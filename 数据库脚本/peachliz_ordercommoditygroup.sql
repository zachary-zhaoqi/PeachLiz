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
  `idorder` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
  `idproductteam` int(11) DEFAULT NULL COMMENT '产品组编号',
  `productname` varchar(45) DEFAULT NULL COMMENT '产品组名称',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `total` double DEFAULT NULL COMMENT '合计',
  PRIMARY KEY (`idorder`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='订单商品组';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordercommoditygroup`
--

LOCK TABLES `ordercommoditygroup` WRITE;
/*!40000 ALTER TABLE `ordercommoditygroup` DISABLE KEYS */;
INSERT INTO `ordercommoditygroup` VALUES (1,1,'一','',100),(2,2,'二','',101),(3,3,'三','',102),(4,4,'四','',103),(5,5,'五','',104),(6,6,'六','',105),(7,7,'七','',106),(8,8,'八','',107),(9,9,'九','',108),(10,10,'十','',109);
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

-- Dump completed on 2018-12-03 21:42:28
