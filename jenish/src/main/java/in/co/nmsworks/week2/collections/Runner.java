package in.co.nmsworks.week2.collections;

import java.util.Iterator;

public class Runner {
    public static void main(String[] args) {
        Question1 q1 = new Question1();
        q1.displayColors();

        Question2 q2 = new Question2();
        q2.displayList();

        Question3 q3 = new Question3();
        q3.displayList();

        Question4 q4 = new Question4();
        q4.displayList();

        Question5 q5 = new Question5();
        q5.flowersList.add("Rose");
        q5.flowersList.add("Lotus");
        q5.flowersList.add("Jasmine");
        System.out.println("Question 5");
        System.out.println("Before update:: "+q5.flowersList);
        q5.flowersList.set(1,"Sunflower");
        System.out.println("After update:: "+q5.flowersList);

        Question6 q6 = new Question6();
        q6.numbers.add(4);
        q6.numbers.add(3);
        q6.numbers.add(2);
        q6.numbers.add(1);
        System.out.println("Question 6");
        System.out.println("Before update:: "+q6.numbers);
        q6.numbers.remove(2);
        System.out.println("After update:: "+q6.numbers);

        Question7 q7 = new Question7();
        q7.numbersList.add(4);
        q7.numbersList.add(7);
        q7.numbersList.add(6);
        q7.numbersList.add(5);
        q7.numbersList.add(3);

        System.out.println("Question 7");
        int searchElement = 3;
        if(q7.findElement(searchElement)){
            System.out.println("Element Found.");
        }
        else{
            System.out.println("Not Found.");
        }

        Question8 q8 = new Question8();
        q8.fruitsList.add("Apple");
        q8.fruitsList.add("Guava");
        q8.fruitsList.add("Grapes");
        System.out.println("Question 8");
        System.out.println("Original List :: "+q8.fruitsList);
        for (String s : q8.fruitsList) {
            q8.eatables.add(s);
        }
        System.out.println("Copied List :: "+q8.eatables);

        Question9 q9 = new Question9();
        q9.numbersList.add(8);
        q9.numbersList.add(6);
        q9.numbersList.add(5);
        q9.numbersList.add(4);
        int size = q9.numbersList.size() - 1;
        System.out.println("Original List :: "+q9.numbersList);
        System.out.println("Reversed List :: ");
        for (int i = size ; i >= 0 ; i--) {
            System.out.println(q9.numbersList.get(i));
        }

        Question10 q10 =  new Question10();
        q10.numbersList.add(10);
        q10.numbersList.add(2);
        q10.numbersList.add(4);
        q10.numbersList.add(1);

        if(q10.numbersList.containsAll(q10.numbersList1)){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Not same");
        }

        Question11 q11 = new Question11();
        q11.numbersList1.add(4);
        q11.numbersList1.add(2);
        q11.numbersList1.add(5);
        q11.numbersList2.add(7);
        q11.numbersList2.add(11);
        q11.numbersList2.add(9);
        q11.numbersList1.addAll(q11.numbersList2);
        System.out.println(q11.numbersList1);

        Question12 q12 = new Question12();
        q12.colors.add("Vanilla");
        q12.colors.add("Chocolate");
        q12.colors.add("Butterscotch");
        q12.colors.add("BlackCurrent");
        System.out.println("Set Colors ::");
        for (String color : q12.colors) {
            System.out.println(color);
        }
    }
}
