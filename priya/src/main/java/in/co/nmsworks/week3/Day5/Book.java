package in.co.nmsworks.week3.Day5;

public class Book {
    private long bookId;
    private String title;
    private String author;
    private String category;


    private int yearOfRelease;

    public long getBookId() {

        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Integer getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void AddBook(long bookId, String title, String author, String category, int yearOfRelease) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.yearOfRelease = yearOfRelease;
    }

    public Book(String[] arr) {
        int i = 0;
        this.bookId = Integer.parseInt(arr[0]);
        this.title = arr[1];
        this.author = arr[2];
        this.category = arr[3];
    }

    public Book(long bookId, String title, String author, String category) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public Book() {

    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", Category='" + category + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
