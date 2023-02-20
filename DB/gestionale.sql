-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versione server:              8.0.31 - MySQL Community Server - GPL
-- S.O. server:                  Win64
-- HeidiSQL Versione:            12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dump della struttura del database gestionare
CREATE DATABASE IF NOT EXISTS `gestionare` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `gestionare`;

-- Dump della struttura di tabella gestionare.impiegato
CREATE TABLE IF NOT EXISTS `impiegato` (
  `matricola` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `cognome` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `codicefiscale` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`matricola`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dump dei dati della tabella gestionare.impiegato: ~7 rows (circa)
REPLACE INTO `impiegato` (`matricola`, `nome`, `cognome`, `codicefiscale`) VALUES
	(1, 'ricky', 'rizza', 'csajlda'),
	(2, 'francisco', 'acosta', 'cstfnc'),
	(3, 'ermano', 'acosta', 'jhlfjad'),
	(5, 'ermano', 'acosta', 'jhlfjad'),
	(6, 'ernesto', 'martinez', 'jhlfjad'),
	(7, 'carlo', 'martinez', 'jhlfjad'),
	(8, 'karen', 'martinez', 'cstknv');

-- Dump della struttura di tabella gestionare.ruolo
CREATE TABLE IF NOT EXISTS `ruolo` (
  `idruolo` int NOT NULL AUTO_INCREMENT,
  `descrizione` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idruolo`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dump dei dati della tabella gestionare.ruolo: ~3 rows (circa)
REPLACE INTO `ruolo` (`idruolo`, `descrizione`) VALUES
	(1, 'dentista'),
	(2, 'mecanico'),
	(3, 'engenier');

-- Dump della struttura di tabella gestionare.storico
CREATE TABLE IF NOT EXISTS `storico` (
  `idstorico` int NOT NULL AUTO_INCREMENT,
  `matricola` int DEFAULT NULL,
  `idruolo` int DEFAULT NULL,
  `datainizio` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `datafine` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idstorico`),
  KEY `FK_storico_impiegato` (`matricola`),
  KEY `FK_storico_ruolo` (`idruolo`),
  CONSTRAINT `FK_storico_impiegato` FOREIGN KEY (`matricola`) REFERENCES `impiegato` (`matricola`),
  CONSTRAINT `FK_storico_ruolo` FOREIGN KEY (`idruolo`) REFERENCES `ruolo` (`idruolo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dump dei dati della tabella gestionare.storico: ~1 rows (circa)
REPLACE INTO `storico` (`idstorico`, `matricola`, `idruolo`, `datainizio`, `datafine`) VALUES
	(1, 1, 1, '02/02/2015', '02/02/2022');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
