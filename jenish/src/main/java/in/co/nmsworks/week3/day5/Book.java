package in.co.nmsworks.week3.day5;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;

public class Book {
    private long ISBN;
    private String bookName;
    private String author;
    private String category;
    private String releaseYear;
    private boolean isAvailable;

    public Book() {
    }

    public Book(long ISBN, String bookName, String author, String category, String releaseYear, boolean status) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.author = author;
        this.category = category;
        this.releaseYear = releaseYear;
        this.isAvailable = status;
    }

    public long getISBN() {
        return ISBN;
    }


    public String getBookName() {
        return bookName;
    }


    public String getAuthor() {
        return author;
    }


    public String getCategory() {
        return category;
    }


    public String getReleaseYear() {
        return releaseYear;
    }


    public boolean isStatus() {
        return isAvailable;
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

    public List<Book> readFromFile() {
        List<Book> booksList = new ArrayList<>();
        try (FileReader reader = new FileReader("/home/nms/Library.csv");
             CSVReader csvReader = new CSVReader(reader)) {

            csvReader.skip(1);
            String[] bookDetails;
            while ((bookDetails = csvReader.readNext()) != null) {
                long ISBN = Long.parseLong(bookDetails[0].trim());
                String bookName = bookDetails[1].trim();
                String author = bookDetails[2].trim();
                String category = bookDetails[3].trim();
                String releaseYear = bookDetails[4].trim();
                Book book = new Book(ISBN, bookName, author, category, releaseYear, true);
                booksList.add(book);
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        return booksList;
    }

    public void writeIntoDb(List<Book> booksList) {
        String sql = "insert into library values(?,?,?,?,?,?)";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            int noOfRows = 0;
            for (Book book : booksList) {
                preparedStatement.setLong(1, book.getISBN());
                preparedStatement.setString(2, book.getBookName());
                preparedStatement.setString(3, book.getAuthor());
                preparedStatement.setString(4, book.getCategory());
                preparedStatement.setString(5, book.getReleaseYear());
                preparedStatement.setBoolean(6, book.isStatus());
                noOfRows += preparedStatement.executeUpdate();
            }
            System.out.println(noOfRows + " Rows Affected");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addBook(long ISBN, String bookName, String author, String category, String releaseYear, boolean status) {
        String sql = "insert into library values(?,?,?,?,?,?)";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setLong(1, ISBN);
            preparedStatement.setString(2, bookName);
            preparedStatement.setString(3, author);
            preparedStatement.setString(4, category);
            preparedStatement.setString(5, releaseYear);
            preparedStatement.setBoolean(6, status);
            int noOfRows = preparedStatement.executeUpdate();
            System.out.println(noOfRows + " rows affected");
            System.out.println("Book successfully added");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void searchBookByISBN(long ISBN) {
        String sql = "select * from library where ISBN = ?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setLong(1, ISBN);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                if (rs.getBoolean(6)) {
                    System.out.println("Book available...");
                    System.out.println("ISBN :: " + rs.getLong(1));
                    System.out.println("Book name :: " + rs.getString(2));
                    System.out.println("Author :: " + rs.getString(3));
                    System.out.println("Category :: " + rs.getString(4));
                    System.out.println("Release year :: " + rs.getString(5));

                } else {
                    System.out.println("Book currently unavailable");
                }
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void searchBookByName(String bookName) {
        String sql = "select * from library where bookName = ?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, bookName);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                if (rs.getBoolean(6)) {
                    System.out.println("Book available...");
                    System.out.println("ISBN :: " + rs.getLong(1));
                    System.out.println("Book name :: " + rs.getString(2));
                    System.out.println("Author :: " + rs.getString(3));
                    System.out.println("Category :: " + rs.getString(4));
                    System.out.println("Release year :: " + rs.getString(5));
                } else {
                    System.out.println("Book currently unavailable");
                }
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void searchBookByAuthor(String author) {
        String sql = "select * from library where author = ?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, author);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                if (rs.getBoolean(6)) {
                    System.out.println("Book available...");
                    System.out.println("ISBN :: " + rs.getLong(1));
                    System.out.println("Book name :: " + rs.getString(2));
                    System.out.println("Author :: " + rs.getString(3));
                    System.out.println("Category :: " + rs.getString(4));
                    System.out.println("Release year :: " + rs.getString(5));
                } else {
                    System.out.println("Specified author books are unavailable.");
                }
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void searchBookByCategory(String category) {
        String sql = "select * from library where category = ?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, category);
            ResultSet rs = preparedStatement.executeQuery();
            System.out.println("Available books...");
            System.out.println("***************************");
            while (rs.next()) {
                if (rs.getBoolean(6)) {
                    System.out.println("ISBN :: " + rs.getLong(1));
                    System.out.println("Book name :: " + rs.getString(2));
                    System.out.println("Author :: " + rs.getString(3));
                    System.out.println("Category :: " + rs.getString(4));
                    System.out.println("Release year :: " + rs.getString(5));
                    System.out.println("***************************");

                } else {
                    System.out.println("No Books found under this category.");
                }
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBook(String bookName) {
        String sql = "delete from library where bookName = ?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, bookName);
            if (checkAvailability(bookName)) {
                int noOfRows = preparedStatement.executeUpdate();
                if (noOfRows == 1) {
                    System.out.println("Book successfully deleted");
                } else {
                    System.out.println("Book not found !!");
                }
            } else {
                System.out.println("Unable to delete the book !!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void rentBookByName(String bookName) {
        String sql = "select * from library where bookName = ?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, bookName);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                if (rs.getBoolean(6)) {
                    Statement statement = connection.createStatement();
                    int noOfRows = statement.executeUpdate("update library set status = 0 where bookName = '" + bookName + "'");
                    System.out.println(noOfRows + " rows affected");
                    System.out.println("Book is given for rent...");
                } else {
                    System.out.println("Book currently unavailable, comeback after some time");
                }
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void returnBook(String bookName) {
        String sql = "select * from library where bookName = ?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, bookName);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                if (!rs.getBoolean(6)) {
                    Statement statement = connection.createStatement();
                    int noOfRows = statement.executeUpdate("update library set status = 1 where bookName = '" + bookName + "'");
                    System.out.println(noOfRows + " rows affected");
                    System.out.println("Successfully returned...");
                } else {
                    System.out.println("Book is already available...");
                }
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean checkAvailability(String bookName) {
        String sql = "select * from library where bookName = ?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, bookName);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                if (rs.getBoolean(6)) {
                    return true;
                }
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}