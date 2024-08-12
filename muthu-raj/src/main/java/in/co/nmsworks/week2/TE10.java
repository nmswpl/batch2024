package in.co.nmsworks.week2;

public class TE10 {

    public void divisibleBySeven(){
        int start = 200;
        int end = 500;

        for (int i = start; i < end; i++) {

            if(i % 10 == 7){
                System.out.println(i);
            }

        }
    }
}
