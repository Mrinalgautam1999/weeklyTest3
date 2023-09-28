# <h1 align = "center"> User Management System Using Spring_Boot </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.1.3-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>
<p align="left">

<!-- Project Description -->
## Overview

This project, named "User Management System" is a robust Spring Boot application designed for managing user data efficiently. It provides a set of RESTful API endpoints that allow you to perform various operations on user records, such as adding, retrieving, updating, and deleting user information.

## Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven

## Data Flow

### Controller

The Controller layer is responsible for handling incoming HTTP requests and delegating them to the appropriate services. It defines API endpoints for the following operations:

1. **Add User:** `POST /api/user`
2. **Get All Users:** `GET /all/user`
3. **Get User by ID:** `GET /api/user/{id}/detail`
4. **Update User Id, Name, Number:** `PUT /user/api/user/{id}/number/`
5. **Delete User by ID:** `DELETE /api/user/{id}/id`

```java
@RestController
@Validated
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("user/list")
    public String addListUser(@RequestBody @Valid List<User> myUser){
        return userService.addListUser(myUser);
    }
    @GetMapping("users")
    public List<User> getAllUser(){
       return userService.getAllUser();
    }

    @GetMapping("api/v1/user/by/{id}")
    public User getUserById(@PathVariable @Valid Integer id){
        return userService.getUserById(id);
    }

    @PutMapping("change/password")
    public String changePassword(@RequestBody @Valid Password password){
        return userService.changePassword(password.getUserId(),password.getUserPassword());
    }
    @DeleteMapping("Api/{id}/delete")
    public String deleteById(@PathVariable @Valid Integer id){
        return userService.deleteById(id);
    }
}
```

## Database Design

The project's database design includes tables for user management, with fields such as:

- `userId` (User ID)
- `userName` (User Name)
- `name` (name)
- `userContactNo` (Phone Number)
- `userChangePassword` (password)

### ArrayList

The project utilizes the `ArrayList` data structure to store and manage lists of `User` objects in various parts of the application. `ArrayList` provides dynamic sizing and efficient element retrieval, making it suitable for storing user records and performing operations on them.

These data structures enable the application to organize and manipulate user data efficiently while maintaining data integrity.


## Project Summary

The User Management project is a robust Spring Boot application designed for efficient user data management. It offers a set of RESTful API endpoints for various user-related operations, including adding, retrieving, updating, and deleting user information.


 <!-- Acknowledgments -->
## Acknowledgments
- Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

<!-- Contact -->
## Contact
For questions or feedback, please contact : Mrinal Gautam 
- Maild Id : mmrinalGautam1999@gmail.com

<h1 align="center">Thank You...<h1>
<h3 align = "center"> ***********************************************************<h3>
