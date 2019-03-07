package com.eale.scientificresearchmanagersystem.reward.bean;

import com.eale.scientificresearchmanagersystem.publication.bean.Thesis;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *  获奖论文
 */

@Entity
@Table(name = "srms_reward_thesiswinaward")
public class ThesisWinAward {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="twa_id")
    private Long twaId;//获奖论文ID

    @OneToOne
    @JoinColumn(name = "thesis_id")
    private Thesis thesisId;//论文ID

    @Column(name = "twa_money")
    private BigDecimal twaMoney;//获得奖励金额

    @Column(name = "twa_score")
    private BigDecimal twaScore;//获得奖励绩效分数

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public ThesisWinAward() {
    }

    public Long getTwaId() {
        return twaId;
    }

    public void setTwaId(Long twaId) {
        this.twaId = twaId;
    }

    public Thesis getThesisId() {
        return thesisId;
    }

    public void setThesisId(Thesis thesisId) {
        this.thesisId = thesisId;
    }

    public BigDecimal getTwaMoney() {
        return twaMoney;
    }

    public void setTwaMoney(BigDecimal twaMoney) {
        this.twaMoney = twaMoney;
    }

    public BigDecimal getTwaScore() {
        return twaScore;
    }

    public void setTwaScore(BigDecimal twaScore) {
        this.twaScore = twaScore;
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
        return "ThesisWinAward{" +
                "twaId=" + twaId +
                ", thesisId=" + thesisId +
                ", twaMoney=" + twaMoney +
                ", twaScore=" + twaScore +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
