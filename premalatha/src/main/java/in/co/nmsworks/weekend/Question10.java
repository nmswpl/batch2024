package in.co.nmsworks.weekend;
/*
Write a program to print all numbers between 200 and 500 ending with 7.
 */
public class Question10 {
    public void numbersEndBy7(){
        for (int i = 200; i <=500 ; i++) {
            if(i%10 == 7)
                System.out.println("Numbers end by 7 : " + i);
        }
    }
}
