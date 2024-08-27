package in.co.nmsworks.week3.day5;


import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("Welcome to chennai public library\n----------------------------------");
            System.out.println("1. Search Database" +
                    "\n2. Delete Book" +
                    "\n3. Rent a Book" +
                    "\n4. Return a Book" +
                    "\n0. Exit");
            System.out.println("Enter your choice ::");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    searchBook();
                    break;

                case 2:
                    deleteBook();
                    break;

                case 3:
                    rentABook();
                    break;

                case 4:
                    returnABook();
                    break;

                default:
                    System.out.println("Thanks for using our service!");
                    break;
            }

        }while(choice != 0);
        sc.close();
    }

    private static void returnABook()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Book:: ");
        String name = sc.nextLine().trim();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps = con.prepareStatement("SELECT * FROM Library WHERE title = ? limit 1"))
        {
            ps.setString(1, name);
            try (ResultSet rs = ps.executeQuery())
            {
                boolean rented = false;
                while(rs.next())
                {
                    rented = rs.getBoolean(6);
                }
                if (!rented)
                {
                    System.out.println("Confirm to return (y/n) ?");
                    String rent = sc.nextLine().trim();
                    if ("y".equalsIgnoreCase(rent))
                    {
                        try (PreparedStatement pst = con.prepareStatement("UPDATE library SET status = ? WHERE title = \"" + name + "\""))
                        {
                            pst.setBoolean(1, true);
                            pst.executeUpdate();
                        }
                        System.out.println(" Inventory Updated!");
                    }
                }
                else {
                    System.out.println("Sorry, we can't take this one, it doesn't belong to us");
                    return;
                }

            }
        }
        catch (SQLException e) {
            System.out.println("Internal DB error");
            e.printStackTrace();
        }
    }


    private static void rentABook()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Book:: ");
        String name = sc.nextLine().trim();
        if (checkAvailability(name)) {
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
                 PreparedStatement ps = con.prepareStatement("SELECT * FROM Library WHERE title = ? limit 1")) {
                ps.setString(1, name);
                try (ResultSet rs = ps.executeQuery()) {

                    while (rs.next()) {
                        System.out.println("Book ID = " + rs.getLong(1) +
                                "\nTitle = " + rs.getString(2) +
                                "\nAuthor = " + rs.getString(3) +
                                "\nCategory = " + rs.getString(4) +
                                "\nYear of release = " + rs.getInt(5) +
                                "\nStatus = " + (rs.getBoolean(6) ? "Available" : "Not Available"));
                        System.out.println("-------------------x  x---------------------");
                    }

                    System.out.println("....The book requested book is available for rent....");
                    System.out.println("Confirm the book (y/n) ?");
                    String rent = sc.nextLine().trim();
                    if ("y".equalsIgnoreCase(rent)) {
                        int rowCount;
                        try (PreparedStatement pst = con.prepareStatement("UPDATE Library SET status = ? WHERE title = \"" + name + "\"")) {
                            pst.setBoolean(1, false);
                            rowCount = pst.executeUpdate();
                        }
                        System.out.println(rowCount + " Inventory Updated!");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sc.close();
            }
        } else {
            System.out.println("The requested book is currently unavailable!");
            return;
        }
    }


    private static void deleteBook()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter book title :: ");
        String searchVal = sc.nextLine().trim();
        if (!checkAvailability(searchVal)) {
            return;
        }

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps = con.prepareStatement("SELECT * FROM Library WHERE title = ?")) {
            ps.setString(1, searchVal);
            try (ResultSet rs = ps.executeQuery();) {
                int row = 0;
                while (rs.next()) {
                    System.out.println("Book ID = " + rs.getLong(1) +
                            "\nTitle = " + rs.getString(2) +
                            "\nAuthor = " + rs.getString(3) +
                            "\nCategory = " + rs.getString(4) +
                            "\nYear of release = " + rs.getInt(5) +
                            "\nStatus = " + (rs.getBoolean(6) ? "Available" : "Not Available"));
                    System.out.println("-------------------x " + row++ + " x---------------------");
                }

                System.out.println("Confirm Deleting(y/n)?");
                String del = sc.nextLine().trim();
                if ("y".equalsIgnoreCase(del)) {
                    int rowCount;
                    try (PreparedStatement pst = con.prepareStatement("DELETE FROM Library WHERE title = ?")) {
                        pst.setString(1, searchVal);
                        rowCount = pst.executeUpdate();
                    }
                    System.out.println(rowCount + " rows Deleted!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean checkAvailability(String searchVal)
    {
        boolean status = false;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps = con.prepareStatement("SELECT status FROM Library WHERE title = ?");) {
            ps.setString(1, searchVal);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                status = rs.getBoolean(1);
            }
        } catch (SQLException s) {
            s.printStackTrace();
        }
        return status;
    }

    private static void getBookDetails(String colName, String searchVal)
    {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps = con.prepareStatement("SELECT * FROM Library WHERE " + colName + " = ?");) {
            ps.setString(1, searchVal);
            ResultSet rs = ps.executeQuery();

            int row = 0;
            while (rs.next()) {
                System.out.println("Book ID = " + rs.getLong(1) +
                        "\nTitle = " + rs.getString(2) +
                        "\nAuthor = " + rs.getString(3) +
                        "\nCategory = " + rs.getString(4) +
                        "\nYear of release = " + rs.getInt(5) +
                        "\nStatus = " + (rs.getBoolean(6) ? "Available" : "Not Available"));
                System.out.println("-------------------x " + row++ + " x---------------------");
            }
        } catch (Exception e) {
            System.err.println("Something went wrong!");
            e.printStackTrace();
        }
    }

    private static void searchBook()
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Search By ISBN" +
                    "\n2. Search By Book Name" +
                    "\n3. Search By Author" +
                    "\n4. Search By Category" +
                    "\n5. Exit");
            System.out.println("Enter your choice :: ");
            choice = sc.nextInt();

            String searchBy;

            switch (choice) {
                case 1:
                    System.out.println("Enter ISBN ::");
                    sc.nextLine().trim();
                    searchBy = sc.nextLine().trim();
                    getBookDetails("bookid", searchBy);
                    searchBook();
                    break;
                case 2:
                    System.out.println("Enter Book Name ::");
                    sc.nextLine().trim();
                    searchBy = sc.nextLine().trim();
                    getBookDetails("title", searchBy);
                    break;
                case 3:
                    System.out.println("Enter Author Name ::");
                    sc.nextLine().trim();
                    searchBy = sc.nextLine().trim();
                    getBookDetails("author", searchBy);
                    break;
                case 4:
                    int count = 1;
                    List<String> categories = getCategories();
                    for (String category : categories) {
                        System.out.println(count++ + " " + category);
                    }
                    System.out.println("Choose Category ::");
                    sc.nextLine();
                    int option = sc.nextInt();
                    if(option > categories.size())
                    {
                        return;
                    }

                    getBookDetails("category", categories.get(option-1));
                    break;
                default:
                    System.out.println("Exiting..");
                    break;

            }
        } while (choice != 5);
    }

    private static List<String> getCategories() {
        List<String> categories = new ArrayList<>();
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            PreparedStatement ps = con.prepareStatement("SELECT category FROM Library GROUP BY category"))
        {
            try(ResultSet rs = ps.executeQuery())
            {
                while(rs.next())
                {
                    categories.add(rs.getString(1));
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }

    private static void addToDB()
    {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps = con.prepareStatement("INSERT INTO Library VALUES(?,?,?,?,?,?)");) {
            String filePath = "/home/nms/Library.csv";
            addCsvToDB(ps, filePath);
        } catch (Exception e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }

    private static void addCsvToDB(PreparedStatement ps, String filePath)
    {
        try (FileReader fr = new FileReader(filePath);
             CSVReader cr = new CSVReaderBuilder(fr).withSkipLines(1).build()) {
            List<String[]> line = cr.readAll();
            for (String[] data : line) {
                ps.setLong(1, Long.parseLong(data[0].trim()));
                ps.setString(2, data[1].trim());
                ps.setString(3, data[2].trim());
                ps.setString(4, data[3].trim());
                ps.setInt(5, Integer.parseInt(data[4].trim()));
                ps.setBoolean(6, true);

                ps.executeUpdate();
            }
        } catch (SQLException | IOException | CsvException e) {
            System.err.println("Something went wrong!");
            e.printStackTrace();
        }
    }
}
