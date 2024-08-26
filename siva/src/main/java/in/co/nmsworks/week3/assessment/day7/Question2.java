package in.co.nmsworks.week3.assessment.day7;

import java.util.HashSet;
import java.util.Set;
import  java.util.Scanner;

public class Question2 {
    public static Set<String> intersection(Set<String> s1,Set<String> s2)
    {
        Set<String> last = new HashSet<>();

        for(String s : s1)
        {
            if(s2.contains(s))
            {
                last.add(s);
            }
        }

        return last;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.nextLine();

        Set<String> set1 = new HashSet<>();

        for(int i = 0;i<n;i++)
        {
            set1.add(sc.nextLine());
        }

        Set<String> set2 = new HashSet<>();

        for(int i = 0;i<m;i++)
        {
            set2.add(sc.nextLine());
        }
        System.out.println(intersection(set1,set2));
        sc.close();
    }


}
