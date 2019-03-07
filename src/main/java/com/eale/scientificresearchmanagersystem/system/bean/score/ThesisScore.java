package com.eale.scientificresearchmanagersystem.system.bean.score;

import com.eale.scientificresearchmanagersystem.system.bean.periodical.ThesisGrade;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 论文评分规则
 */
@Entity
@Table(name = "srms_sys_thesisscore")
public class ThesisScore {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ts_id")
    private Long tsId;//论文评分ID

    @Column(name = "ts_rankauthor")
    private String tsRankauthor;//作者排名(第几作者)

    @Column(name = "ts_score")
    private BigDecimal tsScore;//应得分数

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

    public ThesisScore() {
    }

    public Long getTsId() {
        return tsId;
    }

    public void setTsId(Long tsId) {
        this.tsId = tsId;
    }

    public String getTsRankauthor() {
        return tsRankauthor;
    }

    public void setTsRankauthor(String tsRankauthor) {
        this.tsRankauthor = tsRankauthor;
    }

    public BigDecimal getTsScore() {
        return tsScore;
    }

    public void setTsScore(BigDecimal tsScore) {
        this.tsScore = tsScore;
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
        return "ThesisScore{" +
                "tsId=" + tsId +
                ", tsRankauthor='" + tsRankauthor + '\'' +
                ", tsScore=" + tsScore +
                ", tgId=" + tgId +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
