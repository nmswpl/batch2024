package in.co.nmsworks.week2;
//Write a program to print all even numbers between 601 and 700 in descending order*/
public class Te1 {
    public void  printEvenNumbersBetween(int start,int end){
        for (int i = end; i >=start ; i--) {
            if(i%2==0){
                System.out.print(i+", ");
            }

        }

    }
}
