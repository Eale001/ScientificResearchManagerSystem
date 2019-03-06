/*
Navicat MySQL Data Transfer

Source Server         : Test
Source Server Version : 50721
Source Host           : 192.168.47.128:3306
Source Database       : SRMS_system

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2019-03-05 18:04:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for srms_sys_dept
-- ----------------------------
DROP TABLE IF EXISTS `srms_sys_dept`;
CREATE TABLE `srms_sys_dept` (
  `dept_id` bigint(33) NOT NULL,
  `dept_name` varchar(250) DEFAULT NULL,
  `dept_tel` varchar(250) DEFAULT NULL,
  `dept_emial` varchar(250) DEFAULT NULL,
  `dept_addr` varchar(250) DEFAULT NULL,
  `create_userid` bigint(33) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_userid` bigint(33) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of srms_sys_dept
-- ----------------------------

-- ----------------------------
-- Table structure for srms_sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `srms_sys_menu`;
CREATE TABLE `srms_sys_menu` (
  `menu_id` bigint(33) NOT NULL,
  `is_show` int(10) DEFAULT NULL,
  `menu_grade` int(10) DEFAULT NULL COMMENT '权限值分数',
  `menu_icon` varchar(50) DEFAULT NULL,
  `menu_name` varchar(50) DEFAULT NULL,
  `menu_url` varchar(50) DEFAULT NULL,
  `parent_id` bigint(33) DEFAULT NULL COMMENT '父亲菜单ID',
  `sort_id` int(33) DEFAULT NULL COMMENT '菜单排序id',
  `create_userid` bigint(33) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_userid` bigint(33) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of srms_sys_menu
-- ----------------------------

-- ----------------------------
-- Table structure for srms_sys_position
-- ----------------------------
DROP TABLE IF EXISTS `srms_sys_position`;
CREATE TABLE `srms_sys_position` (
  `position_id` bigint(33) NOT NULL,
  `position_name` varchar(250) DEFAULT NULL,
  `position_level` varchar(250) DEFAULT NULL,
  `description` varchar(250) DEFAULT NULL,
  `create_userid` bigint(33) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_userid` bigint(33) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`position_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of srms_sys_position
-- ----------------------------

-- ----------------------------
-- Table structure for srms_sys_role
-- ----------------------------
DROP TABLE IF EXISTS `srms_sys_role`;
CREATE TABLE `srms_sys_role` (
  `role_id` bigint(33) NOT NULL,
  `role_name` varchar(33) DEFAULT NULL,
  `role_value` varchar(33) DEFAULT NULL,
  `create_userid` bigint(33) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_userid` bigint(33) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of srms_sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for srms_sys_role_power
-- ----------------------------
DROP TABLE IF EXISTS `srms_sys_role_power`;
CREATE TABLE `srms_sys_role_power` (
  `pk_id` bigint(50) NOT NULL,
  `is_show` int(10) DEFAULT NULL,
  `menu_id` bigint(33) DEFAULT NULL,
  `role_id` bigint(33) DEFAULT NULL,
  `create_userid` bigint(33) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_userid` bigint(33) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`pk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of srms_sys_role_power
-- ----------------------------

-- ----------------------------
-- Table structure for srms_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `srms_sys_user`;
CREATE TABLE `srms_sys_user` (
  `user_id` bigint(33) NOT NULL,
  `address` varchar(500) DEFAULT NULL,
  `bank` varchar(500) DEFAULT NULL COMMENT '银行卡',
  `birthday` datetime DEFAULT NULL,
  `email` varchar(250) DEFAULT NULL,
  `father_userid` bigint(33) DEFAULT NULL COMMENT '入职时间',
  `hire_date` datetime DEFAULT NULL,
  `user_idcard` varchar(250) DEFAULT NULL,
  `img_path` varchar(250) DEFAULT NULL,
  `is_lock` int(10) DEFAULT NULL,
  `password` varchar(33) DEFAULT NULL,
  `real_name` varchar(33) DEFAULT NULL,
  `salary` decimal(33,0) DEFAULT NULL,
  `user_school` varchar(250) DEFAULT NULL,
  `gender` int(10) DEFAULT NULL,
  `user_degree` varchar(33) DEFAULT NULL,
  `user_edu` varchar(33) DEFAULT NULL,
  `user_name` varchar(33) DEFAULT NULL,
  `user_tel` varchar(250) DEFAULT NULL,
  `dept_id` bigint(33) DEFAULT NULL,
  `position_id` bigint(33) DEFAULT NULL,
  `role_id` bigint(33) DEFAULT NULL,
  `score_research` decimal(33,0) DEFAULT NULL,
  `create_userid` bigint(33) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_userid` bigint(33) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of srms_sys_user
-- ----------------------------
