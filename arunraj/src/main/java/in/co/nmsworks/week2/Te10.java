package in.co.nmsworks.week2;

/*Write a program to print all numbers between 200 and 500 ending with 7.*/

public class Te10 {
    public void endingSeven(){
        for(int i=200;i<=500;i++){
            if(i%10==7){
                System.out.println(i);
            }
        }
    }
}
