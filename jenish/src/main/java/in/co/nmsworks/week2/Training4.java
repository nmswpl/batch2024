package in.co.nmsworks.week2;

public class Training4 {
    public void findElement(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println("Element found at index: "+i);
            }
        }
    }
}