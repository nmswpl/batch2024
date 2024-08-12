package in.co.nmsworks.week2;

public class TE10 {

    public void divisibleBySeven(){
        int start = 200;
        int end = 500;

        for (int i = start; i < end; i++) {

            if(String.valueOf(i).charAt(2) == '7'){
                System.out.println(i);
            }

        }
    }
}
