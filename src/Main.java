import java.io.BufferedReader;
import java.io.FileReader;


public class Main {
    public static void main(String[] args) {

        // Provide a file path
        String filePath = "C:\\Users\\ADMIN\\Desktop\\Java Collection Practice\\BookStoreApp\\BookData.csv";
        
        BookStore bookstore = new BookStore();

        // Read a CSV file
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            String line = br.readLine(); // Read NextLine
            while (line != null) {
                if(!line.trim().isEmpty()) {
                    String[] bookData = line.split(",");
                    // Constructor for book
                    Book book = new Book(bookData[0], bookData[1], Integer.parseInt(bookData[2]), Double.parseDouble(bookData[3]));
                    bookstore.addBook(book);
                }
                line = br.readLine(); // Go to next line
            }
            br.close(); // if finish close csv file
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("All Books");
        bookstore.getBooks().forEach(System.out::println);
    }
}