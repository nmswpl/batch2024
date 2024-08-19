package in.co.nmsworks.week1;

/*  A program to reverse words in a Sentence.
	Input : India is my country.
	Output:	country my is India.

*/



public class Training1 {
    public Training1()
    {
                                              //public static void main(String[] args) {
        String a="Thi is an amazing day";
        String []s=a.split(" ");
        for(int i=(s.length)-1;i>=0;i--)
        {
            System.out.println(s[i]);
        }

    }
}