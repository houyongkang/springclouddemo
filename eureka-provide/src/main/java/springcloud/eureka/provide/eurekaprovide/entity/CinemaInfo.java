package springcloud.eureka.provide.eurekaprovide.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author zww <br>
 *         影城
 */
public class CinemaInfo implements Serializable {
    private String cinemaarea;
    private Integer seqid;
    private String shortName;
    private String pinCode;
    private String innerCode;
    private String code;
    private String isopen;
    private String opingState;
    private Date openDate;
    private Integer hallCount;
    private Integer seatCount;
    private String address;
    private String postCode;
    private String cinemaLevel;
    private String cinemaLevelName;
    private String cinemaAttr;
    private String cinemaAttrName;
    private String suppType;
    private String suppTypeName;
    private String mktType;
    private String mktTypeName;
    private Integer province;
    private String provinceName;
    private Integer city;
    private String cityName;
    private String area;
    private String areaName;
    private Date createDate;
    private String createBy;
    private Date updateDate;
    private String updateBy;
    private String deleted;
    private Date deleteDate;
    private String deleteBy;
    private Integer digitHallCount;
    private Integer tridHallCount;
    private Integer imaxHallCount;
    private String innerName;
    private String outName;
    private String workStartDate;
    private String workEndDate;
    private String workendStartDate;
    private String workendEndDate;
    private String isFeel;
    private String isFeelName;
    private String codeOfCfs;
    private String codeOfBcs;
    private BigDecimal groupAccountRatio;
    private String cardReaderType;
    private String cardReaderTypeName;
    private String orgcode;
    private BigDecimal addedValueTax;
    private String fax;
    private String corporate;
    // 提供给卷系统使用
    private String cityCode;
    private String citys;
    // 排片系统使用
    private String citylevel;
    private String cityLevelName;
    private List<String> codes;

    // 影院品牌
    private String cinemaBrand;



    private Map<String,Object> data;

    //卖品级别
    private String voucherLevel;
    private String voucherLevelName;
    private List<String> voucherLevels;
    //卡包级别
    private String packageLevel;
    private String packageLevelName;
    private List<String> packageLevels;

    public String getPackageLevelName() {
        return packageLevelName;
    }

    public void setPackageLevelName(String packageLevelName) {
        this.packageLevelName = packageLevelName;
    }

    public String getPackageLevel() {
        return packageLevel;
    }

    public void setPackageLevel(String packageLevel) {
        this.packageLevel = packageLevel;
    }

    public String getCinemaarea() {
        return cinemaarea;
    }

    public void setCinemaarea(String cinemaarea) {
        this.cinemaarea = cinemaarea;
    }

    public List <String> getVoucherLevels() {
        return voucherLevels;
    }

    public void setVoucherLevels(List <String> voucherLevels) {
        this.voucherLevels = voucherLevels;
    }

    public Map <String, Object> getData() {
        return data;
    }

