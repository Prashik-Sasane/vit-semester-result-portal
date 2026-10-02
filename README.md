# VIT Semester Result Portal

A responsive Spring Boot + MySQL web application for preparing and managing one-semester results of VIT students.

## Features
- Student result form for four subjects
- MSE (30%) and ESE (70%) marks entry
- Automatic total and final grade calculation
- Pass/fail status
- Responsive frontend and backend integration
- MySQL database persistence

## Subject setup
The application uses these four subjects:
- Data Structures
- Database Management Systems
- Operating Systems
- Computer Networks

## Tech stack
- Java 17
- Spring Boot 3
- MySQL
- Thymeleaf + HTML/CSS/JavaScript
- Maven

## Project structure
```text
src/
  main/
    java/com/vit/result/
      controller/
      model/
      repository/
      service/
      VITResultPortalApplication.java
    resources/
      application.properties
      templates/
        index.html
      static/
        css/styles.css
        js/app.js
```

## Prerequisites
- Java 17+
- Maven
- MySQL running locally

## Setup
1. Create a MySQL database named `vit_result_db`
2. Update database credentials in `src/main/resources/application.properties`
3. Run:

```bash
mvn clean install
mvn spring-boot:run
```

4. Open: http://localhost:8080

## Default database configuration
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/vit_result_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```
