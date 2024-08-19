package in.co.nmsworks.weekend;

public class Q3 {
    public void evenLength(String a){
        String[] array = a.split(" ");
        for (int i = 0; i <= array.length - 1; i++) {
            if ((array[i].length()) % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}