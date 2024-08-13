package in.co.nmsworks.week2;


import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        TE1 evenNumbers = new TE1();
        evenNumbers.evenNumbers(601,700);
        System.out.println("\n\n");

        TE2 grade = new TE2(56);
        System.out.println("\n\n");

        TE3 matrix = new TE3();
        int[] matrix1 = {2,4,1};
        int[] matrix2 = {3,5,7};
        int[] result = matrix.matrixMultiplication(matrix1,matrix2);
        System.out.println(Arrays.toString(result));
        System.out.println("\n\n");

        TE4 searchElement = new TE4();
        int[] matrix3 = {7, 15, 41};
        searchElement.searchPosition(matrix3,4);
        System.out.println("\n\n");

        TE5 vowel = new TE5();
        vowel.isVowel('p');
        System.out.println("\n\n");

        TE6 multiply = new TE6();
        multiply.multiplyTables(17);
        System.out.println("\n\n");

        TE7 squareMatrix = new TE7();
        int[] matrix4 = {2, 4, 3 ,5};
        System.out.println(Arrays.toString(squareMatrix.squareTheArray(matrix4)));
        System.out.println("\n\n");

        TE8 hundred = new TE8();
        System.out.println("Hundred Position of value is "+(hundred.findHundredPosition(832)));
        System.out.println("\n\n");

        TE9 number1 = new TE9();
        number1.divisibleBy3(300,400);
        System.out.println("\n\n");

        TE10 num1 = new TE10();
        num1.endWith7(200,500);
        System.out.println("\n\n");

        TE11 max = new TE11();
        max.largestNumber(12,24,5);
        System.out.println("\n\n");

        TE12 number12 = new TE12();
        int[] array1 = {32,43,4,15};
        number12.noOfOdd(array1);
        System.out.println("\n\n");

        TE13 sum = new TE13();
        int[] array2 = {1,2,3};
        System.out.println("sum of elements of array is " +(sum.sumOfElementsInArray(array2)));
        System.out.println("\n\n");

        TE14 val = new TE14();
        val.reverseArray(array2);
        System.out.println("\n\n");

        TE15 even =new TE15();
        even.countEven(array1);
        System.out.println("\n\n");

        TE16 product = new TE16();
        System.out.println("Factorial  : "+product.Factorial(4));
        System.out.println("\n\n");

        TE17 largest = new TE17();
        largest.LargestElement(array1);
        System.out.println("\n\n");

        TE18 ex18 = new TE18();
        ex18.noOfOccurance(array2,3);
        System.out.println("\n\n");

        TE19 palindrome = new TE19();
        palindrome.isPalindrome("malayalam");
        System.out.println("\n\n");

        TE20 prime = new TE20();
        prime.isPrime(7);
        System.out.println("\n\n");
    }
}

