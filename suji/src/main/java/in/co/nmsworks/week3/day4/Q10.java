package in.co.nmsworks.week3.day4;
import java.util.*;
public class Q10 {
    int[]array;

    public void findFreq(int[]array)
    {
        int max = 0;
        int freq=0;
        for (int i = 0; i < array.length; i++)
        {
            int num = array[i];
            int c = 0;

            for (int j = 0; j < array.length; j++)
            {
                if (array[j] == num)
                {
                    c = c + 1;
                }
            }
          //  System.out.println(" count for element " + array[i] + " " + c);
            if (max < c)
            {
                max = c;
                freq=array[i];
            }
        }
        Map<Integer, Integer> occurence = new HashMap<>();

        for (int i : array)
        {
            occurence.put(i, occurence.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : occurence.entrySet())
        {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
        System.out.println("Most Frequent Element: "+freq+" is the most frequent with "+max+" occurrences.So mode= "+freq );
    }


    public static void main(String[] args)
    {
        Q10 ob=new Q10();
        int a[]=new int[]{4,7,7,7,1,1,8};
        ob.findFreq(a);
    }
}
