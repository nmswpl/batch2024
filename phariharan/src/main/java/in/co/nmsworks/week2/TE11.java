package in.co.nmsworks.week2;

/**
 * Write a program to print the biggest of the 3 numbers
 * E.g : Input : 12, 24, 5 Output : 24 ; Input2 : 18, 18, 35 Output : 35
 */
public class TE11 {
    public void largestNumber(int num1 ,int num2,int num3){
        if (num1 >= num2) {
            if (num2 >= num3 || num1 >= num3){
                System.out.println(num1+" is a bigger number");
            }
            else{
                System.out.println(num3+" is a bigger number");
            }
        } else if (num2 >=num3) {
            System.out.println(num2 + " is a bigger number");
        }
        else {
            System.out.println(num3+" is a bigger number");
        }
    }
}
