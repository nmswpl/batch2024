package in.co.nmsworks.week2;

/**
 * Write a program to print the square of every element present in the array.
 * E.g : Input : arr1 = {2, 4, 3, 5} Output : 4 16 9 25
 */

public class TE7 {
    public int[] squareTheArray(int[] matrix1){
        for (int i = 0; i <= matrix1.length - 1; i++) {
            int answer  = matrix1[i] * matrix1[i];
            matrix1[i]= answer;
        }
        return matrix1;
    }
}
