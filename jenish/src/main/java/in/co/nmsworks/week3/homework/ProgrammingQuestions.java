package in.co.nmsworks.week3.homework;

public class ProgrammingQuestions {
    public void printAnInteger(int num){
        System.out.println("You entered: "+ num);
    }

    public void add(int a, int b){
        System.out.println("The sum is: "+ a + b);
    }

    public void multiply(float a, float b){
        System.out.println("The product is: "+ a * b);
    }

    public void findAscii(char ch){
        System.out.println("Ascii value is: "+ (int) ch);
    }

    public void compute(int a, int b){
        System.out.println("Quotient: "+ a / b);
        System.out.println("Remainder: "+ a % b);
    }

    public void swapNumbers(int a, int b){
        System.out.println("Before Swap:");
        System.out.println("First number: "+a+" Second number: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap:");
        System.out.println("First number: "+a+" Second number: "+b);
    }

    public void evenOrOdd(int num){
        if(num % 2 == 0){
            System.out.println(num+" is even");
        }
        else {
            System.out.println(num+" is odd");
        }
    }

    public void vowelOrConsonant(char ch){
        ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch+" is an vowel");
        }
        else {
            System.out.println(ch+" is a consonant");
        }
    }

    public void largestNumber(int a, int b, int c){
        if(a > b && a > c){
            System.out.println(a+" is the largest number");
        }
        else if(b > c){
            System.out.println(b+" is the largest number");
        }
        else {
            System.out.println(c+" is the largest number");
        }
    }

    public void positiveOrNegative(int num){
        if (num == 0) {
            System.out.println(num+" is a neutral");
        } else if (num > 0) {
            System.out.println(num + " is a positive number");
        }
        else {
            System.out.println(num+" is a negative number");
        }
    }

    public void checkAlphabet(char ch){
        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch+" is an alphabet");
        }
        else{
            System.out.println(ch+" is not an alphabet");
        }
    }

    public void sumOfNaturalNumbers(int n){
        int sum = n * (n + 1) / 2;
        System.out.println("Sum = "+sum);
    }

    public int factorialUsingFor(int num){
        if(num <= 1){
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= num ; i++) {
            result *= i;
        }
        return result;
    }

    public int factorialUsingWhile(int num){
        if(num <= 1){
            return 1;
        }

        int i = 1;
        int result = 1;
        while (i <= num){
            result *= i;
            i++;
        }
        return result;
    }

    public void multiplicationTable(int num){
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num + " X " +i + " = "+ num * i);
        }
    }

    public void fibonacciSeries(int num){
        int num1 = 0;
        int num2 = 1;
        System.out.println("Fibonacci series till "+num+" terms:");
        for (int i = 1; i <= num ; i++) {
            System.out.print(num1+" ,");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        System.out.println();
    }

    public void printLowercaseLetters(){
        for (int i = 97; i <= 122 ; i++) {
            System.out.print((char) i+" ");
        }
        System.out.println();
    }

    public void countNoOfDigits(int num){
        String num1 = String.valueOf(num);
        System.out.println("Number of digits: "+num1.length());
    }

    public void calculatePower(int base, int power){
        int result = 1;
        for (int i = 1; i <= power ; i++) {
            result *= base;
        }
        System.out.println("Answer is "+result);
    }

    public void calculatePowerUsingMath(int base, int power){
        int result = (int) Math.pow(base,power);
        System.out.println("Answer(Math.pow()) is "+result);
    }

    public boolean checkPrime(int num){
        if(num <= 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(num) ; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public void findFactors(int num){
        System.out.println("Factors of "+num+" are:");
        for (int i = 1; i <= num ; i++) {
            if(num % i == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public int factorialUsingRecursion(int num){
        if(num <= 1){
            return 1;
        }
        return num * factorialUsingRecursion(num - 1);
    }

    public void frequencyOfCharacter(String sentence, char element){
        int count = 0;
        for (int i = 0; i < sentence.length() ; i++) {
            if(sentence.charAt(i) == 'e'){
                count++;
            }
        }
        System.out.println("The frequency of "+element+" is "+count);
    }

    public void countVowelsAndConsonants(String sentence){
        int vowelsCount = 0;
        int digitsCount = 0;
        int spaceCount = 0;
        int consonantCount = 0;

        for(char ch: sentence.toLowerCase().toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowelsCount++;
                }
                else{
                    consonantCount++;
                }
            }
            else if(ch >= '0' && ch <= '9'){
                digitsCount++;
            }
            else if(ch == ' '){
                spaceCount++;
            }
        }

        System.out.println("Vowels count :: "+vowelsCount);
        System.out.println("Consonant count :: "+consonantCount);
        System.out.println("Digits count :: "+digitsCount);
        System.out.println("Space count :: "+spaceCount);
    }

    public static void main(String[] args) {
        ProgrammingQuestions pq = new ProgrammingQuestions();
        pq.printAnInteger(3);
        pq.add(4,3);
        pq.multiply(4.5f,7.3f);
        pq.findAscii('A');
        pq.compute(6,2);
        pq.swapNumbers(7,4);
        pq.evenOrOdd(8);
        pq.vowelOrConsonant('u');
        pq.largestNumber(7,6,4);
        pq.positiveOrNegative(11);
        pq.checkAlphabet('J');
        pq.sumOfNaturalNumbers(100);
        int ans = pq.factorialUsingFor(5);
        System.out.println("Factorial(for) is "+ans);
        int ans1 = pq.factorialUsingWhile(6);
        System.out.println("Factorial(while) is "+ans1);
        pq.multiplicationTable(5);
        pq.fibonacciSeries(10);
        pq.printLowercaseLetters();
        pq.countNoOfDigits(1543);
        pq.calculatePower(2,3);
        pq.calculatePowerUsingMath(2,4);
        if(pq.checkPrime(7)){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
        pq.findFactors(60);
        int result = pq.factorialUsingRecursion(5);
        System.out.println("Factorial(using recursion) is "+result);
        pq.frequencyOfCharacter("This website is awesome", 'e');
        pq.countVowelsAndConsonants("This website is aw3som3.");
    }
}