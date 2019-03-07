package com.eale.scientificresearchmanagersystem.system.bean.periodical;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *
 * 论文级别
 */
@Entity
@Table(name = "srms_sys_thesisgrade")
public class ThesisGrade {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="tg_id")
    private Long tgId;//论文级别ID

    @Column(name = "tg_gradde")
    private String tgGrade;//论文等级

    @Column(name = "tg_affectoi")
    private String tgAffectoi;//依影响因子

    @Column(name = "tg_money")
    private BigDecimal tgMoney;//奖励金额

    @Column(name = "tg_score")
    private BigDecimal tgScore;//等级绩效分数

    @ManyToOne
    @JoinColumn(name = "tp_id")
    private ThesisPeriodical tpId;//论文刊期ID

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public ThesisGrade() {
    }

    public Long getTgId() {
        return tgId;
    }

    public void setTgId(Long tgId) {
        this.tgId = tgId;
    }

    public String getTgGrade() {
        return tgGrade;
    }

    public void setTgGrade(String tgGrade) {
        this.tgGrade = tgGrade;
    }

    public String getTgAffectoi() {
        return tgAffectoi;
    }

    public void setTgAffectoi(String tgAffectoi) {
        this.tgAffectoi = tgAffectoi;
    }

    public BigDecimal getTgMoney() {
        return tgMoney;
    }

    public void setTgMoney(BigDecimal tgMoney) {
        this.tgMoney = tgMoney;
    }

    public BigDecimal getTgScore() {
        return tgScore;
    }

    public void setTgScore(BigDecimal tgScore) {
        this.tgScore = tgScore;
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

    public ThesisPeriodical getTpId() {
        return tpId;
    }

    public void setTpId(ThesisPeriodical tpId) {
        this.tpId = tpId;
    }

    @Override
    public String toString() {
        return "ThesisGrade{" +
                "tgId=" + tgId +
                ", tgGrade='" + tgGrade + '\'' +
                ", tgAffectoi='" + tgAffectoi + '\'' +
                ", tgMoney=" + tgMoney +
                ", tgScore=" + tgScore +
                ", tpId=" + tpId +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
