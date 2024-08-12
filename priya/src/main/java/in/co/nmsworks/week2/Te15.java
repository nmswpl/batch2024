package in.co.nmsworks.week2;

public class Te15 {
    public void printOddCount(int[] arr){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(i%2==0){
                System.out.println(i);
                count++;
            }

        }
        System.out.println("The even count is"+ count);
    }
}
