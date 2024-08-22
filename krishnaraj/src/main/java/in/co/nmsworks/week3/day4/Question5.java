package in.co.nmsworks.week3.day4;

/***Implement the algorithm to find the min and max elements in an array of integers. **/

public class Question5 {
    public void minMaxArray(int... intArray) {
        int minValue = intArray[0];
        int maxValue = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < minValue) {
                minValue = intArray[i];
            } else if (intArray[i] > maxValue) {
                maxValue = intArray[i];
            }
        }
        System.out.println("The Min Value in Array is : " + minValue);
        System.out.println("The Max Value in Array is : " + maxValue);
    }

    public static void main(String[] args) {
        Question5 question5 = new Question5();
        question5.minMaxArray(1, 2, 4, 5, 3, 45, 4);
    }
}
