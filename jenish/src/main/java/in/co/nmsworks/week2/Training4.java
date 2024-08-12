package in.co.nmsworks.week2;

public class Training4 {
    public int findElement(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}