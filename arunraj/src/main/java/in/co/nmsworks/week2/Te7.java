package in.co.nmsworks.week2;

/*Write a program to print the square of every element present in the array.
E.g : Input : arr1 = {2, 4, 3, 5} Output : 4 16 9 25*/

public class Te7 {
    public void square(){
        int[] arr={2,4,3,5};
        for(int i=0;i<arr.length;i++){
            int n;
            n=arr[i]*arr[i];
            System.out.print(n+" ");
        }
        System.out.println();
    }
}
