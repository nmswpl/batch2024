package in.co.nmsworks.weekend;

public class Q5 {
    public void paragraphSplitter(String paragraph){
        String[] array = paragraph.split("\\.");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");

        }

    }
}
