package in.co.nmsworks.week2;
//Write a program to print all numbers divisble by 3 greater than 300 and less than 400.

public class Te9 {
    public void divBy3(){
        for (int i = 300; i <400 ; i++) {
            if (i%3==0){
                System.out.println(i);
            }

        }
    }
}
