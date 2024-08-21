package in.co.nmsworks.week3.day2.homework;

import java.util.*;
class Train{
    private Integer id;
    private String name;

    private Map<String,Integer> monthTOPassengers;

    public Train(String name, Integer id,Map<String, Integer> monthTOPassengers) {
        this.monthTOPassengers = monthTOPassengers;
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getMonthTOPassengers() {
        return monthTOPassengers;
    }

    public void setMonthTOPassengers(Map<String, Integer> monthTOPassengers) {
        this.monthTOPassengers = monthTOPassengers;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", monthTOPassengers=" + monthTOPassengers +
                '}';
    }
}

public class SetA2Questions {
//    1) Add the Following Colors to a Collection.
//            Violet, Black, Indigo, White, Blue, Brown, Green, Pink, Yellow, Grey, Orange, Red.
//    Iterate the collection, Print the "<Color Name> Found in rainbow" if the color is part of rainbow.
//
//2) Given an array of integers, Write a Program to find the sum of the elements in the array.
//
//3) Create a class Train. Train should have id, Name and a Map containing Month and Number of Pasengers travelled per month.
// Create atleast 5 Train objects.
//
//            4) Write a program to find if a given number (less than 1000) is fibonacci or not using Set.


    public void printRainbowColors(){
        List<String> rainbowColors=new ArrayList<>();
        rainbowColors.add("Red");
        rainbowColors.add("Orange");
        rainbowColors.add("Yellow");
        rainbowColors.add("Green");
        rainbowColors.add("Blue");
        rainbowColors.add("Indigo");
        rainbowColors.add("Violet");
        List<String>colors=new ArrayList<>();
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
        for (String color : colors) {
            if(rainbowColors.contains(color)){
                System.out.println(color);
            }
        }
    }

    public void sumOfArr(){
        int[] array={1,2,3,4,5,6,7,8,9,10,11,12};
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[i];
        }
        System.out.println("the sum of the array is::"+sum);
    }
    public void isFibonacci(int num){
        Set<Integer> fibonaccinumbers=new HashSet<>();
        int val1=0,val2=1;
        while(val1<=1000){
            fibonaccinumbers.add(val1);
            int val3=val2+val1;
            val1=val2;
            val2=val3;
        }
        if(fibonaccinumbers.contains(num)) {
            System.out.println("it is fibonacci number");
        }
        else{
            System.out.println("it is not a fibonacci number");
        }
    }
    public static void main(String[] args) {
//        SetA2Questions obj= new SetA2();
//        obj.printRainbowColors();
//        obj.sumOfArr();
//        obj.isFibonacci(55);
        Map<String,Integer>monthTopassengers=new HashMap<>();
        monthTopassengers.put("jan",6003);
        monthTopassengers.put("feb",6056);
        monthTopassengers.put("mar",6007);
        monthTopassengers.put("apr",6000);
        monthTopassengers.put("may",6090);
        monthTopassengers.put("jun",6038);
        monthTopassengers.put("jul",6078);
        monthTopassengers.put("aug",6056);
        monthTopassengers.put("sep",6087);
        monthTopassengers.put("oct",6090);
        monthTopassengers.put("nov",6036);
        monthTopassengers.put("dec",6088);
        Train train1=new Train("chozan",7892,monthTopassengers);
        Train train2=new Train("pallavan",6892,monthTopassengers);
        Train train3=new Train("chozan express",5692,monthTopassengers);
        Train train4=new Train("anthothiya",3292,monthTopassengers);
        Train train5=new Train("madurai express",9892,monthTopassengers);
        List<Train> objects=new ArrayList<>();
        objects.add(train1);
        objects.add(train2);
        objects.add(train3);
        objects.add(train4);
        objects.add(train5);
        for (Train train : objects) {
            System.out.println(train);
        }
    }
}
