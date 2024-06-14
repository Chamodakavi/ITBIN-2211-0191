-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 14, 2024 at 04:09 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `autocare`
--
CREATE DATABASE IF NOT EXISTS `autocare` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `autocare`;

-- --------------------------------------------------------

--
-- Table structure for table `employeedetails`
--

CREATE TABLE `employeedetails` (
  `empid` int(11) NOT NULL,
  `fname` varchar(100) DEFAULT NULL,
  `lname` varchar(100) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `telephone` int(10) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employeedetails`
--

INSERT INTO `employeedetails` (`empid`, `fname`, `lname`, `gender`, `address`, `telephone`, `email`) VALUES
(1, 'chamoda', 'hapuarachchi', 'male', 'egaloya,bulathsinhala', 765, 'chamodakavishka03@gmail.com'),
(4, 'himantha', 'hapuarachchi', 'male', 'egaloya,bulathsinhala', 243, 'aa'),
(19, 'ikui', 'kui', 'male', 'horana', 4567, ''),
(20, 'ytujf', 'rtyhd', 'male', '12', 4567, ''),
(21, 'cgasd', 'grb', 'female', 'asasa', 13234, '');

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `id` int(10) NOT NULL,
  `name` varchar(60) NOT NULL,
  `stock` int(10) NOT NULL,
  `category` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`id`, `name`, `stock`, `category`) VALUES
(1, 'C-1807', 10, 'oil filter'),
(2, 'FC-1503', 4, 'fuel filter'),
(5, 'A-1001', 8, 'air filter'),
(6, 'Air freshner 1L', 5, 'other'),
(7, 'cate 1L', 12, 'other');

-- --------------------------------------------------------

--
-- Table structure for table `userdetails`
--

CREATE TABLE `userdetails` (
  `userid` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `userdetails`
--

INSERT INTO `userdetails` (`userid`, `username`, `password`) VALUES
(4, 'admin', 'admin'),
(9, 'chamoda', '2001'),
(11, 'keshan', '12345'),
(23, 'admin', 'admin'),
(24, 'chama', 'chama123');

-- --------------------------------------------------------

--
-- Table structure for table `vehicle`
--

CREATE TABLE `vehicle` (
  `id` int(10) NOT NULL,
  `name` varchar(45) NOT NULL,
  `vno` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `tp` int(10) NOT NULL,
  `email` varchar(45) NOT NULL,
  `eoil` varchar(45) NOT NULL,
  `oilfilter` varchar(45) NOT NULL,
  `fuelfilter` varchar(45) NOT NULL,
  `airfilter` varchar(45) NOT NULL,
  `goil` varchar(45) NOT NULL,
  `difoil` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `vehicle`
--

INSERT INTO `vehicle` (`id`, `name`, `vno`, `address`, `tp`, `email`, `eoil`, `oilfilter`, `fuelfilter`, `airfilter`, `goil`, `difoil`) VALUES
(6, 'sanjula', 'BFO-6785', 'Galle', 705679807, '', 'yes', 'no', 'no', 'yes', 'no', 'no'),
(7, 'thilina', 'BFO-5467', 'Horana', 785649067, 'thilina@gmail.com', 'yes', 'yes', 'no', 'yes', 'no', 'no'),
(10, 'advaaaas', '34456', 'ab123', 4325, 'a@g', 'no', 'no', 'no', 'no', 'no', 'no');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employeedetails`
--
ALTER TABLE `employeedetails`
  ADD PRIMARY KEY (`empid`);

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `userdetails`
--
ALTER TABLE `userdetails`
  ADD PRIMARY KEY (`userid`);

--
-- Indexes for table `vehicle`
--
ALTER TABLE `vehicle`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employeedetails`
--
ALTER TABLE `employeedetails`
  MODIFY `empid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `inventory`
--
ALTER TABLE `inventory`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `userdetails`
--
ALTER TABLE `userdetails`
  MODIFY `userid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `vehicle`
--
ALTER TABLE `vehicle`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
