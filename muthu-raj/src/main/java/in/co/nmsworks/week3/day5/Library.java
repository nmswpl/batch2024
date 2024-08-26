package in.co.nmsworks.week3.day5;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
//        addToDB();
//        addBook();
        searchBook();
//        rentABook();
//        returnABook();
//        deleteABook();

    }

    private static void deleteABook() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book :: ");
        String name = sc.nextLine();
        if(!isBookInDB(name))
        {
            System.out.println("Book is not in the DB");
            return;
        }

        if(checkAvailability(name))
        {
            try(Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
                PreparedStatement pr = con.prepareStatement("DELETE FROM Library WHERE Title = ?"))
            {
                System.out.println("Confirm deleting(y/n) ?");
                String del = sc.nextLine();
                if ( "y".equalsIgnoreCase(del))
                {
                    pr.setString(1,name);
                    pr.execute();
                    System.out.println("Book deleted!");
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }
        else
        {
            System.out.println("Book is unavailable!");
        }
    }

    private static boolean checkAvailability(String name)
    {
        boolean availability = false;
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
        PreparedStatement pr = con.prepareStatement("SELECT Status FROM Library WHERE Title = ? limit 1"))
        {
            pr.setString(1,name);

            try(ResultSet rs = pr.executeQuery())
            {
                while(rs.next())
                {
                    availability = rs.getBoolean(1);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return availability;
    }

    private static void returnABook()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book :: ");
        String name = sc.nextLine();

        if(!isBookInDB(name))
        {
            System.out.println("Book is not in the DB");
            return;
        }
        if(!checkAvailability(name))
        {
            try(Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
                PreparedStatement pr = con.prepareStatement("UPDATE Library SET Status = 1 WHERE Title = ?"))
            {
                pr.setString(1,name);
                pr.execute();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("Book is unavailable!");
        }
    }

    private static boolean isBookInDB(String name)
    {
        boolean bookAvailable = false;
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
                 PreparedStatement pr = con.prepareStatement("SELECT * FROM Library WHERE Title = ?")) {
                pr.setString(1, name);
                try(ResultSet rs = pr.executeQuery())
                {
                    while(rs.next())
                    {
                        bookAvailable = true;
                        break;
                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return bookAvailable;
    }

    private static void rentABook()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book :: ");
        String name = sc.nextLine();
        if(checkAvailability(name)) {
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
                 PreparedStatement pr = con.prepareStatement("UPDATE Library SET Status = 0 WHERE Title = ?")) {
                pr.setString(1, name);
                pr.execute();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
            else
            {
                System.out.println("The requested book is unavailable!");
            }

            System.out.println("Inventory Updated!");
        }


    private static List<String[]> addFromFile()
    {

        List<String[]> data = new ArrayList<>();

        try(FileReader fr  = new FileReader("/home/nms/Library.csv");
            CSVReader cr = new CSVReaderBuilder(fr).withSkipLines(1).build())
        {
            data =  cr.readAll();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return data;

    }

    private static void searchBook() {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        int value;

        do {
            System.out.println("1. Search by ISBN" +
                    "\n2. Search by Name" +
                    "\n3. Search by Author" +
                    "\n4. Search by Category" +
                    "\n5. Exit search"
            );
            System.out.println("Enter your choice :: ");
            value = sc.nextInt();

            switch (value) {
                case 1:
                    System.out.print("Enter ISBN :: ");
                    sc.nextLine();
                    String id = sc.next();
                    lib.searchDB(id, "Bookid");
                    break;

                case 2:
                    System.out.print("Enter Name :: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    lib.searchDB(name, "Title");
                    break;

                case 3:
                    System.out.println("Enter Author :: ");
                    sc.nextLine();
                    String author = sc.nextLine();
                    lib.searchDB(author, "Author");
                    break;

                case 4:
                    System.out.println("Enter Category :: ");
                    sc.nextLine();
                    String category = sc.nextLine();
                    lib.searchDB(category, "Category");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }while (value != 5);
    }

    private void searchDB(String searchBy, String colName)
    {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps = con.prepareStatement("select * from Library where " + colName + " = ?")
        )
        {
            ps.setString(1, searchBy);
            ResultSet rs = ps.executeQuery();

            while (rs.next())
            {
                System.out.print("ISBN :: " + rs.getLong(1) + "\nTitle :: " + rs.getString(2) +
                        "\nAuthor :: " + rs.getString(3) + "\nCategory :: " + rs.getString(4) +
                        "\nyearOfRelease :: " + rs.getString(5) + "\nstatus :: " + rs.getBoolean(6));
                System.out.println("\n-----------------------------x------------------------");
            }
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }



    private static void addToDB() {
        List<String[]> data = new ArrayList<>(addFromFile());

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps = con.prepareStatement("INSERT INTO Library VALUES( ?, ?, ?, ?, ?, ?)"))
        {
            for (String[] datum : data) {

                ps.setLong(1, Long.parseLong(datum[0].trim()));
                ps.setString(2, datum[1].trim());
                ps.setString(3, datum[2].trim());
                ps.setString(4, datum[3].trim());
                ps.setLong(5, Long.parseLong(datum[4].trim()));
                ps.setBoolean(6, true);

                ps.executeUpdate();
            }
            System.out.println("Inserted!");
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();

        }
    }
}
