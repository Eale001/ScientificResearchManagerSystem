package com.eale.scientificresearchmanagersystem.system.bean.periodical;


import com.eale.scientificresearchmanagersystem.publication.bean.Book;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 书籍级别
 */

@Entity
@Table(name="srms_sys_bookgrade")
public class BookGrade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bg_id")
    private  Long bgId;//书籍级别ID

    @Column(name="bg_grade")
    private  String bgGrade;//书籍等级

    @Column(name="bg_affectoi")
    private  String bgAffectoi;//依影响因子

    @Column(name="bg_money")
    private BigDecimal bgMoney;//奖励金额

    @Column(name="bg_score")
    private  BigDecimal bgScore;//等级绩效分数

    @ManyToOne
    @JoinColumn(name="bp_id")
    private BookPeriodical bpId;//书籍刊期ID

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public BookGrade(){

    }

    public Long getBgId() {
        return bgId;
    }

    public void setBgId(Long bgId) {
        this.bgId = bgId;
    }

    public String getBgGrade() {
        return bgGrade;
    }

    public void setBgGrade(String bgGrade) {
        this.bgGrade = bgGrade;
    }

    public String getBgAffectoi() {
        return bgAffectoi;
    }

    public void setBgAffectoi(String bgAffectoi) {
        this.bgAffectoi = bgAffectoi;
    }

    public BigDecimal getBgMoney() {
        return bgMoney;
    }

    public void setBgMoney(BigDecimal bgMoney) {
        this.bgMoney = bgMoney;
    }

    public BigDecimal getBgScore() {
        return bgScore;
    }

    public void setBgScore(BigDecimal bgScore) {
        this.bgScore = bgScore;
    }

    public BookPeriodical getBpId() {
        return bpId;
    }

    public void setBpId(BookPeriodical bpId) {
        this.bpId = bpId;
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
        return "BookGrade{" +
                "bgId=" + bgId +
                ", bgGrade='" + bgGrade + '\'' +
                ", bgAffectoi='" + bgAffectoi + '\'' +
                ", bgMoney=" + bgMoney +
                ", bgScore=" + bgScore +
                ", bpId=" + bpId +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
}
}
