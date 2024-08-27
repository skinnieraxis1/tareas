-- phpMyAdmin SQL Dump
-- version 4.4.12
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-06-2022 a las 02:33:35
-- Versión del servidor: 5.6.25
-- Versión de PHP: 5.6.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `control_fabricante`
--
CREATE DATABASE IF NOT EXISTS `control_fabricante` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `control_fabricante`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fabricante`
--

DROP TABLE IF EXISTS `fabricante`;
CREATE TABLE IF NOT EXISTS `fabricante` (
  `CUIT` varchar(20) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `razon_social` varchar(40) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `codigo` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `fabricante`
--

INSERT INTO `fabricante` (`CUIT`, `email`, `razon_social`, `tel`, `codigo`) VALUES
('20-12345678-1', 'manolitoElGlobito@esta.com', 'GlobitosManolo', '43 9 11-5531-7860', 1),
('20-57047211-5', 'gordofleroFiambreria@aguanteMC.com', 'GordoFelriFiambres', '43 9 11-7893-3421', 2),
('20-85943673-8', 'AsusGod@gmail.com', 'Asus', '43 9 11-8396-7396', 3),
('20-96746867-5', 'Lenovo@gmail.com', 'Lenovo', '43 9 11-8734-2323', 4),
('20-15464323-8', 'HewlettPackard@gmail.com', 'Hewlett-Packard', '43 9 11-8403-8278', 5),
('20-21230677-2', 'appleForro@gmail.com', 'Samsung', '43 9 11-6578-2135', 6),
('20-73958222-1', 'Seagategmail.com', 'Seagate', '43 9 11-5620-1795', 7),
('20-57653687-9', 'Crucial@gmail.com', 'Crucial', '43 9 11-8567-6548', 8),
('20-49235432-6', 'Gigabyte@gmail.com', 'Gigabyte', '43 9 11-8593-2564', 9),
('20-64967684-7', 'Huaweino@gmail.com', 'Huawei', '43 9 11-7869-4684', 10),
('20-75657456-0', 'Xiaomi@gmail.com', 'Xiaomi', '43 9 11-8764-2475', 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

DROP TABLE IF EXISTS `producto`;
CREATE TABLE IF NOT EXISTS `producto` (
  `codigo` int(11) NOT NULL DEFAULT '0',
  `nombre` varchar(30) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `codigo_fabricante` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`codigo`, `nombre`, `precio`, `codigo_fabricante`) VALUES
(1, 'Disco duro SATA3 1TB', 86.99, 5),
(2, 'Memoria RAM DDR4 8GB', 120, 6),
(3, 'Disco SSD 1 TB', 150.99, 4),
(4, 'GeForce GTX 1050Ti', 185, 7),
(5, 'GeForce GTX 1080 Xtreme', 755, 6),
(6, 'Monitor 24 LED Full HD', 202, 1),
(7, 'Monitor 27 LED Full HD', 245.99, 1),
(8, 'Portátil Yoga 520', 559, 2),
(9, 'Portátil Ideapd 320', 444, 2),
(10, 'Impresora HP Deskjet 3720', 59.99, 3),
(11, 'Impresora HP Laserjet Pro M26n', 180, 3),
(10874542, 'Globitos Extragrande Con Cara ', 5000, 1),
(10974012, 'Salmines Salados Con Extra Gra', 1500, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `fabricante`
--
ALTER TABLE `fabricante`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `codigo_fabricante` (`codigo_fabricante`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `fabricante`
--
ALTER TABLE `fabricante`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`codigo_fabricante`) REFERENCES `fabricante` (`codigo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
