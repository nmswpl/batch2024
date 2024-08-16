package in.co.nmsworks.week1;
/*9. Write a Java method to find the longest word in a given sentence.
        Input: "The quick brown fox jumps over the lazy dog"
Output: "jumps"*/
public class Training9 {
    public void getLongestWord(String s){
        String arr[]  = s.split(" ");
        String longString = arr[0];

        for(int i=0;i<= arr.length-1;i++) {

            if (arr[i].length() >= arr[0].length()) {
                longString = arr[i];
            }

        }
            System.out.println("The longest word is: "+longString);

    }
}
