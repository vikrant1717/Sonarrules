import java.util.*;
import java.util.stream.Collectors;

public class Example {
    private List<Book> books = new ArrayList<>();
    
    public void demonstrateForEachVsCollect() {
        List<String> bookNames = new ArrayList<>();
        books.stream().filter(book -> book.getIsbn().startsWith("0"))
                        .map(Book::getTitle)
                        .forEach(bookNames::add);  // Noncompliant: should use collect
        
        Set<String> authors = new HashSet<>();
        books.stream().map(Book::getAuthor)
                      .forEach(authors::add);  // Noncompliant: should use collect
    }
}

class Book {
    private String isbn;
    private String title;
    private String author;
    
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}
