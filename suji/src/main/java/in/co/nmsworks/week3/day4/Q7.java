package in.co.nmsworks.week3.day4;

public class Q7 {

    int a;
    int b;

    public void calcRem(int a, int b)
    {
        if (a < b)
        {
            System.out.println("PLease enter a number say a1 greater than b1");
        }

        int rem = 0;
        while (b > 0)
        {
            rem = a % b;
            a = b;
            b = rem;
        }
        System.out.println("The GCD of these 2 numbers :: " + a );
    }

    public static void main(String[] args)
    {
        Q7 ob = new Q7();
        ob.calcRem(21, 18);
    }
}
