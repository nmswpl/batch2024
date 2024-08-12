package in.co.nmsworks.week2;

/**
 * Write a program to multiply two arrays of same size element-by-element.
 * E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7
 */

public class TE3 {
    public int[] matrixMultiplication(int[] matrix1, int[] matrix2) {
        for (int i = 0; i <= matrix1.length - 1; i++) {
            int answer  = matrix1[i] * matrix2[i];
            matrix2[i]= answer;
        }
        return matrix2;
    }
}
