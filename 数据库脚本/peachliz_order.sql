-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: peachliz
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `order` (
  `idorder` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
  `projectname` varchar(45) DEFAULT NULL COMMENT '项目名称',
  `customer` varchar(45) DEFAULT NULL COMMENT '购买单位',
  `notes` varchar(45) DEFAULT NULL COMMENT '订单备注',
  `orderstatus` varchar(45) DEFAULT NULL COMMENT '订单状态',
  `expressnumber` varchar(45) DEFAULT NULL COMMENT '快递单号',
  `idshippingaddress` int(11) DEFAULT NULL COMMENT '收货地址id',
  `idorderdate` int(11) DEFAULT NULL COMMENT '订单时间id',
  `idorderamount` int(11) DEFAULT NULL COMMENT '订单金额id',
  PRIMARY KEY (`idorder`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
INSERT INTO `order` VALUES (1,'项目一','买家一','','正常','10',1,1,1),(2,'项目二','买家二','','正常','11',2,2,2),(3,'项目三','买家三','','正常','12',3,3,3),(4,'项目四','买家四','','正常','13',4,4,4),(5,'项目五','买家五','','正常','14',5,5,5),(6,'项目六','买家六','','正常','15',6,6,6),(7,'项目七','买家七','','正常','16',7,7,7),(8,'项目八','买家八','','正常','17',8,8,8),(9,'项目九','买家九','','正常','18',9,9,9),(10,'项目十','买家十','','正常','19',10,10,10);
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-05 10:47:31
