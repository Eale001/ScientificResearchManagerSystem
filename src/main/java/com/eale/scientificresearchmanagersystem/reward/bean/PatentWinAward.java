package com.eale.scientificresearchmanagersystem.reward.bean;


import com.eale.scientificresearchmanagersystem.publication.bean.Thesis;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 获奖论文
 */

@Entity
@Table(name = "srms_reward_patentwinaward")
public class PatentWinAward {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="pwa_id")
    private Long pwaId;//获奖专利ID

    @OneToOne
    @JoinColumn(name = "patent_id")
    private Thesis patentId;//专利ID

    @Column(name = "pwa_money")
    private BigDecimal pwaMoney;//获得奖励金额

    @Column(name = "pwa_score")
    private BigDecimal pwaScore;//获得奖励绩效分数

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public PatentWinAward() {
    }

    public Long getPwaId() {
        return pwaId;
    }

    public void setPwaId(Long pwaId) {
        this.pwaId = pwaId;
    }

    public Thesis getPatentId() {
        return patentId;
    }

    public void setPatentId(Thesis patentId) {
        this.patentId = patentId;
    }

    public BigDecimal getPwaMoney() {
        return pwaMoney;
    }

    public void setPwaMoney(BigDecimal pwaMoney) {
        this.pwaMoney = pwaMoney;
    }

    public BigDecimal getPwaScore() {
        return pwaScore;
    }

    public void setPwaScore(BigDecimal pwaScore) {
        this.pwaScore = pwaScore;
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
        return "PatentWinAward{" +
                "pwaId=" + pwaId +
                ", patentId=" + patentId +
                ", pwaMoney=" + pwaMoney +
                ", pwaScore=" + pwaScore +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
