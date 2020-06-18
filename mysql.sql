/*
SQLyog Ultimate v12.2.6 (64 bit)
MySQL - 5.7.28-log : Database - meansystem
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`meansystem` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `meansystem`;

/*Table structure for table `finance` */

DROP TABLE IF EXISTS `finance`;

CREATE TABLE `finance` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `finance_no` varchar(32) NOT NULL COMMENT '财务编码',
  `finance_entry_time` varchar(32) NOT NULL COMMENT '财务入账时间',
  `financial_voucher_no` varchar(32) NOT NULL COMMENT '财务凭证号',
  `is_pocket` tinyint(1) NOT NULL DEFAULT '0' COMMENT '资产是否入库 0 否 1是',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `finance` */

insert  into `finance`(`id`,`finance_no`,`finance_entry_time`,`financial_voucher_no`,`is_pocket`) values 
(15,'12138','2020-05-18 02:11:36','PCB-12138',1),
(16,'12139','2020-05-18 02:12:02','PCB-12139',1),
(17,'12140','2020-05-18 02:20:11','PCB-12140',0),
(18,'12141','2020-05-18 02:20:24','PCB-12141',0),
(19,'12142','2020-05-18 02:20:31','PCB-12142',1);

/*Table structure for table `history` */

DROP TABLE IF EXISTS `history`;

CREATE TABLE `history` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `product_id` varchar(32) NOT NULL COMMENT '产品序列号',
  `property_name` varchar(32) NOT NULL COMMENT '资产名称',
  `product_model` varchar(32) NOT NULL COMMENT '规格型号',
  `borrow_time` varchar(32) NOT NULL COMMENT '借出时间',
  `back_time` varchar(32) NOT NULL DEFAULT '&nbsp;' COMMENT '归还时间',
  `product_user` varchar(32) DEFAULT NULL COMMENT '使用人',
  `product_keeper` varchar(32) NOT NULL COMMENT '保管人',
  `product_status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '物品状态，0为好，1为坏',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;

/*Data for the table `history` */

insert  into `history`(`id`,`product_id`,`property_name`,`product_model`,`borrow_time`,`back_time`,`product_user`,`product_keeper`,`product_status`) values 
(22,'AIQOB9','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(23,'AIQOB6','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(24,'AIQOB7','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(25,'AIQOB10','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(26,'AIQOB3','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(27,'AIQOB18','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(28,'AIQOB15','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(29,'AIQOB16','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(30,'AIQOB17','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(31,'AIQOB12','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(32,'AIQOB2','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(33,'AIQOB19','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(34,'AIQOB14','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(35,'AIQOB11','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(36,'AIQOB4','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(37,'AIQOB13','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(38,'AIQOB5','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(39,'AIQOB1','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(40,'AIQOB8','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0),
(41,'AIQOB0','签字笔','0.5','2020-05-18 02:24:58','&nbsp;','1','张大爷',0);

/*Table structure for table `pocket` */

DROP TABLE IF EXISTS `pocket`;

CREATE TABLE `pocket` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `property_family` varchar(32) NOT NULL COMMENT '资产类别',
  `property_name` varchar(32) NOT NULL COMMENT '资产名称',
  `count` int(11) NOT NULL COMMENT '总数',
  `entry_time` varchar(32) NOT NULL COMMENT '入库时间',
  `finance_no` varchar(32) NOT NULL COMMENT '财务编码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `pocket` */

insert  into `pocket`(`id`,`property_family`,`property_name`,`count`,`entry_time`,`finance_no`) values 
(11,'12138','电脑',5,'2020-05-18 02:14:03','12138'),
(12,'12142','办公桌椅',5,'2020-05-18 02:21:36','12142'),
(13,'12139','签字笔',20,'2020-05-18 02:23:43','12139');

/*Table structure for table `property` */

DROP TABLE IF EXISTS `property`;

CREATE TABLE `property` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `finance_no` varchar(32) NOT NULL COMMENT '财务编码',
  `finance_entry_time` varchar(32) NOT NULL COMMENT '财务入账时间',
  `financial_voucher_no` varchar(32) NOT NULL COMMENT '财务凭证号',
  `property_no` varchar(32) NOT NULL COMMENT '资产编码',
  `property_family` varchar(32) NOT NULL COMMENT '资产类别',
  `property_name` varchar(32) NOT NULL COMMENT '资产名称',
  `product_id` varchar(32) NOT NULL COMMENT '产品序列号',
  `product_model` varchar(32) NOT NULL COMMENT '规格型号',
  `product_pocket_time` varchar(32) NOT NULL COMMENT '入库时间',
  `product_unit` varchar(32) NOT NULL COMMENT '单位',
  `product_count` int(11) NOT NULL COMMENT '数量',
  `product_price` double NOT NULL COMMENT '价格',
  `product_health` tinyint(1) NOT NULL DEFAULT '0' COMMENT '健康状态，0为健康 1为损坏',
  `product_keeper` varchar(32) NOT NULL COMMENT '保管人',
  `product_user` varchar(32) DEFAULT NULL COMMENT '使用人',
  `product_status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否闲置，0闲置、1申请使用  2为已经审批',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8;

