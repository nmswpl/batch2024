package in.co.nmsworks.week2;
/*12. Given an array of integers, Write a Program to print number of odd elements.
For E.g Input : arr[] = {32, 43, 4, 15} Output : Odd elements = 2 Reason : 43 & 15
are odd.*/
public class Te12 {
    public void printOddCount(int[] arr){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(i%2!=0){
                System.out.println(i);
                count++;
            }

        }
        System.out.println("The odd count is "+ count);
    }
}
