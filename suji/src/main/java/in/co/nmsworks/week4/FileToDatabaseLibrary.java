package in.co.nmsworks.week4;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FileToDatabaseLibrary {
    private boolean rent;
    long id;
    String title;
    String author;
    String category;
    int year;

    public int getId() {
        return (int) id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getYear() {
        return year;
    }

    public FileToDatabaseLibrary(long id, String title, String author, String category, int year,boolean rent) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.year = year;
        this.rent=rent;
    }

    @Override
    public String toString() {
        return "FileToDatabaseLibrary{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", year=" + year +
                '}';
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void FileToDb() throws FileNotFoundException {
        FileReader fr = new FileReader("/home/nms/Documents/Library");

    }
}

class Function
{
    String[]Books=new String[5];
List<FileToDatabaseLibrary> bookList=new ArrayList<>();
List<FileToDatabaseLibrary> bookFromDb=new ArrayList<>();

    public void readFromFile() throws IOException
    {
        try(FileReader fr=new FileReader("/home/nms/Documents/Library.csv");

        CSVReader csvReader = new CSVReader(fr))
        {
            csvReader.skip(1);
            while ((Books=csvReader.readNext() )!= null) {
                long id = Long.parseLong(Books[0].trim());
                String name = Books[1];
                String Author = Books[2];
                String Genre = Books[3];
                int year = Integer.parseInt(Books[4]);
                FileToDatabaseLibrary ob = new FileToDatabaseLibrary(id, name, Author, Genre, year, false);
                bookList.add(ob);
            }

        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToDB() throws SQLException {
        try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","nms","");
        PreparedStatement ps= con.prepareStatement("INSERT INTO library values(?,?,?,?,?,?)")){

            for (FileToDatabaseLibrary fileToDatabaseLibrary : bookList)
            {
                ps.setInt(1, fileToDatabaseLibrary.getId());
                ps.setString(2, fileToDatabaseLibrary.getTitle());
                ps.setString(3, fileToDatabaseLibrary.getAuthor());
                ps.setString(4, fileToDatabaseLibrary.getCategory());
                ps.setInt(5, fileToDatabaseLibrary.getYear());
                ps.setBoolean(6, false);
                int rows = ps.executeUpdate();
                System.out.println(rows + " rows affected");
            }


        }
            catch(Exception e)
            {
                System.out.println("Exception");
                e.printStackTrace();
            }
}

public void readFromDb() throws SQLException {
    try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","nms","");
    Statement stmt= con.createStatement())
    {
        ResultSet rs= stmt.executeQuery("select * from library ");

        while (rs.next())
        {
           long id=rs.getInt(1);
           String name=rs.getString(2);
           String author=rs.getString(3);
           String category=rs.getString(4);
           int year=rs.getInt(5);
           boolean rented= rs.getBoolean(6);
           FileToDatabaseLibrary ob=new FileToDatabaseLibrary(id,name,author,category,year,rented);
           bookFromDb.add(ob);
        }
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
}



public void display()
{
    for (FileToDatabaseLibrary fileToDatabaseLibrary : bookFromDb) {
        System.out.println(fileToDatabaseLibrary);
    }
}

public void writeToFile() throws IOException
{
    FileWriter fw=new FileWriter("/home/nms/Documents/books");
    BufferedWriter bw=new BufferedWriter(fw);

    for (FileToDatabaseLibrary fileToDatabaseLibrary : bookFromDb)
    {
       bw.write(String.valueOf(fileToDatabaseLibrary));

    }
    bw.flush();
    bw.close();
    fw.close();

}
    public static void main(String[] args) throws IOException, SQLException {
        Function ob=new Function();
        ob.readFromFile();
     //   ob.writeToDB();
        ob.readFromDb();
      //  ob.display();
        ob.writeToFile();
    }
}


