package in.co.nmsworks.weekend;
/*
Write a program to print all numbers divisble by 3 greater than 300 and less than 400.
 */

public class Question9 {
    public void divide(){
        for (int i = 301; i <400 ; i++) {
            if(i%3 == 0)
                System.out.println("Numbers divisible by 3 : " + i);
        }
    }
}
