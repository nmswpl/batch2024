package in.co.nmsworks.week3.day4;
//Implement the algorithm to find the min and max elements in an array of integers.

public class Program4 {
    public static void main(String[] args) {
        new Program4().minAndMax(31,5,66,77,33,22);
    }
    public void minAndMax(int... arr){
        int min=arr[1],max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("maximum in th Array::"+max);
        System.out.println("minimum in th Array::"+min);
    }
}
