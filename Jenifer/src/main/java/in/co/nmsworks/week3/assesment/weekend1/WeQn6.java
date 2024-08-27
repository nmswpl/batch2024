package in.co.nmsworks.week3.assesment.weekend1;
// Write a program that reverses a given string without using built-in reverse methods.

public class WeQn6 {
    public void stringReverse(String string){
        String revString = "";
        for (int i = string.length()-1; i >= 0; i--) {
            revString += string.charAt(i);
        }
        System.out.println("Reversed String : " +revString);
    }
}
