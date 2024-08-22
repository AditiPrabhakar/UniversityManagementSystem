-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 22, 2024 at 01:42 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `university_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `calculated_salary`
--

CREATE TABLE `calculated_salary` (
  `serial_no` int(10) NOT NULL,
  `faculty_id` int(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `month` varchar(10) NOT NULL,
  `days_worked` varchar(3) NOT NULL,
  `salary` varchar(20) NOT NULL,
  `bonus` bigint(10) DEFAULT NULL,
  `bonus_type` varchar(20) DEFAULT NULL,
  `remarks` varchar(30) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `calculated_salary`
--

INSERT INTO `calculated_salary` (`serial_no`, `faculty_id`, `name`, `month`, `days_worked`, `salary`, `bonus`, `bonus_type`, `remarks`, `status`) VALUES
(1, 2024005, 'Olivia Bennett', 'July', '28', 'Rs. 55480.32', 28, 'Spot Bonus', 'Good Work', ''),
(2, 2024001, 'David', 'July', '22', 'Rs. 39010.40', 10, 'Referral Bonus', '', ''),
(3, 2024003, 'Max Clark', 'July', '31', 'Rs. 62066.65', 15, 'Attendence Bonus', 'Well done', 'Paid');

-- --------------------------------------------------------

--
-- Table structure for table `faculty`
--

CREATE TABLE `faculty` (
  `id` int(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `fname` varchar(20) NOT NULL,
  `mname` varchar(20) NOT NULL,
  `dob` varchar(10) NOT NULL,
  `address` varchar(20) NOT NULL,
  `email` varchar(25) NOT NULL,
  `password` varchar(20) NOT NULL,
  `joined_on` datetime NOT NULL DEFAULT current_timestamp(),
  `education` varchar(20) NOT NULL,
  `expertise` varchar(30) NOT NULL,
  `department` varchar(20) NOT NULL,
  `role` varchar(20) NOT NULL,
  `salary` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `faculty`
--

INSERT INTO `faculty` (`id`, `name`, `fname`, `mname`, `dob`, `address`, `email`, `password`, `joined_on`, `education`, `expertise`, `department`, `role`, `salary`) VALUES
(2024001, 'David', 'Samuel', 'Zara', '21/2/1989', '22 Model Town', 'david@uni.com', 'dav123', '2024-08-03 10:27:28', 'M. Tech', 'Artificial Intelligence', 'Computer Science', 'Professor', 50000),
(2024002, 'Sophie', 'Joseph', 'Katie', '2/2/1987', '89 Evenue Lane', 'sophie@uni.com', 'sop123', '2024-08-08 00:14:35', 'Ph.D.', 'English literature', 'Literature', 'Assistant Professor', 30000),
(2024003, 'Max Clark', 'Jay Clark', 'Maria Clark', '4/10/1982', '66th Lane, Downtown', 'max@uni.com', 'max123', '2024-08-08 00:16:19', 'M.Tech.', 'Data Science', 'Computer Science', 'Assistant Professor', 54000),
(2024004, 'Mia Sierra', 'James Sierra', 'Stacy Sierra', '5/8/1991', 'Upstate, 6th Street', 'mia@uni.com', 'mia123', '2024-08-08 15:13:09', 'Ph. D.', 'Microbiology', 'Biology', 'Professor', 45000),
(2024005, 'Olivia Bennett', 'John Bennett', 'Sarah Bennett', '4/3/1990', '15 Baker Street', 'olivia@uni.com', 'oli123', '2024-08-08 21:17:25', 'Ph.D.', 'Graphics', 'Graphics and Drawing', 'Assistant Professor', 48000);

-- --------------------------------------------------------

--
-- Table structure for table `leave_request_fac`
--

CREATE TABLE `leave_request_fac` (
  `serial_no` int(11) NOT NULL,
  `id` int(10) NOT NULL,
  `name` varchar(25) NOT NULL,
  `num_of_days` int(2) NOT NULL,
  `date` varchar(20) NOT NULL,
  `reason` varchar(40) NOT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `leave_request_fac`
--

INSERT INTO `leave_request_fac` (`serial_no`, `id`, `name`, `num_of_days`, `date`, `reason`, `status`) VALUES
(1, 2024001, 'David', 2, '19/8/24 -  20/8/24', 'Urgent work', 'Approved'),
(2, 2024002, 'Sophie', 1, '29/8/24 - 30/8/24', 'Sick Leave', 'Approved'),
(3, 2024003, 'Max Clark', 2, '24/8/24 - 25/8/24', 'Urgent Work', 'Approved');

-- --------------------------------------------------------

--
-- Table structure for table `leave_request_stu`
--

CREATE TABLE `leave_request_stu` (
  `serial_no` int(20) NOT NULL,
  `rollno` int(10) NOT NULL,
  `name` varchar(25) NOT NULL,
  `num_of_days` int(2) NOT NULL,
  `date` varchar(20) NOT NULL,
  `reason` varchar(40) NOT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `leave_request_stu`
--

INSERT INTO `leave_request_stu` (`serial_no`, `rollno`, `name`, `num_of_days`, `date`, `reason`, `status`) VALUES
(1, 202401, 'Hayley', 2, '', 'Sick leave.', 'Approved'),
(2, 202404, 'Sammie', 3, '23/8/24 - 25/8/24', 'Urgent work.', 'Approved');

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `id` int(10) NOT NULL,
  `course` varchar(20) NOT NULL,
  `branch` varchar(25) NOT NULL,
  `semester` int(2) NOT NULL,
  `max_marks` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`id`, `course`, `branch`, `semester`, `max_marks`) VALUES
(102301, 'B.Tech', 'Computer Science', 1, 500),
(102302, 'B.Tech', 'Mechanical', 1, 400),
(102303, 'BCA', 'Accounting', 1, 400),
(102304, 'BBA', 'Buisness Analytics', 1, 500);

-- --------------------------------------------------------

--
-- Table structure for table `result_list`
--

CREATE TABLE `result_list` (
  `id` int(11) NOT NULL,
  `result_id` int(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `student_id` int(11) NOT NULL,
  `marks_obtained` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `result_list`
--

INSERT INTO `result_list` (`id`, `result_id`, `name`, `student_id`, `marks_obtained`) VALUES
(1, 102301, 'Elijah Knight', 202403, 489),
(3, 102301, 'Hayley', 202401, 457.83),
(5, 102302, 'Alaric Saltzman', 202402, 343.21),
(8, 102303, 'Sammie', 202404, 309.43),
(9, 102304, 'Paxton Hall Yoshida', 202405, 490.6);

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `rollno` int(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `fname` varchar(20) NOT NULL,
  `mname` varchar(20) NOT NULL,
  `dob` varchar(10) NOT NULL,
  `contact` bigint(10) NOT NULL,
  `address` varchar(25) NOT NULL,
  `email` varchar(25) NOT NULL,
  `password` varchar(10) NOT NULL,
  `class_x` float NOT NULL,
  `class_xii` float NOT NULL,
  `course` varchar(10) NOT NULL,
  `branch` varchar(20) NOT NULL,
  `joined_on` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`rollno`, `name`, `fname`, `mname`, `dob`, `contact`, `address`, `email`, `password`, `class_x`, `class_xii`, `course`, `branch`, `joined_on`) VALUES
(202401, 'Hayley', 'Phil', 'Claire', '12/3/2002', 7839271927, '201 Downtown', 'hayley@uni.com', 'hay123', 80.2, 87.23, 'B.Tech', 'Computer Science', '2024-08-07 20:04:19'),
(202402, 'Alaric Saltzman', 'Jake Saltzman', 'Sophia Saltzman', '11/6/2002', 7845361927, '16th Avenue', 'alaric@uni.com', 'ala123', 92.2, 91.87, 'B.Tech', 'Mechanical', '2024-08-07 20:08:06'),
(202403, 'Elijah Knight', 'Josh Knight', 'Marie Knight', '1/11/2001', 9864673294, 'TownStreet, 32 Model Town', 'elijah@uni.com', 'eli123', 95.6, 96.2, 'B.Tech', 'Computer Science', '2024-08-13 15:21:47'),
(202404, 'Sammie', 'Josh', 'Rosie', '8/3/2003', 7836482930, '6, TownSquare', 'sammie@uni.com', 'sam123', 89.3, 90.2, 'BCA', 'Accounting', '2024-08-13 15:24:48'),
(202405, 'Paxton Hall Yoshida', 'Ken Yoshida', 'Xia Yoshida', '10/4/2003', 7836482930, '78 Model Town', 'paxton@uni.com', 'pax123', 78.4, 91.32, 'BBA', 'Buisness Analytics', '2024-08-13 15:27:18');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `calculated_salary`
--
ALTER TABLE `calculated_salary`
  ADD PRIMARY KEY (`serial_no`);

--
-- Indexes for table `faculty`
--
ALTER TABLE `faculty`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `leave_request_fac`
--
ALTER TABLE `leave_request_fac`
  ADD PRIMARY KEY (`serial_no`);

--
-- Indexes for table `leave_request_stu`
--
ALTER TABLE `leave_request_stu`
  ADD PRIMARY KEY (`serial_no`);

--
-- Indexes for table `result`
--
ALTER TABLE `result`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `result_list`
--
ALTER TABLE `result_list`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`rollno`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `calculated_salary`
--
ALTER TABLE `calculated_salary`
  MODIFY `serial_no` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `faculty`
--
ALTER TABLE `faculty`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2024006;

--
-- AUTO_INCREMENT for table `leave_request_fac`
--
ALTER TABLE `leave_request_fac`
  MODIFY `serial_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `leave_request_stu`
--
ALTER TABLE `leave_request_stu`
  MODIFY `serial_no` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `result`
--
ALTER TABLE `result`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=102305;

--
-- AUTO_INCREMENT for table `result_list`
--
ALTER TABLE `result_list`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `rollno` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=202407;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
