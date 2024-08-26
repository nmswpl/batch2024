package in.co.nmsworks.week4.day1;

public class Book {
    private long isbn;
    private String name;
    private String authorName;
    private String category;
    private int yearOfRelase;

    public Book(long isbn, String name, String authorName, String category, int yearOfRelase) {

        this.isbn = isbn;
        this.name = name;
        this.authorName = authorName;
        this.category = category;
        this.yearOfRelase = yearOfRelase;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYearOfRelase() {
        return yearOfRelase;
    }

    public void setYearOfRelase(int yearOfRelase) {
        this.yearOfRelase = yearOfRelase;
    }
}
