package in.co.nmsworks.week3.day2.homework;

import java.util.Scanner;

public class SimplePrograms {
    public void printPassedValue(int value){
        System.out.println("you entered ::"+value);
    }
    public int addTwoVal(int val1,int val2){
        return val1+val2;
    }

    public float multipFloatValues(float val1,float val2){
        return val1*val2;
    }

    public void charToASCII(char ch){
        System.out.println((int)ch);
    }

    public void divide(int divident,int divisor){
        System.out.println("quotient is:"+(divident/divisor));
        System.out.println("remainder  is:"+(divident%divisor));
    }
    public void swap(){
        int a=10,b=20;
        System.out.println("the value of a is "+a+" b is "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping using temp var");
        System.out.println("the value of a is "+a+"b is "+b);
    }

    public void oddOrEven(int value){
        if(value%2==0){
            System.out.println("it is even number");
        }
        else{
            System.out.println("it is odd number");
        }
    }

    public void vowelOrConsonant(char ch){
        if(ch=='a' ||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            System.out.println("given character is vowel");
        }
        else {
            System.out.println("given character is consonants");
        }
    }

    public  void largestNumber(int val1,int val2,int val3){
        if(val1>val2 &&val1>val3){
            System.out.println(val1+" is a great number");
        } else if (val2>val3) {
            System.out.println(val2+" is a great number");
        }
        else {
            System.out.println(val3+" is a great number");
        }

    }

    public void positiveOrNegative(int value){
        if(value>0){
            System.out.println("it is positive number");
        } else if (value<0) {
            System.out.println("it is a negative number");
        }
        else {
            System.out.println("it is neither positive nor negative");
        }
    }

    public void alphabetOrNot(char ch){
        if((int)ch>=65&&(int)ch<=90){
            System.out.println(ch+" is a Alphabet");
        } else if ((int)ch<=122&&(int)ch>97) {
            System.out.println(ch+" is a Alphabet");
        }
        else{
            System.out.println(ch+" is not a Alphabet");
        }
    }

    public void sumOFNaturalNumbers(int limit){
        int sum=0;
        for (int i = 0; i <=limit ; i++) {
            sum+=i;
        }
        System.out.println("the sum is::"+sum);
    }

    public void factorialFinder(int value){
        int fac=1;
        for (int i = 1; i <=value ; i++) {
            fac*=i;
        }
        System.out.println("the factorial of "+value+" is::"+fac);
    }

    public void factorialUsingWhile(int value){
        int fac=1,i=1;
        while(i<=value){
            fac*=i;
            i++;
        }
        System.out.println("the factorial of "+value+" is::"+fac);
    }

    public void multiplicationTableUsingFor(int value){
        for (int i = 1; i <11 ; i++) {
            System.out.println(i+" * "+value+" = "+ i*value);
        }
    }
    public void fibonacciSeries(int value){
        int val1=0,val2=1;
        for (int i = 0; i <=value; i++) {
            System.out.print(val1+",");
            int val3=val1+val2;
            val1=val2;
            val2=val3;
        }
    }
    public void printAlphabet(){
        char ch='a';
        for (int i = 0; i < 26; i++) {
            System.out.print(ch+"  ");
            ch++;
        }

    }
    public void countDigits(int value){
        int count=0,temp=1;
        while(temp<=value){
            temp=temp*10;
            count++;
        }
        System.out.println("the count of the digit is::"+count);
    }

    public void powerUsingFor(int base,int pow){
        int ans=1;
        for (int i = 0; i <pow ; i++) {
            ans*=base;
        }
        System.out.println("answer is::"+ans);
    }
    public void isprime(int num){
        int count=0;
        for (int i = 1; i <=num/2 ; i++) {
            if (num % i == 0)
                count++;

        }
        if (count==1)
            System.out.println("it is a prime");
        else
            System.out.println("it is a not prime number");
    }
    public void powerUsingPowFunc(int base,int pow){
        System.out.println("Answer is::"+Math.pow(base,pow));
    }
    public void factors(int value){
        System.out.println("the factors of"+value+"is::");
        for (int i = 1; i <=value ; i++) {
            if(value%i==0){
                System.out.print(i+",");
            }
        }
    }
    public int factorialUsingRecursion(int num){
        if(num==0){
            return 1;
        }
        else {
            return num*factorialUsingRecursion(num-1);
        }
    }

    public void frequencyOfChar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the statement::");
        String str=sc.nextLine();
        System.out.println("enter the char to find frequency::");
        char s=sc.nextLine().charAt(0);
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==s)
                count++;
        }
        System.out.println("the frequencies is::"+count);
    }
    public void countVowelsDigitsSpaces(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the statement::");
        String str=sc.nextLine();
        String vowels="aeiou";
        String digits="1234567890";
        int countV=0,countC=0,countD=0,countS=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==' '){
                countS++;
            } else if (vowels.contains(String.valueOf(str.charAt(i)))) {
                countV++;
            } else if (digits.contains(String.valueOf(str.charAt(i)))) {
                countD++;
            }
            else {
                countC++;
            }
        }
        System.out.println("Vowels"+countV);
        System.out.println("Consonants"+countC);
        System.out.println("Digits"+countD);
        System.out.println("Spaces"+countS);

    }
    public static void main(String[] args) {
        SimplePrograms sp=new SimplePrograms();
        sp.printPassedValue(10);

        int addTwoIntegers=sp.addTwoVal(10,20);
        System.out.println("the sum is::"+addTwoIntegers);

        float mulTwoValues=sp.multipFloatValues(3.1f,4.2f);
        System.out.println("the product is ::"+mulTwoValues);

        sp.charToASCII('C');

        sp.divide(31,5);

        sp.swap();

        sp.oddOrEven(77);

        sp.vowelOrConsonant('e');
        sp.vowelOrConsonant('k');

        sp.largestNumber(90,45,89);

        sp.positiveOrNegative(-8);


        sp.alphabetOrNot('B');
        sp.alphabetOrNot('j');

        sp.sumOFNaturalNumbers(100);

        sp.factorialFinder(6);

        sp.factorialUsingWhile(5);

        sp.multiplicationTableUsingFor(5);

        sp.fibonacciSeries(10);

        sp.printAlphabet();

        sp.countDigits(1234);

        sp.powerUsingFor(3,4);

        sp.powerUsingPowFunc(3,4);

        sp.isprime(31);

        sp.factors(60);

        int value=sp.factorialUsingRecursion(5);
        System.out.println("the factorial of "+value+" is"+value);


        sp.frequencyOfChar();

        sp.countVowelsDigitsSpaces();


    }
}
