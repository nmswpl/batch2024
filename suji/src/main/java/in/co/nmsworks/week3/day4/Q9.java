package in.co.nmsworks.week3.day4;

public class Q9 {
    int median;
    int mean;
    int[] array;

    public void calc(int[] array)
    {
        this.array = array;
        int l = array.length;

        if (l % 2 == 0)
        {
            int sum = 0;
            for (int i = 0; i < array.length; i++)
            {
                sum = sum + array[i];
                mean = (sum / array.length);
            }
            System.out.println(" Since the size is even (mean) :: is " + mean);
        }
        else
        {
            for (int i = 0; i < (array.length) / 2; i++)
            {
                median = array[i + 1];
            }
        }
        System.out.println(" Since the size is odd (median) :: is " + median);
    }

    public static void main(String[] args)
    {
        Q9 ob = new Q9();
        int[] a = new int[]{1, 5, 3, 7, 8};
        ob.calc(a);
    }
}
