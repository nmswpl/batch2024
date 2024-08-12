package in.co.nmsworks.week2;

public class Training15 {
    public void noOfEvenElements(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("Number of Even Elements: "+count);
    }
}