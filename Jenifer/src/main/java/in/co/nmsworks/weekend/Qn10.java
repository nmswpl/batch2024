package in.co.nmsworks.weekend;
// Write a program to print all numbers between 200 and 500 ending with 7.

public class Qn10 {
    public void endsWithSeven(){
        for (int i = 200; i < 500; i++) {
            if (i % 10 == 7){
                System.out.println(i);
            }
        }
    }
}
