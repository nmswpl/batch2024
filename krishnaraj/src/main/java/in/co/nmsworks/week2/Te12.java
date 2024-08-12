package in.co.nmsworks.week2;

/***
 * Given an array of integers, Write a Program to print number of odd elements.
 * For E.g Input : arr[] = {32, 43, 4, 15} Output : Odd elements = 2 Reason : 43 & 15
 * are odd
 */
public class Te12 {
    public void printOdd(){
        int number[]={32,43,4,15};
        int count=0;
        for (int i : number){
            if(i%2 !=0){
                count++;
            }
        }
        System.out.println("Odd elements : "+count);
    }
}
