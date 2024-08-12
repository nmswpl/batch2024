package in.co.nmsworks.week2;

/*
. Write a program to print all even numbers between 601 and 700 in descending order.

 */
public class Te1 {
    public static void main(String[] args) {
        //  public void Te1()
        {
            for (int i = 700; i > 600; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }

            }
        }
    }
}


