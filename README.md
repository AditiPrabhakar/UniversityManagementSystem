# University System

## Overview
The **University System** is a comprehensive platform designed to streamline and automate various academic and administrative processes within a university. Developed using **Java** in **NetBeans**, this system utilizes **XAMPP's MyPHPAdmin** for database management and **SQL** for data manipulation. The application aims to enhance efficiency in handling university operations by providing distinct login portals for **faculty**, **students**, and **administrators**.

## Features

### 1. **User Authentication & Role-Based Access**
- The system provides secure login pages for different roles: **Admin**, **Faculty**, and **Students**.
- Role-based access ensures that each user group can only access relevant functionalities and data.

### 2. **Faculty Management**
- **Salary Calculation**: Faculty members’ salaries are calculated and managed through the system.
- **Profile Management**: Faculty can register, update, and manage their profiles, ensuring that personal and professional details are kept current.
- **Leave Applications**: Faculty members can apply for leave, with the application being processed and reviewed within the system.

### 3. **Student Management**
- **Result Management**: Faculty members can input and update student results. Students can access their grades and academic progress directly through their login.
- **Profile Management**: Students have the ability to register and update their profiles, keeping personal and academic details updated.

### 4. **Administrative Functions**
- **Registration**: Admins can oversee the registration of faculty and students, ensuring the integrity of the data.
- **Updates and Maintenance**: The system allows for continuous updates to profiles, academic records, and administrative details, ensuring the system remains current.

### 5. **Database Integration**
- The system is tightly integrated with an **SQL** database, which is used for efficient data manipulation and storage.
- The database stores user information, results, salary details, leave applications, and profile data, ensuring a centralized repository of information.

## Technologies Used
- **Java**: For the core logic and backend functionality.
- **NetBeans IDE**: As the integrated development environment for building the application.
- **XAMPP (MyPHPAdmin)**: For local database management.
- **SQL**: For database queries, data manipulation, and retrieval.

## Future Enhancements
- Implementation of notification systems for students and faculty.
- Expansion of the system to include additional modules, such as course management and timetable scheduling.
- Mobile-friendly design for ease of access.

## Setup Instructions
To set up this project locally, follow these steps:
1. Install **XAMPP** for database management and start **MySQL** services.
2. Import the SQL database included in the repository into **MyPHPAdmin**.
3. Open the project in **NetBeans** and configure the database connection.
4. Run the project from NetBeans and access it through your preferred web browser.
