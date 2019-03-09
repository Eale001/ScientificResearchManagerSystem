package com.eale.scientificresearchmanagersystem.system.bean.user;

import com.eale.scientificresearchmanagersystem.system.bean.system.SystemMenu;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 在线用户对象
 * 
 * @version 1.0
 */
public class Client implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	private User user;


	private Map<String, SystemMenu> menus;
	private Map<Integer, List<SystemMenu>> menuMap;

	/**
	 * 用户IP
	 */
	private String ip;
	/**
	 *登录时间
	 */
	private java.util.Date logindatetime;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Map<String, SystemMenu> getMenus() {
		return menus;
	}

	public void setMenus(Map<String, SystemMenu> menus) {
		this.menus = menus;
	}

	public Map<Integer, List<SystemMenu>> getMenuMap() {
		return menuMap;
	}

	public void setMenuMap(Map<Integer, List<SystemMenu>> menuMap) {
		this.menuMap = menuMap;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getLogindatetime() {
		return logindatetime;
	}

	public void setLogindatetime(Date logindatetime) {
		this.logindatetime = logindatetime;
	}
}
