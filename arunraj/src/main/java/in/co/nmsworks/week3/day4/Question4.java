package in.co.nmsworks.week3.day4;

/*Implement the algorithm to find the min and max
elements in an array of integers
 */

public class Question4 {
    public static void main(String[] args) {
        Question4 q4 = new Question4();
        q4.findMinAndMax(new int[]{2,3,5,1,7,8,5});
    }

    public void findMinAndMax(int[] array) {
        int max = 0;
        int min = Integer.MAX_VALUE ;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                }
            }
            for (int j=0;j<array.length;j++){
                if(max < array[j]){
                    max = array[j];
                }
            }
        }
        System.out.println("The minimum element is "+min);
        System.out.println("The maximum element is "+max);
    }
}
