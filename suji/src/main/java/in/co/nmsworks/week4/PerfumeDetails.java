package in.co.nmsworks.week4;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PerfumeDetails
{
    String perfumes[]=new String [4];
    List<Perfume> perfumeList=new ArrayList<>();


    private List<Perfume> readFromFile(String path) throws IOException, CsvValidationException {
        FileReader fr=new FileReader( path);
        CSVReader csvReader=new CSVReader(fr);

        csvReader.skip(1);

        while((perfumes=csvReader.readNext())!=null)
        {
            String perfumeName=perfumes[0];
            String flavour=perfumes[1];
            float price= Float.parseFloat(perfumes[2]);
            String country=perfumes[3];

            Perfume obj=new Perfume(perfumeName,flavour,price,country);
            perfumeList.add(obj);
        }

        for (Perfume perfume : perfumeList) {
            System.out.println(perfume);
        }
        return perfumeList;
    }


    public void writeToDb(List<Perfume> perfumeList)
    {
        try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","nms","");
            PreparedStatement ps= con.prepareStatement("INSERT INTO perfumes values (?,?,?,?) "))

        {
            for (Perfume perfume : perfumeList)
            {
                ps.setString(1, perfume.getName());
                ps.setString(2, perfume.getFlavour());
                ps.setInt(3, perfume.getPrice());
                ps.setString(4, perfume.getCountry());

                int row = ps.executeUpdate();
                System.out.println(row + " rows affected");
            }
        }

        catch (SQLException e) {
            throw new RuntimeException(e);
        }
   }

   public void readFromDB()
   {
       List<String> values=new ArrayList<>();
       try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","nms","");
       PreparedStatement ps= con.prepareStatement("select name,flavour from perfumes where country=? or ?"))
       {
           ps.setString(1,"France");
           ps.setString(2,"Italy");

           ResultSet rs= ps.executeQuery();

           while (rs.next())
           {
               String name=rs.getString(1);
               String flavour=rs.getString(2);

              values.add(name+" "+flavour);

           }

           rs.close();
       } catch (SQLException e) {
           e.printStackTrace();
       }
       for (String value : values) {
           System.out.println(value);
       }

   }


   public void readFromDbAll(String flavour1,String flavour2) throws SQLException
   {
       List<Perfume> parfum=new ArrayList<>();
       try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice");
       PreparedStatement ps= con.prepareStatement("SELECT * from perfumes where flavour= ? or flavour= ? "))
       {
           ps.setString(1,flavour1);
           ps.setString(2,flavour2);

           ResultSet rs= ps.executeQuery();

           while (rs.next())
           {
               String name=rs.getString(1);
               String flavour=rs.getString(2);
               float price=(rs.getInt(3));
               String country= rs.getString(4);

               Perfume ob=new Perfume(name,flavour,price,country);
               parfum.add(ob);
           }
       }

       for (Perfume perfume : parfum)
       {
           System.out.println(perfume);
       }
   }

     public void writeInFile(List<Perfume> list,String path) throws IOException {
         FileWriter fw=new FileWriter(path);
         BufferedWriter bw=new BufferedWriter(fw);

         for (Perfume perfume : list)
         {
             bw.write(perfume.getName()+"\t"+perfume.getFlavour()+"\t"+perfume.getPrice()+"\t"+perfume.getCountry()+"\n");
         }

         bw.flush();
         bw.close();
         fw.close();
     }

        public static void main(String[] args) throws CsvValidationException, IOException, SQLException {
        PerfumeDetails obj=new PerfumeDetails();
       List<Perfume> list= obj.readFromFile("/home/nms/Practice/perfumes.csv");
       // obj.writeToDb(list);

      //      obj.readFromDB();
            obj.readFromDbAll("Sweet","Floral");
            obj.writeInFile(list,"/home/nms/Practice/perfume.txt");
    }
}