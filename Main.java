import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;

public class Main extends JFrame {
    private BookManager manager;
    private JTextField title, author, year, genre, search;
    private JTextArea displayArea;

    public Main() {
        manager = new BookManager();
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Program do zarządzania książkami");
        setSize(550, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(0, 2, 5, 5));
        title = new JTextField();
        author = new JTextField();
        year = new JTextField();
        genre = new JTextField();
        search = new JTextField();

        inputPanel.add(new JLabel("Tytuł:"));
        inputPanel.add(title);
        inputPanel.add(new JLabel("Autor:"));
        inputPanel.add(author);
        inputPanel.add(new JLabel("Rok:"));
        inputPanel.add(year);
        inputPanel.add(new JLabel("Gatunek:"));
        inputPanel.add(genre);
        inputPanel.add(new JLabel("Wyszukiwanie nieregularne:"));
        inputPanel.add(search);

        JButton addButton = new JButton("Dodaj książkę");
        addButton.addActionListener(new AddBookAction());
        JButton removeButton = new JButton("Usuń książkę");
        removeButton.addActionListener(new RemoveBookAction());
        JButton searchButton = new JButton("Wyszukiwanie nieregularne");
        searchButton.addActionListener(new SearchBookAction());
        JButton showAllButton = new JButton("Pokaż wszystkie książki");
        showAllButton.addActionListener(e -> showAllBooks());
        JButton sortTitleButton = new JButton("Sortuj po tytule");
        sortTitleButton.addActionListener(e -> sortBooks(Comparator.comparing(Book::getTitle)));
        JButton sortAuthorButton = new JButton("Sortuj po autorze");
        sortAuthorButton.addActionListener(e -> sortBooks(Comparator.comparing(Book::getAuthor)));
        JButton sortYearButton = new JButton("Sortuj po roku");
        sortYearButton.addActionListener(e -> sortBooks(Comparator.comparingInt(Book::getYear)));
        JButton sortGenreButton = new JButton("Sortuj po gatunku");
        sortGenreButton.addActionListener(e -> sortBooks(Comparator.comparing(Book::getGenre)));

        inputPanel.add(addButton);
        inputPanel.add(removeButton);
        inputPanel.add(searchButton);
        inputPanel.add(showAllButton);
        inputPanel.add(sortTitleButton);
        inputPanel.add(sortAuthorButton);
        inputPanel.add(sortYearButton);
        inputPanel.add(sortGenreButton);

        add(inputPanel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    private void showAllBooks() {
        displayArea.setText("");
        for (Book book : manager.getBooks()) {
            displayArea.append(book.toString() + "\n");
        }
    }

    private class AddBookAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String titleText = title.getText();
            String authorText = author.getText();
            int yearValue = Integer.parseInt(year.getText());
            String genreText = genre.getText();
            manager.addBook(new Book(titleText, authorText, yearValue, genreText));
            displayArea.append("Dodano: " + titleText + "\n");
        }
    }

    private class RemoveBookAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String titleText = title.getText();
            if (manager.removeBook(titleText)) {
                displayArea.append("Usunięto: " + titleText + "\n");
            } else {
                displayArea.append("Nie znaleziono książki o tytule: " + titleText + "\n");
            }
        }
    }

    private class SearchBookAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String regex = search.getText();
            displayArea.setText("");
            for (Book book : manager.searchBooks(regex)) {
                displayArea.append(book.toString() + "\n");
            }
        }
    }

    private void sortBooks(Comparator<Book> comparator) {
        manager.sortBooks(comparator);
        showAllBooks();
    }

    public static void main(String[] args) {
        new Main();
    }
}
