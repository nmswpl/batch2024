package in.co.nmsworks.week2;

//1. Write a program to print all even numbers between 601 and 700 in descending order.

public class Te1 {
    public void even()
    {
        int n = 601;
        for (int i = 700; i >n; i--) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
