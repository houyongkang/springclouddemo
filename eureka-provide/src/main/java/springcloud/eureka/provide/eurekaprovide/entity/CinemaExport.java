package springcloud.eureka.provide.eurekaprovide.entity;

import java.io.Serializable;

/**
 * 导出bean
 */
public class CinemaExport implements Serializable {
    //广电编码
    private String code;
    //影院名称
    private String shortName;
    //影院级别
    private String cinemaLevel;
    //卖品级别
    private String voucherLevel;
    //卡包级别
    private String packageLevel;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getCinemaLevel() {
        return cinemaLevel;
    }

    public void setCinemaLevel(String cinemaLevel) {
        this.cinemaLevel = cinemaLevel;
    }

    public String getVoucherLevel() {
        return voucherLevel;
    }

    public void setVoucherLevel(String voucherLevel) {
        this.voucherLevel = voucherLevel;
    }

    public String getPackageLevel() {
        return packageLevel;
    }

    public void setPackageLevel(String packageLevel) {
        this.packageLevel = packageLevel;
    }
}