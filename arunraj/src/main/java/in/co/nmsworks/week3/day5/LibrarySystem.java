package in.co.nmsworks.week3.day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LibrarySystem {
    public void listToTable(){
        Library library = new Library();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "nms", "");
            PreparedStatement ps = con.prepareStatement("INSERT INTO Books VALUES(?,?,?,?,?)");

            for (Book book : library.csvToList()){
                /*ps.executeUpdate(1,book.getBookId());
                ps.executeUpdate(2,book.getTitle());
                ps.executeUpdate(3,book.getAuthor());
                ps.executeUpdate(4,book.getCategory());
                ps.executeUpdate(5,book.getYear());*/
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addBook(){
        Library library = new Library();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "nms", "");
            PreparedStatement ps = con.prepareStatement("INSERT INTO Books values(?,?,?,?,?)");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void searchBook(String book){

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "nms", "");
            PreparedStatement ps = con.prepareStatement("SELECT bookname FROM books WHERE bookname = ?");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void deleteBook(String book){


    }
}
