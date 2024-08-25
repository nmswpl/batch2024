package in.co.nmsworks.week3.day2.homwork;

import java.util.*;

public class CountryCollection {

    public static void main(String[] args) {
        // Create a list of countries
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("Egypt");
        countries.add("Pakistan");
        countries.add("Brazil");
        countries.add("Srilanka");
        countries.add("England");
        countries.add("Bangladesh");
        countries.add("France");
        countries.add("China");
        countries.add("America");
        countries.add("Australia");

        // Create a Map to store Asian countries
        Map<String, List<String>> continentCountries = new HashMap<>();
        List<String> asiaCountries = new ArrayList<>();
        asiaCountries.add("India");
        asiaCountries.add("Pakistan");
        asiaCountries.add("Srilanka");
        asiaCountries.add("Bangladesh");
        asiaCountries.add("China");
        continentCountries.put("Asia", asiaCountries);

        // Iterate through the countries and check if they are in Asia
        for (String country : countries) {
            if (continentCountries.get("Asia").contains(country)) {
                System.out.println(country + " is in Asia");
            }
        }
    }
}






 class Divisible {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= 1000; i++) {
            if (i % 8 == 0) {
                set.add(i);
            }
        }
        for(Integer i:set)
        {
            System.out.println(i);
        }

    }
}



 class RainbowColors {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Violet");
        colors.add("Black");
        colors.add("Indigo");
        colors.add("White");
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Green");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Grey");
        colors.add("Orange");
        colors.add("Red");

        List<String> rainbowColors = new ArrayList<>();
        rainbowColors.add("Violet");
        rainbowColors.add("Indigo");
        rainbowColors.add("Blue");
        rainbowColors.add("Green");
        rainbowColors.add("Yellow");
        rainbowColors.add("Orange");
        rainbowColors.add("Red");

        for (String color : colors) {
            if (rainbowColors.contains(color)) {
                System.out.println(color + " found in rainbow");
            }
        }
    }
}


class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int number : numbers) {
            sum =sum+ number;
        }

        System.out.println("Sum of the array elements: " + sum);
    }
}



 class Train {
    private int id;
    private String name;
    private Map<String, Integer> passengerCountPerMonth;

    public Train(int id, String name) {
        this.id = id;
        this.name = name;
        this.passengerCountPerMonth = new HashMap<>();
    }

    public void addPassengerCount(String month, int passengerCount) {
        passengerCountPerMonth.put(month, passengerCount);
    }

    // Getters and setters for id, name, and passengerCountPerMonth
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getPassengerCountPerMonth() {
        return passengerCountPerMonth;
    }
}
class TrainTest {
    public static void main(String[] args) {
        // Create 5 Train objects
        Train train1 = new Train(1, "Chennai Express");
        train1.addPassengerCount("January", 1000);
        train1.addPassengerCount("February", 800);

        Train train2 = new Train(2, "Shatabdi Express");
        train2.addPassengerCount("January", 1200);
        train2.addPassengerCount("February", 900);

        Train train3 = new Train(3, "Cholan Express");
        train3.addPassengerCount("January", 900);
        train3.addPassengerCount("February", 1100);

        Train train4 = new Train(4, "Pandian Express");
        train4.addPassengerCount("January", 1500);
        train4.addPassengerCount("February", 1300);

        Train train5 = new Train(5, "Tejas Express");
        train5.addPassengerCount("January", 700);
        train5.addPassengerCount("February", 600);


        class FibonacciChecker {
            public void main(String[] args) {
                int number = 89; // Replace with the desired number

                // Create a Set to store Fibonacci numbers
                Set<Integer> fibonacciNumbers = new HashSet<>();
                fibonacciNumbers.add(0);
                fibonacciNumbers.add(1);

                // Generate Fibonacci numbers up to 1000
                int prev1 = 0;
                int prev2 = 1;
                int next;
                while ((next = prev1 + prev2) <= 1000) {
                    fibonacciNumbers.add(next);
                    prev1 = prev2;
                    prev2 = next;
                }

                // Check if the number is Fibonacci
                boolean isFibonacci = fibonacciNumbers.contains(number);
                System.out.println("Is " + number + " a Fibonacci number? " + isFibonacci);
            }
        }
    }
}




