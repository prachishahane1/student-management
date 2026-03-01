# Student Management System

## Project Description
This is a Spring Boot based Student Management REST API project.

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

{
"name": "Prachi",
"email": "prachi@gmail.com",
"course": "Java"
}

### Get All Students (GET)
GET /students

### Update Student (PUT)
PUT /students/{id}

### Delete Student (DELETE)
DELETE /students/{id}