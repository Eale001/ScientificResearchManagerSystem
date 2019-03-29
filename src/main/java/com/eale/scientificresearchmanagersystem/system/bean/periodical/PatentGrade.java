package com.eale.scientificresearchmanagersystem.system.bean.periodical;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 专利级别
 */
@Entity
@Table(name = "srms_sys_patentgrade")
public class PatentGrade {
//    pg_id	Long	否	专利级别ID
//    pg_grade	String		专利等级
//    pg_affectoi	String		依影响因子
//    pg_money	BigDecimal		奖励金额
//    pg_score	BigDecimal		等级绩效分数
//    pp_id	PatentPeriodical		论文期刊ID
//    create_userid	Long		创建人
//    create_date	Timestamp		创建时间
//    update_userid	Long		修改人
//    update_date	Timestamp		修改时间

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="pg_id")
    private Long pgId;//专利级别ID

    @Column(name = "pg_grade")
    private String pgGrade;//专利等级

    @Column(name = "pg_affectoi")
    private String pgAffectoi;//依影响因子

    @Column(name = "pg_money")
    private BigDecimal pgMoney;//奖励金额

    @Column(name = "pg_score")
    private BigDecimal pgScore;//等级绩效分数

    @ManyToOne
    @JoinColumn(name = "pp_id")
    private ThesisPeriodical ppId;//专利刊期ID

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public PatentGrade() {
    }

    public Long getPgId() {
        return pgId;
    }

    public void setPgId(Long pgId) {
        this.pgId = pgId;
    }

    public String getPgGrade() {
        return pgGrade;
    }

    public void setPgGrade(String pgGrade) {
        this.pgGrade = pgGrade;
    }

    public String getPgAffectoi() {
        return pgAffectoi;
    }

    public void setPgAffectoi(String pgAffectoi) {
        this.pgAffectoi = pgAffectoi;
    }

    public BigDecimal getPgMoney() {
        return pgMoney;
    }

    public void setPgMoney(BigDecimal pgMoney) {
        this.pgMoney = pgMoney;
    }

    public BigDecimal getPgScore() {
        return pgScore;
    }

    public void setPgScore(BigDecimal pgScore) {
        this.pgScore = pgScore;
    }

    public ThesisPeriodical getPpId() {
        return ppId;
    }

    public void setPpId(ThesisPeriodical ppId) {
        this.ppId = ppId;
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
        return "PatentGrade{" +
                "pgId=" + pgId +
                ", pgGrade='" + pgGrade + '\'' +
                ", pgAffectoi='" + pgAffectoi + '\'' +
                ", pgMoney=" + pgMoney +
                ", pgScore=" + pgScore +
                ", ppId=" + ppId +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
