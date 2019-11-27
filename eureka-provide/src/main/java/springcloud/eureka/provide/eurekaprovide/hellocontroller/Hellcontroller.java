package springcloud.eureka.provide.eurekaprovide.hellocontroller;


import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.*;
import springcloud.eureka.provide.eurekaprovide.Utils.FilePortUtil;
import springcloud.eureka.provide.eurekaprovide.entity.CinemaExport;
import springcloud.eureka.provide.eurekaprovide.entity.CinemaInfo;
import springcloud.eureka.provide.eurekaprovide.entity.User;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Description:
 * @Author: Yongkang Hou
 * @Date: 2019-07-25
 */
@RestController
public class Hellcontroller {
    @Resource
    private Registration getServiceId;// 服务注册
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        Long starttime = System.currentTimeMillis ();

        List <ServiceInstance> instances = client.getInstances (getServiceId.getServiceId ());
        int sleepTime = new Random ().nextInt (3000);
        System.out.println ("睡眠时间" + sleepTime);
        try {
            Thread.sleep (sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        if (instances != null && instances.size () > 0) {
            System.out.println ("/hello,host:" + instances.get (0).getHost () + ", service_id:" + instances.get (0).getServiceId ());
        }

        Long endtime = System.currentTimeMillis ();
        System.out.println ("请求时间：" + (endtime - starttime));
        return "hello,provider";
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello1(@RequestParam String name) {
        return "hello:" + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    User hello2(@RequestHeader String name, @RequestHeader int age) {
        User user = new User ();
        user.setAge (age);
        user.setName (name);
        return user;
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello3(@RequestBody User user) {
        return user.getName () + ":" + user.getAge ();
    }


    //服务降级验证
    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    public String hello4() {
        Long starttime = System.currentTimeMillis ();
        List <ServiceInstance> instances = client.getInstances (getServiceId.getServiceId ());
        try {
            Thread.sleep (5000);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        if (instances != null && instances.size () > 0) {
            System.out.println ("/hello,host:" + instances.get (0).getHost () + ", service_id:" + instances.get (0).getServiceId ());
        }
        Long endtime = System.currentTimeMillis ();
        System.out.println ("请求时间：" + (endtime - starttime));
        return "hello,provider";
    }

    /**
     * 导出
     *
     * @param httpServletResponse
     * @param
     */
    @RequestMapping(value = "/export/{param}", method = RequestMethod.GET)
    @ResponseBody
    public void export(HttpServletResponse httpServletResponse, @PathVariable String param) {
        try {
            CinemaInfo cinemaInfo = JSONObject.parseObject (param, CinemaInfo.class);
            System.out.println (JSONObject.parseObject (param, CinemaInfo.class));
            if (null == cinemaInfo) {
                cinemaInfo = new CinemaInfo ();
            }
            List <CinemaInfo> list = cinemaInfos ();
            list.sort (Comparator.comparing (CinemaInfo::getCode));
            SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyyMMddHHmmss");
            String date = dateFormat.format (new Date ());
            String titleName = "影院" + date;
            String[] titles = {"广电编码", "影院名称", "影院级别", "卖品级别", "卡包级别"};
            List <String> containBeans = new ArrayList <> ();
            for (Field declaredField : CinemaExport.class.getDeclaredFields ()) {
                containBeans.add (declaredField.getName ());
            }
            FilePortUtil.exportExcel (httpServletResponse, titleName, "影院", titles, list, containBeans);

        } catch (Exception e) {
        System.out.println (e);
        }
    }

    public List <CinemaInfo> cinemaInfos(){
        List<CinemaInfo> cinemaInfos=new ArrayList <> ();
        CinemaInfo cinemaInfo=new CinemaInfo ();
        cinemaInfo.setInnerName ("a");
        cinemaInfo.setCode ("a");
        cinemaInfos.add (cinemaInfo);
        CinemaInfo cinemaInfo2=new CinemaInfo ();
        cinemaInfo2.setInnerName ("a");
        cinemaInfo2.setCode ("b");
        cinemaInfos.add (cinemaInfo2);
        CinemaInfo cinemaInfo3=new CinemaInfo ();
        cinemaInfo3.setInnerName ("a");
        cinemaInfo3.setCode ("c");
        cinemaInfos.add (cinemaInfo3);
        return cinemaInfos;
    }

}
