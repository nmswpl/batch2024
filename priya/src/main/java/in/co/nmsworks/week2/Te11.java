package in.co.nmsworks.week2;

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
