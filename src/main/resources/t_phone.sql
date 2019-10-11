/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50727
Source Host           : localhost:3306
Source Database       : test1

Target Server Type    : MYSQL
Target Server Version : 50727
File Encoding         : 65001

Date: 2019-10-11 08:35:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_phone
-- ----------------------------
DROP TABLE IF EXISTS `t_phone`;
CREATE TABLE `t_phone` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ptitle` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `img` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pdesc` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of t_phone
-- ----------------------------
INSERT INTO `t_phone` VALUES ('1', 'IPhone11', 'Apple/苹果', '5999.00', 'p1.jpg', '清仓！仅北京，武汉仓有货！');
INSERT INTO `t_phone` VALUES ('2', '三星', '三星Galaxy  note10', '3111.00', 'p2.jpg', '下单送12000毫安移动电源！双3.5英寸魔焕炫屏，以非凡视野纵观天下时局，尊崇翻盖设计，张弛中，尽显从容气度！');
INSERT INTO `t_phone` VALUES ('3', '华为', '华为 p30 pro 24期免息', '5699.00', 'p3.jpg', 'Huawei/华为Mate 30 Pro超级快充徕卡电影四摄麒麟990 4G智能手机mate30pro华为官方旗舰店');
INSERT INTO `t_phone` VALUES ('4', 'oppo', 'OPPO 1100 4G全网通', '4200.00', 'p4.jpg', '送蓝牙耳机+至美一拍礼包！智能遥控2.0+，4G双卡双待，趣味拍照！');
INSERT INTO `t_phone` VALUES ('5', '华为', '华为 mete20 pro', '5000.00', 'p5.jpg', 'Huawei/华为 Mate 20 Pro 曲面屏后置徕卡三摄980芯片智能手机mate20pro');
INSERT INTO `t_phone` VALUES ('6', '小米', '小米9 pro', '4599.00', 'p6.jpg', 'xiaomi/小米9Pro手机5G手机小米官方旗舰店网mix4骁龙855plus九红米K20pro尊享版aipha');
INSERT INTO `t_phone` VALUES ('7', '一加七', '一加七pro', '4200.00', 'p7.jpg', '一加7Pro手机全新正品OnePlus7pro 骁龙855 一加七 6t 1+7T 一加7手机官方旗舰官网 一加7pro');
INSERT INTO `t_phone` VALUES ('8', 'vivo', 'vivo NEX 3 5G', '5698.00', 'p8.jpg', 'vivo NEX 3 5G高通骁龙855Plus处理器游戏屏幕指纹手机旗舰vivonex3 vivonex nex3 限量版');
