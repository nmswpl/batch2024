package in.co.nmsworks.week1;
/*
Given a number as String, write a program that removes the leading 0
 */

public class Training4 {
    public void leading0(String string1)
    {
        boolean leading0 = true;
        for (int i = 0; i <= string1.length() - 1; i++)
        {
            char a = string1.charAt(i);
            if (a != '0' || leading0 == false) {
                System.out.print(a);
                leading0 = false;
            }

        }
    }
}
