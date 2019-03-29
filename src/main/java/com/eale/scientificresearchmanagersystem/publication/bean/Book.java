package com.eale.scientificresearchmanagersystem.publication.bean;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 书籍实体
 */
@Entity
@Table(name = "srms_publication_book")
public class Book {
   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   @Column(name="book_id")


    private  Long  bookId;//书籍ID

    @Column(name = "book_publisher")
    private  String  bookPublisher;//出版单位

    @Column(name = "book_application date")
    private Date bookApplicationDate;//申请日期

    @Column(name = "book_name")
    private  String bookName;//书籍名字

    @Column(name = "book_thesecondleveldiscipline")
    private  String  bookThesecondleveldiscipline;//所属二级学科

    @Column(name = "book_publishing house specialty")
    private  Integer bookPublishingHouseSpecialty;//是否与出版社专业对口

    @Column(name = "book_public offering or not")
    private Integer bookPublicOfferingOrNot;//是否公开发行

    @Column(name = "book_delivery time")
    private  Date bookDeliveryTime;//交稿时间

    @Column(name = "book_public time")
    private  Date bookPublicTime;//出版时间

    @Column(name =" book_manuscript category")
    private  Integer bookManuscriptCategory;//书稿类别(A,手稿B,打印稿,C,图书)

    @Column(name ="book_number of words")
    private  String bookNumberOfWords;//字数(拟定)

    @Column(name ="book_press")
    private  String bookPress;//出版社(拟定)

    @Column(name ="book_publication of royalty")
    private  String bookPublicationOfRoyalty;//出版册数(拟定)

    @Column(name ="book_editorial board or not")
    private  String bookEditorialBoardOrNot;//出版编审委员会说明有否

    @Column(name ="book_contract for publication or not")
    private  Integer bookContractForPublicationOrNot;//出版合同有否

    @Column(name ="book_applicant")
    private  String bookApplication;//申请者

    @Column(name ="book_approval time")
    private  Date bookApprovalTime;// 批准时间

    @Column(name =" book_phone")
    private String bookPhone;//联系电话

    @Column(name ="book_the name of the project funded  by the relevant fund")
    private  String bookTheNameOfTheProjectFundedByTheRelevantFund;//与此书有关的基金资助项目名称

    @Column(name =" book_finance department")
    private String bookFinanceDepartment;//资助部门

    @Column(name =" book_project approval number")
    private  String bookProjectApprovalNumber;//项目批准号

    @Column(name ="book_the undersigned of the manuscript")
    private  String bookTheUndersignedOfTheManuscript;//书稿署名者（含申请人）

    @Column(name =" book_writing task")
    private  String bookWritingTask;//编写任务

    @Column(name ="book_informative abstract")
    private  String bookInfomativeAbstract;//内容提要

    @Column(name ="book_review or not")
    private  String bookReviewOrNot;//是否审评(默认为否)

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

 public Long getBookId() {
  return bookId;
 }

 public void setBookId(Long bookId) {
  this.bookId = bookId;
 }

 public String getBookPublisher() {
  return bookPublisher;
 }

 public void setBookPublisher(String bookPublisher) {
  this.bookPublisher = bookPublisher;
 }

 public Date getBookApplicationDate() {
  return bookApplicationDate;
 }

 public void setBookApplicationDate(Date bookApplicationDate) {
  this.bookApplicationDate = bookApplicationDate;
 }

 public String getBookName() {
  return bookName;
 }

 public void setBookName(String bookName) {
  this.bookName = bookName;
 }

 public String getBookThesecondleveldiscipline() {
  return bookThesecondleveldiscipline;
 }

 public void setBookThesecondleveldiscipline(String bookThesecondleveldiscipline) {
  this.bookThesecondleveldiscipline = bookThesecondleveldiscipline;
 }

 public Integer getBookPublishingHouseSpecialty() {
  return bookPublishingHouseSpecialty;
 }

 public void setBookPublishingHouseSpecialty(Integer bookPublishingHouseSpecialty) {
  this.bookPublishingHouseSpecialty = bookPublishingHouseSpecialty;
 }

 public Integer getBookPublicOfferingOrNot() {
  return bookPublicOfferingOrNot;
 }

 public void setBookPublicOfferingOrNot(Integer bookPublicOfferingOrNot) {
  this.bookPublicOfferingOrNot = bookPublicOfferingOrNot;
 }

 public Date getBookDeliveryTime() {
  return bookDeliveryTime;
 }

 public void setBookDeliveryTime(Date bookDeliveryTime) {
  this.bookDeliveryTime = bookDeliveryTime;
 }

 public Date getBookPublicTime() {
  return bookPublicTime;
 }

 public void setBookPublicTime(Date bookPublicTime) {
  this.bookPublicTime = bookPublicTime;
 }

 public Integer getBookManuscriptCategory() {
  return bookManuscriptCategory;
 }

 public void setBookManuscriptCategory(Integer bookManuscriptCategory) {
  this.bookManuscriptCategory = bookManuscriptCategory;
 }

 public String getBookNumberOfWords() {
  return bookNumberOfWords;
 }

 public void setBookNumberOfWords(String bookNumberOfWords) {
  this.bookNumberOfWords = bookNumberOfWords;
 }

 public String getBookPress() {
  return bookPress;
 }

 public void setBookPress(String bookPress) {
  this.bookPress = bookPress;
 }

 public String getBookPublicationOfRoyalty() {
  return bookPublicationOfRoyalty;
 }

