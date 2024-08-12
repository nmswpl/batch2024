package in.co.nmsworks.week2;

public class Training10 {
    public void printEndWithSeven(){
        for (int i = 200; i < 500; i += 7) {
            if(i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }
}