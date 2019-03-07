package com.eale.scientificresearchmanagersystem.reward.bean;

import com.eale.scientificresearchmanagersystem.system.bean.periodical.ThesisGrade;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 论文奖励规则表
 */
@Entity
@Table(name = "srms_reward_thesisrewardrule")
public class ThesisReward {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="tr_id")
    private Long trId;//论文奖励ID

    @Column(name = "tr_rankauthor")
    private String trRankauthor;//作者排名(第几作者)

    @Column(name = "tr_score")
    private BigDecimal trScore;//奖励分数

    @Column(name = "tr_money")
    private BigDecimal trMoney;//奖励金额

    @OneToOne
    @JoinColumn(name = "tg_id")
    private ThesisGrade tgId;//级别ID

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public ThesisReward() {
    }

    public Long getTrId() {
        return trId;
    }

    public void setTrId(Long trId) {
        this.trId = trId;
    }

    public String getTrRankauthor() {
        return trRankauthor;
    }

    public void setTrRankauthor(String trRankauthor) {
        this.trRankauthor = trRankauthor;
    }

    public BigDecimal getTrScore() {
        return trScore;
    }

    public void setTrScore(BigDecimal trScore) {
        this.trScore = trScore;
    }

    public BigDecimal getTrMoney() {
        return trMoney;
    }

    public void setTrMoney(BigDecimal trMoney) {
        this.trMoney = trMoney;
    }

    public ThesisGrade getTgId() {
        return tgId;
    }

    public void setTgId(ThesisGrade tgId) {
        this.tgId = tgId;
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
        return "ThesisReward{" +
                "trId=" + trId +
                ", trRankauthor='" + trRankauthor + '\'' +
                ", trScore=" + trScore +
                ", trMoney=" + trMoney +
                ", tgId=" + tgId +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
