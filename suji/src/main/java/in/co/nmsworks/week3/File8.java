package in.co.nmsworks.week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class File8
{
    public List<Candidates> fill() throws IOException
    {
        List<Candidates> ls = new ArrayList<>();
        try (FileReader fr = new FileReader("/home/nms/Documents/Candidates.csv");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] s = (line.split(","));
                System.out.println(Arrays.toString(s));
                Candidates ob = new Candidates(s);
                ls.add(ob);
            }

        }
        catch (Exception e)
        {
            System.out.println("error");
        }
          return ls;
    }


    public void display(List<Candidates> list)
    {
        for (Candidates c: list)
        {
            System.out.println(c);
        }
    }




    public static void main(String[] args) throws IOException
    {
        File8 ob=new File8();
        List<Candidates> list = ob.fill();
        ob.display(list);
    }
}









