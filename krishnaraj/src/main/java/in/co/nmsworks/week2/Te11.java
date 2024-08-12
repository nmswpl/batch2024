package in.co.nmsworks.week2;

/***
 * Write a program to print the biggest of the 3 numbers
 * E.g : Input : 12, 24, 5 Output : 24 ; Input2 : 18, 18, 35 Output : 35
 */
public class Te11 {
    public void biggestNumber(){
        int a=12;
        int b=24;
        int c=5;
        if(a>b && a>c){
            System.out.println("a is greater");
        } else if (b>a && b>c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }
    }

}
