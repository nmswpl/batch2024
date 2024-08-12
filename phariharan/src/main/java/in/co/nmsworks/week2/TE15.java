package in.co.nmsworks.week2;

public class TE15 {
    public void countEven(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        System.out.println("even elements = " + count);
    }
}
