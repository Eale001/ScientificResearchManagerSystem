package com.eale.scientificresearchmanagersystem.system.bean.score;

import com.eale.scientificresearchmanagersystem.system.bean.periodical.ThesisGrade;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 书籍评分规则
 */
@Entity
@Table(name="srms_sys_bookscore")
public class BookScore {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="bs_id")
    private  Long bsId;//书籍评分ID


    @Column(name = "bs_rankauthor")
    private String bsRankauthor;//作者排名(第几作者)

    @Column(name = "bs_score")
    private BigDecimal bsScore;//应得分数

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

    public BookScore() {
    }

    public Long getBsId() {
        return bsId;
    }

    public void setBsId(Long bsId) {
        this.bsId = bsId;
    }

    public String getBsRankauthor() {
        return bsRankauthor;
    }

    public void setBsRankauthor(String bsRankauthor) {
        this.bsRankauthor = bsRankauthor;
    }

    public BigDecimal getBsScore() {
        return bsScore;
    }

    public void setBsScore(BigDecimal bsScore) {
        this.bsScore = bsScore;
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
    public String toString() {
        return "BookScore{" +
                "bsId=" + bsId +
                ", bsRankauthor='" + bsRankauthor + '\'' +
                ", bsScore=" + bsScore +
                ", bgId=" + bgId +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
