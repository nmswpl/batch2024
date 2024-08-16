package in.co.nmsworks.week2.collections;

public class Runner {
    public static void main(String[] args) {

        PQ1 excercise1 = new PQ1();
        excercise1.addColours("Red");
        excercise1.addColours("Blue");
        excercise1.addColours("Green");
        excercise1.displayDetails();

        System.out.println();
        PQ2 excercise2 = new PQ2();
        excercise2.displayColours(excercise1);
        System.out.println();
        System.out.println("Set 2 ( Colours.set2) ------ >");
        excercise2.addColourSet("Orange");
        excercise2.addColourSet("White");
        excercise2.addColourSet("Green");
        excercise2.displaySet();


        System.out.println();
        PQ3 excercise3 = new PQ3();
        excercise3.addInFirstIndex(excercise1,"White");
        System.out.println("Set in First Index -----> ");
        excercise3.setInFirstIndex(excercise1,"Red");

        System.out.println();
        PQ4 exercise4 = new PQ4();
        exercise4.addInAnyIndex(excercise1,"Black",2);

        System.out.println();
        PQ5 exercise5 = new PQ5();
        exercise5.replaceELement(excercise1,"Red","Orange");

        System.out.println();
        PQ6 exercise6 = new PQ6();
        exercise6.displayThirdElement(excercise1);

        System.out.println();
        PQ7 excercise7 = new PQ7();
        excercise7.searchElement(excercise1,"White");

        System.out.println();
        PQ8 excercise8 = new PQ8();
        excercise8.createCopy(excercise1);

        System.out.println();
        PQ9 excercise9 = new PQ9();
        excercise9.reversePrint(excercise1);

        System.out.println();
        PQ10 excercise10 = new PQ10();
        excercise10.compareTwoList(excercise1.colourList,excercise8.createCopy(excercise1));

        System.out.println();
        PQ11 excercise11 = new PQ11();
        excercise11.combineTwoList(excercise1.colourList,excercise8.createCopy(excercise1));

        System.out.println();
        System.out.println("Set (First Question Repeat using Set) ---- >");
        PQ12 excercise12 = new PQ12();
        excercise12.addColourset("White");
        excercise12.addColourset("Red");
        excercise12.addColourset("Violet");
        excercise12.displayDetails();
    }
}
