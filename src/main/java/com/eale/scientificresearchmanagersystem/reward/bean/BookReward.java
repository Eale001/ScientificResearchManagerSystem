package com.eale.scientificresearchmanagersystem.reward.bean;


import com.eale.scientificresearchmanagersystem.system.bean.periodical.ThesisGrade;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *书记奖励规则表
 */
@Entity
@Table(name="srms_reward_bookrewardrule")
public class BookReward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="br_id")
    private  Long brId;//书籍奖励ID


    @Column(name = "br_rankauthor")
    private  String brRankauthor;//作者排名（第几作者）

    @Column(name = "br_score")
    private BigDecimal brScore;//奖励分数

    @Column(name = "br_money")
    private BigDecimal brMoney;//奖励金额

    @OneToOne
    @JoinColumn(name = "bg_id")
    private ThesisGrade bgId;//级别ID

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public Long getBrId() {
        return brId;
    }

    public void setBrId(Long brId) {
        this.brId = brId;
    }

    public String getBrRankauthor() {
        return brRankauthor;
    }

    public void setBrRankauthor(String brRankauthor) {
        this.brRankauthor = brRankauthor;
    }

    public BigDecimal getBrScore() {
        return brScore;
    }

    public void setBrScore(BigDecimal brScore) {
        this.brScore = brScore;
    }

    public BigDecimal getBrMoney() {
        return brMoney;
    }

    public void setBrMoney(BigDecimal brMoney) {
        this.brMoney = brMoney;
    }

    public ThesisGrade getBgId() {
        return bgId;
    }

    public void setBgId(ThesisGrade bgId) {
        this.bgId = bgId;
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
        public String toString(){
            return "BookReward{" +
                    "brId=" + brId +
                    ", brRankauthor='" + brRankauthor + '\'' +
                    ", brScore=" + brScore +
                    ", brMoney=" + brMoney +
                    ", bgId=" + bgId +
                    ", createUserid=" + createUserid +
                    ", createDate=" + createDate +
                    ", updateUserid=" + updateUserid +
                    ", updateDate=" + updateDate +
                    '}';
    }
}
