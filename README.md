# Student Data Entry using JDBC and MySQL

## 📌 Description
This Java application allows users to **add, view, search, update, and delete student records** stored in a **MySQL database** using **JDBC (Java Database Connectivity)**.

The project is based on **Assignment 9** of the Java Lab and includes all functionalities from Assignment 3, but integrated with **MySQL**.

---

## 📁 Functionalities Implemented
- ✅ **Insert Student**
- ✅ **Display All Students**
- ✅ **Search by PRN**
- ✅ **Search by Name**
- ✅ **Update Student by PRN**
- ✅ **Delete Student by PRN**

---

## 🛠️ Technologies Used
- Java (JDK 17+)
- JDBC
- MySQL (Workbench or CLI)
- Prepared Statements
- Scanner (for user input)

---

## 🧱 MySQL Setup

```sql
-- Create the database and table before running the application
CREATE DATABASE db_student;

USE db_student;

CREATE TABLE student (
    PRN INT PRIMARY KEY,
    Name VARCHAR(50),
    Branch VARCHAR(50),
    Batch VARCHAR(20),
    CGPA FLOAT
);
