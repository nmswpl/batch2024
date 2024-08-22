package in.co.nmsworks.week3.day4;
/***Write a program to find the mean of an array.
 The mean is the result of dividing the sum of the elements by the number of elements. **/

public class Question9 {
    public void meanOfAnArray(int[] intArray){
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        System.out.println("The mean of an array is : " +sum/ intArray.length);
    }

    public static void main(String[] args) {
        Question9 question9 = new Question9();
        int[] intArray = {2,2,3,5,6,7,8};
        question9.meanOfAnArray(intArray);
    }
}
