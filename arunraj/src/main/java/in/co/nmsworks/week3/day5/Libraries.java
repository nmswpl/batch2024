package in.co.nmsworks.week3.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.Scanner;

public class Libraries {
    private int bookId;
    private String title;
    private String author;
    private String category;
    private int yearOfRealese;

    public Libraries() {
    }

    public Libraries(int bookId, String title, String author, String category, int yearOfRealese) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.yearOfRealese = yearOfRealese;
    }

    Scanner scanner = new Scanner(System.in);

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
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

    public int getYearOfRealese() {
        return yearOfRealese;
    }

    public void setYearOfRealese(int yearOfRealese) {
        this.yearOfRealese = yearOfRealese;
    }

    public void addBooksToLibrary() {
        String sql = "insert into books (BookId,BookTitle,BookAuthor,BookCategory,YearOfRealese) values(? ,? , ?,?, ?)";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library"); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            System.out.println("enter a bookId : ");
            long bookId = scanner.nextLong();
            System.out.println("enter a bookName : ");
            String bookName = scanner.nextLine();
            System.out.println("enter a authorName : ");
            String authorName = scanner.nextLine();
            System.out.println("enter a bookCategory : ");
            String bookCategory = scanner.nextLine();
            System.out.println("enter a yearOfRealese : ");
            int yearOfRealese = scanner.nextInt();
            preparedStatement.setLong(1, bookId);
            preparedStatement.setString(2, bookName);
            preparedStatement.setString(3, authorName);
            preparedStatement.setString(4, bookCategory);
            preparedStatement.setLong(5, yearOfRealese);
            preparedStatement.executeUpdate();
            System.out.println("the values inseted successfully ...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewBooksInLibrary() {
        String sql = "select * from books";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library"); Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                long bookId = resultSet.getLong(1);
                String bookTitle = resultSet.getString(2);
                String bookAuthor = resultSet.getString(3);
                String bookCategory = resultSet.getString(4);
                int yearOfRealese = resultSet.getInt(5);
                //boolean availabilty= resultSet.getBoolean(6);
                System.out.println("The bookId : " + bookId);
                System.out.println("The bookName : " + bookTitle);
                System.out.println("The Author : " + bookAuthor);
                System.out.println("The category : " + bookCategory);
                System.out.println("The year of release : " + yearOfRealese);
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBookFromLibrary(Long bookIdValuealue) {
        String sql = "delete from books where BookId =?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library"); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setLong(1, bookIdValuealue);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("The book successfully deleted .." + rowsAffected);
            } else {
                System.out.println("The book not exist ...");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("the book id was not in library ....");
        }
    }

    public void searchBooksInLibrary(Long bookIdValue) {
        String sql = "select * from books where BookId=?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library"); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setLong(1, bookIdValue);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                long bookId = resultSet.getLong(1);
                String bookTitle = resultSet.getString(2);
                String bookAuthor = resultSet.getString(3);
                String bookCategory = resultSet.getString(4);
                int yearOfRealese = resultSet.getInt(5);
                //boolean availabilty= resultSet.getBoolean(6);
                System.out.println("The bookId : " + bookId);
                System.out.println("The bookName : " + bookTitle);
                System.out.println("The Author : " + bookAuthor);
                System.out.println("The category : " + bookCategory);
                System.out.println("The year of release : " + yearOfRealese);
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("the book id was wrong ....");
        }
    }

    public boolean checkAvailability(Long bookIdValue) {
        boolean availabilityValue = false;
        String sql = "select * from books where BookId=?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library"); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setLong(1, bookIdValue);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                availabilityValue = resultSet.getBoolean(6);
            }
            if (availabilityValue) {
                System.out.println("the book is available..");
            } else {
                System.out.println("the book is not available..");
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("the book id was wrong ....");
        }
        return availabilityValue;
    }

    public void rentBookFromLibrary(Long BookIdValue) {
        boolean availabilityValue = checkAvailability(BookIdValue);
        if (availabilityValue) {
            String sql = "insert into rentalDetails (BookId,rentalDate) values(? ,curdate())";
            String sql2 = "update books set availability=false where BookId =? ";
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library"); PreparedStatement preparedStatement = connection.prepareStatement(sql); PreparedStatement preparedStatement1 = connection.prepareStatement(sql2)) {
                preparedStatement.setLong(1, BookIdValue);
                preparedStatement1.setLong(1, BookIdValue);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    preparedStatement1.executeUpdate();
                }
                System.out.println("the book was successfully rented ...");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("the book is not available for rent");
        }
    }

    public void returnBookToLibrary(Long BookIdValue) {
        boolean availabilityValue = checkAvailability(BookIdValue);
        if (!availabilityValue) {
            String sql = "insert into rentalDetails (BookId,returnDate) values(? ,curdate())";
            String sql2 = "update books set availability=true where BookId =? ";
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library"); PreparedStatement preparedStatement = connection.prepareStatement(sql); PreparedStatement preparedStatement1 = connection.prepareStatement(sql2)) {
                preparedStatement.setLong(1, BookIdValue);
                preparedStatement1.setLong(1, BookIdValue);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    preparedStatement1.executeUpdate();
                }
                System.out.println("the book was successfully rented ...");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("The book is already returned ....");
        }
    }

    public void insertBooksToDatabase() {
        String sql = "insert into books (BookId,BookTitle,BookAuthor,BookCategory,YearOfRealese) values(? ,? , ?,?, ?)";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library"); PreparedStatement preparedStatement = connection.prepareStatement(sql); FileReader fileReader = new FileReader("/home/nms/Downloads/Library.csv"); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = "";
            line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                line = line.replaceAll("[\"\\s]+", "").trim();
                String[] entry = line.split(",");
                try {
                    preparedStatement.setLong(1, Long.parseLong(entry[0]));
                    preparedStatement.setString(2, entry[1]);
                    preparedStatement.setString(3, entry[2]);
                    preparedStatement.setString(4, entry[3]);
                    preparedStatement.setInt(5, Integer.parseInt(entry[4]));
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("error while parsing a file :" + entry[0] + " " + entry[1] + " " + entry[2] + "" + entry[3] + "" + entry[4]);
                }
                preparedStatement.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void showMenu() {
        System.out.println("\nMenu Options:");
        System.out.println("1. Add");
        System.out.println("2. View");
        System.out.println("3. Delete");
        System.out.println("4. Search");
        System.out.println("5. Rent");
        System.out.println("6. Return");
        System.out.println("7. Exit");
    }

    public static void main(String[] args) {
        Libraries libraries = new Libraries();
        Scanner scanner = new Scanner(System.in);
        String choice;

        while (true) {
            showMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine().trim().toLowerCase();

            switch (choice) {
                case "1":
                case "add":
                    libraries.addBooksToLibrary();
                    break;
                case "2":
                case "view":
                    libraries.viewBooksInLibrary();
                    break;
                case "3":
                case "delete":
                    System.out.println("Delete operation selected.");
                    break;
                case "4":
                case "search":
                    libraries.searchBooksInLibrary(7L);
                    break;
                case "5":
                case "rent":
                    libraries.rentBookFromLibrary(7L);
                    break;
                case "6":
                case "return":
                    libraries.returnBookToLibrary(7L);
                    break;
                case "7":
                case "exit":
                    System.out.println("Exit.....");
                    scanner.close();
                    return;
                default:
                    System.out.println("invalid choice...");
            }
        }
    }
}
