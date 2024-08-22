package in.co.nmsworks.week3.assesment.day4;
// Write a program to find the second largest number in an array.

public class SecondLargest {
    public void secondLageElement() {
        int[] array = {12, 45, 69, 23, 67};
        int max = 0;
        int ele = 0;
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                ele = max;
                max = array[i];
            } else if (array[i] > ele && array[i] < max) {
                ele = array[i];
            }
        }
            System.out.println(max);
            System.out.println("Second largest element : " + ele);
    }
}
