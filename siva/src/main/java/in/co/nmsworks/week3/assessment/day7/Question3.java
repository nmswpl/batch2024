package in.co.nmsworks.week3.assessment.day7;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Question3 {
    public static Map<String, Integer> sortt(Map<String, Integer> m)
    {
        Map<String, Integer> strr = new HashMap<>();

        for(Map.Entry<String, Integer> x : m.entrySet())
        {
            strr.put(x.getKey(), (x.getKey()).length());
        }
        return strr;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        Map<String, Integer> m = new HashMap<>();

        int n = sc.nextInt();
        for(int i =0;i<n;i++)
        {
            m.put(sc.next(), sc.nextInt());
        }

        System.out.println(sortt(m));
        sc.close();
    }



}
