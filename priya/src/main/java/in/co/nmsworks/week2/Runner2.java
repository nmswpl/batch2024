package in.co.nmsworks.week2;

public class Runner2 {
    public static void main(String[] args) {
        Te1 te1 = new Te1();
        te1.printEvenNumbersBetween(601,700);
        System.out.println();
        System.out.println();

        Te2 te2 = new Te2();
        te2.getGrade(101);
        Te3 te3 = new Te3();
        System.out.println();
        System.out.println();

        int[] a1={2,4,1};
        int[] a2={3,5,7};
        te3.multiplyArrays(a1,a2);
        System.out.println();
        System.out.println();

        int[] a = {7,15,41};
        Te4 te4 = new Te4();
        te4.getPosition(a,7);
        System.out.println();

        Te5 te5 = new Te5();
        te5.vowelTest('e');
        System.out.println();

        Te6 te6 = new Te6();
        te6.getTables(17);
        System.out.println();
        System.out.println();

        Te7 te7 = new Te7();
        int[] array = {2,4,3,5};
        te7.getSquare(array);
        System.out.println();
        System.out.println();


        Te8 te8 = new Te8();
        te8.getHundredPosition(387);
        System.out.println();

        Te9 te9 = new Te9();
        te9.divisibleByThree(300,400);
        System.out.println();
        System.out.println();

        Te10 te10 = new Te10();
        te10.getNumbers(200,500);
        System.out.println();
        System.out.println();

        Te11 te11 = new Te11();
      te11.getGreatestNumber(2,5,5);

        Te12 te12 = new Te12();
        int[] arr12 = {32,43,4,15};
        te12.printOddCount(arr12);

        Te13 te13 = new Te13();
        int[] a13 = {2,3,5};
        te13.getSum(a13);

        String[] arr1 = {"a","b","c"};
        Te14 te14 = new Te14();
        te14.reverseArray(arr1);

        Te15 te15 = new Te15();
        int[] a15 = {2,3,5,6};
        te15.printOddCount(a15);


        Te16 te16 = new Te16();
        te16.getFactorial(5);
        System.out.println();

        Te17 te17 = new Te17();
        int[] a17 = {12,3,20,14,-1};
        te17.maxArray(a17);

        Te18 te18   = new Te18();
        int arr[] = {1, 2, 3, 2, 2, 3};
        te18.getOccurence(arr,2);
        System.out.println();

        Te19 te19   = new Te19();
        te19.isPalindrome("LeveL");
        te19.isPalindrome("abc");
        System.out.println();

        Te20 te20   = new Te20();
        te20.isPrime(7);
        te20.isPrime(10);







    }
}