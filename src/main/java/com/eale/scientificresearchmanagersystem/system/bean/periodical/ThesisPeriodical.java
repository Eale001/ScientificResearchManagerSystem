package com.eale.scientificresearchmanagersystem.system.bean.periodical;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 论文刊期实体
 */
@Entity
@Table(name = "srms_sys_thesisperiodical")
public class ThesisPeriodical {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="tp_id")
    private Long tpId;//论文刊期ID

    @Column(name = "tp_name")
    private String tpName;//论文刊期名称

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public ThesisPeriodical() {
    }

    public Long getTpId() {
        return tpId;
    }

    public void setTpId(Long tpId) {
        this.tpId = tpId;
    }

    public String getTpName() {
        return tpName;
    }

    public void setTpName(String tpName) {
        this.tpName = tpName;
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
        return "ThesisPeriodical{" +
                "tpId=" + tpId +
                ", tpName='" + tpName + '\'' +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
