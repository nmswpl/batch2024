package in.co.nmsworks.week3.day4;

public class Q3 {
    int number;

    public int findSum(int number)
    {
        this.number=number;
        int n=number;            //temp variable
        int sum=0;
        int num=0;
        while (n>0)
        {
            num=n%10;
            sum=sum+num;
            n=n/10;
        }
        return sum;
        }
        public void show(int number)
        {
            System.out.println(" THe sum is"+number);
        }

    public static void main(String[] args)
    {
        Q3 ob=new Q3();
        int a=  ob.findSum(512);
        ob.show(a);
    }
}
