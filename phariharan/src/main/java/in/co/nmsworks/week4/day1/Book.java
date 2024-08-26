package in.co.nmsworks.week4.day1;

public class Book {
    private Long book_id;
    private String title;
    private String author;
    private String category;
    private int year;
    private boolean isAvailable;

    public Book(Long book_id, String title, String author, String category, int year, boolean isAvailable) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", year=" + year +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
