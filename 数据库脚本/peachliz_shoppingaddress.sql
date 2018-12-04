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
-- Table structure for table `shoppingaddress`
--

DROP TABLE IF EXISTS `shoppingaddress`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `shoppingaddress` (
  `idshippingaddress` int(11) NOT NULL AUTO_INCREMENT COMMENT '收货地址id',
  `contactname` varchar(45) DEFAULT NULL COMMENT '联系人姓名',
  `contactqq` varchar(45) DEFAULT NULL COMMENT '联系人qq',
  `contacttel` varchar(45) DEFAULT NULL COMMENT '联系人电话',
  `address` varchar(45) DEFAULT NULL COMMENT '收货地址',
  PRIMARY KEY (`idshippingaddress`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='收货地址';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoppingaddress`
--

LOCK TABLES `shoppingaddress` WRITE;
/*!40000 ALTER TABLE `shoppingaddress` DISABLE KEYS */;
INSERT INTO `shoppingaddress` VALUES (1,'赵一','9876543001','1234567001','北京'),(2,'赵二','9876543002','1234567002','上海'),(3,'赵三','9876543003','1234567003','福州'),(4,'赵四','9876543004','1234567004','天津'),(5,'赵五','9876543005','1234567005','广州'),(6,'赵六','9876543006','1234567006','成都'),(7,'赵七','9876543007','1234567007','昆明'),(8,'赵八','9876543008','1234567008','杭州'),(9,'赵九','9876543009','1234567009','合肥'),(10,'赵十','9876543010','1234567010','长沙');
/*!40000 ALTER TABLE `shoppingaddress` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-04 14:31:09
