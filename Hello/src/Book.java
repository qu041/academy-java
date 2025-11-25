public class Book {
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private String pubYear;
    private String category;
    private String kdcName;

    public Book(String title, String author, String isbn,
                String publisher, String pubYear,
                String category, String kdcName) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.pubYear = pubYear;
        this.category = category;
        this.kdcName = kdcName;
    }

    public String getIsbn() {
        return isbn;
    }

    public String[] toArray() {
        return new String[]{
            title, author, isbn, publisher, pubYear, category, kdcName
        };
    }
}