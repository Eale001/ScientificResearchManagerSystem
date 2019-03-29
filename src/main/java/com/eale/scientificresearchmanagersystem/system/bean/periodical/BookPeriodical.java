package com.eale.scientificresearchmanagersystem.system.bean.periodical;


import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 书籍刊期实体
 */
@Entity
@Table(name="srms_sys_bookperiodical")
public class BookPeriodical {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="bp_id")
    private Long bpId;//书籍刊期ID

    @Column(name = "bp_name")
    private String bpName;//书籍刊期名称

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public BookPeriodical() {
    }

    public Long getBpId() {
        return bpId;
    }

    public void setBpId(Long bpId) {
        this.bpId = bpId;
    }

    public String getBpName() {
        return bpName;
    }

    public void setBpName(String bpName) {
        this.bpName = bpName;
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
        return "BookPeriodical{" +
                "bpId=" + bpId +
                ", bpName='" + bpName + '\'' +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
