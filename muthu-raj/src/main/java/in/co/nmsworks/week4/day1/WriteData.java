package in.co.nmsworks.week4.day1;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class WriteData {

    public static void main(String[] args) {
        WriterInterface wi = new Writer();
        saveEmployeeData(wi);
    }

    private static void saveEmployeeData(WriterInterface wi)
    {
        try(FileReader fr = new FileReader("/home/nms/employeeData.csv");
            CSVReader cr =  new CSVReaderBuilder(fr).withSkipLines(1).build())
        {
            String[] line = cr.readNext();
            while(cr.readNext() != null)
            {
                if(Integer.parseInt(line[2]) % 2 == 0)
                {
                    try(FileWriter fw = new FileWriter("/home/nms/employee.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw))
                    {
                        wi.save(bw, line);
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error writing to file");
                        e.printStackTrace();
                    }
                }
                else
                {
                    try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
                    PreparedStatement ps = con.prepareStatement("INSERT INTO Employee values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"))
                    {
                        wi.save(ps,line);
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error writing to DB");
                        e.printStackTrace();
                    }
                }
                line = cr.readNext();
            }
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }


}
