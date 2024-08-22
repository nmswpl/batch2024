package in.co.nmsworks.week3.day4;

public class Q1 {
    int number;
    int i;

    public void checK()
    {
        for (int j = 1; j <=100; j++)
        {
            if ((j % 3 == 0) && (j % 5 == 0))
            {
                System.out.println(" FIZZBIZZ " + j);
            } else if (j % 3 == 0)
            {
                System.out.println(" FIZZ " + j);
            } else if (j % 5 == 0)
            {
                System.out.println(" BUZZ " + j);
            }

        }
    }

    public static void main(String[] args)
    {
        Q1 ob = new Q1();
        ob.checK();
    }
}