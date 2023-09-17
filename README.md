#### weeklyTest3
# <h1 align = "center"> Restaurant ModelUsing Spring_Boot </h1>


<!-- Project Description -->
## Overview
<p align="center">This project, named "Restaurant Model," is a robust Spring Boot application designed for managing user data efficiently. It provides a set of API endpoints that allow you to perform various operations on user records, such as adding, retrieving, updating, and deleting user information. 
</p>

<!-- Table of Contents -->
## Table of Contents
1. [Technologies Used](#technologies-used)
2. [Key Features](#key-features)
3. [Usage](#usage)
4. [API reference](#api-reference)
5. [License](#license)
6. [Acknowledgments](#acknowledgments)
7. [Contact](#contact)

<!-- Technologies Used -->
## Technologies Used
- Java 20
- Spring Boot
- Spring Web Initializer
- Maven
- Spring Web Dependency
- Lombok
- Validation


<!-- Key Features -->
## Key Features
- Add Restaurant
- Add List of Restaurant
- Get All Restaurant
- Get Restaurant Details By RestaurantId
- Delete Restaurant By RestaurantId.
- Update Restaurant by RestaurantId

<!-- Usage -->
## Usage
- Access the application at `http://localhost:8080`.
- Use the provided API endpoints to manage your User Management.

### Controller:
- It consists of a class named APIController which basically controls the flow of data.
- @RestController annotation is used to make the APIController as a controller layer.
- We perform the CRUD operations such as @PostMapping , @GetMapping , @PutMapping , @DeleteMapping.

### API Reference

#### Add Restaurant :
POST Method :  http://localhost:8080/restaurant

#### Add List Restaurant :
POST Method :  http://localhost:8080/list/rest

#### Get All Restaurant :
 - GET Method : http://localhost:8080/allList

 #### GET Restaurant By ID :
 - GET Method :   http://localhost:8080/find/detail/by/{id}

 #### DELETE Restaurant :
 - DELETE Method :   http://localhost:8080/del/{id}/Rest

  #### Update Restaurant Details :
 - PUT Method :   http://localhost:8086/change/restaurant




 <!-- Acknowledgments -->
## Acknowledgments
- Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

<!-- Contact -->
## Contact
For questions or feedback, please contact : Mrinal   
- Maild Id : mmrinalGautam1999@gmail.com

<h1 align="center">Thank You...<h1>
<h3 align = "center"> ***********************************************************<h3>