    public void setData(Map <String, Object> data) {
        this.data = data;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCitys() {
		return citys;
	}

	public void setCitys(String citys) {
		this.citys = citys;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	private BigDecimal legalPersonId;
    private static final long serialVersionUID = 1L;

    public Integer getSeqid() {
        return seqid;
    }

    public void setSeqid(Integer seqid) {
        this.seqid = seqid;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode == null ? null : pinCode.trim();
    }

    public String getInnerCode() {
        return innerCode;
    }

    public void setInnerCode(String innerCode) {
        this.innerCode = innerCode == null ? null : innerCode.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getIsopen() {
        return isopen;
    }

    public void setIsopen(String isopen) {
        this.isopen = isopen == null ? null : isopen.trim();
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Integer getHallCount() {
        return hallCount;
    }

    public void setHallCount(Integer hallCount) {
        this.hallCount = hallCount;
    }

    public Integer getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getCinemaLevel() {
        return cinemaLevel;
    }

    public void setCinemaLevel(String cinemaLevel) {
        this.cinemaLevel = cinemaLevel == null ? null : cinemaLevel.trim();
    }

    public String getCinemaAttr() {
        return cinemaAttr;
    }

    public void setCinemaAttr(String cinemaAttr) {
        this.cinemaAttr = cinemaAttr == null ? null : cinemaAttr.trim();
    }

    public String getSuppType() {
        return suppType;
    }

    public void setSuppType(String suppType) {
        this.suppType = suppType == null ? null : suppType.trim();
    }

    public String getMktType() {
        return mktType;
    }

    public void setMktType(String mktType) {
        this.mktType = mktType == null ? null : mktType.trim();
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    public String getDeleteBy() {
        return deleteBy;
    }

    public void setDeleteBy(String deleteBy) {
        this.deleteBy = deleteBy == null ? null : deleteBy.trim();
    }

    public Integer getDigitHallCount() {
        return digitHallCount;
    }

    public void setDigitHallCount(Integer digitHallCount) {
        this.digitHallCount = digitHallCount;
    }

    public Integer getTridHallCount() {
        return tridHallCount;
    }

    public void setTridHallCount(Integer tridHallCount) {
        this.tridHallCount = tridHallCount;
    }

    public Integer getImaxHallCount() {
        return imaxHallCount;
    }

    public void setImaxHallCount(Integer imaxHallCount) {
        this.imaxHallCount = imaxHallCount;
    }

    public String getInnerName() {
        return innerName;
    }

    public void setInnerName(String innerName) {
        this.innerName = innerName == null ? null : innerName.trim();
    }

    public String getOutName() {
        return outName;
    }

    public void setOutName(String outName) {
        this.outName = outName == null ? null : outName.trim();
    }

    public String getWorkStartDate() {
        return workStartDate;
    }

    public void setWorkStartDate(String workStartDate) {
        this.workStartDate = workStartDate == null ? null : workStartDate.trim();
    }

    public String getWorkEndDate() {
        return workEndDate;
    }

    public void setWorkEndDate(String workEndDate) {
        this.workEndDate = workEndDate == null ? null : workEndDate.trim();
    }

    public String getWorkendStartDate() {
        return workendStartDate;
    }

    public void setWorkendStartDate(String workendStartDate) {
        this.workendStartDate = workendStartDate == null ? null : workendStartDate.trim();
    }

    public String getWorkendEndDate() {
        return workendEndDate;
    }

    public void setWorkendEndDate(String workendEndDate) {
        this.workendEndDate = workendEndDate == null ? null : workendEndDate.trim();
    }

    public String getIsFeel() {
        return isFeel;
    }

    public void setIsFeel(String isFeel) {
        this.isFeel = isFeel == null ? null : isFeel.trim();
    }

    public String getCodeOfCfs() {
        return codeOfCfs;
    }

    public void setCodeOfCfs(String codeOfCfs) {
        this.codeOfCfs = codeOfCfs == null ? null : codeOfCfs.trim();
    }

    public String getCodeOfBcs() {
        return codeOfBcs;
    }

    public void setCodeOfBcs(String codeOfBcs) {
        this.codeOfBcs = codeOfBcs == null ? null : codeOfBcs.trim();
    }

    public BigDecimal getGroupAccountRatio() {
        return groupAccountRatio;
    }

    public void setGroupAccountRatio(BigDecimal groupAccountRatio) {
        this.groupAccountRatio = groupAccountRatio;
    }

    public String getCardReaderType() {
        return cardReaderType;
    }

    public void setCardReaderType(String cardReaderType) {
        this.cardReaderType = cardReaderType == null ? null : cardReaderType.trim();
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }

    public BigDecimal getAddedValueTax() {
        return addedValueTax;
    }

    public void setAddedValueTax(BigDecimal addedValueTax) {
        this.addedValueTax = addedValueTax;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getCorporate() {
        return corporate;
    }

    public void setCorporate(String corporate) {
        this.corporate = corporate == null ? null : corporate.trim();
    }

    public BigDecimal getLegalPersonId() {
        return legalPersonId;
    }

    public void setLegalPersonId(BigDecimal legalPersonId) {
        this.legalPersonId = legalPersonId;
    }

    public String getCinemaLevelName() {
        return cinemaLevelName;
    }

    public void setCinemaLevelName(String cinemaLevelName) {
        this.cinemaLevelName = cinemaLevelName;
    }

    public String getCinemaAttrName() {
        return cinemaAttrName;
    }

    public void setCinemaAttrName(String cinemaAttrName) {
        this.cinemaAttrName = cinemaAttrName;
    }

    public String getSuppTypeName() {
        return suppTypeName;
    }

    public void setSuppTypeName(String suppTypeName) {
        this.suppTypeName = suppTypeName;
    }

    public String getMktTypeName() {
        return mktTypeName;
    }

    public void setMktTypeName(String mktTypeName) {
        this.mktTypeName = mktTypeName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getIsFeelName() {
        return isFeelName;
    }

    public void setIsFeelName(String isFeelName) {
        this.isFeelName = isFeelName;
    }

    public String getCardReaderTypeName() {
        return cardReaderTypeName;
    }

    public void setCardReaderTypeName(String cardReaderTypeName) {
        this.cardReaderTypeName = cardReaderTypeName;
    }

    public String getOpingState() {
        return opingState;
    }

    public void setOpingState(String opingState) {
        this.opingState = opingState;
    }

	public String getCitylevel() {
		return citylevel;
	}

	public void setCitylevel(String cityLevel) {
		this.citylevel = cityLevel;
	}

	public List<String> getCodes() {
		return codes;
	}

	public void setCodes(List<String> codes) {
		this.codes = codes;
	}

	public String getCityLevelName() {
		return cityLevelName;
	}

	public void setCityLevelName(String cityLevelName) {
		this.cityLevelName = cityLevelName;
	}

    public String getCinemaBrand() {
        return cinemaBrand;
    }

    public void setCinemaBrand(String cinemaBrand) {
        this.cinemaBrand = cinemaBrand;
    }

    public String getVoucherLevel() {
        return voucherLevel;
    }

    public void setVoucherLevel(String voucherLevel) {
        this.voucherLevel = voucherLevel;
    }

    public String getVoucherLevelName() {
        return voucherLevelName;
    }

    public void setVoucherLevelName(String voucherLevelName) {
        this.voucherLevelName = voucherLevelName;
    }


    public List<String> getPackageLevels() {
        return packageLevels;
    }

    public void setPackageLevels(List<String> packageLevels) {
        this.packageLevels = packageLevels;
    }

}