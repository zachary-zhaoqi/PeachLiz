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
-- Table structure for table `commodity`
--

DROP TABLE IF EXISTS `commodity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `commodity` (
  `idcommodity` int(11) NOT NULL AUTO_INCREMENT COMMENT '产品ID',
  `container` varchar(45) DEFAULT NULL COMMENT '箱号',
  `category` varchar(45) DEFAULT NULL COMMENT '品类',
  `model` varchar(45) DEFAULT NULL COMMENT '型号',
  `picture` varchar(45) DEFAULT NULL COMMENT '图片',
  `color` varchar(45) DEFAULT NULL COMMENT '颜色',
  `topfabric` varchar(45) DEFAULT NULL COMMENT '面-面料型号',
  `underfabric` varchar(45) DEFAULT NULL COMMENT '底-面料型号',
  `Accessoriesfabric` varchar(45) DEFAULT NULL COMMENT '附件面料型号',
  `factoryprice` double DEFAULT NULL COMMENT '出厂价',
  `retailprice` double DEFAULT NULL COMMENT '零售价',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `status` varchar(45) DEFAULT NULL COMMENT '产品状态',
  `creterdate` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcommodity`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='产品';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `commodity`
--

LOCK TABLES `commodity` WRITE;
/*!40000 ALTER TABLE `commodity` DISABLE KEYS */;
INSERT INTO `commodity` VALUES (1,'AB1','抱枕','BZ001','/commoditypic/BZ001.jpg','红色','T1','T2','R1',100,900,'','正常',NULL),(2,'AB2','抱枕','BZ002','/commoditypic/BZ002.jpg','蓝色','T1','T9','100',900,0,'R4','冻结',NULL),(3,'AB3','抱枕','BZ003','/commoditypic/BZ003.jpg','黄色','T8','T7','100',900,0,'R5','正常',NULL),(4,'AB4','抱枕','BZ004','/commoditypic/BZ004.jpg','绿色','T6','T5','100',900,0,'R6','正常',NULL),(5,'AB5','抱枕','BZ005','/commoditypic/BZ005.jpg','青色','T4','T3','100',900,0,'R7','正常',NULL),(6,'AB6','抱枕','BZ006','/commoditypic/BZ006.jpg','紫色','T1','T7','100',900,0,'R8','冻结',NULL),(7,'AB7','抱枕','BZ007','/commoditypic/BZ007.jpg','黑色','T3','T8','100',900,0,'R9','正常',NULL),(8,'AB8','抱枕','BZ008','/commoditypic/BZ008.jpg','褐色','T4','T2','100',900,0,'R2','正常',NULL),(9,'AB9','抱枕','BZ009','/commoditypic/BZ009.jpg','粉色','T5','T6','100',900,0,'R3','正常',NULL),(10,'AB10','抱枕','BZ010','/commoditypic/BZ010.jpg','白色','T9','T3','100',900,0,'R10','正常',NULL);
/*!40000 ALTER TABLE `commodity` ENABLE KEYS */;
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
