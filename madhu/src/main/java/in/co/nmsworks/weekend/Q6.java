package in.co.nmsworks.weekend;

public class Q6 {
    public void vowelsConsonats(String str){
        int vowels = 0;
        int consonants = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }
}
