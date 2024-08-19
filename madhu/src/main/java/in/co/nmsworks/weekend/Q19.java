package in.co.nmsworks.weekend;

public class Q19 {
    int count = 0;
    public void endingWith7() {
        for (int i = 200; i <= 500; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
