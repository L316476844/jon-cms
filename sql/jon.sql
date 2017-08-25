# --------------------------------------------------------
# Host:                         127.0.0.1
# Database:                     jon_cms
# Server version:               5.0.96-community-nt
# Server OS:                    Win64
# HeidiSQL version:             5.0.0.3272
# Date/time:                    2017-08-25 12:01:58
# --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
# Dumping database structure for jon_cms
DROP DATABASE IF EXISTS `jon_cms`;
CREATE DATABASE IF NOT EXISTS `jon_cms` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `jon_cms`;


# Dumping structure for table jon_cms.sys_admin
DROP TABLE IF EXISTS `sys_admin`;
CREATE TABLE IF NOT EXISTS `sys_admin` (
  `id` bigint(20) NOT NULL auto_increment COMMENT '主键',
  `user_name` varchar(30) NOT NULL default '' COMMENT '用户名',
  `password` varchar(100) NOT NULL default '' COMMENT '密码',
  `nick_name` varchar(30) NOT NULL default '' COMMENT '昵称',
  `gender` tinyint(2) NOT NULL default '0' COMMENT '性别 0-男 1-女 2-未知',
  `mobile` varchar(12) NOT NULL default '' COMMENT '手机号',
  `header` varchar(200) NOT NULL default '' COMMENT '头像地址',
  `create_time` datetime default NULL COMMENT '创建时间',
  `creator` bigint(20) NOT NULL default '-1' COMMENT '创建人',
  `modify_time` datetime default NULL COMMENT '最后修改时间',
  `modifier` bigint(20) NOT NULL default '-1' COMMENT '修改人',
  `version` bigint(20) NOT NULL default '0' COMMENT '版本号',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员';

# Dumping data for table jon_cms.sys_admin: 0 rows
/*!40000 ALTER TABLE `sys_admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_admin` ENABLE KEYS */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
