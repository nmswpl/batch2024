package in.co.nmsworks.week2;

/*Write a program to print the biggest of the 3 numbers
E.g : Input : 12, 24, 5 Output : 24 ; Input2 : 18, 18, 35 Output : 35*/

public class Te11 {
    public void biggestOf(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("The Greatest number : "+a);
        } else if (b>c) {
            System.out.println("The Greatest number : "+b);
        }
        else {
            System.out.println("The Greatest number : "+c);
        }
    }
}
