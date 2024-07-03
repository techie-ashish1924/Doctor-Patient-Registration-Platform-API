# Doctor-Patient-Registration-Platform-API
This project is a backend application developed in Spring Boot to manage doctors and patients registration and interaction through APIs.
## Features

- **Adding a Doctor**: Register a new doctor with details including name, city, email, phone number, and speciality.
- **Removing a Doctor**: Delete a doctor from the platform by their ID.
- **Listing All Doctors**: Retrieve a list of all registered doctors.
- **Adding a Patient**: Register a new patient with details including name, city, email, phone number, and symptom.
- **Removing a Patient**: Delete a patient from the platform by their ID.
- **Listing All Patients**: Retrieve a list of all registered patients.
- **Suggesting Doctors**: API to suggest doctors based on a patient’s symptom and location.

## Technologies Used

- Java
- Spring Boot (Version 3)
- Spring Data JPA
- Hibernate
- MySQL
- Swagger (for API documentation and testing)

## Database Configuration

- Create a MySQL database named `doctor_patient_db`.
- Configure the database connection in `src/main/resources/application.properties`:

  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/databaseName
  spring.datasource.username=root
  spring.datasource.password=password
  spring.jpa.hibernate.ddl-auto=update

## API Documentation

Swagger UI is integrated into the project for easy API documentation and testing:

- Access API documentation and test APIs through Swagger UI at [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html).

Ensure your application is running locally to access the Swagger UI and interact with the APIs.





### API Endpoints

#### Doctor Endpoints

- **Add a doctor**
    ```http
    POST /api/add-doctor
    ```
    - Request Body:
        ```json
        {
            "name": "Dr. Saurabh",
            "city": "DELHI",
            "email": "saurabh@gmail.com",
            "phoneNumber": "7060806912",
            "speciality": "ORTHOPAEDIC"
        }
        ```
    - Response: The saved doctor object or a validation error.

- **Remove a doctor**
    ```http
    DELETE /api/remove-doctor/{id}
    ```
    - Response: Confirmation message with the ID of the removed doctor.

- **Get all doctors**
    ```http
    GET /api/all-doctors
    ```
    - Response: List of all doctors.

#### Patient Endpoints

- **Add a patient**
    ```http
    POST /api/add-patient
    ```
    - Request Body:
        ```json
        {
            "name": "Nitish",
            "city": "FARIDABAD",
            "email": "headar@gmail.com",
            "phoneNumber": "7060806925",
            "symptom": "ARTHRITIS"
        }
        ```
    - Response: The saved patient object or a validation error.

- **Remove a patient**
    ```http
    DELETE /api/remove-patient/{id}
    ```
    - Response: Confirmation message with the ID of the removed patient.

- **Suggest a doctor**
    ```http
    GET /api/suggest-doctor/{patientId}
    ```
    - Response: List of suggested doctors based on patient symptom and location.

- **Get all patients**
    ```http
    GET /api/all-patients
    ```
    - Response: List of all patients.
 
### Sample Patient Data

```json
[
    {
        "id": 1,
        "name": "Nitish",
        "city": "FARIDABAD",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806925",
        "symptom": "ARTHRITIS"
    },
    {
        "id": 2,
        "name": "Neelesh",
        "city": "NOIDA",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806925",
        "symptom": "ARTHRITIS"
    },
    {
        "id": 3,
        "name": "Namneet",
        "city": "DELHI",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806925",
        "symptom": "ARTHRITIS"
    },
    {
        "id": 4,
        "name": "Harikant",
        "city": "DELHI",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806925",
        "symptom": "TISSUE INJURIES"
    },
    {
        "id": 5,
        "name": "Anikate",
        "city": "FARIDABAD",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806925",
        "symptom": "TISSUE INJURIES"
    },
    {
        "id": 6,
        "name": "Ashish",
        "city": "NOIDA",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806925",
        "symptom": "TISSUE INJURIES"
    },
    {
        "id": 7,
        "name": "Deepak",
        "city": "NOIDA",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806925",
        "symptom": "DYSMENORRHEA"
    },
    {
        "id": 8,
        "name": "Mahesh",
        "city": "FARIDABAD",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806925",
        "symptom": "DYSMENORRHEA"
    },
    {
        "id": 9,
        "name": "Sunny",
        "city": "DELHI",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806925",
        "symptom": "DYSMENORRHEA"
    },
    {
        "id": 10,
        "name": "Sunny Deol",
        "city": "ALIGARH",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806925",
        "symptom": "SKIN BURN"
    },
    {
        "id": 11,
        "name": "Sunil",
        "city": "DELHI",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806925",
        "symptom": "SKIN INFECTION"
    },
    {
        "id": 12,
        "name": "Sunil Sethi",
        "city": "KANPUR",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806925",
        "symptom": "EAR PAIN"
    },
    {
        "id": 13,
        "name": "Sunil Sethi",
        "city": "DELHI",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806925",
        "symptom": "EAR PAIN"
    }
]

###




