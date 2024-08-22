package in.co.nmsworks.week3.day4;

public class Q8 {
    int mean;
    int[] array;

    public int meanCalc(int[] array)
    {
        this.array = array;
        int sum = 0;
        for (int i = 0; i < array.length ; i++)
        {
            sum = sum + array[i];
            mean = (sum / array.length);
        }
        return mean;
    }

    public void show(int mean)
    {
        System.out.println("THe mean of the given array :: "+mean);
    }

    public static void main(String[] args)
    {
        Q8 ob=new Q8();
        int a[]=new int[]{1,2,3,4};
        int mean= ob.meanCalc(a);
        ob.show(mean);
    }
}
