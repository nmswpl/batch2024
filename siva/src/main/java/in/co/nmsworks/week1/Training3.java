package in.co.nmsworks.week1;
/*
Given a string str, write a Java program to print all words with even length in the given string
 */

public class Training3 {
    String s;


    public void evenLength()
    {
        String[] strings=s.split(" ");
        for(String s1:strings){
            if(s1.length()%2==0)
            {
                System.out.println(s1);
            }

        }
    }
}
