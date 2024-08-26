package in.co.nmsworks.week3.assessment.day6;

public class PracticeQuestion7 {

        public static void main(String[] args) {
            String input = "Hello, how are you?";

            String result = removeSpaces(input);
            System.out.println("Original String: \"" + input + "\"");
            System.out.println("String without spaces: \"" + result + "\"");
        }

        public static String removeSpaces(String str) {
            return str.replace(" ", "");
        }
    }


