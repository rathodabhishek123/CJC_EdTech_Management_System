# CJC EdTech Management System

A console-based **CJC EdTech Management System** developed using **Core Java, Object-Oriented Programming, and Java Collection Framework**.

The project is designed to manage **Courses, Faculties, Batches, and Students** using Java collections and object-oriented programming concepts.

## Features

- Add Course
- View Course
- Add Faculty
- View Faculty
- Add Batch
- View Batch
- Add Student
- View Student
- Store multiple objects using Java Collections
- Menu-driven console application
- User input using Scanner
- Exception handling

## Application Menu

```text
======= CJC EdTech =======

1. Add Course
2. View Course
3. Add Faculty
4. View Faculty
5. Add Batch
6. View Batch
7. Add Student
8. View Student
9. Exit
```

## Technologies Used

- Java
- Core Java
- Object-Oriented Programming
- Java Collection Framework
- Eclipse IDE

## Java Concepts Used

### Object-Oriented Programming

- Class and Object
- Encapsulation
- Abstraction
- Interface
- Inheritance
- Polymorphism
- Method Overriding

### Collection Framework

The project uses Java Collection Framework concepts to store and manage multiple objects dynamically.

Collections can be used for:

- Student data
- Course data
- Faculty data
- Batch data

Example:

```java
List<Student> students = new ArrayList<>();
```

Objects can be added dynamically:

```java
students.add(student);
```

And retrieved using iteration:

```java
for(Student student : students) {
    System.out.println(student);
}
```

## Collection Framework Benefits

Using collections provides:

- Dynamic data storage
- Easy insertion of objects
- Easy retrieval of objects
- Easy iteration
- Generic type safety
- Better management of multiple records

## Project Structure

```text
CJC_EdTech_Management_System
│
└── src
    └── com.cjc.ims.app
        │
        ├── client
        │   └── Test.java
        │
        ├── model
        │   ├── Course.java
        │   ├── Faculty.java
        │   ├── Batch.java
        │   └── Student.java
        │
        ├── servicei
        │   └── Cjc.java
        │
        └── serviceimpl
            └── Karvenager.java
```

## How the Application Works

The application starts from the `Test` class.

The user selects the required operation from the menu.

```java
Cjc kn = new Karvenager();
```

The `Cjc` interface provides the required operations, while `Karvenager` provides their implementation.

For example:

```java
kn.addCourse();
kn.viewCourse();

kn.addFaculty();
kn.viewFaculty();

kn.addBatch();
kn.viewBatch();

kn.addStudent();
kn.viewStudent();
```

The application uses Java collections to maintain multiple objects during program execution.

## Collection Framework Concepts

Important collection concepts related to this project include:

- List
- ArrayList
- Generics
- Iterator
- Enhanced For Loop
- Collection methods
- Object storage
- Dynamic data management

## Learning Objectives

This project was developed to gain practical experience with:

- Core Java
- Object-Oriented Programming
- Java Collection Framework
- Working with multiple objects
- Interface-based programming
- Runtime polymorphism
- Generic collections
- Menu-driven applications
- Exception handling

## Future Improvements

The project can be enhanced with:

- MySQL database integration
- JDBC
- Complete CRUD operations
- Search functionality
- Update and Delete operations
- Student login
- Faculty login
- Admin login
- Spring Boot REST API
- Web-based interface

## Author

**Abhishek Rathod**

Computer Science & Engineering Graduate

## License

This project is created for learning and educational purposes.
