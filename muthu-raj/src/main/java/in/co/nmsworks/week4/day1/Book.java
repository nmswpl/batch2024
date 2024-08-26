package in.co.nmsworks.week4.day1;

public class Book {
    private Long id;
    private String title;
    private String author;
    private String category;
    private int yearOfRelease;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }



    @Override
    public String toString() {
        return "\n-------------x--------------" +
                "\nid = " + id +
                "\ntitle = '" + title + '\'' +
                "\nauthor = '" + author + '\'' +
                "\ncategory = '" + category + '\'' +
                "\nyearOfRelease = " + yearOfRelease;
    }
}
