package in.co.nmsworks.week3.day5;

import java.sql.*;
import java.util.Scanner;

public class LibraryManagement {

    static Scanner sc = new Scanner(System.in);
    static Connection connection;
    static Statement statement = null;

    static {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Rent a Book");
            System.out.println("2. Return a Book");
            System.out.println("3. Check Book Availability");
            System.out.println("4. Add a Book");
            System.out.println("5. Delete a Book");
            System.out.println("6. Search book");
            System.out.println("7. exit ");
            System.out.print("Enter your choice: ");

            int choice = 0;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Search by: 1. ISBN 2. Book Name");
                    int rentSearchBy = sc.nextInt();
                    if (rentSearchBy > 0 && rentSearchBy < 3) {
                        sc.nextLine();
                        System.out.print("Enter search keyword: ");
                        String rentSearch = sc.nextLine();
                        library.getRent(rentSearchBy, rentSearch.trim());
                        break;
                    } else {
                        System.out.println("Enter correct choice !!!");
                        break;
                    }

                case 2:
                    System.out.println("Search by: 1. ISBN 2. Book Name ");
                    int returnSearchBy = sc.nextInt();
                    if (returnSearchBy > 0 && returnSearchBy < 3) {
                        sc.nextLine();
                        System.out.print("Enter search keyword: ");
                        String returnSearch = sc.nextLine();
                        library.returnBook(returnSearchBy, returnSearch.trim());
                    } else {
                        System.out.println("Enter correct choice !!");
                    }
                    break;

                case 3:
                    System.out.println("Search by: 1. ISBN 2. Book Name");
                    int availabilitySearchBy = sc.nextInt();
                    if (availabilitySearchBy > 0 && availabilitySearchBy < 3) {
                        sc.nextLine();
                        System.out.print("Enter search keyword: ");
                        String availabilitySearch = sc.nextLine();
                        library.checkAvailability(availabilitySearchBy, availabilitySearch.trim());
                    } else {
                        System.out.println("enter correct choice !!!");
                    }
                    break;

                case 4:
                    System.out.print("Enter ISBN: ");
                    long bookID = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter Year: ");
                    int year = sc.nextInt();
                    sc.nextLine();
                    library.addBook(bookID, title, author, category, year);
                    break;

                case 5:
                    System.out.println("Search by: 1. ISBN 2. Book Name ");
                    int deleteSearchBy = sc.nextInt();
                    if (deleteSearchBy > 0 && deleteSearchBy < 3) {
                        sc.nextLine();
                        System.out.print("Enter search keyword: ");
                        String deleteSearchKeyword = sc.nextLine();
                        library.deleteBook(deleteSearchBy, deleteSearchKeyword.trim());
                    } else {
                        System.out.println("Enter correct choice !!!");
                    }
                    break;

                case 6:
                    System.out.println("Search by: 1. ISBN 2. Book Name 3. Author 4. Category");
                    int search = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter search keyword: ");
                    String searchKeyword = sc.nextLine();
                    library.displayDetails(search, searchKeyword.trim());
                    break;

                case 7:
                    exit = true;
                    library.closeConnection();
                    System.out.println("Bye.....!!!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }


    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private ResultSet getData(int searchBy, String search) throws SQLException {
        String query = "SELECT * FROM Library WHERE ";
        switch (searchBy) {
            case 1:
                query += "ISBN = ?";
                break;
            case 2:
                query += "bookname = ?";
                break;
            case 3:
                query += "author = ?";
                break;
            default:
                query += "category = ?";
                break;
        }
        PreparedStatement ps1 = connection.prepareStatement(query);
        ps1.setString(1, search);
        return ps1.executeQuery();
    }


    private void displayDetails(int searchBy, String searchKeyword) {
        try {
            ResultSet bookData = getData(searchBy, searchKeyword);
            if (bookData != null && bookData.next()) {
                System.out.println("Book Details :");
                do {
                    System.out.println("Book ISBN : " + bookData.getLong("ISBN")
                            + "\nBook Name : " + bookData.getString("bookname")
                            + "\nAuthor : " + bookData.getString("author")
                            + "\nCategory : " + bookData.getString("category")
                            + "\nYear : " + bookData.getInt("year")
                            + "\nStatus : " + (bookData.getBoolean("status") ? "Available" : "Not Available"));
                } while (bookData.next());
            } else {
                System.out.println("No book records found !!!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void getRent(int searchBy, String search) {
        try (ResultSet rs = getData(searchBy, search)) {
            if (rs != null) {
                try {
                    if (rs.next() && rs.getBoolean("status")) {
                        PreparedStatement rentQuery = connection.prepareStatement("UPDATE Library SET status = false WHERE ISBN = ?");
                        rentQuery.setLong(1, rs.getLong("ISBN"));
                        rentQuery.executeUpdate();
                        System.out.println("Book rented successfully. Return within 10 days!");
                    } else {
                        System.out.println("Book not available or not  found");
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Book not found. Try again.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private void checkAvailability(int searchBy, String search) {
        try (ResultSet rs = getData(searchBy, search)) {
            if (rs != null) {
                try {
                    if (rs.next()) {
                        if (!rs.getBoolean("status")) {
                            System.out.println("Book is not available");
                        } else {
                            System.out.println("Book is available");
                        }
                    }
                    else {
                        System.out.println("Book not available or not found !!!");
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Book not found. Try again.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void returnBook(int searchBy, String search) {
        try (ResultSet rs = getData(searchBy, search)) {
            if (rs != null) {
                try {
                    if (rs.next() && !rs.getBoolean("status")) {
                        PreparedStatement returnQuery = connection.prepareStatement("UPDATE Library SET status = true WHERE ISBN = ?");
                        returnQuery.setLong(1, rs.getLong("ISBN"));
                        returnQuery.executeUpdate();
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("Book was not rented or not found.");
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void addBook(long bookID, String title, String author, String category, int year) {
        try (PreparedStatement ps = connection.prepareStatement("INSERT INTO Library (ISBN, bookname, author, category, year, status) VALUES (?, ?, ?, ?, ?, ?)")) {
            ps.setLong(1, bookID);
            ps.setString(2, title);
            ps.setString(3, author);
            ps.setString(4, category);
            ps.setInt(5, year);
            ps.setBoolean(6, true);
            ps.executeUpdate();
            System.out.println("Book added successfully.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void deleteBook(int searchBy, String searchKeyword) {
        try (ResultSet rs = getData(searchBy, searchKeyword)) {
            if (rs != null) {
                try {
                    if (rs.next() && rs.getBoolean("status")) {
                        PreparedStatement deleteQuery = connection.prepareStatement("DELETE FROM Library WHERE ISBN = ?");
                        deleteQuery.setLong(1, rs.getLong("ISBN"));
                        deleteQuery.executeUpdate();
                        System.out.println("Book deleted successfully.");
                    } else {
                        System.out.println("Book is currently unavailable or not found.");
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Book not found. Try again.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
