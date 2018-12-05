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
-- Table structure for table `inventoryspecification`
--

DROP TABLE IF EXISTS `inventoryspecification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `inventoryspecification` (
  `idinventory` int(11) NOT NULL AUTO_INCREMENT COMMENT '库存id',
  `idcommodity` int(11) DEFAULT NULL COMMENT '产品id',
  `size` varchar(45) DEFAULT NULL COMMENT '尺寸',
  `number` int(11) DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (`idinventory`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='库存';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventoryspecification`
--

LOCK TABLES `inventoryspecification` WRITE;
/*!40000 ALTER TABLE `inventoryspecification` DISABLE KEYS */;
INSERT INTO `inventoryspecification` VALUES (1,1,'101',1000),(2,2,'102',1001),(3,3,'103',1002),(4,4,'104',1003),(5,5,'105',1004),(6,6,'106',1005),(7,7,'107',1006),(8,8,'108',1007),(9,9,'109',1008),(10,10,'110',1009);
/*!40000 ALTER TABLE `inventoryspecification` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-05 10:01:04
