package in.co.nmsworks.week1;

public class Training3 {
    public void toFindEvenLenWord(String s) {
        String[] arr = s.split(" ");
        for (String string : arr) {
            if ((string.length()) % 2 == 0) {
                System.out.println(string);
            }
        }
    }
}