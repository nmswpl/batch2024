package in.co.nmsworks.week2;

public class Runner {
    public static void main(String[] args) {
        Training1 t1 = new Training1();
        t1.printEven();

        Training2 t2 = new Training2();
        t2.printGrade(80);

        Training3 t3 = new Training3();
        int[] arr1 = {2,4,1};
        int[] arr2={3,5,7};
        t3.multiplyArray(arr1,arr2);

        Training4 t4 = new Training4();
        int[] arr3 = {7,15,41};
        int searchElement = 41;
        t4.findElement(arr3, searchElement);

        Training5 t5 = new Training5();
        t5.checkVowelOrConsonant('b');

        Training6 t6 = new Training6();
        t6.printTable();

        Training7 t7 = new Training7();
        int[] arr = {2, 4, 3, 5};
        t7.printSquareOfNum(arr);

        Training8 t8 = new Training8();
        t8.printHundredPos(743);

        Training9 t9 = new Training9();
        t9.divisibleByThree();

        Training10 t10 = new Training10();
        t10.printEndWithSeven();

        Training11 t11 = new Training11();
        t11.findLargest(18,24,8);

        Training12 t12 = new Training12();
        int[] arr4 = {32, 43, 4, 15};
        t12.noOfOddElements(arr4);

        Training13 t13 = new Training13();
        int[] arr5 = {1, 2, 3};
        t13.sumOfElements(arr5);

        Training14 t14 = new Training14();
        String[] arr6 = {"a","b","c"};
        t14.reverse(arr6);

        Training15 t15 = new Training15();
        //int res = t15.fact(5);
        //System.out.println(res);

        Training16 t16 = new Training16();
        int[] arr7 = {12, 3, 20, 14};
        t16.findLargest(arr7);


    }
}