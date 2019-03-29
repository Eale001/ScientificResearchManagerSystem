package com.eale.scientificresearchmanagersystem.system.bean.periodical;

import com.eale.scientificresearchmanagersystem.publication.bean.Patent;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 专利刊期实体
 */

@Entity
@Table(name = "srms_sys_patentperiodical")
public class PatentPeriodical {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="pp_id")
    private Long ppId;//专利刊期ID

    @Column(name = "pp_name")
    private String ppName;//专利刊期名称

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public PatentPeriodical() {
    }

    public Long getPpId() {
        return ppId;
    }

    public void setPpId(Long ppId) {
        this.ppId = ppId;
    }

    public String getPpName() {
        return ppName;
    }

    public void setPpName(String ppName) {
        this.ppName = ppName;
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
        return "PatentPeriodical{" +
                "ppId=" + ppId +
                ", ppName='" + ppName + '\'' +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
