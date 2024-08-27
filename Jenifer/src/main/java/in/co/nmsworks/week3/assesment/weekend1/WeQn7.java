package in.co.nmsworks.week3.assesment.weekend1;
// Write a program that removes all spaces from a given string and prints the result.

public class WeQn7 {
    public void removeSpace(String string){
        String remSpaceString = "";
        String[] array = string.split(" ");
        for (int i = 0; i < array.length; i++) {
            remSpaceString += array[i];
        }
        String result = remSpaceString.trim();
        System.out.println("Space removed String : " + result);
    }
}
