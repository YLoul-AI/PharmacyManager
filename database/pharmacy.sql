-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : sam. 12 avr. 2025 à 15:18
-- Version du serveur : 8.0.31
-- Version de PHP : 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `pharmacy`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `User` varchar(30) NOT NULL,
  `pwd` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `admin`
--

INSERT INTO `admin` (`User`, `pwd`) VALUES
('user', 'user'),
('u', '');

-- --------------------------------------------------------

--
-- Structure de la table `agent`
--

DROP TABLE IF EXISTS `agent`;
CREATE TABLE IF NOT EXISTS `agent` (
  `IdAgent` int NOT NULL,
  `NomAg` varchar(20) NOT NULL,
  `AgeAgent` int NOT NULL,
  `TelAgent` int NOT NULL,
  `PwdAgent` varchar(20) NOT NULL,
  `GenderAgent` varchar(8) NOT NULL,
  PRIMARY KEY (`IdAgent`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `agent`
--

INSERT INTO `agent` (`IdAgent`, `NomAg`, `AgeAgent`, `TelAgent`, `PwdAgent`, `GenderAgent`) VALUES
(2, 'Ahmed', 45, 676701, 'ahm12345', 'Homme'),
(3, 'Sofia', 29, 676702, 'sof56789', 'Femme'),
(1, 'Fatima', 34, 676700, 'fat08989', 'Femme'),
(5, 'Leila', 32, 676704, 'lei34567', 'Femme');

-- --------------------------------------------------------

--
-- Structure de la table `entreprise`
--

DROP TABLE IF EXISTS `entreprise`;
CREATE TABLE IF NOT EXISTS `entreprise` (
  `IdEntr` int NOT NULL,
  `NomEnt` varchar(20) NOT NULL,
  `ExpEnt` varchar(20) NOT NULL,
  `TelEnt` int NOT NULL,
  `AdrsEnt` varchar(27) NOT NULL,
  PRIMARY KEY (`IdEntr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `entreprise`
--

INSERT INTO `entreprise` (`IdEntr`, `NomEnt`, `ExpEnt`, `TelEnt`, `AdrsEnt`) VALUES
(4, 'Entreprise4', 'Financier', 7000, 'Rabat'),
(5, 'Entreprise5', 'Agriculture', 677777, 'Marrakech'),
(2, 'Entreprise2', 'Technologie', 5004, 'Casablanca'),
(3, 'Entreprise3', 'Professionnel', 8989, 'El jadida'),
(6, 'Entreprise6', 'Logistique', 5500, 'Tanger');

-- --------------------------------------------------------

--
-- Structure de la table `medcine`
--

DROP TABLE IF EXISTS `medcine`;
CREATE TABLE IF NOT EXISTS `medcine` (
  `IdMed` int NOT NULL,
  `MedicamemtMed` varchar(20) NOT NULL,
  `PrixMed` float NOT NULL,
  `QteMed` int NOT NULL,
  `FabDateMed` date NOT NULL,
  `ExpDateMed` date NOT NULL,
  `EntrepriseMed` varchar(20) NOT NULL,
  PRIMARY KEY (`IdMed`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `medcine`
--

INSERT INTO `medcine` (`IdMed`, `MedicamemtMed`, `PrixMed`, `QteMed`, `FabDateMed`, `ExpDateMed`, `EntrepriseMed`) VALUES
(26, 'Doliprane', 23.09, 200, '2024-05-16', '2033-08-23', 'Ent1'),
(1, 'farmadocie', 50, 100, '2024-05-10', '2026-05-15', 'Entreprise4'),
(27, 'Aspirine', 15.5, 150, '2024-05-18', '2033-08-25', 'Entreprise2'),
(30, 'Amoxicilline', 28.6, 90, '2024-05-24', '2033-08-31', 'Entreprise5');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
