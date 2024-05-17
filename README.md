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
  
     
