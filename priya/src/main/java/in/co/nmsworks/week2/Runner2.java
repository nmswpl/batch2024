package in.co.nmsworks.week2;

public class Runner2 {
    public static void main(String[] args) {
        Te1 te1 = new Te1();
        te1.printEvenNumbersBetween(601,700);
        System.out.println();

        Te2 te2 = new Te2();
        te2.getGrade(101);
        Te3 te3 = new Te3();

        int[] a1={2,4,1};
        int[] a2={3,5,7};
        te3.multiplyArrays(a1,a2);
        System.out.println();

        int[] a = {7,15,41};
        Te4 te4 = new Te4();
        te4.getPosition(a,7);

        Te5 te5 = new Te5();
        te5.vowelTest('e');

        Te6 te6 = new Te6();
        te6.getTables(17);

        Te7 te7 = new Te7();
        int[] array = {2,4,3,5};
        te7.getSquare(array);
        System.out.println();


        Te8 te8 = new Te8();
        te8.getHundredPosition(387);

        Te9 te9 = new Te9();
        te9.divisibleByThree(300,400);
        System.out.println();

        Te10 te10 = new Te10();
        te10.getNumbers(200,500);

        Te11 te11 = new Te11();
      te11.getGreatestNumber(2,5,5);

        Te12 te12 = new Te12();
        int[] arr12 = {32,43,4,15};
        te12.printOddCount(arr12);

        Te14 te14 = new Te14();
        int[] a14 = {2,3,5};
        te14.getSum(a14);

        Te15 te15 = new Te15();
        int[] a15 = {2,3,5,6};
        te15.printOddCount(a15);

        Te16 te16 = new Te16();
        int[] a16 = {2,3,5,6};
        te16.maxArray(a16);



    }
}