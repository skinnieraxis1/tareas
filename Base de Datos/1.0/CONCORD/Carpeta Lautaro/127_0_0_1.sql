-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-11-2022 a las 01:33:53
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `concord`
--
DROP DATABASE IF EXISTS `concord`;
CREATE DATABASE IF NOT EXISTS `concord` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `concord`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignar`
--

DROP TABLE IF EXISTS `asignar`;
CREATE TABLE `asignar` (
  `rol` int(11) DEFAULT NULL,
  `usuario` int(11) DEFAULT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `asignar`
--

INSERT INTO `asignar` (`rol`, `usuario`, `ID`) VALUES
(2, 1, 2),
(3, 2, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `canal`
--

DROP TABLE IF EXISTS `canal`;
CREATE TABLE `canal` (
  `ID` int(11) NOT NULL,
  `servidor` int(11) DEFAULT NULL,
  `categoria` int(11) DEFAULT NULL,
  `personas_reales` int(7) DEFAULT NULL,
  `tiempo_pausado_seg` int(10) DEFAULT NULL,
  `tipo_de_canal` varchar(30) DEFAULT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `personas_max` int(7) DEFAULT NULL,
  `imagen` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `canal`
--

INSERT INTO `canal` (`ID`, `servidor`, `categoria`, `personas_reales`, `tiempo_pausado_seg`, `tipo_de_canal`, `descripcion`, `nombre`, `personas_max`, `imagen`) VALUES
(1, 0, 1, NULL, 0, 'chat', 'reglas', 'Reglas', NULL, NULL),
(2, 0, 1, NULL, 0, 'chat', 'actualizaciones', 'Actualizaciones', NULL, NULL),
(3, 2, 2, NULL, 0, 'chat', 'reglas', 'Reglas', NULL, NULL),
(4, 2, 2, NULL, 0, 'chat', 'actualizaciones', 'Actualizaciones', NULL, NULL),
(6, 2, 2, NULL, NULL, 'chat', 'un canal para probar si puedo ingresar canales', 'canal de prueba', NULL, NULL),
(7, 2, 2, NULL, NULL, 'chat', 'un canal para probar si puedo ingresar canales', 'canal de prueba', NULL, NULL),
(8, 2, 2, NULL, NULL, 'chat', 'como estas', 'hola que tal', NULL, NULL),
(9, 3, 4, NULL, 0, 'chat', 'reglas', 'Reglas', NULL, NULL),
(10, 3, 4, NULL, 0, 'chat', 'actualizaciones', 'Actualizaciones', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

DROP TABLE IF EXISTS `categoria`;
CREATE TABLE `categoria` (
  `ID` int(11) NOT NULL,
  `servidor` int(11) DEFAULT NULL,
  `Cant_canales` int(4) DEFAULT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `imagen` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`ID`, `servidor`, `Cant_canales`, `nombre`, `imagen`) VALUES
(1, 0, 2, 'normales', NULL),
(2, 2, 2, 'normales', NULL),
(3, 2, NULL, 'categoria 2', NULL),
(4, 3, 2, 'normales', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `configuraciones_server`
--

DROP TABLE IF EXISTS `configuraciones_server`;
CREATE TABLE `configuraciones_server` (
  `ID` int(11) NOT NULL,
  `creador` int(11) DEFAULT NULL,
  `canal_inactividad` int(11) DEFAULT NULL,
  `canal_reglas` int(11) DEFAULT NULL,
  `canal_actualizaciones` int(11) DEFAULT NULL,
  `lista_baneos` int(11) DEFAULT NULL,
  `servidor` int(11) DEFAULT NULL,
  `mensaje` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `configuraciones_server`
--

INSERT INTO `configuraciones_server` (`ID`, `creador`, `canal_inactividad`, `canal_reglas`, `canal_actualizaciones`, `lista_baneos`, `servidor`, `mensaje`) VALUES
(1, NULL, NULL, 1, 2, NULL, 0, NULL),
(2, 1, NULL, 3, 4, NULL, 2, NULL),
(3, 2, NULL, 9, 10, NULL, 3, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lista_baneos`
--

