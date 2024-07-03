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
```


### Sample Doctor Data
```
[
    {
        "id": 1,
        "name": "Dr. Saurabh",
        "city": "DELHI",
        "email": "saurabh@gmail.com",
        "phoneNumber": "7060806912",
        "speciality": "ORTHOPAEDIC"
    },
    {
        "id": 3,
        "name": "Dr. Himani",
        "city": "DELHI",
        "email": "himani@gmail.com",
        "phoneNumber": "7060806913",
        "speciality": "ORTHOPAEDIC"
    },
    {
        "id": 4,
        "name": "Dr. Sheetal",
        "city": "DELHI",
        "email": "sheetal@gmail.com",
        "phoneNumber": "7060806914",
        "speciality": "GYNECOLOGY"
    },
    {
        "id": 5,
        "name": "Dr. Manshi",
        "city": "DELHI",
        "email": "manshi@gmail.com",
        "phoneNumber": "7060806915",
        "speciality": "GYNECOLOGY"
    },
    {
        "id": 6,
        "name": "Dr.Hedar",
        "city": "DELHI",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806916",
        "speciality": "DERMATOLOGY"
    },
    {
        "id": 7,
        "name": "Dr.Neetu",
        "city": "DELHI",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806917",
        "speciality": "DERMATOLOGY"
    },
    {
        "id": 8,
        "name": "Dr.Neta",
        "city": "DELHI",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806918",
        "speciality": "ENT"
    },
    {
        "id": 9,
        "name": "Dr.Nitisha",
        "city": "DELHI",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806919",
        "speciality": "ENT"
    },
    {
        "id": 10,
        "name": "Dr.Nistha",
        "city": "NOIDA",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806920",
        "speciality": "ENT"
    },
    {
        "id": 11,
        "name": "Dr.Nisha",
        "city": "FARIDABAD",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806921",
        "speciality": "ENT"
    },
    {
        "id": 12,
        "name": "Dr.Neha",
        "city": "FARIDABAD",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806922",
        "speciality": "ENT"
    },
    {
        "id": 13,
        "name": "Dr.Nishu",
        "city": "FARIDABAD",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806923",
        "speciality": "DERMATOLOGY"
    },
    {
        "id": 14,
        "name": "Dr.Neelam",
        "city": "NOIDA",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806924",
        "speciality": "DERMATOLOGY"
    },
    {
        "id": 15,
        "name": "Dr.Komal",
        "city": "NOIDA",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806925",
        "speciality": "GYNECOLOGY"
    },
    {
        "id": 16,
        "name": "Dr.Sonall",
        "city": "FARIDABAD",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806925",
        "speciality": "GYNECOLOGY"
    },
    {
        "id": 17,
        "name": "Dr.Hina",
        "city": "FARIDABAD",
        "email": "headar@gmail.com",
        "phoneNumber": "7060806925",
        "speciality": "ORTHOPAEDIC"
    }
]
```

## Screen Shots

## Doctor Table 

![image](https://github.com/techie-ashish1924/Doctor-Patient-Registration-Platform-API/assets/87715030/1240712b-c350-419b-b1d7-d701b54815e2)

## Patient Table

![image](https://github.com/techie-ashish1924/Doctor-Patient-Registration-Platform-API/assets/87715030/c7c6a8ca-bb1e-42e3-ab96-280769c6e248)

## Add Doctor


![image](https://github.com/techie-ashish1924/Doctor-Patient-Registration-Platform-API/assets/87715030/54978e54-07cf-423f-aa4d-04fca2a6fc57)


## Remove Doctor

![image](https://github.com/techie-ashish1924/Doctor-Patient-Registration-Platform-API/assets/87715030/24b1c653-3295-400b-966b-c7425f0c44cd)


## Add Patient


![image](https://github.com/techie-ashish1924/Doctor-Patient-Registration-Platform-API/assets/87715030/37f39fe9-5d0e-446b-84b2-76ca82ccef5f)


## Remove Patient


![image](https://github.com/techie-ashish1924/Doctor-Patient-Registration-Platform-API/assets/87715030/323203b6-2906-45e6-81d5-4de81764777b)


## Sugest Doctor


-patient details
![image](https://github.com/techie-ashish1924/Doctor-Patient-Registration-Platform-API/assets/87715030/dc603795-ab09-4ae5-9bea-ff53962f39a1)


![image](https://github.com/techie-ashish1924/Doctor-Patient-Registration-Platform-API/assets/87715030/50dec7e0-a296-4154-8c0a-5bc0eed9ffe6)


-- ![image](https://github.com/techie-ashish1924/Doctor-Patient-Registration-Platform-API/assets/87715030/ef8abf53-97f0-4649-8931-f15cf408ecaf)


--![image](https://github.com/techie-ashish1924/Doctor-Patient-Registration-Platform-API/assets/87715030/17c942ab-80d7-48d1-b587-f15b893bd83e)

list of suggested doctors

--![image](https://github.com/techie-ashish1924/Doctor-Patient-Registration-Platform-API/assets/87715030/1754774c-5c5e-4804-85b2-781066fdd06b)


