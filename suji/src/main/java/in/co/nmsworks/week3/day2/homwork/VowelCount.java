package in.co.nmsworks.week3.day2.homwork;

public class VowelCount {
    public static void main(String[] args) {
        char[] arr = {'a', 'h', 'i', 'o', 'r', 'd', 'g', 'j'};
        int vowelCount = 0;

        for (char c : arr) {
            if (isVowel(c)) {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }

    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
