-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-05-2022 a las 02:40:32
-- Versión del servidor: 10.1.35-MariaDB
-- Versión de PHP: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `servicios_miguelito`
--
DROP DATABASE IF EXISTS `servicios_miguelito`;
CREATE DATABASE IF NOT EXISTS `servicios_miguelito` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `servicios_miguelito`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE `cliente` (
  `dni` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `telefono` varchar(30) DEFAULT NULL,
  `email` varchar(80) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`dni`, `nombre`, `apellido`, `telefono`, `email`, `fecha_nacimiento`) VALUES
(29115095, 'Damian Ariel', 'Olaso', '+5491165651414', 'Darioloprete@gmail.com', '1981-11-01'),
(46959541, 'Thiago Gerard', 'Pereyra Santana', '+5491127599493', 'pereyrasantanathiago@gmail.com', '2005-10-13'),
(46994313, 'Lautaro', 'Feruglio', '+541162780960', 'skinnieraxis1lauf@gmail.com', '2006-04-27'),
(46994314, 'Joao', 'Pinto Sayaveedra', '+5491164577025', 'JoaoGustaHentai@gmail.com', '2006-05-21'),
(95245352, 'Junior', 'Espinola', '+5491125275973', 'juniorespinola.et.32@gmail.com', '2005-09-26'),
(95599909, 'Gustavo', 'Brasil Simioni', '+5491134863476', 'gustavo.brasil.et32@gmail.com', '2005-10-12'),
(95810729, 'Anderson', 'Suarez', 'suarezanderson.et32@gmail.com', '+54 9 1166108790', '2005-08-08');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mecanico`
--

DROP TABLE IF EXISTS `mecanico`;
CREATE TABLE `mecanico` (
  `legajo` int(8) NOT NULL,
  `ingreso` float DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mecanico`
--

INSERT INTO `mecanico` (`legajo`, `ingreso`, `nombre`, `apellido`) VALUES
(54313, 600.5, 'Nicole', 'Waterson'),
(449869, 500.5, 'João', 'Fring'),
(453905, 300.5, 'Samuel', 'Deluque'),
(678934, 80000000000000, 'Wilson', 'Fisk'),
(867474, 90000, 'Diosito', 'Borgues'),
(894567, 1500.66, 'miguel', 'palacios');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reparar`
--

DROP TABLE IF EXISTS `reparar`;
CREATE TABLE `reparar` (
  `ID` int(11) NOT NULL,
  `Fecha` date DEFAULT NULL,
  `cliente` int(11) DEFAULT NULL,
  `mecanico` int(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `reparar`
--

INSERT INTO `reparar` (`ID`, `Fecha`, `cliente`, `mecanico`) VALUES
(2, '2022-05-17', 46959541, 449869),
(3, '2022-07-30', 46994313, 54313),
(7, '2022-07-30', 46994313, 453905),
(8, '2022-08-08', 95810729, 453905),
(9, '2022-08-08', 95810729, 867474),
(11, '2022-08-08', 95810729, 894567);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `mecanico`
--
ALTER TABLE `mecanico`
  ADD PRIMARY KEY (`legajo`);

--
-- Indices de la tabla `reparar`
--
ALTER TABLE `reparar`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `cliente` (`cliente`),
  ADD KEY `mecanico` (`mecanico`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `reparar`
--
ALTER TABLE `reparar`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `reparar`
--
ALTER TABLE `reparar`
  ADD CONSTRAINT `reparar_ibfk_1` FOREIGN KEY (`cliente`) REFERENCES `cliente` (`dni`),
  ADD CONSTRAINT `reparar_ibfk_2` FOREIGN KEY (`mecanico`) REFERENCES `mecanico` (`legajo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
