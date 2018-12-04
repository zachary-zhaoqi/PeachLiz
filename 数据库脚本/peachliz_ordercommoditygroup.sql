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
-- Table structure for table `ordercommoditygroup`
--

DROP TABLE IF EXISTS `ordercommoditygroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ordercommoditygroup` (
  `idgrop` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单商品组id',
  `idorder` int(11) DEFAULT NULL COMMENT '订单编号',
  `productname` varchar(45) DEFAULT NULL COMMENT '产品组名称',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `total` double DEFAULT NULL COMMENT '合计',
  PRIMARY KEY (`idgrop`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='订单商品组';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordercommoditygroup`
--

LOCK TABLES `ordercommoditygroup` WRITE;
/*!40000 ALTER TABLE `ordercommoditygroup` DISABLE KEYS */;
INSERT INTO `ordercommoditygroup` VALUES (1,2,'P1','',100),(2,5,'P2','',110),(3,4,'P3','',110),(4,2,'P4','',50),(5,1,'P2',NULL,64),(6,3,'P3',NULL,78),(7,3,'P1',NULL,99);
/*!40000 ALTER TABLE `ordercommoditygroup` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-04 18:24:28
