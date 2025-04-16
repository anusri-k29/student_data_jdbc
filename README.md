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
## Outputs
![image](https://github.com/user-attachments/assets/bfa3883b-5bb9-4f1a-8f3b-34a59f52ac19)

![image](https://github.com/user-attachments/assets/24e9cd2b-b4c9-4e2b-9e2d-9f5552158dba)

![image](https://github.com/user-attachments/assets/f647f185-e2d0-4856-a135-0aa046d88a00)

![image](https://github.com/user-attachments/assets/88839598-fb74-4c8a-9685-a966c33ec150)

![image](https://github.com/user-attachments/assets/1bf4d19a-4c53-42fc-97e5-303f1d6eff39)

![image](https://github.com/user-attachments/assets/b4fdc090-c270-4b16-bc22-d4fe2371f153)
![image](https://github.com/user-attachments/assets/7811e75b-ab55-4bc3-9121-65117b1372d6)

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
