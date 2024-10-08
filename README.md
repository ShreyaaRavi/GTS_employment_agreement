# GTS_employment_agreement
Developed a set of RESTful APIs to manage Employment Agreements for GTS Organisation
# Overview
This is a Java-based microservice that manages Employment Agreements within an organisation. The system provides a set of RESTful APIs to perform CRUD operations (Create, Read, Update, Delete) on employment agreements.

# Prerequisites
Java 11 or higher<br />
Spring Boot 2.5.4 or higher<br />
Maven 3.6.0 or higher<br />

# Running the Application
Clone the repository: git clone https://github.com/your-username/employment-agreement-management-system.git <br />
Navigate to the project directory: cd employment-agreement-management-system <br />
Build the project: mvn clean package <br />
Run the application: java -jar target/employment-agreement-management-system-0.0.1-SNAPSHOT.jar<br />
Access the Swagger documentation:(http://localhost:7000/swagger-ui/index.html)<br />

Request Body: JSON object containing employee details, role, start date, end date, salary, and other contractual terms<br />
Response: JSON object of the created employment agreement with a unique identifier<br />
Retrieve Employment Agreement<br />
Endpoint: GET /api/employment-agreements/{id}<br />
Path Parameter: id - Unique identifier of the employment agreement<br />
Response: JSON object of the requested employment agreement<br />
Update Employment Agreement<br />
Endpoint: PUT /api/employment-agreements/{id}<br />
Path Parameter: id - Unique identifier of the employment agreement<br />
Request Body: JSON object containing updated employee details, role, start date, end date, salary, and other contractual terms<br />
Response: JSON object of the updated employment agreement<br />
Delete Employment Agreement<br />
Endpoint: DELETE /api/employment-agreements/{id}<br />
Path Parameter: id - Unique identifier of the employment agreement<br />
Response: Status message confirming deletion<br />
List Employment Agreements<br />
Endpoint: GET /api/employment-agreements<br />
Query Parameters: Optional filters like employee name, role, and date range<br />
Response: JSON array of employment agreements matching the criteria<br />


# Swagger Documentation
The Swagger documentation is available at (http://localhost:7000/swagger-ui/index.html). This provides a detailed description of the API endpoints, request and response bodies, and error handling.
