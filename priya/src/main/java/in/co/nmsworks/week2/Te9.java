package in.co.nmsworks.week2;
//9. Write a program to print all numbers divisble by 3 greater than 300 and less than 400.
public class Te9 {
    public void divisibleByThree(int first  ,int last){
        for (int i =first ; i < last; i++) {
            if(i%3==0){

                System.out.print(i+" ");
            }

        }

    }
}
