package in.co.nmsworks.week3.Day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    List<Book> books = new ArrayList<>();
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
    PreparedStatement addBook = connection.prepareStatement("INSERT INTO books (bookId,title,author,category,yearOfRelease)VALUES(?,?,?,?,?)");
    PreparedStatement addAvailabilityColumn = connection.prepareStatement("alter table books add column Availability varchar(255) default 'Yes'");
    PreparedStatement deleteBook = connection.prepareStatement("DELETE FROM books WHERE TITLE = ?");
    PreparedStatement checkAvailability = connection.prepareStatement("SELECT availability FROM books WHERE TITLE = ?");
    PreparedStatement setAvailability = connection.prepareStatement("UPDATE books SET AVAILABILITY = ? WHERE TITLE = ?");

    public Library() throws SQLException {
    }

    public List<Book> getBookList() {
        try (FileReader fr = new FileReader("/home/nms/Library.csv");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            String[] arr = {};
            br.readLine();
            while ((line = br.readLine()) != null) {
                arr = line.replaceAll("\"", " ").split(",", 5);
                int i = 0;
                for (String string : arr) {
                    string = string.trim();
                    arr[i++] = string;
                }
                Book book = new Book(arr);
                books.add(book);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

    public void createTableBooks() {

        try {
            for (Book book : books) {
                addBook.setLong(1, book.getBookId());
                addBook.setString(2, book.getTitle());
                addBook.setString(3, book.getAuthor());
                addBook.setString(4, book.getCategory());
                addBook.setInt(5, book.getYearOfRelease());
                addBook.executeUpdate();
            }
            addAvailabilityColumn.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                addBook.close();
                addAvailabilityColumn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void addBook(long bookId, String title, String author, String category, int yearOfRelease) {
        try {
            addBook.setLong(1, bookId);
            addBook.setString(2, title);
            addBook.setString(3, author);
            addBook.setString(4, category);
            addBook.setInt(5, yearOfRelease);
            addBook.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                addBook.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void searchBookByName(String name) {

        try {
            PreparedStatement searchBookByName = connection.prepareStatement("select * from books where title  = ?");
            searchBookByName.setString(1, name);
            ResultSet rs = searchBookByName.executeQuery();
            while (rs.next()) {
                System.out.println("BookId: " + rs.getLong(1));
                System.out.println("Book Title: " + rs.getString(2));
                System.out.println("Author: " + rs.getString(3));
                System.out.println("Category: " + rs.getString(4));
                System.out.println("Year of release: " + rs.getInt(5));
                System.out.println("Availability: " + rs.getString(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchBookByAuthor(String author) {
        try {
            PreparedStatement searchBookByName = connection.prepareStatement("select * from books where author  = ?");
            searchBookByName.setString(1, author);
            ResultSet rs = searchBookByName.executeQuery();
            while (rs.next()) {
                System.out.println("BookId: " + rs.getLong(1));
                System.out.println("Book Title: " + rs.getString(2));
                System.out.println("Author: " + rs.getString(3));
                System.out.println("Category: " + rs.getString(4));
                System.out.println("Year of release: " + rs.getInt(5));
                System.out.println("Availability: " + rs.getString(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void searchByBookId(long Id) {
        try {
            PreparedStatement searchBookByName = connection.prepareStatement("select * from books where bookid  = ?");
            searchBookByName.setLong(1, Id);
            ResultSet rs = searchBookByName.executeQuery();
            while (rs.next()) {
                System.out.println("BookId: " + rs.getLong(1));
                System.out.println("Book Title: " + rs.getString(2));
                System.out.println("Author: " + rs.getString(3));
                System.out.println("Category: " + rs.getString(4));
                System.out.println("Year of release: " + rs.getInt(5));
                System.out.println("Availability: " + rs.getString(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchBookByCategory(String category) {
        try {
            PreparedStatement searchBookByName = connection.prepareStatement("select * from books where category  = ?");
            searchBookByName.setString(1, category);
            ResultSet rs = searchBookByName.executeQuery();
            while (rs.next()) {
                System.out.println("BookId: " + rs.getLong(1));
                System.out.println("Book Title: " + rs.getString(2));
                System.out.println("Author: " + rs.getString(3));
                System.out.println("Category: " + rs.getString(4));
                System.out.println("Year of release: " + rs.getInt(5));
                System.out.println("Availability: " + rs.getString(6));
                System.out.println("********************************");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteBook(String name) {
        try {
            deleteBook.setString(1, name);
            deleteBook.executeUpdate();
            System.out.println(name + " deleted successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String checkAvailability(String name) {
        String isAvailable = "No";
        try {
            checkAvailability.setString(1, name);
            ResultSet availability = checkAvailability.executeQuery();
            while (availability.next()) {
                isAvailable = availability.getString(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isAvailable;
    }

    public void rentBook(String name) {
        try {
            String isAvailable = checkAvailability(name);
            if (isAvailable.equalsIgnoreCase("Yes")) {
                System.out.println("Book Rent Success");
                setAvailability.setString(1, "NO");
                setAvailability.setString(2, name);
                setAvailability.executeUpdate();
            } else {
                System.out.println(name + " is currently unavailable");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void returnBook(String name) {
        try {
            setAvailability.setString(1, "Yes");
            setAvailability.setString(2, name);
            setAvailability.executeUpdate();
            System.out.println(name + " returned successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        Library l = new Library();
        //l.addBook(2100213,"Wings of fire","Abdul Kalam","Fiction",2020);
        l.searchBookByCategory("Fiction");
        l.searchByBookId(2308202);
        l.searchBookByName("1984");
        l.searchBookByAuthor("Abdul kalam");
        l.rentBook("1984");
        l.rentBook("1984");
        l.returnBook("1984");
        System.out.println(l.checkAvailability("1984"));
        l.rentBook("1984");
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO PRIYA\'S LIBRARY");
        System.out.println("***************************");
        System.out.println("Enter 1 for Operations");
        System.out.println("Enter -1 to Exit");
        while (scanner.nextInt() != -1) {
            System.out.println("Please Enter your choice");
            System.out.println("1: ADD BOOK");
            System.out.println("2: SEARCH BOOK BY NAME");
            System.out.println("3: SEARCH BOOK BY AUTHOR");
            System.out.println("4: SEARCH BOOK CATEGORY");
            System.out.println("5: DELETE BOOK");
            System.out.println("6: RENT BOOK");
            System.out.println("7: RETURN BOOK");
            System.out.println("8: CHECK BOOK AVAILABILITY");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(" Enter BookID");
                    long id = scanner.nextLong();
                    System.out.println("Enter book title");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    System.out.println("Enter author name ");
                    String authorName = scanner.nextLine();
                    System.out.println("Enter book category");
                    String category = scanner.next();
                    System.out.println("Enter year of release of the book");
                    int yerOfRelease = scanner.nextInt();
                    l.addBook(id, title, authorName, category, yerOfRelease);
                    System.out.println("Book " + title + " added successfully");
                    break;
                case 2:
                    System.out.println("Enter book name to search");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println(name);
                    l.searchBookByName(name);
                    break;
                case 3:
                    System.out.println("Enter author name to search");
                    scanner.nextLine();
                    String author = scanner.nextLine();
                    l.searchBookByAuthor(author);
                    break;
                case 4:
                    System.out.println("Enter category of the  book to search");
                    scanner.nextLine();
                    String bookCategory = scanner.nextLine();
                    l.searchBookByCategory(bookCategory);
                    break;
                case 5:
                    System.out.println("Enter book title to delete");
                    scanner.nextLine();
                    String bookToDelete = scanner.nextLine();
                    l.deleteBook(bookToDelete);
                    break;
                case 6:
                    System.out.println("Enter book name to rent");
                    scanner.nextLine();
                    String bookToRent = scanner.nextLine();
                    l.rentBook(bookToRent);
                    break;
                case 7:
                    System.out.println("Enter book name to rent");
                    scanner.nextLine();
                    String bookToReturn = scanner.nextLine();
                    l.returnBook(bookToReturn);
                    break;
                case 8:
                    System.out.println("Enter book name to checkAvailability");
                    scanner.nextLine();
                    String bookToCheck = scanner.nextLine();
                    l.checkAvailability(bookToCheck);
                    break;


            }


        }

    }

}


