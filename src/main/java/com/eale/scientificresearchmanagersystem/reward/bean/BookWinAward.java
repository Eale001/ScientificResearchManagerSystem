package com.eale.scientificresearchmanagersystem.reward.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 获奖书籍
 */
@Entity
@Table(name="srms_reward_bookwinaward")
public class BookWinAward {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="bwa_id")
    private  Long bwaId;//获奖书籍ID

@OneToOne
@JoinColumn(name="book_id")
private Long  bookId;//书籍ID

    @Column(name="bwa_money")
    private BigDecimal bwaMoney;//获得奖励金额

    @Column(name="bwa_score")
    private  BigDecimal bwaScore;//获得奖励绩效分数

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public BookWinAward(){

    }

    public Long getBwaId() {
        return bwaId;
    }

    public void setBwaId(Long bwaId) {
        this.bwaId = bwaId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public BigDecimal getBwaMoney() {
        return bwaMoney;
    }

    public void setBwaMoney(BigDecimal bwaMoney) {
        this.bwaMoney = bwaMoney;
    }

    public BigDecimal getBwaScore() {
        return bwaScore;
    }

    public void setBwaScore(BigDecimal bwaScore) {
        this.bwaScore = bwaScore;
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
            return "BookWinAward{" +
                    "bwaId=" + bwaId +
                    ", bookId=" + bookId +
                    ", bwaMoney=" + bwaMoney +
                    ", bwaScore=" + bwaScore +
                    ", createUserid=" + createUserid +
                    ", createDate=" + createDate +
                    ", updateUserid=" + updateUserid +
                    ", updateDate=" + updateDate +
                    '}';
    }
}

