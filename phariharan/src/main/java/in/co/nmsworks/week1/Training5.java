package in.co.nmsworks.week1;

public class Training5 {
    public void sentanceDivider(String paragraph){
        String[] array = paragraph.split("\\.");
        int i = 0;
        System.out.println(paragraph+"\n");
        while (i <= array.length-1) {
            System.out.println(array[i] + " ");
            i++;
        }
    }
}
