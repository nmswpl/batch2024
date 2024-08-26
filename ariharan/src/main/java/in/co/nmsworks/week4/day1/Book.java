package in.co.nmsworks.week4.day1;
//"Book Id"," Title    "," Author"," Category          "," Year of Release "
public class Book {
    private Long id;
    private String bookName;
    private String author;
    private  String category;
    private Integer yearOfRelease;

    public Book(Long id, String bookName, String author, String category, Integer yearOfRelease){
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.category = category;
        this.yearOfRelease = yearOfRelease;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public Integer getYearOfRelease(){
        return yearOfRelease;
    }

    public void setYearOfRelease(Integer yearOfRelease){
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString(){
        return "Books{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                "}\n";
    }
}
