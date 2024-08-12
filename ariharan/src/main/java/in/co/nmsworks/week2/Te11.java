package in.co.nmsworks.week2;

//Write a program to print the biggest of the 3 numbers
//E.g : Input : 12, 24, 5 Output : 24 ; Input2 : 18, 18, 35 Output : 35
public class Te11 {
    public void bidOf3(int val1,int val2,int val3){
        if(val1>val2 && val1>val3){
            System.out.println("the biggest number is "+val1);
        }
        else if(val2>val3){
            System.out.println("the biggest number is "+ val2);

        }
        else{
            System.out.println("the bigest number is "+val3);
        }
    }
}
