package in.co.nmsworks.week2;

public class TE15 {

    public void countAndPrintEven(int[] arr){
        int count = 0;
        for (int i : arr) {
            if ( i % 2 == 0){
                System.out.println(i);
                count += 1;
            }
        }
        System.out.println("Number of Even elements:: "+count);
    }
}
