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

public class Fruits
{
    int sno;
    String name;
    int quantity;

    public int getSno() {
        return sno;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public Fruits(int sno, String name, int quantity) {
        this.sno = sno;
        this.name = name;
        this.quantity = quantity;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
class FruitDetails {
    List<Fruits> listofFruits = new ArrayList<>();
    String[] Fruit=new String[3];

    public void getDataFromFile() throws IOException, CsvValidationException {
        try (FileReader fr = new FileReader("/home/nms/Practice/fruit.txt");
             CSVReader csv = new CSVReader(fr))
        {
            csv.skip(1);
            while ((Fruit = csv.readNext()) != null)
            {
                int sno = Integer.parseInt(Fruit[0].trim());
                String name = Fruit[1].trim();
                int quantity = Integer.parseInt(Fruit[2].trim());

                Fruits ob = new Fruits(sno, name, quantity);
                listofFruits.add(ob);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("EXception");
        }
    }

    public void writeInDb() throws SQLException {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "nms", "");
             PreparedStatement ps = con.prepareStatement("INSERT INTO fruits values (?,?,?) ")) {
            for (Fruits listofFruit : listofFruits) {
                ps.setInt(1, listofFruit.getSno());
                ps.setString(2, listofFruit.getName());
                ps.setInt(3, listofFruit.getQuantity());

                int rows = ps.executeUpdate();
                System.out.println(rows + " rows affected");
            }
        } catch (Exception e) {
            System.out.println("exception");
            e.printStackTrace();
        }
    }

    public void readFRomDb() throws SQLException {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "nms", "");
             Statement stmt = con.createStatement())
        {
            ResultSet rs= stmt.executeQuery("select * from fruits");
            while(rs.next())
            {
                int sno=rs.getInt(1);
                String name=rs.getString(2);
                int quantity=rs.getInt(3);

                Fruits ob=new Fruits(sno,name,quantity);
                listofFruits.add(ob);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeTofile() throws SQLException, IOException {
        FileWriter fw=new FileWriter("/home/nms/Practice/fruit.txt");
        BufferedWriter bw=new BufferedWriter(fw);

        for (Fruits listofFruit : listofFruits)
        {
            bw.write((listofFruit.getSno()+" \t"+listofFruit.getName()+" \t"+ listofFruit.getQuantity())+"\n)");
        }
        bw.close();
        fw.close();

    }


    public static void main(String[] args) throws CsvValidationException, IOException, SQLException {
        FruitDetails ob = new FruitDetails();
        ob.getDataFromFile();
     //   ob.writeInDb();
        ob.readFRomDb();
        ob.writeTofile();

    }
}