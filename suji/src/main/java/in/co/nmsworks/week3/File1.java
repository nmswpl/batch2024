package in.co.nmsworks.week3;

import org.omg.IOP.IOR;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File1 {
    public static void main(String[] args) throws IOException {

        String s[] = new String[3];
        System.out.println("Enter lines");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < s.length; i++) {
            s[i] = scanner.nextLine();
        }

        for(String i:s)
        {
            System.out.println(i);
        }

        FileWriter fw = new FileWriter("/home/nms/file1.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < 3; i++) {
            bw.write(s[i]);
            bw.newLine();
        }
        bw.close();
        fw.close();

    }
}
