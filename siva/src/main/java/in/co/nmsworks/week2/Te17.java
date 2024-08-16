package in.co.nmsworks.week2;

public class Te17 {
    public void larElemOfArr(int arr[]){
        int max=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("the largest element in th array is "+max);
    }
}
