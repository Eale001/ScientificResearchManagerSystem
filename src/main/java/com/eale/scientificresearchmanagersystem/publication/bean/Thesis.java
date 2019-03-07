package com.eale.scientificresearchmanagersystem.publication.bean;

import com.eale.scientificresearchmanagersystem.system.bean.periodical.ThesisPeriodical;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 论文实体
 */
@Entity
@Table(name = "srms_publication_thesis")
public class Thesis {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="thesis_id")
    private Long thesisId;//论文ID

    @Column(name = "thesis_subject")
    private String thesisSubject;//论文题目

    @Column(name = "thesis_direction")
    private String thesisDirection;//论文方向

    @Column(name = "thesis_number")
    private String thesisNumber;//论文字数

    @OneToOne
    @JoinColumn(name = "tp_id")
    private ThesisPeriodical tpId;//论文刊期ID

    @Column(name = "thesis_periodicalvolume")
    private String thesisPeriodicalvolume;//刊期卷

    @Column(name = "thesis_pagenumber")
    private String thesisPagenumber;//页码

    @Column(name = "thesis_authorNumber")
    private String thesisAuthorNumber;//作者数

    @Column(name = "thesis_rankAuthor")
    private String thesisRankAuthor;//第几作者

    @Column(name = "thesis_publishTime")
    private Timestamp thesisPublishTime;//发表时间

    private Integer thesis_award;//获奖状态

    @Column(name = "thesis_affectoi")
    private String thesisAffectoi;//影响因子

    @Column(name = "thesis_verify")
    private Integer thesisVerify;//审核状态

    @Column(name = "tv_remark")
    private String remark;//审核备注

    @Column(name = "userName")
    private String userName;//申请人

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public Thesis() {
    }

    public Long getThesisId() {
        return thesisId;
    }

    public void setThesisId(Long thesisId) {
        this.thesisId = thesisId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getThesisSubject() {
        return thesisSubject;
    }

    public void setThesisSubject(String thesisSubject) {
        this.thesisSubject = thesisSubject;
    }

    public String getThesisDirection() {
        return thesisDirection;
    }

    public void setThesisDirection(String thesisDirection) {
        this.thesisDirection = thesisDirection;
    }

    public String getThesisNumber() {
        return thesisNumber;
    }

    public void setThesisNumber(String thesisNumber) {
        this.thesisNumber = thesisNumber;
    }

    public ThesisPeriodical getTpId() {
        return tpId;
    }

    public void setTpId(ThesisPeriodical tpId) {
        this.tpId = tpId;
    }

    public String getThesisPeriodicalvolume() {
        return thesisPeriodicalvolume;
    }

    public void setThesisPeriodicalvolume(String thesisPeriodicalvolume) {
        this.thesisPeriodicalvolume = thesisPeriodicalvolume;
    }

    public String getThesisPagenumber() {
        return thesisPagenumber;
    }

    public void setThesisPagenumber(String thesisPagenumber) {
        this.thesisPagenumber = thesisPagenumber;
    }

    public String getThesisAuthorNumber() {
        return thesisAuthorNumber;
    }

    public void setThesisAuthorNumber(String thesisAuthorNumber) {
        this.thesisAuthorNumber = thesisAuthorNumber;
    }

    public String getThesisRankAuthor() {
        return thesisRankAuthor;
    }

    public void setThesisRankAuthor(String thesisRankAuthor) {
        this.thesisRankAuthor = thesisRankAuthor;
    }

    public Timestamp getThesisPublishTime() {
        return thesisPublishTime;
    }

    public void setThesisPublishTime(Timestamp thesisPublishTime) {
        this.thesisPublishTime = thesisPublishTime;
    }

    public Integer getThesis_award() {
        return thesis_award;
    }

    public void setThesis_award(Integer thesis_award) {
        this.thesis_award = thesis_award;
    }

    public String getThesisAffectoi() {
        return thesisAffectoi;
    }

    public void setThesisAffectoi(String thesisAffectoi) {
        this.thesisAffectoi = thesisAffectoi;
    }

    public Integer getThesisVerify() {
        return thesisVerify;
    }

    public void setThesisVerify(Integer thesisVerify) {
        this.thesisVerify = thesisVerify;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        return "Thesis{" +
                "thesisId=" + thesisId +
                ", thesisSubject='" + thesisSubject + '\'' +
                ", thesisDirection='" + thesisDirection + '\'' +
                ", thesisNumber='" + thesisNumber + '\'' +
                ", tpId=" + tpId +
                ", thesisPeriodicalvolume='" + thesisPeriodicalvolume + '\'' +
                ", thesisPagenumber='" + thesisPagenumber + '\'' +
                ", thesisAuthorNumber='" + thesisAuthorNumber + '\'' +
                ", thesisRankAuthor='" + thesisRankAuthor + '\'' +
                ", thesisPublishTime=" + thesisPublishTime +
                ", thesis_award=" + thesis_award +
                ", thesisAffectoi='" + thesisAffectoi + '\'' +
                ", thesisVerify=" + thesisVerify +
                ", userName='" + userName + '\'' +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
