package com.eale.scientificresearchmanagersystem.system.bean.role;

import com.eale.scientificresearchmanagersystem.system.bean.system.SystemMenu;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 角色权限中间表
 */
@Entity
@Table(name = "srms_sys_role_power")
public class Rolepowerlist {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="pk_id")
    private Long pkId;


    @ManyToOne()
    @JoinColumn(name = "role_id")
    private Role roleId;

    @ManyToOne()
    @JoinColumn(name = "menu_id")
    private SystemMenu menuId;


    @Column(name="is_show")
    private Boolean check=false;

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public Rolepowerlist() {
    }

    public Rolepowerlist(Role roleId, SystemMenu menuId, Boolean check, Long createUserid, Timestamp createDate, Long updateUserid, Timestamp updateDate) {
        this.roleId = roleId;
        this.menuId = menuId;
        this.check = check;
        this.createUserid = createUserid;
        this.createDate = createDate;
        this.updateUserid = updateUserid;
        this.updateDate = updateDate;
    }

    public Long getPkId() {
        return pkId;
    }

    public void setPkId(Long pkId) {
        this.pkId = pkId;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    public SystemMenu getMenuId() {
        return menuId;
    }

    public void setMenuId(SystemMenu menuId) {
        this.menuId = menuId;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
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
        return "Rolepowerlist{" +
                "pkId=" + pkId +
                ", roleId=" + roleId +
                ", menuId=" + menuId +
                ", check=" + check +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