 public void setBookPublicationOfRoyalty(String bookPublicationOfRoyalty) {
  this.bookPublicationOfRoyalty = bookPublicationOfRoyalty;
 }

 public String getBookEditorialBoardOrNot() {
  return bookEditorialBoardOrNot;
 }

 public void setBookEditorialBoardOrNot(String bookEditorialBoardOrNot) {
  this.bookEditorialBoardOrNot = bookEditorialBoardOrNot;
 }

 public Integer getBookContractForPublicationOrNot() {
  return bookContractForPublicationOrNot;
 }

 public void setBookContractForPublicationOrNot(Integer bookContractForPublicationOrNot) {
  this.bookContractForPublicationOrNot = bookContractForPublicationOrNot;
 }

 public String getBookApplication() {
  return bookApplication;
 }

 public void setBookApplication(String bookApplication) {
  this.bookApplication = bookApplication;
 }

 public Date getBookApprovalTime() {
  return bookApprovalTime;
 }

 public void setBookApprovalTime(Date bookApprovalTime) {
  this.bookApprovalTime = bookApprovalTime;
 }

 public String getBookPhone() {
  return bookPhone;
 }

 public void setBookPhone(String bookPhone) {
  this.bookPhone = bookPhone;
 }

 public String getBookTheNameOfTheProjectFundedByTheRelevantFund() {
  return bookTheNameOfTheProjectFundedByTheRelevantFund;
 }

 public void setBookTheNameOfTheProjectFundedByTheRelevantFund(String bookTheNameOfTheProjectFundedByTheRelevantFund) {
  this.bookTheNameOfTheProjectFundedByTheRelevantFund = bookTheNameOfTheProjectFundedByTheRelevantFund;
 }

 public String getBookFinanceDepartment() {
  return bookFinanceDepartment;
 }

 public void setBookFinanceDepartment(String bookFinanceDepartment) {
  this.bookFinanceDepartment = bookFinanceDepartment;
 }

 public String getBookProjectApprovalNumber() {
  return bookProjectApprovalNumber;
 }

 public void setBookProjectApprovalNumber(String bookProjectApprovalNumber) {
  this.bookProjectApprovalNumber = bookProjectApprovalNumber;
 }

 public String getBookTheUndersignedOfTheManuscript() {
  return bookTheUndersignedOfTheManuscript;
 }

 public void setBookTheUndersignedOfTheManuscript(String bookTheUndersignedOfTheManuscript) {
  this.bookTheUndersignedOfTheManuscript = bookTheUndersignedOfTheManuscript;
 }

 public String getBookWritingTask() {
  return bookWritingTask;
 }

 public void setBookWritingTask(String bookWritingTask) {
  this.bookWritingTask = bookWritingTask;
 }

 public String getBookInfomativeAbstract() {
  return bookInfomativeAbstract;
 }

 public void setBookInfomativeAbstract(String bookInfomativeAbstract) {
  this.bookInfomativeAbstract = bookInfomativeAbstract;
 }

 public String getBookReviewOrNot() {
  return bookReviewOrNot;
 }

 public void setBookReviewOrNot(String bookReviewOrNot) {
  this.bookReviewOrNot = bookReviewOrNot;
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
  return "Book{" +
          "bookId=" + bookId +
          ", bookPublisher='" + bookPublisher + '\'' +
          ",  bookApplicationDate='" +  bookApplicationDate + '\'' +
          ", bookName='" + bookName + '\'' +
          ", bookThesecondleveldiscipline='" + bookThesecondleveldiscipline + '\'' +
          ", bookPublishingHouseSpecialty='" +bookPublishingHouseSpecialty + '\'' +
          ", bookPublicOfferingOrNot='" +  bookPublicOfferingOrNot + '\'' +
          ", bookDeliveryTime='"+bookDeliveryTime+'\''+
          ", bookPublicTime='"+bookPublicTime+'\''+
          ", bookManuscriptCategory='"+bookManuscriptCategory+'\''+
          ", bookNumberOfWords='"+bookNumberOfWords+'\''+
          ", bookPress='"+bookPress+'\''+
          ", bookPublicationOfRoyalty='"+bookPublicationOfRoyalty+'\''+
          ", bookEditorialBoardOrNot='"+ bookEditorialBoardOrNot+'\''+
          ", bookContractForPublicationOrNot='"+bookContractForPublicationOrNot+'\''+
          ", bookApplication='" + bookApplication + '\'' +
          ", bookApprovalTime='" + bookApprovalTime +'\''+
          ", bookPhone=" + bookPhone +'\''+
          ", bookTheNameOfTheProjectFundedByTheRelevantFund='" +bookTheNameOfTheProjectFundedByTheRelevantFund + '\'' +
          ", bookFinanceDepartment=" + bookFinanceDepartment +
          ", bookProjectApprovalNumber='" + bookProjectApprovalNumber + '\'' +
          ", bookTheUndersignedOfTheManuscript='" +bookTheUndersignedOfTheManuscript + '\'' +
          ", bookWritingTask='" +bookWritingTask + '\'' +
          ", bookInfomativeAbstract='" +bookInfomativeAbstract + '\'' +
          ", bookReviewOrNot='" +bookReviewOrNot + '\'' +
          ", createUserid=" + createUserid +
          ", createDate=" + createDate +
          ", updateUserid=" + updateUserid +
          ", updateDate=" + updateDate +
          '}';
 }
}
