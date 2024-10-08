# GTS_employment_agreement
Developed a set of RESTful APIs to manage Employment Agreements within an organization
Employment Agreement Management System
# Overview
This is a Java-based microservice that manages Employment Agreements within an organization. The system provides a set of RESTful APIs to perform CRUD operations (Create, Read, Update, Delete) on employment agreements.

# Prerequisites
Java 11 or higher
Spring Boot 2.5.4 or higher
Maven 3.6.0 or higher

# Running the Application
Clone the repository: git clone https://github.com/your-username/employment-agreement-management-system.git
Navigate to the project directory: cd employment-agreement-management-system
Build the project: mvn clean package
Run the application: java -jar target/employment-agreement-management-system-0.0.1-SNAPSHOT.jar
Access the Swagger documentation:(http://localhost:7000/swagger-ui/index.html)

Request Body: JSON object containing employee details, role, start date, end date, salary, and other contractual terms
Response: JSON object of the created employment agreement with a unique identifier
Retrieve Employment Agreement
Endpoint: GET /api/employment-agreements/{id}
Path Parameter: id - Unique identifier of the employment agreement
Response: JSON object of the requested employment agreement
Update Employment Agreement
Endpoint: PUT /api/employment-agreements/{id}
Path Parameter: id - Unique identifier of the employment agreement
Request Body: JSON object containing updated employee details, role, start date, end date, salary, and other contractual terms
Response: JSON object of the updated employment agreement
Delete Employment Agreement
Endpoint: DELETE /api/employment-agreements/{id}
Path Parameter: id - Unique identifier of the employment agreement
Response: Status message confirming deletion
List Employment Agreements
Endpoint: GET /api/employment-agreements
Query Parameters: Optional filters like employee name, role, and date range
Response: JSON array of employment agreements matching the criteria
Search Employment Agreements
Endpoint: GET /api/employment-agreements/search
Query Parameters: Fields such as employee name, role, salary range, start date, end date, etc.
Response: JSON array of matching employment agreements

# Swagger Documentation
The Swagger documentation is available at (http://localhost:7000/swagger-ui/index.html). This provides a detailed description of the API endpoints, request and response bodies, and error handling.
