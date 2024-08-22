package in.co.nmsworks.week3.day3hw.setA;
/*
Given an array of integers, Write a Program to find the sum of the elements in the array.
 */

public class Program2 {
    Integer[] intArr;
    public Program2(Integer[] intArr){
        this.intArr = intArr;
    }
    public void sumOfIntegerArray() {
        Integer result = 0;
        for (int i = 0; i < intArr.length; i++) {
            result = result + intArr[i];
        }
        System.out.println("The sum of Integer array :: "+result);
    }

    public static void main(String[] args) {
        Program2 sumOfIntArr = new Program2(new Integer[]{22,34,56});
        sumOfIntArr.sumOfIntegerArray();


    }
}


