package in.co.nmsworks.week2;

public class Training10 {
    public void printEndWithSeven(){
        for (int i = 200; i < 500; i++) {
            if(i % 10 == 7) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }
}