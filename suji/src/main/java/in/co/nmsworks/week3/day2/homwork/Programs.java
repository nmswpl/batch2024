package in.co.nmsworks.week3.day2.homwork;

import java.util.*;

     class PrintInteger {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            System.out.println("You entered: " + number);
        }
    }


class AddIntegers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter two numbers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int sum = num1 + num2;

            System.out.println("The sum is: " + sum);
        }
    }



class Multiply{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter two floating-point numbers: ");
            float num1 = scanner.nextFloat();
            float num2 = scanner.nextFloat();

            float product = num1 * num2;

            System.out.println("The product is: " + product);
        }
    }

     class FindASCIIValue {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a character: ");
            char ch = scanner.next().charAt(0);

            int asciiValue = (int) ch;

            System.out.println("The ASCII value of " + ch + " is: " + asciiValue);
        }
    }
class QuotientRemainder {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the dividend: ");
            int dividend = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        }
    }

   class SwapNumbers {
        public static void main(String[] args) {
            double firstNumber = 1.2;
            double secondNumber = 2.45;

            System.out.println("--Before swap--");
            System.out.println("First number = " + firstNumber);
            System.out.println("Second number = " + secondNumber);

            // Swap using a temporary variable
            double temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;

            System.out.println("--After swap--");
            System.out.println("First number = " + firstNumber);
            System.out.println("Second number = " + secondNumber);
        }
    }

  class EvenOrOdd {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        }
    }

   class VowelOrConsonant {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a character: ");
            char ch = scanner.next().charAt(0);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    System.out.println(ch + " is a vowel");
                } else {
                    System.out.println(ch + " is a consonant");
                }
            } else {
                System.out.println(ch + " is not an alphabet");
            }
        }
    }
class FindLargest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter three numbers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            int largest = num1;
            if (num2 > largest) {
                largest = num2;
            }
            if (num3 > largest) {
                largest = num3;
            }

            System.out.println("The largest number is: " + largest);
        }
    }


   class Numbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println(number + " is positive");
            } else if (number < 0) {
                System.out.println(number + " is negative");
            } else {
                System.out.println(number + " is zero");
            }
        }
    }
 class CheckAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println(ch + " is an alphabet");
        } else {
            System.out.println(ch + " is not an alphabet");
        }
    }
}

class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}

class Factorial
{
    public static void main(String[] args) {
        int n=6;
        int fact=1;
        for (int i = 1; i <=n; i++)
        {
            fact=fact*i;
        }
        System.out.println("fact "+fact);

    }
}

class FactorialUsingWhile{
    public static void main(String[] args) {
        int n=6;
        int fact=1;
        while(n!=0)
        {
            fact=fact*n;
            n--;
        }
        System.out.println("Factorial :: "+fact);
    }
}

