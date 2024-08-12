package in.co.nmsworks.week2;

public class Training16 {
    public void findLargest(int[] arr){
        int largest = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.println("Largest Element is "+largest);
    }
}