DROP TABLE IF EXISTS `lista_baneos`;
CREATE TABLE `lista_baneos` (
  `ID` int(11) NOT NULL,
  `dia_de_baneo` date DEFAULT NULL,
  `tipos_baneo` varchar(30) DEFAULT NULL,
  `duracion_baneo_min` int(10) DEFAULT NULL,
  `config_servidor` int(11) DEFAULT NULL,
  `miembro_baneador` int(11) DEFAULT NULL,
  `miembros_baneados` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `logear`
--

DROP TABLE IF EXISTS `logear`;
CREATE TABLE `logear` (
  `usuario` int(11) DEFAULT NULL,
  `miembros` int(11) DEFAULT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `logear`
--

INSERT INTO `logear` (`usuario`, `miembros`, `ID`) VALUES
(2, 1, 2),
(2, 2, 3),
(3, 3, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mensajes`
--

DROP TABLE IF EXISTS `mensajes`;
CREATE TABLE `mensajes` (
  `msg_id` int(11) NOT NULL,
  `incoming_msg_id` int(255) NOT NULL,
  `outgoing_msg_id` int(255) NOT NULL,
  `msg` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `miembros`
--

DROP TABLE IF EXISTS `miembros`;
CREATE TABLE `miembros` (
  `ID` int(11) NOT NULL,
  `dia_inicio` date DEFAULT NULL,
  `server` int(11) DEFAULT NULL,
  `roles_usuario` int(11) DEFAULT NULL,
  `mensaje` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `miembros`
--

INSERT INTO `miembros` (`ID`, `dia_inicio`, `server`, `roles_usuario`, `mensaje`) VALUES
(1, '2022-11-22', 2, NULL, NULL),
(2, '2022-11-22', 3, NULL, NULL),
(3, '2022-11-22', 3, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `permisos`
--

DROP TABLE IF EXISTS `permisos`;
CREATE TABLE `permisos` (
  `ID` int(11) NOT NULL,
  `poder_banear` tinyint(4) DEFAULT NULL,
  `modificar_canales` tinyint(4) DEFAULT NULL,
  `poder_kitear` tinyint(4) DEFAULT NULL,
  `poder_ensordecer` tinyint(4) DEFAULT NULL,
  `poder_silenciar` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `permitir`
--

DROP TABLE IF EXISTS `permitir`;
CREATE TABLE `permitir` (
  `roles` int(11) DEFAULT NULL,
  `permisos_administrador` int(11) DEFAULT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas_vip`
--

DROP TABLE IF EXISTS `personas_vip`;
CREATE TABLE `personas_vip` (
  `miembro` int(11) DEFAULT NULL,
  `canal` int(11) DEFAULT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles` (
  `ID` int(11) NOT NULL,
  `miembros` int(11) DEFAULT NULL,
  `nombre_roles` varchar(80) DEFAULT NULL,
  `color` varchar(30) DEFAULT NULL,
  `configuracion_server` int(11) DEFAULT NULL,
  `descripcion_roles` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `roles`
--

INSERT INTO `roles` (`ID`, `miembros`, `nombre_roles`, `color`, `configuracion_server`, `descripcion_roles`) VALUES
(1, NULL, 'Miembros', 'grey', 1, 'Miembros'),
(2, NULL, 'Miembros', 'grey', 2, 'Miembros'),
(3, NULL, 'Miembros', 'grey', 3, 'Miembros');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servidor`
--

DROP TABLE IF EXISTS `servidor`;
CREATE TABLE `servidor` (
  `ID` int(11) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `configuraciones` int(11) DEFAULT NULL,
  `imagen` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `servidor`
--

INSERT INTO `servidor` (`ID`, `nombre`, `configuraciones`, `imagen`) VALUES
(1, 'Servidor Prueba', 1, NULL),
(2, 'Servidor Prueba', 2, NULL),
(3, 'skinnieraxis1', 3, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `nombre_apellido` varchar(60) DEFAULT NULL,
  `gmail` varchar(80) DEFAULT NULL,
  `contraseña` double DEFAULT NULL,
  `foto_perfil` varchar(200) DEFAULT NULL,
  `ID` int(11) NOT NULL,
  `actividad` varchar(30) DEFAULT NULL,
  `nombre_usuario` varchar(30) DEFAULT NULL,
  `imagen` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`nombre_apellido`, `gmail`, `contraseña`, `foto_perfil`, `ID`, `actividad`, `nombre_usuario`, `imagen`) VALUES
(NULL, 'noInicia', 0, NULL, 1, NULL, NULL, NULL),
('Lautaro Feruglio', 'skinnieraxis1lauf@gmail.com', 1234, NULL, 2, NULL, 'skinnieraxis1', NULL),
('Damian Olaso', 'damian@gmail.com', 1234, NULL, 3, NULL, 'dami', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asignar`
--
ALTER TABLE `asignar`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `rol` (`rol`),
  ADD KEY `usuario` (`usuario`);

--
-- Indices de la tabla `canal`
--
ALTER TABLE `canal`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `categoria` (`categoria`),
  ADD KEY `servidor` (`servidor`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `servidor` (`servidor`);

--
-- Indices de la tabla `configuraciones_server`
--
ALTER TABLE `configuraciones_server`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `creador` (`creador`),
  ADD KEY `canal_inactividad` (`canal_inactividad`),
  ADD KEY `canal_reglas` (`canal_reglas`),
  ADD KEY `canal_actualizaciones` (`canal_actualizaciones`),
  ADD KEY `lista_baneos` (`lista_baneos`),
  ADD KEY `servidor` (`servidor`);

--
-- Indices de la tabla `lista_baneos`
--
ALTER TABLE `lista_baneos`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `config_servidor` (`config_servidor`),
  ADD KEY `miembro_baneador` (`miembro_baneador`),
  ADD KEY `miembros_baneados` (`miembros_baneados`);

--
-- Indices de la tabla `logear`
--
ALTER TABLE `logear`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `usuario` (`usuario`),
  ADD KEY `miembros` (`miembros`);

--
-- Indices de la tabla `mensajes`
--
ALTER TABLE `mensajes`
  ADD PRIMARY KEY (`msg_id`);

--
-- Indices de la tabla `miembros`
--
ALTER TABLE `miembros`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `server` (`server`),
  ADD KEY `roles_usuario` (`roles_usuario`),
  ADD KEY `mensaje` (`mensaje`);

--
-- Indices de la tabla `permisos`
--
ALTER TABLE `permisos`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `permitir`
--
ALTER TABLE `permitir`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `roles` (`roles`),
  ADD KEY `permisos_administrador` (`permisos_administrador`);

--
-- Indices de la tabla `personas_vip`
--
ALTER TABLE `personas_vip`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `canal` (`canal`),
  ADD KEY `miembro` (`miembro`);

--
-- Indices de la tabla `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `miembros` (`miembros`),
  ADD KEY `configuracion_server` (`configuracion_server`);

--
-- Indices de la tabla `servidor`
--
ALTER TABLE `servidor`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `configuraciones` (`configuraciones`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asignar`
--
ALTER TABLE `asignar`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `canal`
--
ALTER TABLE `canal`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `configuraciones_server`
--
ALTER TABLE `configuraciones_server`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `lista_baneos`
--
ALTER TABLE `lista_baneos`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `logear`
--
ALTER TABLE `logear`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `miembros`
--
ALTER TABLE `miembros`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `permisos`
--
ALTER TABLE `permisos`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `permitir`
--
ALTER TABLE `permitir`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `personas_vip`
--
ALTER TABLE `personas_vip`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `roles`
--
ALTER TABLE `roles`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `servidor`
--
ALTER TABLE `servidor`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asignar`
--
ALTER TABLE `asignar`
  ADD CONSTRAINT `asignar_ibfk_1` FOREIGN KEY (`rol`) REFERENCES `roles` (`ID`),
  ADD CONSTRAINT `asignar_ibfk_2` FOREIGN KEY (`usuario`) REFERENCES `miembros` (`ID`);

--
-- Filtros para la tabla `canal`
--
ALTER TABLE `canal`
  ADD CONSTRAINT `canal_ibfk_1` FOREIGN KEY (`categoria`) REFERENCES `categoria` (`ID`),
  ADD CONSTRAINT `canal_ibfk_2` FOREIGN KEY (`servidor`) REFERENCES `servidor` (`ID`);

--
-- Filtros para la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD CONSTRAINT `categoria_ibfk_1` FOREIGN KEY (`servidor`) REFERENCES `servidor` (`ID`);

--
-- Filtros para la tabla `configuraciones_server`
--
ALTER TABLE `configuraciones_server`
  ADD CONSTRAINT `canal_actualizaciones` FOREIGN KEY (`canal_actualizaciones`) REFERENCES `canal` (`ID`),
  ADD CONSTRAINT `canal_inactividad` FOREIGN KEY (`canal_inactividad`) REFERENCES `canal` (`ID`),
  ADD CONSTRAINT `canal_reglas` FOREIGN KEY (`canal_reglas`) REFERENCES `canal` (`ID`),
  ADD CONSTRAINT `creador` FOREIGN KEY (`creador`) REFERENCES `miembros` (`ID`),
  ADD CONSTRAINT `lista_baneos` FOREIGN KEY (`lista_baneos`) REFERENCES `lista_baneos` (`ID`),
  ADD CONSTRAINT `servidor` FOREIGN KEY (`servidor`) REFERENCES `servidor` (`ID`);

--
-- Filtros para la tabla `lista_baneos`
--
ALTER TABLE `lista_baneos`
  ADD CONSTRAINT `lista_baneos_ibfk_1` FOREIGN KEY (`config_servidor`) REFERENCES `configuraciones_server` (`ID`),
  ADD CONSTRAINT `lista_baneos_ibfk_2` FOREIGN KEY (`miembro_baneador`) REFERENCES `miembros` (`ID`),
  ADD CONSTRAINT `lista_baneos_ibfk_3` FOREIGN KEY (`miembros_baneados`) REFERENCES `miembros` (`ID`);

--
-- Filtros para la tabla `logear`
--
ALTER TABLE `logear`
  ADD CONSTRAINT `logear_ibfk_1` FOREIGN KEY (`usuario`) REFERENCES `usuarios` (`ID`),
  ADD CONSTRAINT `logear_ibfk_2` FOREIGN KEY (`miembros`) REFERENCES `miembros` (`ID`);

--
-- Filtros para la tabla `miembros`
--
ALTER TABLE `miembros`
  ADD CONSTRAINT `mensaje` FOREIGN KEY (`mensaje`) REFERENCES `mensajes` (`msg_id`),
  ADD CONSTRAINT `miembros_ibfk_1` FOREIGN KEY (`server`) REFERENCES `configuraciones_server` (`ID`),
  ADD CONSTRAINT `roles_usuario` FOREIGN KEY (`roles_usuario`) REFERENCES `roles` (`ID`);

--
-- Filtros para la tabla `permitir`
--
ALTER TABLE `permitir`
  ADD CONSTRAINT `permitir_ibfk_1` FOREIGN KEY (`roles`) REFERENCES `roles` (`ID`),
  ADD CONSTRAINT `permitir_ibfk_2` FOREIGN KEY (`permisos_administrador`) REFERENCES `permisos` (`ID`);

--
-- Filtros para la tabla `personas_vip`
--
ALTER TABLE `personas_vip`
  ADD CONSTRAINT `personas_vip_ibfk_1` FOREIGN KEY (`canal`) REFERENCES `canal` (`ID`),
  ADD CONSTRAINT `personas_vip_ibfk_2` FOREIGN KEY (`miembro`) REFERENCES `miembros` (`ID`);

--
-- Filtros para la tabla `roles`
--
ALTER TABLE `roles`
  ADD CONSTRAINT `roles_ibfk_1` FOREIGN KEY (`miembros`) REFERENCES `miembros` (`ID`),
  ADD CONSTRAINT `roles_ibfk_2` FOREIGN KEY (`configuracion_server`) REFERENCES `configuraciones_server` (`ID`);

--
-- Filtros para la tabla `servidor`
--
ALTER TABLE `servidor`
  ADD CONSTRAINT `servidor_ibfk_1` FOREIGN KEY (`configuraciones`) REFERENCES `configuraciones_server` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
