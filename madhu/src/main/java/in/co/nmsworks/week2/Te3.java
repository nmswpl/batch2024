package in.co.nmsworks.week2;
/*Write a program to multiply two arrays of same size element-by-element.
E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7 */
public class Te3{
    public static void main(String[] args){
        int arr1[] = {1,2,3};
        int arr2[] = {4,5,6};
        for(int i = 0; i < arr1.length; i++){
            int j;
            for(j =0; j < arr2.length;j++){
                System.out.println(arr1[i] * arr2[i]);
            }
        }
    }
}