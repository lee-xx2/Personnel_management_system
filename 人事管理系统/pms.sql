/*
Navicat MySQL Data Transfer

Source Server         : lxx
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : pms

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2020-06-22 16:43:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `accound` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('李欣欣', '11', '111');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(100) NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `major` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `career` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('100', '许牧', '23', '男', '计算机专业', '省');
INSERT INTO `employee` VALUES ('109', '刘强', '34', '男', '软件专业', '省');
INSERT INTO `employee` VALUES ('111', '邓力夫', '24', '男', '物流管理', '省');
INSERT INTO `employee` VALUES ('112', '罗秋雨', '23', '女', '会计', '省');
INSERT INTO `employee` VALUES ('113', '刘阳', '25', '男', '国际经济与贸易', '哼');
INSERT INTO `employee` VALUES ('334', '梁浩', '26', '男', '计算机专业', '省');
INSERT INTO `employee` VALUES ('445', '吴敏', '26', '女', '信息管理与信息技术', '省');
INSERT INTO `employee` VALUES ('555', '刘倩', '27', '女', '计算计专业', '省');
INSERT INTO `employee` VALUES ('664', '刘琳', '28', '女', '金融', '省');
INSERT INTO `employee` VALUES ('543', '李阳', '29', '男', '房地产', '省');
INSERT INTO `employee` VALUES ('432', '东阳', '34', '男', '管理科学', '省');
INSERT INTO `employee` VALUES ('445', '段任飞', '25', '男', '计算机专业', '省');

-- ----------------------------
-- Table structure for existing_worksheet
-- ----------------------------
DROP TABLE IF EXISTS `existing_worksheet`;
CREATE TABLE `existing_worksheet` (
  `no` int(255) NOT NULL,
  `depart_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `work_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `now_number` int(11) DEFAULT NULL,
  `work` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `remain_number` int(255) DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of existing_worksheet
-- ----------------------------
INSERT INTO `existing_worksheet` VALUES ('1', '采购部', '实习', '10', '采购原材料', '2');
INSERT INTO `existing_worksheet` VALUES ('3', '营业部修改', '人才', '16', '营业部工作内容修改', '15');
INSERT INTO `existing_worksheet` VALUES ('6', '促销部', '促销修改', '15', '促销修改', '15');
INSERT INTO `existing_worksheet` VALUES ('8', '企划部', 'hh', '13', '此处省略300字', '12');
INSERT INTO `existing_worksheet` VALUES ('9', '产品开发部', 'ii', '12', '省略', '11');
INSERT INTO `existing_worksheet` VALUES ('10', '采购部', 'jj', '14', '此处省略900字', '14');
INSERT INTO `existing_worksheet` VALUES ('11', '市场部', 'kk', '14', '省略', '14');
INSERT INTO `existing_worksheet` VALUES ('12', '财务部', 'll', '16', '哈哈哈啊啊啊', '16');
INSERT INTO `existing_worksheet` VALUES ('13', '工程部', 'mm', '15', '哈哈拉拉拉', '15');
INSERT INTO `existing_worksheet` VALUES ('14', '财务部', 'aa', '16', '省略', '15');
INSERT INTO `existing_worksheet` VALUES ('15', '业务部', 'bb', '16', '省', '14');

-- ----------------------------
-- Table structure for job_seeker
-- ----------------------------
DROP TABLE IF EXISTS `job_seeker`;
CREATE TABLE `job_seeker` (
  `id` int(100) NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `major` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `career` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of job_seeker
-- ----------------------------
INSERT INTO `job_seeker` VALUES ('111', '邓力夫', '24', '男', '物流管理', '省');
INSERT INTO `job_seeker` VALUES ('112', '罗秋雨', '23', '女', '会计', '省');
INSERT INTO `job_seeker` VALUES ('113', '刘阳', '25', '男', '国际经济与贸易', '哼');
INSERT INTO `job_seeker` VALUES ('334', '梁浩', '26', '男', '计算机专业', '省');
INSERT INTO `job_seeker` VALUES ('445', '吴敏', '26', '女', '信息管理与信息技术', '省');
INSERT INTO `job_seeker` VALUES ('555', '刘倩', '27', '女', '计算计专业', '省');
INSERT INTO `job_seeker` VALUES ('664', '刘琳', '28', '女', '金融', '省');
INSERT INTO `job_seeker` VALUES ('543', '李阳', '29', '男', '房地产', '省');
INSERT INTO `job_seeker` VALUES ('432', '东阳', '34', '男', '管理科学', '省');
INSERT INTO `job_seeker` VALUES ('445', '段任飞', '25', '男', '计算机专业', '省');
INSERT INTO `job_seeker` VALUES ('13', '李欣欣', '22', '女', '信管', '无');
INSERT INTO `job_seeker` VALUES ('3', '刘强', '23', '男', '信管', '无');

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `name` varchar(255) NOT NULL,
  `accound` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`accound`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('李欣欣', '11', '11');
INSERT INTO `login` VALUES ('晓林', '111', '111');
INSERT INTO `login` VALUES ('郭杰', '11111', '11');
INSERT INTO `login` VALUES ('李鑫鑫', '12', '12');
INSERT INTO `login` VALUES ('李琳', '123', '123456');
INSERT INTO `login` VALUES ('李诗敏', '123456', '444');
INSERT INTO `login` VALUES ('李恺', '12345678', '555');
INSERT INTO `login` VALUES ('李思宁', '123456789', '666');
INSERT INTO `login` VALUES ('刘', '13344', '22');
INSERT INTO `login` VALUES ('郑琰', '15521279726', '1');
INSERT INTO `login` VALUES ('张凌', '2', '1');
INSERT INTO `login` VALUES ('李靓', '44', '55');
INSERT INTO `login` VALUES ('李杏和', '55', '666');
INSERT INTO `login` VALUES ('卜欢欢', '666', '666');
INSERT INTO `login` VALUES ('张三', '6666', '6666');
INSERT INTO `login` VALUES ('马阳鸿', '777', '555');
INSERT INTO `login` VALUES ('郑琰', '8', '8');

-- ----------------------------
-- Table structure for wages
-- ----------------------------
DROP TABLE IF EXISTS `wages`;
CREATE TABLE `wages` (
  `department` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `id` int(255) DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `biaozhun` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ticheng` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `yingfa` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `koushui` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `shifa` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of wages
-- ----------------------------
INSERT INTO `wages` VALUES ('销售部', '4', '张焕', '3500', '500', '4000', '450', '3500');
INSERT INTO `wages` VALUES ('销售部', '5', '张靓仙', '3500', '500', '4000', '450', '3500');
INSERT INTO `wages` VALUES ('销售部', '6', '周杰', '3500', '500', '4000', '450', '3500');
INSERT INTO `wages` VALUES ('采购部', '4', '添加张三', '3000', '500', '3500', '100', '3400');

-- ----------------------------
-- View structure for temp
-- ----------------------------
DROP VIEW IF EXISTS `temp`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `temp` AS select `existing_worksheet`.`no` AS `no`,`existing_worksheet`.`depart_name` AS `depart_name`,`existing_worksheet`.`work_type` AS `work_type`,`existing_worksheet`.`now_number` AS `now_number`,`existing_worksheet`.`work` AS `work`,`existing_worksheet`.`remain_number` AS `remain_number` from `existing_worksheet` where (`existing_worksheet`.`work` like '%省略%') ;