/*Data for the table `property` */

insert  into `property`(`id`,`finance_no`,`finance_entry_time`,`financial_voucher_no`,`property_no`,`property_family`,`property_name`,`product_id`,`product_model`,`product_pocket_time`,`product_unit`,`product_count`,`product_price`,`product_health`,`product_keeper`,`product_user`,`product_status`) values 
(47,'12138','2020-05-18 02:14:03','PCB-12138','IUBXL','12138','电脑','IQMVO0','I7-7700HQ  GTX1050TI  250GSSD 8G','2020-05-18 02:14:03','运维部',1,3599,0,'曾小贤',NULL,0),
(48,'12138','2020-05-18 02:14:03','PCB-12138','IUBXL','12138','电脑','IQMVO1','I7-7700HQ  GTX1050TI  250GSSD 8G','2020-05-18 02:14:03','运维部',1,3599,0,'曾小贤',NULL,0),
(49,'12138','2020-05-18 02:14:03','PCB-12138','IUBXL','12138','电脑','IQMVO2','I7-7700HQ  GTX1050TI  250GSSD 8G','2020-05-18 02:14:03','运维部',1,3599,0,'曾小贤',NULL,0),
(50,'12138','2020-05-18 02:14:03','PCB-12138','IUBXL','12138','电脑','IQMVO3','I7-7700HQ  GTX1050TI  250GSSD 8G','2020-05-18 02:14:03','运维部',1,3599,0,'曾小贤',NULL,0),
(51,'12138','2020-05-18 02:14:03','PCB-12138','IUBXL','12138','电脑','IQMVO4','I7-7700HQ  GTX1050TI  250GSSD 8G','2020-05-18 02:14:03','运维部',1,3599,0,'曾小贤',NULL,0),
(52,'12142','2020-05-18 02:21:36','PCB-12142','PFJOH','12142','办公桌椅','IGYIV0','128*128*128','2020-05-18 02:21:36','运维部',1,299,0,'胡一菲',NULL,0),
(53,'12142','2020-05-18 02:21:36','PCB-12142','PFJOH','12142','办公桌椅','IGYIV1','128*128*128','2020-05-18 02:21:36','运维部',1,299,0,'胡一菲',NULL,0),
(54,'12142','2020-05-18 02:21:36','PCB-12142','PFJOH','12142','办公桌椅','IGYIV2','128*128*128','2020-05-18 02:21:36','运维部',1,299,0,'胡一菲',NULL,0),
(55,'12142','2020-05-18 02:21:36','PCB-12142','PFJOH','12142','办公桌椅','IGYIV3','128*128*128','2020-05-18 02:21:36','运维部',1,299,0,'胡一菲',NULL,0),
(56,'12142','2020-05-18 02:21:36','PCB-12142','PFJOH','12142','办公桌椅','IGYIV4','128*128*128','2020-05-18 02:21:36','运维部',1,299,0,'胡一菲',NULL,0),
(57,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB0','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(58,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB1','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(59,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB2','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(60,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB3','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(61,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB4','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(62,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB5','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(63,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB6','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(64,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB7','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(65,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB8','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(66,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB9','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(67,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB10','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(68,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB11','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(69,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB12','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(70,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB13','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(71,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB14','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(72,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB15','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(73,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB16','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(74,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB17','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(75,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB18','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1),
(76,'12139','2020-05-18 02:23:43','PCB-12139','SSYGS','12139','签字笔','AIQOB19','0.5','2020-05-18 02:23:43','服务',1,1.5,0,'张大爷','1',1);

/*Table structure for table `scrap` */

DROP TABLE IF EXISTS `scrap`;

CREATE TABLE `scrap` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` varchar(32) NOT NULL,
  `product_name` varchar(32) NOT NULL,
  `in_time` varchar(32) NOT NULL,
  `out_time` varchar(32) DEFAULT '&nbsp;',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

/*Data for the table `scrap` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `user_name` varchar(16) NOT NULL COMMENT '用户名',
  `user_password` varchar(16) NOT NULL COMMENT '密码',
  `user_identity` varchar(16) NOT NULL DEFAULT '普通用户' COMMENT '用户身份',
  `user_status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否锁定',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`user_id`,`user_name`,`user_password`,`user_identity`,`user_status`) values 
(1,'admin','admin','超级管理员',0),
(2,'张三','123','超级管理员',0),
(3,'lili','123','普通用户',0),
(4,'1','1','管理员',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
