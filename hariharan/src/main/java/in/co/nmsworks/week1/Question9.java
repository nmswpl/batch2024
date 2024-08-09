package in.co.nmsworks.week1;

//Alphabet pattern 1

public class Question9 {

    public static void main(String[] args) {

        int x = 1;

        for (int i = 65 ; i <= 71; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print((char) i);
            }
            System.out.println(" ");
            x++;


        }


    }

}
