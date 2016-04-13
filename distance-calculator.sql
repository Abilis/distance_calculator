-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Апр 13 2016 г., 21:21
-- Версия сервера: 10.1.9-MariaDB
-- Версия PHP: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `distance-calculator`
--
CREATE DATABASE IF NOT EXISTS `distance-calculator` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `distance-calculator`;

-- --------------------------------------------------------

--
-- Структура таблицы `city`
--

CREATE TABLE `city` (
  `Name` varchar(50) NOT NULL,
  `Latitude` decimal(20,10) NOT NULL,
  `Longitude` decimal(20,10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `city`
--

INSERT INTO `city` (`Name`, `Latitude`, `Longitude`) VALUES
('Anapa', '44.8900000000', '37.3300000000'),
('Samara', '53.2000000000', '50.1500000000'),
('Vashington', '38.9000000000', '-77.0000000000'),
('Vena', '48.2000000000', '16.3600000000'),
('Sidney', '-33.8500000000', '151.2000000000'),
('Ottava', '45.6000000000', '-75.7000000000');

-- --------------------------------------------------------

--
-- Структура таблицы `distance`
--

CREATE TABLE `distance` (
  `from city` varchar(50) NOT NULL,
  `to city` varchar(50) NOT NULL,
  `distance` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
