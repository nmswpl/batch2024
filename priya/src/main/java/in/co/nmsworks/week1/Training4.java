package in.co.nmsworks.week1;
/*4. Given a number as String, write a program that removes the leading 0
Input :	0005640
output:	5640*/
public class Training4 {
    public void removeLeadingzeros(String string){

        String[] s =string.split("0*",2);
        System.out.println("After removing leading zeros ::"+s[1]);

        }
}
