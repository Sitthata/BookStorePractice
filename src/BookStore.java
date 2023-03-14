import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class BookStore {
    
    ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> searchByTitle(String author) {
        return books.stream()
        .filter(book -> book.getAuthor().equals(author))
        .collect(Collectors.toList());
    }

    public Stream<Book> getBooks() {
        return books.stream();
    }



    
}
