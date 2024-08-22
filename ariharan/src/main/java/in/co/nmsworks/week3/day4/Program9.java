package in.co.nmsworks.week3.day4;
//Write a program to find the median of an array.
//If the number of elements is odd, the median is the middle element.
//If the number of elements is even, the median is the average of the two middle elements.
public class Program9 {
    public static void main(String[] args) {
        int[] array={4,5,6,7,8,9};
    new Program9().medianOfArray(array);
    }
    public void medianOfArray(int[] arr){
        if(arr.length%2==1){
            int median=arr.length/2;
            System.out.println("the median of the array is::"+arr[median]);
        }else{
            int mead=arr.length/2;
            System.out.println(mead);
            int avg=(arr[mead]+arr[mead-1])/2;
            System.out.println("the median of the Array is::"+avg);
        }
    }
}
