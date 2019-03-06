package com.eale.scientificresearchmanagersystem.system.bean.user;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 *
 * 部门
 */
@Entity
@Table(name = "srms_sys_dept")
public class Dept {
    @Id
    @Column(name = "dept_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long deptId;	//部门id

    @Column(name = "dept_name")
    @NotEmpty(message="部门名称不为空")
    private String deptName;	//部门名字  非空 唯一

    @Column(name = "dept_tel")
    private String deptTel;		//部门电话

    @Column(name = "dept_emial")
    private String deptEmial;		//部门邮箱

    @Column(name = "dept_addr")
    private String deptAddr;	//部门地址

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public Dept() {
    }

    public Dept(@NotEmpty(message = "部门名称不为空") String deptName, String deptTel, String deptEmial, String deptAddr, Long createUserid, Timestamp createDate, Long updateUserid, Timestamp updateDate) {
        this.deptName = deptName;
        this.deptTel = deptTel;
        this.deptEmial = deptEmial;
        this.deptAddr = deptAddr;
        this.createUserid = createUserid;
        this.createDate = createDate;
        this.updateUserid = updateUserid;
        this.updateDate = updateDate;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptTel() {
        return deptTel;
    }

    public void setDeptTel(String deptTel) {
        this.deptTel = deptTel;
    }

    public String getDeptEmial() {
        return deptEmial;
    }

    public void setDeptEmial(String deptEmial) {
        this.deptEmial = deptEmial;
    }

    public String getDeptAddr() {
        return deptAddr;
    }

    public void setDeptAddr(String deptAddr) {
        this.deptAddr = deptAddr;
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
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptTel='" + deptTel + '\'' +
                ", deptEmial='" + deptEmial + '\'' +
                ", deptAddr='" + deptAddr + '\'' +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
