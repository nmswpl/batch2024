package in.co.nmsworks.week3.day4;

/***Write a program to find the second largest number in an array. ***/
public class Question6 {
    public void secondLargestNumber(int[] intArray) {
        int maxValue = intArray[0];
        int secondMax = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > maxValue) {
                secondMax = maxValue;
                maxValue = intArray[i];
            }
        }
        System.out.println("The second max is : " + secondMax);
    }

    public static void main(String[] args) {
        Question6 question6 = new Question6();
        int[] intArray = {1, 244, 56, 34, 67, 890, 47};
        question6.secondLargestNumber(intArray);
        String result = 8==8 ? "Equals" : "NotEquals" ;
        System.out.println(result);
    }
}
