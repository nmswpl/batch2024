package in.co.nmsworks.week2;

public class Training12 {
    public void noOfOddElements(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        System.out.println("Number of Odd Elements: "+count);
    }
}