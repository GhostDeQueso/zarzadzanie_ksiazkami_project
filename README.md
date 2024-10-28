Book Management - Project

Table of Contents:
1. Project Description
  - A brief introduction to the Book Management project.
2. Features
  - A list of features implemented in the project.
3. Source Code
  - Directory structure and description of source files.
4. External Libraries Used
  - A list of external libraries used in the project.
5. GUI Implementation
  - A brief description of the graphical interface and its functionality.
6. User Guide
  - Step-by-step instructions on how to run and use the application.


    1.1 Project Description:
      - The "Book Management" project is a desktop application enabling users to manage a book library. Users can add, delete, search, and sort books, and display information about all books in the database.

    2.1 Features:
      - Adding books - Deleting books - Searching for books using regular expressions.
      - Sorting books by title, author, publication year, and genre.
      - Displaying information about all books.


    3.1 Source Code:
      - Main.java - The main application class containing the user interface.
      - BookManager.java - Class managing operations on books.
      - Book.java - Class representing a single book.


    4.1 External Libraries Used:
      - javax.swing - Library for creating graphical interfaces.
      - java.awt - Library for handling graphical components and events.
      - java.util - A collection of utility classes for working with collections and regular expressions.


    5.1 GUI Implementation:
      - The application's graphical interface (GUI) is implemented using Swing and AWT. It allows users to manage books through forms and buttons easily.


    6.1 User Guide:
      6.1.1 Requirements:
         - Java version 11 or higher.
         - An IDE.
    
      6.1.2 Launching the Application:
          - Open the project in the selected IDE.
          - Run the Main class as a Java application.
          - User Interface
          - Upon launching, you will see a GUI with the following fields and buttons
    
      6.1.3. Text Fields (Description):
          - Title: - Enter the book's title.
          - Author: - Enter the book's author.
          - Year: - Enter the book's publication year (int).
          - Genre: - Enter the book's genre. - Irregular Search:
          - Enter a regular expression to search for books.
    
      6.4.1 Buttons (Description):
          - Add Book - Adds a book based on the entered details.
          - Delete Book - Deletes a book based on the provided title.
          - Irregular Search - Searches for books using the entered regular expression.
          - Show All Books - Displays all books.
          - Sort by Title - Sort books by title.
          - Sort by Author - Sort books by author.
          - Sort by Year - Sort books by publication year.
          - Sort by Genre - Sort books by genre.
     
