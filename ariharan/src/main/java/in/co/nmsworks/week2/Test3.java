package in.co.nmsworks.week2;
//Write a program to multiply two arrays of same size element-by-element.
//        E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7

public class Test3 {
    public void multipyArray(int arr1[],int arr2[]){
        int len=arr2.length;
        for (int i = 0; i <len ; i++) {
            int mul=arr1[i]*arr2[i];
            System.out.print(mul+ " ");
        }

    }
}
