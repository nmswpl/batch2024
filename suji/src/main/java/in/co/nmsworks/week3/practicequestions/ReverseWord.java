package in.co.nmsworks.week3.practicequestions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReverseWord
{
    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    private String word;
    private String revWord;

    public String reverseWord(String word)
    {
        revWord=" ";
        for (int i = word.length()-1; i >=0 ; i--)
        {
            revWord=revWord+word.charAt(i);
        }
        return revWord;
    }
public void display(String word,String revWord)
{
    System.out.println(" Orginal word :: "+word);
    System.out.println(" Reverse word :: "+revWord);
}

/*public void removeSpace(String word)                           //normal method
{
    word=word.replace(" ","");
    System.out.println( word );
}*/

public void removeSpace(String path) throws IOException                       //using filehandling
{
  //  FileReader fr=new FileReader("/home/nms/Practice/skincare.txt");
    FileReader fr=new FileReader(path);
    BufferedReader br=new BufferedReader(fr);
    String line= br.readLine();
    while(br.readLine()!=null)
    {
        line=line.replace(" ","");
        System.out.println(line);
    }

}

public void oneTimeSubstring(String word)
{
    word=word.toLowerCase();
    word=word.replace(" ","");
    word=word.replace(",","");
    String substr=" ";
    int c=0;
    Set<String> set=new HashSet<>();
    for (int i = 0; i < word.length()-1; i++)
    {
        set.add(String.valueOf(word.charAt(i)));
    }

    for (String s : set)
    {
        substr=substr+s;
        c+=1;
    }
    System.out.println("Substring of the word :: "+substr +". Count of the longest substring :: "+c);

}

    public static void main(String[] args) throws IOException {
        ReverseWord ob=new ReverseWord();
       // String word="Suji";   //for reverse program
        //  String reverse =ob.reverseWord(word);
        // ob.display(word,reverse);

       // String word="Dot & Key's Cica Niacinamide Serum is a popular skincare product known for its ability to soothe irritated skin and improve uneven skin tone. The serum's combination of cica and niacinamide helps reduce redness, inflammation, and hyperpigmentation\n" +"\n\n";

     //   ob.removeSpace(word);
        Scanner sc=new Scanner(System.in);
     //   System.out.println("Enter path");             //using FILe handling to remove space & print the lines.
     //   String path=sc.nextLine();
      //  ob.removeSpace(path);

        String word1="Strawberries are juicy, sweet, and often used in desserts and snacks.";
        ob.oneTimeSubstring(word1);
    }
}
