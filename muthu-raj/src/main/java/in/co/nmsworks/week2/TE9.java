package in.co.nmsworks.week2;

public class TE9 {

    public void divisibleByThree() {
        int start = 300;
        int end = 400;

        for (int i = start; i < end; i++) {
            if (i % 3 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
