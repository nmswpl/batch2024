package in.co.nmsworks.weekend;

public class Q14 {
    public void consonantsVowels(String str) {
        int vowels = 0;
        int consonats = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonats++;
            }

        } System.out.println(vowels);
        System.out.println(consonats);
    }
}
