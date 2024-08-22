package in.co.nmsworks.week3.day4;

public class Runner {
    public static void main(String[] args) {
        Training1 training1 = new Training1();
        training1.question1();
        System.out.println("______________________________");

        Training2 training2 = new Training2();
        training2.isLeapYear(104);
        System.out.println("______________________________");

        Training3 training3 = new Training3();
        training3.sumOfDigit(1234);
        System.out.println("______________________________");

        Training4 training4 = new Training4();
        training4.printMinMaxOfArray(1,4,5,8,0,3,4,23,4,1);
        System.out.println("______________________________");

        Training5 training5 = new Training5();
        training5.printSecondLargest(1,4,5,8,0,4,12,23,1);
        System.out.println("______________________________");

        Training6 training6 = new Training6();
        training6.wordCount();
        System.out.println("______________________________");

        Training7 training7 = new Training7();
        training7.computeGCD(24,10);
        System.out.println("______________________________");

        Training8 training8 = new Training8();
        training8.findMean(1,2,3,4,5,6,7,8,9,10);
        System.out.println("______________________________");

        Training9 training9 = new Training9();
        training9.findMedian(1,2,3,4,5,6,7);
        training9.findMedian(1,2,3,4,5,6);
        System.out.println("______________________________");

        Training10 training10 = new Training10();
        training10.findMostFrequentElement(4,7,7,7,1,1,8);
        System.out.println("______________________________");

        String result = 8==8?"equals":"notEquals";
    }
}
