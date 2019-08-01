package springcloud.demo.apigateway.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: 请求过滤
 * @Author: Yongkang Hou
 * @Date: 2019-07-31
 */
public class AccessFilter extends ZuulFilter {
    /**
     * 过滤器类型
     *
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器执行顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 该过滤器是否执行
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器逻辑
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext ();
        HttpServletRequest servletRequest = context.getRequest ();
        System.out.println (String.format ("send [%s] request to [%s]",servletRequest.getMethod (),servletRequest.getRequestURI ())
                );
        Object accessToken = servletRequest.getParameter ("accessToken");
        System.out.println (accessToken);
        if (null == accessToken) {

            context.setSendZuulResponse (false);
            context.setResponseStatusCode (401);
            return null;
        }
        System.out.println ("accessToken OK" );
        return null;

    }
}
