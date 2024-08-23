package in.co.nmsworks.week3.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;

public class Books {
    private long ISBN;
    private String bookName;
    private String author;
    private String category;
    private String releaseYear;
    private boolean status;

    public Books(){}

    public Books(long ISBN, String bookName, String author, String category, String releaseYear, boolean status) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.author = author;
        this.category = category;
        this.releaseYear = releaseYear;
        this.status = status;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
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

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Books{" +
                "ISBN=" + ISBN +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
    public List<Books> readFromFile(){
        List<Books> booksList = new ArrayList<>();
        try (FileReader reader = new FileReader("/home/nms/Downloads/Library.csv");
               CSVReader csvReader = new CSVReader(reader)){

            csvReader.skip(1);
            String[] bookDetails;
            while ((bookDetails = csvReader.readNext()) != null) {
                long ISBN = Long.parseLong(bookDetails[0].trim());
                String bookName = bookDetails[1].trim();
                String author = bookDetails[2].trim();
                String category = bookDetails[3].trim();
                String releaseYear = bookDetails[4].trim();
                Books book = new Books(ISBN, bookName, author, category, releaseYear, true);
                booksList.add(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }
        return booksList;
    }

    public void writeIntoDb(List<Books> booksList){
        String sql = "insert into library values(?,?,?,?,?,?)";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
             int noOfRows = 0;
            for (Books book : booksList) {
                preparedStatement.setLong(1,book.getISBN());
                preparedStatement.setString(2,book.getBookName());
                preparedStatement.setString(3,book.getAuthor());
                preparedStatement.setString(4,book.getCategory());
                preparedStatement.setString(5,book.getReleaseYear());
                preparedStatement.setBoolean(6,book.isStatus());
                noOfRows += preparedStatement.executeUpdate();
            }
            System.out.println(noOfRows+" Rows Affected");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addBook(long ISBN, String bookName, String author, String category, String releaseYear, boolean status){
        String sql = "insert into library values(?,?,?,?,?,?)";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
             preparedStatement.setLong(1,ISBN);
             preparedStatement.setString(2,bookName);
             preparedStatement.setString(3,author);
             preparedStatement.setString(4,category);
             preparedStatement.setString(5,releaseYear);
             preparedStatement.setBoolean(6,status);
             int noOfRows = preparedStatement.executeUpdate();
             System.out.println(noOfRows+" rows affected");
             System.out.println("Book successfully added");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void searchBookByISBN(long ISBN){
        String sql = "select * from library where ISBN = ?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
             preparedStatement.setLong(1,ISBN);
             ResultSet rs = preparedStatement.executeQuery();
             while (rs.next()){
                 System.out.println("ISBN :: "+rs.getLong(1));
                 System.out.println("Book name :: "+rs.getString(2));
                 System.out.println("Author :: "+rs.getString(3));
                 System.out.println("Category :: "+rs.getString(4));
                 System.out.println("Release year :: "+rs.getString(5));
                 if(rs.getBoolean(6)){
                     System.out.println("Book available");
                 }
                 else {
                     System.out.println("Book currently unavailable");
                 }
             }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void searchBookByName(String bookName){
        String sql = "select * from library where bookName = ?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1,bookName);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                System.out.println("ISBN :: "+rs.getLong(1));
                System.out.println("Book name :: "+rs.getString(2));
                System.out.println("Author :: "+rs.getString(3));
                System.out.println("Category :: "+rs.getString(4));
                System.out.println("Release year :: "+rs.getString(5));
                if(rs.getBoolean(6)){
                    System.out.println("Book available");
                }
                else {
                    System.out.println("Book currently unavailable");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void searchBookByAuthor(String author){
        String sql = "select * from library where author = ?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1,author);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                System.out.println("ISBN :: "+rs.getLong(1));
                System.out.println("Book name :: "+rs.getString(2));
                System.out.println("Author :: "+rs.getString(3));
                System.out.println("Category :: "+rs.getString(4));
                System.out.println("Release year :: "+rs.getString(5));
                if(rs.getBoolean(6)){
                    System.out.println("Book available");
                }
                else {
                    System.out.println("Book currently unavailable");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void searchBookByCategory(String category){
        String sql = "select * from library where category = ?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1,category);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                System.out.println("ISBN :: "+rs.getLong(1));
                System.out.println("Book name :: "+rs.getString(2));
                System.out.println("Author :: "+rs.getString(3));
                System.out.println("Category :: "+rs.getString(4));
                System.out.println("Release year :: "+rs.getString(5));
                if(rs.getBoolean(6)){
                    System.out.println("Book available");
                }
                else {
                    System.out.println("Book currently unavailable");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBook(String bookName){
        String sql = "delete from library where bookName = ?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
             preparedStatement.setString(1,bookName);
             int noOfRows = preparedStatement.executeUpdate();
             if(noOfRows == 1){
                 System.out.println("Book successfully deleted");
             }
             else{
                 System.out.println("Book not found !!");
             }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        public static void main(String[] args) {
        Books b1 = new Books();
        //b1.readFromFile();
        //b1.writeIntoDb(b1.readFromFile());
        //b1.addBook(2308202451L,"The Catcher in the Rye".trim(),"J.D. Salinger".trim(),"Young Adult / Fiction".trim(),"1951",true);
        //b1.searchBookByISBN(2308202451L);
        //b1.searchBookByName("The Great Gatsby".trim());
        //b1.searchBookByAuthor("Jane Austen".trim());
        //b1.searchBookByCategory("Fiction".trim());
            // b1.deleteBook("Othello".trim());

    }
}