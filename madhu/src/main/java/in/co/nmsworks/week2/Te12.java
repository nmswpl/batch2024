package in.co.nmsworks.week2;
/* Given an array of integers, Write a Program to print number of odd elements.
For E.g Input : arr[] = {32, 43, 4, 15} Output : Odd elements = 2 Reason : 43 & 15
are odd.*/
public class Te12
{
        public static void main(String args[]) {
            int a[] = {1, 2, 5, 6, 3, 2};
            System.out.println("Odd Numbers:");
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0) {
                    System.out.println(a[i]);
                }
            }

        }

}
