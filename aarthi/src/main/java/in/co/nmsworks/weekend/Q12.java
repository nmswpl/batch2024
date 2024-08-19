package in.co.nmsworks.weekend;
/*
Write a program to print the biggest of the 3 numbers
E.g : Input : 12, 24, 5 Output : 24 ; Input2 : 18, 18, 35 Output : 35
*/

public class Q12 {
    public void biggest(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("biggest "+a);
        } else if (b>a && b>c) {
            System.out.println("biggest "+b);
        }else{
            System.out.println("biggest " +c);
        }

    }
}
