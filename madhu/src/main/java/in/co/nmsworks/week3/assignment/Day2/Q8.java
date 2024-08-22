package in.co.nmsworks.week3.assignment.Day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q8 {

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();


        FileReader fr = new FileReader("/home/nms/Candidates.csv");
        BufferedReader br = new BufferedReader(fr);
        String str;
        String arr[] = {};
        while ((str = br.readLine()) != null) {
            arr = str.split(",");
            list.add(Arrays.toString(arr));
            Candidates candidates = new Candidates(list);
            System.out.println(candidates);
        }
        br.close();
        fr.close();
    }
}






