package in.co.nmsworks.week4.day1;

public class Book {
    private long ISBM;
    private String bookName;
    private String author;
    private String category;
    private int releaseYear;

    public Book() {
    }

    public Book(long ISBM, String bookName, String author, String category, int releaseYear) {
        this.ISBM = ISBM;
        this.bookName = bookName;
        this.author = author;
        this.category = category;
        this.releaseYear = releaseYear;
    }

    public long getISBM() {
        return ISBM;
    }

    public void setISBM(long ISBM) {
        this.ISBM = ISBM;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBM=" + ISBM +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
