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
-- Table structure for table `commodityoperation`
--

DROP TABLE IF EXISTS `commodityoperation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `commodityoperation` (
  `idoperation` int(11) NOT NULL AUTO_INCREMENT COMMENT '操作id',
  `idcommodity` int(11) DEFAULT NULL COMMENT '库存id',
  `idoperator` int(11) DEFAULT NULL COMMENT '操作员id',
  `operationdate` varchar(45) DEFAULT NULL COMMENT '操作时间',
  `change` varchar(45) DEFAULT NULL COMMENT '改变产品状态',
  PRIMARY KEY (`idoperation`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='产品操作细则';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `commodityoperation`
--

LOCK TABLES `commodityoperation` WRITE;
/*!40000 ALTER TABLE `commodityoperation` DISABLE KEYS */;
INSERT INTO `commodityoperation` VALUES (1,1,1,'10','空闲'),(2,2,2,'11','空闲'),(3,3,3,'12','空闲'),(4,4,4,'13','空闲'),(5,5,5,'14','空闲'),(6,6,6,'15','空闲'),(7,7,7,'16','空闲'),(8,8,8,'17','空闲'),(9,9,9,'18','空闲'),(10,10,10,'19','空闲');
/*!40000 ALTER TABLE `commodityoperation` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-05 10:01:02
