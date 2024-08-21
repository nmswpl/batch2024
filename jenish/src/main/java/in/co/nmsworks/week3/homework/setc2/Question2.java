package in.co.nmsworks.week3.homework.setc2;

public class Question2 {
    public void countNoOfVowels(char[] chars){
        int vowelsCount = 0;
        for (char ch : chars) {
            ch = Character.toLowerCase(ch);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelsCount++;
            }
        }
        System.out.println("Number of vowels in the array :: "+vowelsCount);
    }

    public static void main(String[] args) {
        Question2 q2 = new Question2();
        q2.countNoOfVowels(new char[]{'w', 'e', 'i', 'o', 's', 'v', 'b'});
    }
}