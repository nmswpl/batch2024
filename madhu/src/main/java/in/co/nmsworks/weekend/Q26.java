package in.co.nmsworks.weekend;

public class Q26 {
    public void largestElement(){
        int arr[] = {3,7,9,1};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
