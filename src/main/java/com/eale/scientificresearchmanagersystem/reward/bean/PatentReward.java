package com.eale.scientificresearchmanagersystem.reward.bean;

import com.eale.scientificresearchmanagersystem.system.bean.periodical.ThesisGrade;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 专利奖励规则表
 */
@Entity
@Table(name = "srms_reward_patentrewardrule")
public class PatentReward {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column(name="pr_id")
private Long prId;//专利奖励ID

    @Column(name = "pr_rankauthor")
    private String prRankauthor;//作者排名(第几作者)

    @Column(name = "pr_score")
    private BigDecimal prScore;//奖励分数

    @Column(name = "pr_money")
    private BigDecimal prMoney;//奖励金额

    @OneToOne
    @JoinColumn(name = "pg_id")
    private ThesisGrade pgId;//级别ID

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public PatentReward() {
    }

    public Long getPrId() {
        return prId;
    }

    public void setPrId(Long prId) {
        this.prId = prId;
    }

    public String getPrRankauthor() {
        return prRankauthor;
    }

    public void setPrRankauthor(String prRankauthor) {
        this.prRankauthor = prRankauthor;
    }

    public BigDecimal getPrScore() {
        return prScore;
    }

    public void setPrScore(BigDecimal prScore) {
        this.prScore = prScore;
    }

    public BigDecimal getPrMoney() {
        return prMoney;
    }

    public void setPrMoney(BigDecimal prMoney) {
        this.prMoney = prMoney;
    }

    public ThesisGrade getPgId() {
        return pgId;
    }

    public void setPgId(ThesisGrade pgId) {
        this.pgId = pgId;
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
        return "PatentReward{" +
                "prId=" + prId +
                ", prRankauthor='" + prRankauthor + '\'' +
                ", prScore=" + prScore +
                ", prMoney=" + prMoney +
                ", pgId=" + pgId +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
