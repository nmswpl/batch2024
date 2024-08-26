package in.co.nmsworks.week3.day5;

public class Book {
    private Long bookId;
    private String title;
    private String author;
    private String category;
    private int year;

    public Book(long bookId, String title, String author, String category, int year) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.year = year;
    }

    public int getBookId() {
        return Math.toIntExact(bookId);
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", year=" + year +
                '}';
    }
}
