package in.co.nmsworks.week3.assessment.day6;

public class PracticeQuestion6 {

        public static void main(String[] args) {
            String input = "Hello, World!";

            String reversed = reverseString(input);


            System.out.println("Original String: " + input);
            System.out.println("Reversed String: " + reversed);
        }

        public static String reverseString(String str) {

            StringBuilder reversed = new StringBuilder();


            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
            }

            return reversed.toString();
        }
    }


