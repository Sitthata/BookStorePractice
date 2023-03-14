public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double price;

    public Book(String title, String author, int publicationYear, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
    }


    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public double getPrice() {
        return this.price;
    }
    
    @Override
    public String toString() {
        return "Title: " + this.title + ", Author: " + this.author + ", Publisher: " + this.publicationYear + ", Price: " + this.price;
    }
}
