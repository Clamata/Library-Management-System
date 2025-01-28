# 📚 Library-Management-System

## ✨ About

This program simulates a library management system, showcasing various Object-Oriented Programming (OOP) concepts:
1. Inheritance: Used to create specialized classes (Autor, Book, Magazine) from base classes (Person, Position).
2. Polymorphism: Applied when the same method printInfo() behaves differently depending on the object type (Book vs. Magazine), even though they are treated as Position.
3. Abstraction: Achieved by making Position an abstract class and leaving certain methods unimplemented, the code forces the subclasses to provide specific implementations.
4. Encapsulation: Ensured by restricting direct access to the internal state of the classes. Instead of accessing the fields directly, external code uses getter and setter methods.
5. Composition:  The Library class is composed of multiple Catalog objects, and each Catalog contains multiple Position objects (which could be books or magazines).
6. Interfaces: Implemented interfaces to define behaviors that can be shared across multiple classes.

## 🔧 Features

The program allows:

1. Adding new books, magazines, and authors to the system.
2. Registering librarians and displaying their information.
3. Displaying information about all positions in the library (books, magazines).
4. Searching for positions by their ID or title.

## 📂 Directories and Files
<details open>
   <summary><b>Project's Tree</b></summary>
   
``` bash
  .
- |   .gitignore     # Specifies files and directories to ignore in Git version control 
- |   LICENSE        # Contains the licensing terms for the project 
- |   README.md      # Provides an overview and instructions for the project
  |
  └───src            # Main source code directory
    | - Author.java
    | - Book.java
    | - Catalog.java
    | - IManageLibrarians.java
    | - IManagePositions.java
    | - Librarian.java
    | - Library.java
    | - Magazine.java
    | - Main.java
    | - Person.java
    | - Position.java
 ```

</details>

## 🚀 Getting Started

1.  **Clone the Repository**:
    
    ```
    git clone https://github.com/Clamata/Java-Testing.git
    ```
2.  **Set Up the Project**:
    
    -   Open your preferred IDE.
        
    -   Copy the contents of the src folder into the source directory of your project.

3. Execute the main class of your choice.

----------

## 📜 License

This project is licensed under the MIT License. Feel free to use, modify, and distribute the code as permitted under the terms of this license.
