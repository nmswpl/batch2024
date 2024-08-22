package in.co.nmsworks.week3.day4;
/***Write a program to find the median of an array.
 If the number of elements is odd, the median is the middle element.
 If the number of elements is even, the median is the average of the two middle elements. ***/
public class Question10 {
    public void findMedianOfArray(int[] intArray){
        if (intArray.length % 2 ==0){
            int num1 = intArray.length/2;
            int num2 = num1 -1;
            int median = num1/num2;
            System.out.println("The median is : " + (intArray[median]));
        }
        else {
            int middle =intArray.length/2;
            System.out.println("The median is : " + intArray[middle]);
        }
    }
    public static void main(String[] args) {
        Question10 question10 = new Question10();
        int[] intArray = {1,2,3,4,5,6,7};
        question10.findMedianOfArray(intArray);
    }
}
