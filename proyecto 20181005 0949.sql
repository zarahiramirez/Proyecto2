-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.12


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema proyecto
--

CREATE DATABASE IF NOT EXISTS proyecto;
USE proyecto;

--
-- Definition of table `departamento`
--

DROP TABLE IF EXISTS `departamento`;
CREATE TABLE `departamento` (
  `id_dep` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`id_dep`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `departamento`
--

/*!40000 ALTER TABLE `departamento` DISABLE KEYS */;
INSERT INTO `departamento` (`id_dep`,`nombre`) VALUES 
 (1,'Desarrollo'),
 (2,'Soporte'),
 (3,'ventas'),
 (4,'Recursos Humanos'),
 (5,'prueba'),
 (6,'Marketing'),
 (7,'Cocina'),
 (8,'Limpieza'),
 (9,'Paqueteria'),
 (10,'Intendencia'),
 (11,'Paqueteria2'),
 (12,'Paqueteria3');
/*!40000 ALTER TABLE `departamento` ENABLE KEYS */;


--
-- Definition of table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
CREATE TABLE `empleado` (
  `id_emp` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(80) NOT NULL,
  `id_dep` int(11) NOT NULL,
  PRIMARY KEY (`id_emp`),
  KEY `id_dep` (`id_dep`),
  CONSTRAINT `empleado_ibfk_1` FOREIGN KEY (`id_dep`) REFERENCES `departamento` (`id_dep`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `empleado`
--

/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` (`id_emp`,`nombre`,`id_dep`) VALUES 
 (1,'zarahi',2),
 (2,'Isela',1),
 (3,'Isidro',1),
 (4,'Camacho',1),
 (5,'Angel',1),
 (6,'Josefina',4),
 (7,'Domingo',1),
 (8,'Ruben',12);
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
