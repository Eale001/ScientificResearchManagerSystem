package com.eale.scientificresearchmanagersystem.system.bean.user;

import com.eale.scientificresearchmanagersystem.system.bean.role.Role;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "srms_sys_user")
public class User {

    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long userId;		//用户id

    @Column(name="user_name")
    @NotEmpty(message="用户名不能为空")
    private String userName;	//登录用户名

    @Column(name="user_tel")
    @NotEmpty(message="电话不能为空")
    private String userTel;		//用户电话

    @Column(name="real_name")
    @NotEmpty(message="真实姓名不能为空")
    private String realName;    //真实姓名


    @NotEmpty(message="邮箱不能为空")
    @Pattern(regexp="^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\\.[a-zA-Z0-9_-]{2,3}){1,2})$",message="请填写正确邮箱号")
    private String eamil;		//邮件

    @NotEmpty(message="地址不能为空")
    private String address;		//地址

    @Column(name="user_edu")
    @NotEmpty(message="学历不能为空")
    private String userEdu;		//用户学历

    @Column(name="user_degree")
    private String userDegree;		//用户学位


    private Boolean superman=false;

    @Column(name="user_school")
    @NotEmpty(message="毕业院校不能为空")
    private String school;		//学校

    @Column(name="user_idcard")
    @Pattern(regexp="^(\\d{6})(19|20)(\\d{2})(1[0-2]|0[1-9])(0[1-9]|[1-2][0-9]|3[0-1])(\\d{3})(\\d|X|x)?$",message="请填写正确身份证号")
    private String idCard;		//用户身份证

    @NotEmpty(message="卡号不能为空")
    @Length(min=16, max=19,message="银行卡号长度必须在16到19之间!")
    private String bank;		//银行

    private String gender;			//性别


    private Date birthday;			//生日


    private String password;	//用户密码

    private String salary;		//用户薪水

    @Column(name="img_path")
    private String imgPath;		//用户头像路径

    @Column(name="hire_time")
    private Date hireTime;		//入职时间

    @Column(name="is_lock")
    private Integer isLock=0;		//该用户是否被禁用

    @Column(name="father_userid")
    private Long fatherUserd;		//上司id

    @Column(name = "score_research")
    private BigDecimal scoreResearch;//科研分数


    @ManyToOne()
    @JoinColumn(name = "position_id")
    private Position position;	//外键关联 职位表

    @ManyToOne()
    @JoinColumn(name = "dept_id")
    private Dept dept;			//外键关联 部门表

    @ManyToOne()
    @JoinColumn(name = "role_id")
    private Role role;			//外键关联 角色表

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public User() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserEdu() {
        return userEdu;
    }

    public void setUserEdu(String userEdu) {
        this.userEdu = userEdu;
    }

    public String getUserDegree() {
        return userDegree;
    }

    public void setUserDegree(String userDegree) {
        this.userDegree = userDegree;
    }

    public Boolean getSuperman() {
        return superman;
    }

    public void setSuperman(Boolean superman) {
        this.superman = superman;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Date getHireTime() {
        return hireTime;
    }

    public void setHireTime(Date hireTime) {
        this.hireTime = hireTime;
    }

    public Integer getIsLock() {
        return isLock;
    }

    public void setIsLock(Integer isLock) {
        this.isLock = isLock;
    }

    public Long getFatherUserd() {
        return fatherUserd;
    }

    public void setFatherUserd(Long fatherUserd) {
        this.fatherUserd = fatherUserd;
    }

    public BigDecimal getScoreResearch() {
        return scoreResearch;
    }

    public void setScoreResearch(BigDecimal scoreResearch) {
        this.scoreResearch = scoreResearch;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userTel='" + userTel + '\'' +
                ", realName='" + realName + '\'' +
                ", eamil='" + eamil + '\'' +
                ", address='" + address + '\'' +
                ", userEdu='" + userEdu + '\'' +
                ", userDegree='" + userDegree + '\'' +
                ", superman=" + superman +
                ", school='" + school + '\'' +
                ", idCard='" + idCard + '\'' +
                ", bank='" + bank + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", password='" + password + '\'' +
                ", salary='" + salary + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", hireTime=" + hireTime +
                ", isLock=" + isLock +
                ", fatherUserd=" + fatherUserd +
                ", scoreResearch=" + scoreResearch +
                ", position=" + position +
                ", dept=" + dept +
                ", role=" + role +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
