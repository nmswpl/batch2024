package in.co.nmsworks.week2;
//Write a program to print the multiplication table of 17 upto 10 numbers.
//Expected Output : 17 x 1 = 17 ...... 17 x 10 = 170
public class Te6 {
    public void multiply(){
        int table=17;
        for (int i = 0; i < 11; i++) {
            int mul=table*i;
            System.out.println(table+ "x" + i +"=" +mul);


        }
    }
}
