package in.co.nmsworks.week3.day5;

public class Books {
    long bookId;
    String bookNmae;
    String author;
    String catagory;
    int year;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookNmae() {
        return bookNmae;
    }

    public void setBookNmae(String bookNmae) {
        this.bookNmae = bookNmae;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Books(long bookId, String bookNmae, String author, String catagory, int year) {
        this.bookId = bookId;
        this.bookNmae = bookNmae;
        this.author = author;
        this.catagory = catagory;
        this.year = year;
    }
}
