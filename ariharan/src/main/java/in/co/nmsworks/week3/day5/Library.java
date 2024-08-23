package in.co.nmsworks.week3.day5;


import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

public class Library {
    public static void main(String[] args){
       new Library().fileParsing();
        new Library().returnBook("ariha");
    }
    public void fileParsing(){
        try (FileReader fr=new FileReader("/home/nms/Library.csv");
             BufferedReader br=new BufferedReader(fr);
             Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps =con.prepareStatement("insert into library values(?,?,?,?,?)")){
            String line="";
            br.readLine();
            while ((line=br.readLine())!=null){
                String[] words=line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                for (int i = 0; i <words.length ; i++) {
                    words[i]=words[i].replace("\"", "");
                    words[i]=words[i].trim();
                }
                ps.setLong(1,Long.parseLong(words[0]));
                ps.setString(2,words[1]);
                ps.setString(3,words[2]);
                ps.setString(4,words[3]);
                ps.setInt(5,Integer.parseInt(words[4]));
                ps.execute();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void addBook(){
        try ( Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
              PreparedStatement ps =con.prepareStatement("insert into library values(?,?,?,?,?)")){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the author of the book::");
            String authorname=sc.nextLine();
            System.out.println("enter the id of the book::");
            long bookid= sc.nextLong();
            System.out.println("enter the book name ::");
            String name=sc.next();

            System.out.println("enter the category of the book::");
            String category=sc.next();
            System.out.println("enter the year of release::");
            int year=sc.nextInt();
            ps.setLong(1,bookid);
            ps.setString(2,name);
            ps.setString(3,authorname);
            ps.setString(4,category);
            ps.setInt(5,year);
            ps.execute();
            System.out.println("this book is added into the library");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void searchBookbyID(Long id){
        try ( Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
              PreparedStatement ps =con.prepareStatement("select* from library where id=?")){
              ps.setLong(1,id);
              ResultSet rs= ps.executeQuery();
              int flag=0;
              while (rs.next()){
              if(rs.getLong(1)==id){
                  System.out.println("the name is  "+rs.getString(2));
                  System.out.println("the author of the book is::"+rs.getString(3));
                  System.out.println("the category of the book is::"+rs.getString(4));
                  System.out.println("the year of the release  of the book is::"+rs.getInt(5));
                  flag=1;
              }
              }
              if (flag==0){
                  System.out.println("the book is not found in the library");
              }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void searchBookbyName(String name){
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps = con.prepareStatement("select* from library where name=?")) {
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            int flag = 0;
            while (rs.next()){
                if (rs.getString(2).equals(name)) {
                    System.out.println("the id of the book is::"+rs.getLong(1));
                    System.out.println("the name is  " + rs.getString(2));
                    System.out.println("the author of the book is::" + rs.getString(3));
                    System.out.println("the category of the book is::" + rs.getString(4));
                    System.out.println("the year of the release  of the book is::" + rs.getInt(5));
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("the book is not found in the library");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void searchBookbyAuthor(String author){
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps = con.prepareStatement("select* from library where author=?")) {
            ps.setString(1, author);
            ResultSet rs = ps.executeQuery();
            int flag = 0;
            while (rs.next()){
                if (rs.getString(3).equals(author)) {
                    System.out.println("the id of the book is::"+rs.getLong(1));
                    System.out.println("the name is  " + rs.getString(2));
                    System.out.println("the author of the book is::" + rs.getString(3));
                    System.out.println("the category of the book is::" + rs.getString(4));
                    System.out.println("the year of the release  of the book is::" + rs.getInt(5));
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("the book is not found in the library");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void searchBookbyCategory(String category){
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps = con.prepareStatement("select* from library where category=?")) {
            ps.setString(1, category);
            ResultSet rs = ps.executeQuery();
            int flag = 0;
            while (rs.next()){
                if (rs.getString(4) .equals(category)) {
                    System.out.println("the id of the book is::"+rs.getLong(1));
                    System.out.println("the name is  " + rs.getString(2));
                    System.out.println("the author of the book is::" + rs.getString(3));
                    System.out.println("the category of the book is::" + rs.getString(4));
                    System.out.println("the year of the release  of the book is::" + rs.getInt(5));
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("the book is not found in the library");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deletebook(String bookname){
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps = con.prepareStatement("delete from library where name=?")) {
            ps.setString(1, bookname);
            ps.execute();
            System.out.println("successfully deleted");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void rentBook(String bookName){
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps = con.prepareStatement("select * from library")) {
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                if ((rs.getString(2).equals(bookName))&&(rs.getInt(6) == 1)) {
                        System.out.println("take the book ");
                        Statement st = con.createStatement();
                        st.execute("update library set instock=0 where name =\"" + bookName + "\"");
                        st.close();
                        rs.close();
                        return;
                }
            }
            System.out.println("it is not in stock ");

            rs.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void returnBook(String bookName){
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");) {
            Statement st=con.createStatement();
            st.execute("update library set instock=0 where name =\""+bookName+"\"");
            System.out.println("thank you for return");
            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void checkAvailability(String bookName){
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps = con.prepareStatement("select * from library")) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                if ((rs.getString(2).equals(bookName)) && (rs.getInt(6) == 1)) {
                    System.out.println(bookName+" is available in the library");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
