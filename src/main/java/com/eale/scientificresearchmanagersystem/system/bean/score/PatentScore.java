package com.eale.scientificresearchmanagersystem.system.bean.score;

import com.eale.scientificresearchmanagersystem.publication.bean.Patent;
import com.eale.scientificresearchmanagersystem.system.bean.periodical.ThesisGrade;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 专利评分规则
 */
@Entity
@Table(name = "srms_sys_patentscore")
public class PatentScore {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ps_id")
    private Long psId;//专利评分ID

    @Column(name = "ps_rankauthor")
    private String psRankauthor;//作者排名(第几作者)

    @Column(name = "ps_score")
    private BigDecimal psScore;//应得分数

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

    public PatentScore() {
    }

    public Long getPsId() {
        return psId;
    }

    public void setPsId(Long psId) {
        this.psId = psId;
    }

    public String getPsRankauthor() {
        return psRankauthor;
    }

    public void setPsRankauthor(String psRankauthor) {
        this.psRankauthor = psRankauthor;
    }

    public BigDecimal getPsScore() {
        return psScore;
    }

    public void setPsScore(BigDecimal psScore) {
        this.psScore = psScore;
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
        return "PatentScore{" +
                "psId=" + psId +
                ", psRankauthor='" + psRankauthor + '\'' +
                ", psScore=" + psScore +
                ", pgId=" + pgId +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
