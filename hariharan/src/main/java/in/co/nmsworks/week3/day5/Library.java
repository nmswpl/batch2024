package in.co.nmsworks.week3.day5;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
          Library library= new Library();
         // library.WriteToDB("/home/nms/Downloads/Library.csv");

        System.out.println("Select 1.Add book 2.Search Book 3.Delete Book 4.Rent Book 5.Return Book 6.Check book Availability  7. -1 for Exit");

        int option = 0;
        do {
            System.out.println("Enter the Option: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.searchBook();
                    break;
                case 3:
                    library.deleteBook();
                    break;
                case 4:
                    library.rentBook();
                    break;
                case 5:
                    library.returnBook();
                    break;
                case 6:
                    library.checkBookAvailability();
                    break;

            }
        }while(option != -1);
    }

    private void checkBookAvailability() {
        System.out.println("Enter the Book Name: ");
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","")) {
            String name = sc.nextLine();
            PreparedStatement preparedStatementforGetDetail = connection.prepareStatement("select status from library where name = ?");
            preparedStatementforGetDetail.setString(1,name);

            ResultSet resultSet = preparedStatementforGetDetail.executeQuery();
            resultSet.next();
            if(resultSet.getInt(1) == 1) {

                System.out.println("Book " + name + " is avilable ");
            }else{
                System.out.println("Book is Not Avilable");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    private void returnBook() {
        System.out.println("Enter the Book Name: ");
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","")) {
            String name = sc.nextLine();
            PreparedStatement preparedStatementforGetDetail = connection.prepareStatement("select status from library where name = ?");
            preparedStatementforGetDetail.setString(1,name);
            ResultSet resultSet = preparedStatementforGetDetail.executeQuery();
            resultSet.next();
            if(resultSet.getInt(1) == 0) {
                PreparedStatement preparedStatement = connection.prepareStatement("update library set status = 1 where name = ?");
                preparedStatement.setString(1, name);
                preparedStatement.executeUpdate();
                System.out.println("Book " + name + " Returned");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    private void rentBook() {
        System.out.println("Enter the Book Name: ");
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","")) {

            String name = sc.nextLine();


            PreparedStatement preparedStatementforGetDetail = connection.prepareStatement("select status from library where name = ?");
            preparedStatementforGetDetail.setString(1,name);
            ResultSet resultSet = preparedStatementforGetDetail.executeQuery();
            System.out.println(resultSet.toString());
            resultSet.next();
            if(resultSet.getInt(1) == 1){
            PreparedStatement preparedStatement = connection.prepareStatement("update library set status = 0 where name = ?");
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
            System.out.println("Book " + name+" is rented");
            }else{
                System.out.println("The Book is Not Available");
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }

    private void deleteBook() {
        System.out.println("Enter the Book Name: ");
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","")){

           String name = sc.nextLine();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from library where name = ?");
            preparedStatement.setString(1,name);
            preparedStatement.executeUpdate();

            System.out.println("Book " + name+" is Deleted");
        }catch (Exception e){
            System.out.println(e);
        }
    }


    public void WriteToDB(String filePath){
       try(FileReader fileReader = new FileReader(filePath);
           BufferedReader bufferedReader = new BufferedReader(fileReader)) {

           bufferedReader.readLine();

           List<String[]> bookDetails= new ArrayList<>();
           String line;
          while ((line = bufferedReader.readLine()) != null){

             String[] book = line.split(",");
              for (int i = 0; i < book.length; i++) {
                  book[i] = book[i].replaceAll("\\s","").replaceAll("^\"|\"$", "");
                  System.out.println(book[i]);
              }
             bookDetails.add(book);
          }

          try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","")){
              PreparedStatement preparedStatement = connection.prepareStatement("insert into library values(?,?,?,?,?,?)");
              int i =0;
              for (String[] bookDetail : bookDetails) {
                  preparedStatement.setLong(1,Long.parseLong(bookDetail[0].trim()));
                  preparedStatement.setString(2,bookDetail[1].trim());
                  preparedStatement.setString(3,bookDetail[2].trim());
                  preparedStatement.setString(4,bookDetail[3].trim());
                  preparedStatement.setInt(5,Integer.parseInt(bookDetail[4].trim()));
                  preparedStatement.setInt(6,1);

                  i +=preparedStatement.executeUpdate();
              }
              System.out.println(i);
          }catch (Exception e){
              System.out.println(e);
          }

       } catch (FileNotFoundException e) {
           System.out.println(e);
       } catch (IOException e) {
           System.out.println(e);
       }
    }

    public void addBook(){
        System.out.println("Enter the Book Id: ");
        Long bookId = sc.nextLong();

        System.out.println("Enter the Book Name: ");
        String bookName = sc.nextLine();
        System.out.println("Enter the Author Name:");
        String authorName = sc.nextLine();
        System.out.println("Enter the Catagory:");
        String catagory = sc.nextLine();
        System.out.println("Enter the year of Release:");
        int yearOfRelease = sc.nextInt();

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","")) {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into library values(?,?,?,?,?,?)");
            preparedStatement.setLong(1,bookId);
            preparedStatement.setString(2,bookName);
            preparedStatement.setString(3,authorName);
            preparedStatement.setString(4,catagory);
            preparedStatement.setInt(5,yearOfRelease);
            preparedStatement.setInt(6,1);

            int i =preparedStatement.executeUpdate();
            System.out.println(i + "Rows Affected");
            System.out.println("Book details added");
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public void searchBook(){
        System.out.println("Searching option: 1.ISBN 2.Name 3.Author 4.Catgory 5.Exit");
        int option = sc.nextInt();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","")){
            switch (option){
                case 1:
                    System.out.println("Enter the ISBN Number:");
                    Long bookId = sc.nextLong();
                    sc.nextLine();
                    PreparedStatement preparedStatement = connection.prepareStatement("select * from library where Bookid = ?");
                    preparedStatement.setLong(1,bookId);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    while (resultSet.next()){
                        System.out.println("Book Id:" + resultSet.getLong(1));
                        System.out.println("Name " + resultSet.getString(2));
                        System.out.println("Author :" + resultSet.getString(3));
                        System.out.println("Catagory :" + resultSet.getString(4));
                        System.out.println("year of releas:" + resultSet.getInt(5));
                        System.out.println("Available Status :" + ((resultSet.getInt(6) == 1) ? " Available " : " Not Availabale "));
                    }
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("Enter the Book Name");
                    String name = sc.nextLine();
                    PreparedStatement namepreparedStatement = connection.prepareStatement("select * from library where name = ?");
                    namepreparedStatement.setString(1,name);
                    ResultSet resultSetforName = namepreparedStatement.executeQuery();
                    while (resultSetforName.next()){
                        System.out.println("Book Id:" + resultSetforName.getLong(1));
                        System.out.println("Name " + resultSetforName.getString(2));
                        System.out.println("Author :" + resultSetforName.getString(3));
                        System.out.println("Catagory :" + resultSetforName.getString(4));
                        System.out.println("year of releas:" + resultSetforName.getInt(5));
                        System.out.println("Available Status" + ((resultSetforName.getInt(6) == 1) ? "Available" : "Not Availabale"));

                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.println("Enter the Author Name");
                    String authorname = sc.nextLine();
                    PreparedStatement authorpreparedStatement = connection.prepareStatement("select * from library where author = ?");
                    authorpreparedStatement.setString(1,authorname);
                    ResultSet resultSetforAuthor = authorpreparedStatement.executeQuery();
                    while (resultSetforAuthor.next()){
                        System.out.println("Book Id:" + resultSetforAuthor.getLong(1));
                        System.out.println("Name " + resultSetforAuthor.getString(2));
                        System.out.println("Book Id:" + resultSetforAuthor.getString(3));
                        System.out.println("Book Id:" + resultSetforAuthor.getString(4));
                        System.out.println("Book Id:" + resultSetforAuthor.getInt(5));
                        System.out.println("Book Id:" + ((resultSetforAuthor.getInt(6) == 1) ? "Available" : "Not Availabale"));
                    }
                    break;

                case 4:
                    sc.nextLine();
                    System.out.println("Enter the Catgory:");
                    String catagory = sc.nextLine();
                    PreparedStatement catagorypreparedStatement = connection.prepareStatement("select * from library where author = ?");
                    catagorypreparedStatement.setString(1,catagory);
                    ResultSet resultSetforCatagory  = catagorypreparedStatement.executeQuery();
                    while (resultSetforCatagory .next()){
                        System.out.println("Book Id:" + resultSetforCatagory.getLong(1));
                        System.out.println("Name " + resultSetforCatagory.getString(2));
                        System.out.println("Book Id:" + resultSetforCatagory.getString(3));
                        System.out.println("Book Id:" + resultSetforCatagory .getString(4));
                        System.out.println("Book Id:" + resultSetforCatagory.getInt(5));
                        System.out.println("Book Id:" + ((resultSetforCatagory.getInt(6) == 1) ? "Available" : "Not Availabale"));
                    }
                    break;

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
