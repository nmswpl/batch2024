package in.co.nmsworks.week3.assessment.day6;
import java.util.HashSet;
import java.util.Set;

public class PracticeQuestion8 {


        public static void main(String[] args) {

            String input = "sivaasissaiivaaaa";


            String result = findLongestSubstring(input);


            System.out.println("Original String: \"" + input + "\"");
            System.out.println("Longest Substring without Repeating Characters: \"" + result + "\"");
        }

        public static String findLongestSubstring(String str) {
            if (str == null || str.isEmpty()) {
                return "";
            }

            Set<Character> seenChars = new HashSet<>();
            int start = 0;
            int maxLength = 0;
            int maxStart = 0;

            for (int end = 0; end < str.length(); end++) {
                char currentChar = str.charAt(end);


                while (seenChars.contains(currentChar)) {
                    seenChars.remove(str.charAt(start));
                    start++;
                }

                seenChars.add(currentChar);

                if (end - start + 1 > maxLength) {
                    maxLength = end - start + 1;
                    maxStart = start;
                }
            }

            return str.substring(maxStart, maxStart + maxLength);
        }
    }


