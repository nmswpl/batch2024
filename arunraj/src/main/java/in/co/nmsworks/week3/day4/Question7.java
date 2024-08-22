package in.co.nmsworks.week3.day4;

/*Write a program to find the median of an array.
        If the number of elements is odd, the median is the
        middle element.
        If the number of elements is even, the median is
        the average of the two middle elements.
        */

public class Question7 {
    public static void main(String[] args) {
        Question7 q7 = new Question7();
        q7.medianOfArray(new int[]{1,2,4,5,6});
    }

    public void medianOfArray(int[] array){
        int oddMedian = 0;
        int evenMedian = 0;
        for (int i = 0; i < array.length; i++) {
            if(array.length % 2 == 1){
                oddMedian = (array.length / 2) + 1;
                break;
            }
        }
        System.out.println("The meadian of is "+oddMedian);
        /*if(array.length % 2 == 0){
            for (int i = 0; i < array.length; i++) {

            }
        }*/
    }
}
