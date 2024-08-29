package in.co.nmsworks.week3.day5;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import in.co.nmsworks.week4.Book;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Books
{
    String bookTitle;
    long ISBN;
    String author;
    String gerne;
    int yearOfRelease;
    List<Books> ls=new ArrayList<>();
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGerne() {
        return gerne;
    }

    public void setGerne(String gerne) {
        this.gerne = gerne;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public Books(String bookTitle, long ISBN, String author, String gerne, int yearOfRelease, boolean b) {
        this.bookTitle = bookTitle;
        this.ISBN = ISBN;
        this.author = author;
        this.gerne = gerne;
        this.yearOfRelease = yearOfRelease;
    }
    @Override
    public String toString() {
        return "Books{" +
                "bookTitle='" + bookTitle + '\'' +
                ", ISBN=" + ISBN +
                ", author='" + author + '\'' +
                ", gerne='" + gerne + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
class Library
{

    List<Books> bookList = new ArrayList<>();
    static int availability ;
    String period;
    String date;
    int rentedFlag;
    int returnFlag;
    public void addBook(String[] newBook)
    {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
             PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO library values(?,?,?,?,?,?) ")) {

            preparedStatement.setLong(1, Long.parseLong(String.valueOf(newBook[0])));
            preparedStatement.setString(2, newBook[1]);
            preparedStatement.setString(3, newBook[2]);
            preparedStatement.setString(4, newBook[3]);
            preparedStatement.setInt(5, Integer.parseInt(String.valueOf(newBook[4])));
            preparedStatement.setBoolean(6,false);

            int row = preparedStatement.executeUpdate();
            System.out.println("Rows affected :: " + row);
        }
        catch (SQLException ex)
        {
            throw new RuntimeException(ex);
        }
    }
    public List<Books> getBookListFromCsv() {
        try (FileReader reader = new FileReader("/home/nms/Documents/Library.csv");
             CSVReader csvReader = new CSVReader(reader)) {

            csvReader.skip(1);
            String[] bookDetails;
            while ((bookDetails = csvReader.readNext()) != null) {
                long ISBN = Long.parseLong(bookDetails[0].trim());
                String bookName = bookDetails[1].trim();
                String author = bookDetails[2].trim();
                String category = bookDetails[3].trim();
                int releaseYear = Integer.parseInt(bookDetails[4].trim());
                Books book = new Books(bookName, ISBN, author, category, releaseYear, true);
                bookList.add(book);       // sample code
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
        return bookList;
    }



    public List<Books> searchByISBN(long id, List<Books> ls)
    {
        int c=0;
        for (Books book : bookList)
        {
            long isbn = book.getISBN();
            if (isbn==id)
            {
                c = c + 1;
                System.out.println(" Book is available  :: "+book);
            }
        }
        if (c!=1)
        {
            System.out.println(" Book not found");
        }
        return bookList;
    }

    public void searchByAuthor(String name, List<Books> ls)
    {
        int c=0;
        for (Books book : bookList)
        {
            String author = book.getAuthor();
            if (author.equalsIgnoreCase(name))
            {
                c = c + 1;
                System.out.println(" Book is available  :: "+book);
            }
        }
        if (c!=1)
        {
            System.out.println(" Book not found");
        }
    }
    public void searchByGerne(String g, List<Books> ls)
    {
        int c=0;
        for (Books book : bookList)
        {
            String gerne = book.getGerne();
            if (gerne.equalsIgnoreCase(g))
            {
                c = c + 1;
                System.out.println(" Book is available  :: "+book);
            }
        }
        if (c!=1)
        {
            System.out.println(" Book not found");
        }
    }
    public List<Books> searchByTitle(String name, List<Books> ls)
    {
        int c=0;
        for (Books book : bookList)
        {
            String title = book.getBookTitle();
            if (title.equalsIgnoreCase(name))
            {
                c = c + 1;
                System.out.println(" Book is available  :: "+book);
            }
        }
        if (c!=1)
        {
            System.out.println(" Book not found");
        }
        return ls;
    }
    public void display(List<Book> ls)
    {
        for (Books book : bookList)
        {
            System.out.println(book);
        }
    }

    public void deleteBook(String bookName) throws SQLException
    {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
             PreparedStatement preparedStatement = con.prepareStatement("delete from library where Title= ? ")) {
            preparedStatement.setString(1,bookName);

            int row = preparedStatement.executeUpdate();
            System.out.println("Rows affected :: " + row);
        }
        catch (SQLException ex)
        {
            throw new RuntimeException(ex);
        }
    }


        public int rentBook(int ISBN, String bookName, String author, String date, String period) throws SQLException {
            // Check book availability
            List<Books> availableBooks = searchByTitle(bookName, bookList); // Search by Title
            availableBooks.retainAll(searchByISBN(ISBN, bookList));// Filter by ISBN (should only return 1 book)

            if (availableBooks.isEmpty())
            {
                System.out.println("Book not found or already rented.");

            }

            Books bookToRent = availableBooks.get(0); // Get the first available book

            // Update book's rented status in the database
            String sql = "UPDATE library SET Rented = TRUE WHERE ISBN = ?";
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
                 PreparedStatement preparedStatement = con.prepareStatement(sql)) {

                preparedStatement.setInt(1, ISBN);
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Book rented successfully!");
                    System.out.println("RENTING DETAILS ::  Today's date (Rentiong date) " + date + " and the period of renting " + period);
                    rentedFlag = rentedFlag + 1;
                } else {
                    System.out.println("An error occurred while renting the book.");
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            return rentedFlag;
        }

        public void renting(int rentedFlag,String bookName,String author) throws SQLException {
            if (rentedFlag == 1)
            {

                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
                     PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO rent (Title, Author) VALUES (?, ?)")) {
                    // Insert rental details into the "rent" table

                    preparedStatement.setString(1, bookName);
                    preparedStatement.setString(2, author);
                    preparedStatement.executeUpdate();
                }
                catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    public int returnBook(String Title) throws SQLException
    {
        // Check if the book is rented
        String sql = "SELECT * FROM rent WHERE Title = ?";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
             PreparedStatement preparedStatement = con.prepareStatement(sql)) {

            preparedStatement.setString(1, Title);
            ResultSet rs = preparedStatement.executeQuery();

            if (!rs.next())
            {
                System.out.println("Book is not currently rented.");

            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }return returnFlag=-1;
    }

    public void returning(int returnFlag,String Title,String author,String gerne,int year) throws SQLException {
  if(returnFlag!=-1)
  {
            String sql = "UPDATE library SET RENTED = FALSE WHERE Title = ?";
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
                 PreparedStatement preparedStatement = con.prepareStatement(sql))
            {
              //  preparedStatement.setLong(1, Long.parseLong(String.valueOf(isbn)));
                preparedStatement.setString(1, Title);
             //   preparedStatement.setString(3, author);
            //    preparedStatement.setString(4, gerne);
            //    preparedStatement.setInt(5, Integer.parseInt(String.valueOf(year)));
            //    preparedStatement.setBoolean(6,false);
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0)
                {
                    System.out.println("Book returned successfully!");
                }
            } catch (Exception e) {
                System.out.println("Exception ");
                e.printStackTrace();
            }     }

    }

                public static void main(String[] args)throws Exception {
            Library ob = new Library();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice ::  ");
            System.out.println(" 1 :  to AddBooks");
            System.out.println(" 2 :  to Search a book");
            System.out.println(" 3 :  to Delete a book");
            System.out.println(" 4 :  to Rent a book");
            System.out.println(" 5 :  to Return a book");
            int choice = sc.nextInt();

          List<Books> list=  ob.getBookListFromCsv();

            switch (choice) {
                case 1:
                    String[] newBook= new String[5];
                  /*  System.out.println("Enter details");
                    for (int i = 0; i < 6; i++) {
                        if (i == 0 || i == 4) {
                            newBook[i] = String.valueOf(sc.nextInt());
                        } else {
                            newBook[i] = sc.nextLine();
                        }
                    }
                      */   newBook= new String[]{String.valueOf(565464), "TinkerBell", "Tila", "Fairytale", String.valueOf(1890)};
                    ob.addBook(newBook);
                    break;

                case 2:
                /*    String bookname;
                    System.out.println(" Bookname ");
                   bookname= sc.nextLine();
                    String author;
                    System.out.println(" Author ");
                     author= sc.nextLine();
                     ob.getBooksforSearching(bookname,author);  */

                    ob.searchByTitle("Pride and Prejudice ",list);
                    ob.searchByAuthor("Jane Austen",list);
                    ob.searchByGerne("Fiction",list);
                    ob.searchByISBN(2433546L,list);
                    break;

                case 3:
                    ob.deleteBook("Cindrella");
                    break;
                case 4:
                 ob.rentBook(565464,"Tinkerbell","Tila","12/09/2024","2 weeks");
                 ob.renting(1,"Tinkerbell","Tila");
                    break;

                case 5:
                   String []returnBook = new String[]{String.valueOf(487583), "Tangled", "Disney", "Fairytale", String.valueOf(1880)};
                   ob.returnBook("Tinkerbell");
                   ob.returning(1,"Tinkerbell","Tila","Fairytale",1890);
            }
        }
}





