1. Zarządzanie książkami

  Spis treści:
    1. Opis projektu
      - Krótkie wprowadzenie do projektu zarządzania książkami.
    2. Funkcjonalności
      - Lista funkcjonalności zaimplementowanych w projekcie.
    3. Kod Źródłowy
      - Struktura katalogów oraz opis zawartości plików źródłowych.
    4. Wykorzystane Biblioteki Zewnętrzne
      - Lista bibliotek zewnętrznych użytych w projekcie.
    5. Implementacja Interfejsu Graficznego
      - Krótki opis GUI i jego funkcjonalności.
    6. Instrukcja Obsługi
      - Krok po kroku jak uruchomić i korzystać z aplikacji.
      

  1.1 Opis Projektu:
    - Projekt "Zarządzanie Książkami" jest aplikacją desktopową umożliwiającą zarządzanie biblioteką książek. Użytkownik może dodawać, usuwać, wyszukiwać i sortować książki oraz              wyświetlać informacje o wszystkich książkach w bazie danych.
    
  2.1 Funkcjonalności:
    - Dodawanie książek
    - Usuwanie książek
    - Wyszukiwanie książek za pomocą wyrażeń regularnych
    - Sortowanie książek według tytułu, autora, roku wydania oraz gatunku
    - Wyświetlanie informacji o wszystkich książkach
    
  3.1 Kod Źródłowy:
    - Main.java - Główna klasa aplikacji zawierająca interfejs użytkownika.
    - BookManager.java - Klasa zarządzająca operacjami na książkach.
    - Book.java - Klasa reprezentująca pojedynczą książkę.
    
  4.1 Wykorzystane Biblioteki Zewnętrzne:
    - javax.swing - Biblioteka do tworzenia interfejsu graficznego.
    - java.awt - Biblioteka do obsługi komponentów graficznych i zdarzeń.
    - java.util - Zbiór klas narzędziowych do pracy z kolekcjami i wyrażeniami regularnymi.
    
  5.1 Implementacja Interfejsu Graficznego:
    - Interfejs graficzny (GUI) aplikacji został zaimplementowany przy użyciu Swinga i AWT. Umożliwia on użytkownikowi łatwe zarządzanie książkami za pomocą formularzy i przycisków.
    
  6.1 Instukcja:
  
  1. Wymagania:
    - Java w wersji 11 lub wyższej.
    - IDE 

  2. Uruchomienie:
    - Otwórz projekt w wybranym IDE.
    - Uruchom klasę Main jako aplikację Java. 
    - Interfejs użytkownika
    - Po uruchomieniu aplikacji zobaczysz GUI z następującymi polami i przyciskami:

  3. Pola tekstowe(objasnienie):
    - Tytuł: - Wprowadź tam tytuł książki.
    - Autor: - Wprowadź tam nazwę autora książki.
    - Rok: - Wprowadź tam rok wydania książki (int).
    - Gatunek: - Wprowadź tam gatunek książki.
    - Wyszukiwanie nieregularne: - Wprowadź wyrażenie regularne do wyszukiwania książek. 

  4. Przyciski(objaśnienie):
    - Dodaj książkę - Dodaje książkę na podstawie wprowadzonych przez Ciebie danych.
    - Usuń książkę - Usuwa książkę z na podstawie podanego przec Ciebie tytułu.
    - Wyszukiwanie nieregularne - Wyszukuje książki na podstawie wprowadzonego wyrażenia regularnego.
    - Pokaż wszystkie książki - Wyświetla wszystkie książki.
    - Sortuj po tytule - Sortuje książki według tytułu.
    - Sortuj po autorze - Sortuje książki według autora.
    - Sortuj po roku - Sortuje książki według roku wydania.
    - Sortuj po gatunku - Sortuje książki według gatunku.


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
     
