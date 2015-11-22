/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.1.73-community : Database - lab
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`lab` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `lab`;

/*Table structure for table `aluno` */

DROP TABLE IF EXISTS `aluno`;

CREATE TABLE `aluno` (
  `idAluno` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nomeAluno` varchar(100) DEFAULT NULL,
  `emailAluno` varchar(100) DEFAULT NULL,
  `matriculaAluno` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idAluno`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Table structure for table `chamada` */

DROP TABLE IF EXISTS `chamada`;

CREATE TABLE `chamada` (
  `idChamada` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Aluno_idAluno` int(10) unsigned NOT NULL,
  `presente` tinyint(1) NOT NULL,
  `disciplinaIdDisciplina` int(10) NOT NULL,
  PRIMARY KEY (`idChamada`),
  KEY `Chamada_FKIndex1` (`Aluno_idAluno`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Table structure for table `cursos` */

DROP TABLE IF EXISTS `cursos`;

CREATE TABLE `cursos` (
  `idCursos` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nomeCurso` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idCursos`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Table structure for table `diasaula` */

DROP TABLE IF EXISTS `diasaula`;

CREATE TABLE `diasaula` (
  `idDiasAula` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `diaAula` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idDiasAula`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Table structure for table `disciplina` */

DROP TABLE IF EXISTS `disciplina`;

CREATE TABLE `disciplina` (
  `idDisciplina` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `DiasAula_idDiasAula` int(10) unsigned NOT NULL,
  `Cursos_idCursos` int(10) unsigned NOT NULL,
  `nomeDisciplina` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idDisciplina`),
  KEY `Disciplina_FKIndex1` (`Cursos_idCursos`),
  KEY `Disciplina_FKIndex2` (`DiasAula_idDiasAula`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Table structure for table `matricula` */

DROP TABLE IF EXISTS `matricula`;

CREATE TABLE `matricula` (
  `idMatricula` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Disciplina_idDisciplina` int(10) unsigned NOT NULL,
  `Aluno_idAluno` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idMatricula`),
  KEY `Matricula_FKIndex1` (`Aluno_idAluno`),
  KEY `Matricula_FKIndex2` (`Disciplina_idDisciplina`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
