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
-- Table structure for table `ordercommoditygroupentry`
--

DROP TABLE IF EXISTS `ordercommoditygroupentry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ordercommoditygroupentry` (
  `idproductteam` int(11) NOT NULL COMMENT '产品组编号',
  `idgrop` int(11) NOT NULL COMMENT '订单商品组id',
  `idinventory` int(11) NOT NULL,
  `retailprice` double DEFAULT NULL COMMENT '零售价',
  `number` int(11) NOT NULL COMMENT '数量',
  `detail` varchar(100) DEFAULT NULL COMMENT '工艺细节',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`idproductteam`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品组条目';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordercommoditygroupentry`
--

LOCK TABLES `ordercommoditygroupentry` WRITE;
/*!40000 ALTER TABLE `ordercommoditygroupentry` DISABLE KEYS */;
/*!40000 ALTER TABLE `ordercommoditygroupentry` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-05 10:01:03
