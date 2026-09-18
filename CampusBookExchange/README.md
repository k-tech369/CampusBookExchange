# Campus Book Exchange System

## 1. What the Project Does

This is a console Java program for campus book swapping. It is meant to let students trade "academic books" in one place.

A student can be added to the system. Books can be listed by the students who own them. People can search what is available, borrow a book, and later bring it back. The program also shows past borrow and return records.

It covers core Java OOP ideas and uses simple data handling and menu based input.

## 2. Functions in the App

1. Register a student  
   Create a student profile with an id, a name, and an email.

2. Add a book  
   Store a new book using an id, title, author, category, and the id of the student who owns it.

3. See every book  
   Print the books that are currently in the system.

4. Find a book  
   Look up books by title, author, or category.

5. Borrow a book  
   Let a registered student take a book if it is free.

6. Return a book  
   Let a student send back a book that was borrowed before.

7. Check history  
   Show the list of borrow and return actions saved by the program.

8. Quit  
   End the app in a clean way.

## 3. Tools Used

- Java as the programming language  
- Java OOP as the main concept area  
- Command line interface for user input  
- Build with `javac`  
- Run with `java`  
- Work in Visual Studio Code or another Java IDE

## 4. Folder Layout

```text
CampusBookExchange/
│
├── README.md
│
└── src/
    ├── Main.java
    ├── Student.java
    ├── Book.java
    ├── Transaction.java
    └── BookExchangeSystem.java
```

### Class Notes

- Main.java
* **Main.java**
  Contains the main method, displays the menu, takes user input, and calls the required operations.

* **Student.java**
  Represents a student and stores details such as student ID, name, and email.

* **Book.java**
  Represents a book and stores details such as book ID, title, author, category, and owner.

* **Transaction.java**
  Represents the borrowing and returning transactions performed in the system.

* **BookExchangeSystem.java**
  Handles the main system operations such as registering students, adding books, searching books, borrowing, returning, and displaying transaction history.

## 5. Requirements

To run this project, you need:

* Java Development Kit (JDK)
* Terminal or command prompt
* Visual Studio Code or any Java-compatible IDE (optional)

You can check whether Java is installed by running:

```bash
java -version
```

You can check the Java compiler using:

```bash
javac -version
```

## 6. How to Run the Project

### Step 1: Open the project

Open the `CampusBookExchange` folder in Visual Studio Code or navigate to it using the terminal.

### Step 2: Go to the source folder

```bash
cd src
```

### Step 3: Compile the Java files

```bash
javac *.java
```

If there are no errors, the project has compiled successfully.

### Step 4: Run the application

```bash
java Main
```

The application will display the main menu. Select an option by entering its corresponding number and follow the instructions shown on the screen.

## 7. Application Menu

```text
==========================================
     CAMPUS BOOK EXCHANGE SYSTEM
==========================================
1. Register Student
2. Add Book
3. View All Books
4. Search Book
5. Borrow Book
6. Return Book
7. View Transaction History
8. Exit
==========================================
```

## 8. OOP Concepts Used

The project applies the following Java OOP concepts:

* Classes and Objects
* Encapsulation
* Constructors
* Methods
* Object interaction
* Abstraction through class design

Different classes are used to represent students, books, transactions, and the overall book exchange system.

## 9. Error Handling

The application handles basic cases such as:

* Duplicate student IDs
* Duplicate book IDs
* Invalid menu choices
* Invalid borrowing or returning operations
* Student and book identification

The system displays an appropriate message when an operation cannot be completed.

## 10. Limitations and Future Improvements

The current version stores data only while the program is running. The data is not permanently stored in a database or external file.

Possible future improvements include:

* Database integration
* Student login and authentication
* Book availability tracking
* Due dates and reminders
* Fine calculation
* Graphical user interface
* Online access for students

## 11. Conclusion

The Campus Book Exchange System provides a simple way for students to manage academic book exchanges through a command-line application. It demonstrates practical Java programming and Object-Oriented Programming concepts through different classes and system operations.
