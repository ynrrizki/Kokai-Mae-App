-- phpMyAdmin SQL Dump
-- version 5.2.0-dev+20220304.7fed200089
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 24, 2022 at 06:44 PM
-- Server version: 8.0.27
-- PHP Version: 8.1.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kokai_mae_app`
--

-- --------------------------------------------------------

--
-- Table structure for table `container_material`
--

CREATE TABLE `container_material` (
  `id` int NOT NULL,
  `title` varchar(255) NOT NULL,
  `material_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `material`
--

CREATE TABLE `material` (
  `id` int NOT NULL,
  `title` varchar(255) NOT NULL,
  `file` varchar(255) NOT NULL,
  `comment` text,
  `created_at` timestamp NOT NULL DEFAULT (now()),
  `updated_at` timestamp NOT NULL DEFAULT (now())
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `material_verif`
--

CREATE TABLE `material_verif` (
  `id_material_v` int NOT NULL,
  `container_id` int NOT NULL,
  `verif` enum('accept','unaccept') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `request_roadmap`
--

CREATE TABLE `request_roadmap` (
  `id` int NOT NULL,
  `message` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `roadmap`
--

CREATE TABLE `roadmap` (
  `id` int NOT NULL,
  `title` varchar(255) NOT NULL,
  `file` varchar(255) NOT NULL,
  `comment` text,
  `created_at` timestamp NOT NULL DEFAULT (now()),
  `updated_at` timestamp NOT NULL DEFAULT (now())
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `roadmap_verif`
--

CREATE TABLE `roadmap_verif` (
  `id` int NOT NULL,
  `roadmap_id` int NOT NULL,
  `verif` enum('accept','unaccept') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int NOT NULL,
  `name` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `level` enum('project_manager','mapper','research') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `container_material`
--
ALTER TABLE `container_material`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_material` (`material_id`);

--
-- Indexes for table `material`
--
ALTER TABLE `material`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `material_verif`
--
ALTER TABLE `material_verif`
  ADD PRIMARY KEY (`id_material_v`),
  ADD KEY `id_container` (`container_id`);

--
-- Indexes for table `request_roadmap`
--
ALTER TABLE `request_roadmap`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `roadmap`
--
ALTER TABLE `roadmap`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `roadmap_verif`
--
ALTER TABLE `roadmap_verif`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_roadmap` (`roadmap_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `container_material`
--
ALTER TABLE `container_material`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `material`
--
ALTER TABLE `material`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `material_verif`
--
ALTER TABLE `material_verif`
  MODIFY `id_material_v` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `request_roadmap`
--
ALTER TABLE `request_roadmap`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `roadmap`
--
ALTER TABLE `roadmap`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `roadmap_verif`
--
ALTER TABLE `roadmap_verif`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `container_material`
--
ALTER TABLE `container_material`
  ADD CONSTRAINT `container_material_ibfk_1` FOREIGN KEY (`material_id`) REFERENCES `material` (`id`);

--
-- Constraints for table `material_verif`
--
ALTER TABLE `material_verif`
  ADD CONSTRAINT `material_verif_ibfk_1` FOREIGN KEY (`container_id`) REFERENCES `container_material` (`id`);

--
-- Constraints for table `roadmap_verif`
--
ALTER TABLE `roadmap_verif`
  ADD CONSTRAINT `roadmap_verif_ibfk_1` FOREIGN KEY (`roadmap_id`) REFERENCES `roadmap` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
