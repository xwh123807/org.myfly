package org.myfly.platform.core.utils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.myfly.platform.core.utils.JaxbUtil;
import org.springframework.data.domain.Page;

//设置生成的xml的根节点的名称
@XmlRootElement(name="sendHospitalInfo")
//设置根据字段还是方法生成
@XmlAccessorType(XmlAccessType.FIELD)
public class YwYyghSydw {
	//xml节点的名称
    @XmlElement(name="hospitalId")
    private String hospitalid;

    //忽略此属性
    @XmlTransient
    private long id;

    @XmlElement(name="hospitalName")
    private String hospitalname;
    
    @XmlElement(name="addr")
    private String addr;

    @XmlElement(name="tel")
    private String tel;

    @XmlElement(name="webite")
    private String website;

    @XmlElement(name="hospLevel")
    private String hosplevel;

    @XmlElement(name="hospArea")
    private String hosparea;

    @XmlElement(name="desc")
    private String yyjj;

    @XmlElement(name="maxRegDays")
    private String maxregdays;

    @XmlElement(name="startRegTime")
    private String startregtime;

    @XmlElement(name="stopRegTime")
    private String stopregtime;

    @XmlElement(name="scbz")
    private String scbz;

    @XmlElement(name="yl")
    private String yl;

    @XmlTransient
    private Page page;

    @XmlTransient
    private String deptid;
    
    @XmlTransient
    private String deptname;
    
    @XmlTransient
    private String parentId;
    
    @XmlTransient
    private String ksjj;
    
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
    public String getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(String hospitalid) {
        this.hospitalid = hospitalid == null ? null : hospitalid.trim();
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname == null ? null : hospitalname.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getHosplevel() {
        return hosplevel;
    }

    public void setHosplevel(String hosplevel) {
        this.hosplevel = hosplevel == null ? null : hosplevel.trim();
    }

    public String getHosparea() {
        return hosparea;
    }

    public void setHosparea(String hosparea) {
        this.hosparea = hosparea == null ? null : hosparea.trim();
    }  

    public String getYyjj() {
        return yyjj;
    }

    public void setYyjj(String yyjj) {
        this.yyjj = yyjj;
    }

    public String getMaxregdays() {
        return maxregdays;
    }

    public void setMaxregdays(String maxregdays) {
        this.maxregdays = maxregdays == null ? null : maxregdays.trim();
    }

    public String getStartregtime() {
        return startregtime;
    }

    public void setStartregtime(String startregtime) {
        this.startregtime = startregtime == null ? null : startregtime.trim();
    }

    public String getStopregtime() {
        return stopregtime;
    }

    public void setStopregtime(String stopregtime) {
        this.stopregtime = stopregtime == null ? null : stopregtime.trim();
    }

    public String getScbz() {
        return scbz;
    }

    public void setScbz(String scbz) {
        this.scbz = scbz == null ? null : scbz.trim();
    }

    public String getYl() {
        return yl;
    }

    public void setYl(String yl) {
        this.yl = yl == null ? null : yl.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getKsjj() {
        return ksjj;
    }

    public void setKsjj(String ksjj) {
        this.ksjj = ksjj;
    }
    
    public static void main(String[] args) {
        YwYyghSydw sydw = new YwYyghSydw();
        sydw.setHospitalid("001");
        sydw.setHospitalname("11");
        sydw.setAddr("dfffffffffffffffff");
        sydw.setTel("111111111");
        System.out.println(JaxbUtil.toXml(sydw));
        String xml=JaxbUtil.toXml(sydw);
        YwYyghSydw sydw1 = new YwYyghSydw();
        sydw1=JaxbUtil.fromXml(xml,YwYyghSydw.class);
        System.out.println(JaxbUtil.toXml(sydw1));
    }
}
