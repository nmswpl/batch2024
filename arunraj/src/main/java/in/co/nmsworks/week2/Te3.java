package in.co.nmsworks.week2;

/*3. Write a program to multiply two arrays of same size element-by-element.
        E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7*/

public class Te3 {
    public void multiplyArray(){
        int[] arr1={2,4,1};
        int[] arr2={3,5,7};
        int n=arr1[0]*arr2[0];
        int m=arr1[1]*arr2[1];
        int s=arr1[2]*arr2[2];
        System.out.println(n+" "+m+" "+s);
    }
}
