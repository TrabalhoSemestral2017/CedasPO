-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 11-Maio-2017 às 12:16
-- Versão do servidor: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `escola`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `estudante`
--

CREATE TABLE `estudante` (
  `idestudante` int(5) DEFAULT NULL,
  `nome` varchar(25) NOT NULL,
  `bi` varchar(15) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `provincia` varchar(25) NOT NULL,
  `data de naiscimento` varchar(10) NOT NULL,
  `residencia` varchar(25) NOT NULL,
  `classe` varchar(10) NOT NULL,
  `apelido` varchar(25) NOT NULL,
  `naturalidade` varchar(25) NOT NULL,
  `nacionalidade` varchar(25) NOT NULL,
  `telefone` varchar(14) NOT NULL,
  `nomedamae` varchar(25) NOT NULL,
  `nomedopai` varchar(25) NOT NULL,
  `estadocivil` varchar(25) NOT NULL,
  `estadosaude` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor`
--

CREATE TABLE `professor` (
  `idProfessor` int(5) DEFAULT NULL,
  `nome` int(25) NOT NULL,
  `naturalidade` int(25) NOT NULL,
  `nomedopai` int(25) NOT NULL,
  `estadocivil` int(10) NOT NULL,
  `sexo` int(20) NOT NULL,
  `categoria` int(25) NOT NULL,
  `apelido` int(25) NOT NULL,
  `nacionalidade` varchar(25) NOT NULL,
  `data` varchar(25) NOT NULL,
  `nomedamae` varchar(25) NOT NULL,
  `nobi` int(14) NOT NULL,
  `contacto` int(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
