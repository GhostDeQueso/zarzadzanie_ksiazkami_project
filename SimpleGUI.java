import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI extends JFrame {
    private BookManager manager;
    private JTextField titleField, authorField, yearField, genreField, searchField;
    private JTextArea textArea;

    public SimpleGUI(BookManager manager) {
        this.manager = manager;
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Book Management System");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Input Panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(0, 2, 5, 5));

        titleField = new JTextField();
        authorField = new JTextField();
        yearField = new JTextField();
        genreField = new JTextField();
        searchField = new JTextField();

        inputPanel.add(new JLabel("Title:"));
        inputPanel.add(titleField);
        inputPanel.add(new JLabel("Author:"));
        inputPanel.add(authorField);
        inputPanel.add(new JLabel("Year:"));
        inputPanel.add(yearField);
        inputPanel.add(new JLabel("Genre:"));
        inputPanel.add(genreField);
        inputPanel.add(new JLabel("Search/Regex:"));
        inputPanel.add(searchField);

        JButton addButton = new JButton("Add Book");
        addButton.addActionListener(new AddBookAction());
        JButton removeButton = new JButton("Remove Book");
        removeButton.addActionListener(new RemoveBookAction());
        JButton searchButton = new JButton("Search Regex");
        searchButton.addActionListener(new SearchBookAction());
        JButton sortTitleButton = new JButton("Sort by Title");
        sortTitleButton.addActionListener(e -> sortBooks(Comparator.comparing(Book::getTitle)));
        JButton sortAuthorButton = new JButton("Sort by Author");
        sortAuthorButton.addActionListener(e -> sortBooks(Comparator.comparing(Book::getAuthor)));
        JButton sortYearButton = new JButton("Sort by Year");
        sortYearButton.addActionListener(e -> sortBooks(Comparator.comparingInt(Book::getYear)));

        inputPanel.add(addButton);
        inputPanel.add(removeButton);
        inputPanel.add(searchButton);
        inputPanel.add(sortTitleButton);
        inputPanel.add(sortAuthorButton);
        inputPanel.add(sortYearButton);

        add(inputPanel, BorderLayout.NORTH);

        // Text Area
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);
    }

    private class AddBookAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String title = titleField.getText();
            String author = authorField.getText();
            int year = Integer.parseInt(yearField.getText());
            String genre = genreField.getText();
            manager.addBook(new Book(title, author, year, genre));
            textArea.append("Added: " + title + "\n");
        }
    }

    private class RemoveBookAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String title = titleField.getText();
            manager.removeBook(new Book(title, "", 0, ""));
            textArea.append("Removed: " + title + "\n");
        }
    }

    private class SearchBookAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String regex = searchField.getText();
            textArea.setText("");
            for (Book book : manager.searchBooks(regex)) {
                textArea.append(book.toString() + "\n");
            }
        }
    }

    private void sortBooks(Comparator<Book> comparator) {
        manager.sortBooks(comparator);
        textArea.setText("");
        for (Book book : manager.books) {
            textArea.append(book.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        BookManager manager = new BookManager();
        SimpleGUI gui = new SimpleGUI(manager);
        gui.setVisible(true);
    }
}
