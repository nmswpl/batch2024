package in.co.nmsworks.week2;
/*17. Given an array of integer, Write a Program to find the largest element in the given
array.
For E.g Input : arr[] = {12, 3, 20, 14} Output : Largest element = 20*/
public class Te17 {
    public void maxArray(int[] arr){
      int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>=max){
                max = arr[i];
            }

        }
        System.out.println("Largest Element = "+max);

    }
}
