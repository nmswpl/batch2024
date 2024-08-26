package in.co.nmsworks.week3.day3hw;
//1.Write a Program to Print an Integer entered by the User.
//2.Write a Program to Add Two Integers.
//3. Write a program to Multiply Two Floating-Point Numbers
//4. Write a program to Find ASCII value of a character
//5. Write a program to Compute Quotient and Remainder.
//6.Write a program to Swap two numbers using temporary variable
//7.Check whether a number is even or odd using if...else statement
//8. Write a program to Check whether an alphabet is vowel or consonant using if..else statement
//9. Write a program to Find Largest Among three numbers using if..else statement.
//10. Write a program to Check if a Number is Positive or Negative using if else
//11. Write a program to Check Alphabet using if else
//12.Write a program to find the Sum of Natural Numbers using for loop
//13.Write a program to Find Factorial of a number using for loop
//14.Write a program to Find Factorial of a number using while loop
//15.Generate Multiplication Table using for loop table(15)
//16. Display Fibonacci Series Using for Loop
//17. Print lowercase alphabet using for loop
//18. Count Number of Digits in an Integer using while loop
//19.Calculate the power of a number using a for loop. (E.g : 2 power 3 is 8 [2 x 2 x 2])
//20.Calculate the power of a number using pow() function
//21.Write a program to Check Prime Number using a for loop
//22.Write a program to find Factors of a Positive Integer
//23.Write a program to find Factorial of a Number Using Recursion
//24.Write a program to find Frequency of Character
//25.Write a program to count vowels, consonants, digits, and spaces


public class Samples {

    public void printIntByUse( int a){

        System.out.println("you entered a number:: " + a);

    }

    public void add2Int(int a, int b){
        System.out.println("The sum is ::"+(a+b));
    }

    public void multiply2Num(float a,float b){
        System.out.println("The product is::"+(a*b));
    }

    public void asciiValues(char ch){

        System.out.println((int)ch);
    }

    public void quoRem(int a,int b){
        System.out.println("The Quotient:: "+(a/b));
        System.out.println("The Remainder:: "+a%b);
    }

    public void swap2Nums(int num1,int num2){
        System.out.println("before swap "+num1+"::"+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("after swap "+num1+"::"+num2);
    }

    public void oddEven(int num){
        if(num % 2 ==0){
            System.out.println(num+" is a even number");
        }else{
            System.out.println(num+" is a odd number");
        }
    }

    public void vowelConso(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println(ch+" is a vowel");
        }else{
            System.out.println(ch+" is a consonants");
        }
    }

    public void largestNum(int num1,int num2,int num3){
        if(num1>num2 && num1>num3){
            System.out.println(num1+" is a largest number ");
        } else if(num2>num1 && num2>num3) {
            System.out.println(num2 + " is a largest number ");
        }else{
            System.out.println(num3 + " is a largest number ");
        }
    }

    public void posiNeg(int num){
        if(num < 0){
            System.out.println(num+" is a negative number");
        }else  if(num > 0) {
            System.out.println(num + " is a positive number");
        }else{
            System.out.println(num+" is zero");
        }
    }

    public void isAlphabet(char ch){
        if(ch > 'a' && ch < 'z'|| ch > 'A' && ch < 'Z' ){
            System.out.println(ch+ " is a Alphabet");
        }else{
            System.out.println(ch+ " is not a Alphabet");
        }
    }

    public void sumNaturalNum(int num){
        int sum = 0;
        for(int i = 1;i <= num;i++){
            sum = sum+i;
        }System.out.println("sum"+sum);
    }

    public void factorialForLoop(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        } System.out.println("The Factorial of "+num+" is "+fact);
    }

    public void factorialWhileLoop(int num){
        int fact = 1;
        int i = 1;
        while( i <=  num){
            fact = fact * i;
            i++;
        } System.out.println("The Factorial of "+num+" is "+fact);
    }

    public void table(int num){
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num+" x "+i+" = "+(i * num) );
        }
    }

    public void fibonacci(int num){
        int num1 = 0;
        int num2 = 1;
        System.out.print("The fibonacci series of  " +num+" is "+num1+","+num2);
        for (int i = 2; i <= num ; i++) {
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(","+num3);
        }
    }

    public void lowercaseAlphabet(){
        for (int i = 97; i < 123; i++) {
            System.out.print((char)i+" ");
        }
    }

    public void countNumOfDigit(int num){
        int count = 0;
        while (num != 0){
            num = num / 10;
            count++;

        }
        System.out.println("The number of digits "+count);
    }
    public void powNu(int base,int pow){
        int result = 1;
        for (int i = 0; i < pow ; i++) {
            result = result * base;
        }
        System.out.println("Answer for power of "+base+"::"+result);
    }

    public void isPrime(int num){
        int count=0;
        for(int i = 1;i <= num;i++){
            if(num % i == 0 ){
                count++;
            }
        }
        if(count==2){
            System.out.println(num+" is prime");
        }else{
            System.out.println(num+" is not Prime");
        }
    }

    public void factorsOfInteger(int num){
        for (int i = 1; i <= num ; i++) {
            if(num % i == 0){
                System.out.print(i+" ");
            }
        }
    }
    public static int factorial(int num){
        if(num != 0){
            return num * factorial(num-1);
        }else{
            return 1;
        }
    }

    public void frequencyOfChar(String str,char ch) {
        int frequency = 0;
        for (int i = 0; i < str.length() ; i++) {
            if(ch == str.charAt(i)){
                frequency++;
            }
        }
        System.out.println("The frequency of "+ch+" is "+frequency);
    }

    public void typeCounter(String str){
        int vowel = 0;
        int consonant= 0;
        int digit = 0;
        int space = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
                vowel++;
            }else if(ch >= 'a' && ch <= 'z'){
                consonant++;
            }else if(ch >= '0'&& ch <= '9'  ){
                digit++;
            }else if(ch == ' '){
                 space++;
             }
        }
        System.out.println("The vowel count :: "+vowel);
        System.out.println("The consonant count :: "+consonant);
        System.out.println("The digits count :: "+digit);
        System.out.println("The space count :: "+space);
    }

    public static void main(String[] args) {
        Samples samples1 = new Samples();
        samples1.printIntByUse(10);
        samples1.add2Int(10,20);
        samples1.multiply2Num(10.3f,2.3f);
        samples1.asciiValues('u');
        samples1.quoRem(55,7);
        samples1.swap2Nums(12,13);
        samples1.oddEven(57);
        samples1.vowelConso('t');
        samples1.largestNum(23,56,78);
        samples1.posiNeg(-1);
        samples1.isAlphabet('F');
        samples1.sumNaturalNum(5);
        samples1.factorialForLoop(5);
        samples1.factorialWhileLoop(6);
        samples1.table(5);
        samples1.fibonacci(5);
        System.out.println("");
        samples1.lowercaseAlphabet();
        System.out.println("");
        samples1.countNumOfDigit(123);
        samples1.powNu(2,3);
        samples1.isPrime(1);
        samples1.factorsOfInteger(60);
        System.out.println("");
        samples1.typeCounter("This website is aw3som3");
        samples1.frequencyOfChar("This website is awesome.",'e');
        int result = factorial(5);
        System.out.println("The factorial of a number ::"+ result);
    }



}
