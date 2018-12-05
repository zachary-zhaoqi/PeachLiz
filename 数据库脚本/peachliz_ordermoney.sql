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
-- Table structure for table `ordermoney`
--

DROP TABLE IF EXISTS `ordermoney`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ordermoney` (
  `idorderamount` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单金额id',
  `totalamount` double DEFAULT NULL COMMENT '面单总额',
  `taxes` double DEFAULT NULL COMMENT '税金',
  `downpayment` double DEFAULT NULL COMMENT '定金',
  `officialreceipts` double DEFAULT NULL COMMENT '实收额度',
  PRIMARY KEY (`idorderamount`)
) ENGINE=InnoDB AUTO_INCREMENT=110 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='订单金额';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordermoney`
--

LOCK TABLES `ordermoney` WRITE;
/*!40000 ALTER TABLE `ordermoney` DISABLE KEYS */;
INSERT INTO `ordermoney` VALUES (100,200,300,50,80),(101,201,301,51,81),(102,202,302,52,82),(103,203,303,53,83),(104,204,304,54,84),(105,205,305,55,85),(106,206,306,56,86),(107,207,307,57,87),(108,208,308,58,88),(109,209,309,59,89);
/*!40000 ALTER TABLE `ordermoney` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-05 10:01:07
