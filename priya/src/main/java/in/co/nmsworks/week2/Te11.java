package in.co.nmsworks.week2;
/*11. Write a program to print the biggest of the 3 numbers
E.g : Input : 12, 24, 5 Output : 24 ; Input2 : 18, 18, 35 Output : 35*/
public class Te11 {
    public void getGreatestNumber(int n1,int n2,int n3){
        if(n1>=n2&& n1>=n3){
            System.out.println(n1);
        }
        if(n2>=n1&& n2>=n3){
            System.out.println(n2);
        }
        else
            System.out.println(n3);
    }
}
