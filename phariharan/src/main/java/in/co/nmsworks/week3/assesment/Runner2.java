package in.co.nmsworks.week3.assesment;

/**
 * Given an array of integers, Write a Program to count and print number of even elements in the array.
 */
public class Runner2 {
    public static void main(String[] args) {
        Integer[] array1 = {1,2,3,4,5,6,7,8,9,11,10};
        Runner2 evenNumbers = new Runner2();
        evenNumbers.noOfEvenElements(array1);
    }

    public void noOfEvenElements(Integer[] array1){
        int count = 0;
        System.out.println(" Even Numbers ");
        for (Integer value : array1){
            if (value % 2 == 0){
                System.out.println(value);
                count +=1;
            }
        }
        System.out.println("No of Even numbers in Integer Array  :: "+count);
    }
}
