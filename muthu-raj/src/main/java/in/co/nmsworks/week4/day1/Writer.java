package in.co.nmsworks.week4.day1;

import java.io.BufferedWriter;
import java.sql.PreparedStatement;

interface WriterInterface {
    public void save(BufferedWriter bw, String[] data);
    public void save(PreparedStatement ps, String[] data);


}

public class Writer implements WriterInterface
{
    public void save(BufferedWriter bw, String[] data)
    {
        try{

            bw.append("------------------X------------------" +
                    "\nID :: " + Integer.parseInt(data[0]) +
                    "\nName :: " +data[1] +
                    "\nAge :: " + data[2] +
                    "\nEmail :: " + data[3] +
                    "\nPhone :: " + data[4] +
                    "\nAddress :: " + data[5] +
                    "\nCity :: " + data[6] +
                    "\nState :: " + data[7] +
                    "\nZipcode :: " + data[8] +
                    "\nCountry :: " + data[9]);
            bw.newLine();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void save(PreparedStatement ps, String[] data)
    {
        try{
            ps.setInt(1, Integer.parseInt(data[0]));
            ps.setString(2, data[1]);
            ps.setInt(3, Integer.parseInt(data[2]));
            ps.setString(4, data[3]);
            ps.setString(5, data[4]);
            ps.setString(6, data[5]);
            ps.setString(7, data[6]);
            ps.setString(8, data[7]);
            ps.setInt(9, Integer.parseInt(data[8]));
            ps.setString(10, data[9]);

            ps.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();

        }
    }

    private void writeToCSV()
    {
        System.out.println("writing in a csv file....");
    }
    
}

