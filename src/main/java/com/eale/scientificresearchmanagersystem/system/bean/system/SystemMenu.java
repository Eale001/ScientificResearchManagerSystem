package com.eale.scientificresearchmanagersystem.system.bean.system;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 系统菜单
 */
@Entity
@Table(name = "srms_sys_menu")
public class SystemMenu {
    @Id
    @Column(name = "menu_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuId; // 菜单id

    @Column(name = "parent_id")
    private Long parentId=0L; // 父id

    @Column(name = "menu_name")
    @NotEmpty(message="菜单名字不能为空")
    private String menuName; // 菜单名字

    @Column(name = "menu_url")
    @NotEmpty(message="{sysMenu.menuUrl.NotNull}")
    private String menuUrl; // 菜单链接

    @Column(name = "menu_icon")
    private String menuIcon; // 菜单图标

    @Column(name = "sort_id")
    private Integer sortId=999; // 菜单排序id

    @Column(name = "is_show")
    private Boolean show=false; // 菜单是否显示

    @Column(name = "menu_grade")
    private Integer menuGrade; // 权限值分数

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public SystemMenu() {
    }

    public SystemMenu(Long parentId, @NotEmpty(message = "菜单名字不能为空") String menuName, @NotEmpty(message = "{sysMenu.menuUrl.NotNull}") String menuUrl, String menuIcon, Integer sortId, Boolean show, Integer menuGrade, Long createUserid, Timestamp createDate, Long updateUserid, Timestamp updateDate) {
        this.parentId = parentId;
        this.menuName = menuName;
        this.menuUrl = menuUrl;
        this.menuIcon = menuIcon;
        this.sortId = sortId;
        this.show = show;
        this.menuGrade = menuGrade;
        this.createUserid = createUserid;
        this.createDate = createDate;
        this.updateUserid = updateUserid;
        this.updateDate = updateDate;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Integer getMenuGrade() {
        return menuGrade;
    }

    public void setMenuGrade(Integer menuGrade) {
        this.menuGrade = menuGrade;
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
        return "SystemMenu{" +
                "menuId=" + menuId +
                ", parentId=" + parentId +
                ", menuName='" + menuName + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", menuIcon='" + menuIcon + '\'' +
                ", sortId=" + sortId +
                ", show=" + show +
                ", menuGrade=" + menuGrade +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
