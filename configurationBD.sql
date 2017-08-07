-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Ven 28 Avril 2017 à 13:14
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `distr`
--

-- --------------------------------------------------------

--
-- Structure de la table `bs`
--

CREATE TABLE `bs` (
  `cin` varchar(15) NOT NULL,
  `NumBs` varchar(15) NOT NULL,
  `NomMedcin` varchar(15) NOT NULL,
  `Date` varchar(20) NOT NULL,
  `Heure` varchar(10) NOT NULL,
  `PharmacieMatr` varchar(15) NOT NULL,
  `MatriculeMedcin` varchar(15) NOT NULL,
  `Totale` varchar(10) NOT NULL,
  `montant` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `bs`
--

INSERT INTO `bs` (`cin`, `NumBs`, `NomMedcin`, `Date`, `Heure`, `PharmacieMatr`, `MatriculeMedcin`, `Totale`, `montant`) VALUES
('155 ', ' 1114', ' yassin', ' 21/05/2017     ', '14     ', ' ph002', 'med001', ' 1000   ', '900'),
('155 ', ' 1114', ' yassin', ' 21/05/2017     ', '14     ', ' ph002', 'med001', ' 1000   ', '900');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
