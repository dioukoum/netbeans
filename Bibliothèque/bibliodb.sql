-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : jeu. 09 fév. 2023 à 22:55
-- Version du serveur : 10.4.27-MariaDB
-- Version de PHP : 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `bibliodb`
--

-- --------------------------------------------------------

--
-- Structure de la table `inscription`
--

CREATE TABLE `inscription` (
  `id` int(11) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(35) NOT NULL,
  `sexe` varchar(8) NOT NULL,
  `date_de_naissance` date NOT NULL,
  `adresse` varchar(20) NOT NULL,
  `telephone` varchar(10) NOT NULL,
  `profession` varchar(20) NOT NULL,
  `nationalite` varchar(10) NOT NULL,
  `ville` varchar(10) NOT NULL,
  `region` varchar(10) NOT NULL,
  `pays_de_residence` varchar(10) NOT NULL,
  `date_inscription` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Déchargement des données de la table `inscription`
--

INSERT INTO `inscription` (`id`, `nom`, `prenom`, `sexe`, `date_de_naissance`, `adresse`, `telephone`, `profession`, `nationalite`, `ville`, `region`, `pays_de_residence`, `date_inscription`) VALUES
(1, 'SISSOKO', 'Dioukou Moussa', 'Masculin', '2000-09-29', 'Golf', '77403882', 'Etudiant', 'Malienne', 'Bamako', 'koulikoro', 'Mali', '2023-02-09'),
(2, 'DOUMBIA', 'Awani', 'Femin', '2005-12-30', 'Kalaban', '90001232', 'Etudiante', 'Malienne', 'Bamako', 'koulikoro', 'Mali', '2023-02-09');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `inscription`
--
ALTER TABLE `inscription`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
