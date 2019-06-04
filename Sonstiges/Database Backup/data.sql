CREATE DATABASE `swta`;

USE `swta`;

DROP TABLE IF EXISTS `packagesize`;

CREATE TABLE `packagesize` (
  `id` int(11) DEFAULT NULL,
  `size` varchar(3) DEFAULT NULL,
  `min_size` int(11) DEFAULT NULL,
  `max_size` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `packagesize` WRITE;

INSERT INTO `packagesize` VALUES (0,'XS',0,35),(1,'S',35,50),(3,'M',50,65),(4,'L',65,80),(5,'XL',80,300);
UNLOCK TABLES;

