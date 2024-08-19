package in.co.nmsworks.weekend;
/*
Write a program to print all numbers divisble by 3 greater than 300 and less than 400.

 */

public class Q14 {
    public void divisibleby3(){
        for (int i = 300; i < 400; i++) {
            if(i % 3==0){
                System.out.println(i);
            }
        }
    }

}
