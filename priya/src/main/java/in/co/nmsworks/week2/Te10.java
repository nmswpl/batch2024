package in.co.nmsworks.week2;
//10. Write a program to print all numbers between 200 and 500 ending with 7.
public class Te10 {
    public void getNumbers(int start,int end){
        for (int i = start; i <end ; i++) {
            if(i%10==7) {
                System.out.print(i+" ");
            }
        }

    }
}
