# Student Management System

## Project Description
This is a Spring Boot REST API project for managing student records.

## Technologies Used
- Java
- Spring Boot
- MySQL
- Maven

## Setup Steps
1. Clone the repository:
   git clone https://github.com/prachishahane1/student-management.git

2. Open in IntelliJ
3. Configure MySQL in application.properties
4. Run the project

## Database Configuration
Database Name: student_db  
Username: root  
Password: root

## API Endpoints

### Create Student (POST)
POST /students

### Get All Students (GET)
GET /students

### Update Student (PUT)
PUT /students/{id}

### Delete Student (DELETE)
DELETE /students/{id}