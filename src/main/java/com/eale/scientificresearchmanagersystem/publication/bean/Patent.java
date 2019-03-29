package com.eale.scientificresearchmanagersystem.publication.bean;


import org.hibernate.type.descriptor.sql.NVarcharTypeDescriptor;
import sun.awt.TimedWindowEvent;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 专利实体
 */
@Entity
@Table(name = "srms_publication_patent")
public class Patent {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="patent_id")
    private Long patentId;//专利ID

    @Column(name="patent_name")
    private String patentName;//专利名称

    @Column(name = "patent_type")
    private  String patentType;//专利类型

    @Column(name = "patent_number")
    private  String patentNumber;//授权号

    @Column(name = "patent_time")
    private Timestamp patentTime;//授权时间

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public Patent() {
    }

    public Long getThesisId() {
        return patentId;
    }

    public void setThesisId(Long thesisId) {
        this.patentId = thesisId;
    }

    public String getPatentName() {
        return patentName;
    }

    public void setPatentName(String patentName) {
        this.patentName = patentName;
    }

    public String getPatentType() {
        return patentType;
    }

    public void setPatentType(String patentType) {
        this.patentType = patentType;
    }

    public String getPatentNumber() {
        return patentNumber;
    }

    public void setPatentNumber(String patentNumber) {
        this.patentNumber = patentNumber;
    }

    public Timestamp getPatentTime() {
        return patentTime;
    }

    public void setPatentTime(Timestamp patentTime) {
        this.patentTime = patentTime;
    }

    public Long getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(Long createUserid) {
        this.createUserid = createUserid;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateUserid() {
        return updateUserid;
    }

    public void setUpdateUserid(Long updateUserid) {
        this.updateUserid = updateUserid;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }
    @Override
    public String toString() {

        return "Patent{" +
                "patentId=" + patentId +
                ",  patentName='" + patentName + '\'' +
                ", patentType ='" + patentType + '\'' +
                ", patentNumber='" +patentNumber  + '\'' +
                ", patentNumber='" +patentNumber  + '\''+
                ", patentTime='" + patentTime + '\'' +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
