import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.Collections;
import java.util.Comparator;

public class BookManager {
    private List<Book> books;

    // Tworzenie listy i wywołanie innialize
    public BookManager() {
        books = new ArrayList<>();
        initializeBookDatabase();
    }

    //dodawanie
    public void addBook(Book newBook) {
        for (Book book : books) {
            if (book.equals(newBook)) {
                System.out.println("Taka ksiązka juz istnieje");
                return;
            }
        }
        books.add(newBook);
    }
    
    // usuwanko
    public boolean removeBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(i);  
                return true;      
            }
        }
        return false;  
    }
    


    // wyszuwkianie niereguralne
    public List<Book> searchBooks(String regex) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (pattern.matcher(book.getTitle()).find() || pattern.matcher(book.getAuthor()).find()) {
                results.add(book);
            }
        }
        return results;
    }

    // wyszukiwanie za pomocą gatunku
    public List<Book> getBooksByGenre(String genre) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }

    // wyszukiwanie za pomocą roku
    public List<Book> searchBooksByYear(int year) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() == year) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }

    // sortowanie
    public void sortBooks(Comparator<Book> comparator) {
        Collections.sort(books, comparator);
    }


    // Zwracanie listy ksiązek
    public List<Book> getBooks() {
        return books; 
    }

    // informacje o ksiązkach(wszystkie ksiazki)
    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // lista ksiazek(26 sztuk)
    private void initializeBookDatabase() {
        addBook(new Book("Physics of the Future", "Michio Kaku", 2011, "Science"));
        addBook(new Book("The Future of Humanity", "Michio Kaku", 2018, "Science"));
        addBook(new Book("Parallel Worlds", "Michio Kaku", 2004, "Science"));
        addBook(new Book("Hyperspace", "Michio Kaku", 1994, "Science"));

        addBook(new Book("On Intelligence", "Jeff Hawkins", 2004, "Psychology"));
        addBook(new Book("A Thousand Brains", "Jeff Hawkins", 2021, "Psychology"));

        addBook(new Book("Good to Great", "Jim Collins", 2001, "Business"));
        addBook(new Book("Built to Last", "Jim Collins", 1994, "Business"));
        addBook(new Book("How the Mighty Fall", "Jim Collins", 2009, "Business"));

        addBook(new Book("Think Like a Monk", "Jay Shetty", 2020, "Self-help"));
        addBook(new Book("8 Rules of Love", "Jay Shetty", 2023, "Self-help"));

        addBook(new Book("How to Win Friends and Influence People", "Dale Carnegie", 1936, "Self-help"));
        addBook(new Book("How to Stop Worrying and Start Living", "Dale Carnegie", 1948, "Self-help"));

        addBook(new Book("Behawiorysta", "Remigiusz Mróz", 2016, "Thriller"));
        addBook(new Book("Ekspozycja", "Remigiusz Mróz", 2015, "Thriller"));
        addBook(new Book("Inwigilacja", "Remigiusz Mróz", 2016, "Thriller"));
        addBook(new Book("Rewizja", "Remigiusz Mróz", 2017, "Thriller"));

        addBook(new Book("Kasacja", "Remigiusz Mróz", 2015, "Legal thriller"));
        addBook(new Book("Zaginięcie", "Remigiusz Mróz", 2015, "Legal thriller"));
        addBook(new Book("Immunitet", "Remigiusz Mróz", 2016, "Legal thriller"));

        addBook(new Book("Wyrok", "Remigiusz Mróz", 2017, "Legal thriller"));
        addBook(new Book("Nieodgadniona", "Remigiusz Mróz", 2019, "Thriller"));
        addBook(new Book("Niepokorni", "Remigiusz Mróz", 2021, "Thriller"));

        addBook(new Book("The Universe in a Nutshell", "Stephen Hawking", 2001, "Science"));
        addBook(new Book("The Grand Design", "Stephen Hawking", 2010, "Science"));
        addBook(new Book("A Brief History of Time", "Stephen Hawking", 1988, "Science"));
    }
}
