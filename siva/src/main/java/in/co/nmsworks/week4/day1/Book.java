package in.co.nmsworks.week4.day1;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private String category;
    private int yearOfRelease;

    public Book(String bookId, String title, String author, String category, int yearOfRelease) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.yearOfRelease = yearOfRelease;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setRelease(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
