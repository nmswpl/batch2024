package in.co.nmsworks.week2;
/*
Write a program to multiply two arrays of same size element-by-element.
E.g : Input :
arr1 = {2,4,1}
arr2={3,5,7}
Output : 6 20 7
 */

public class Question3 {

    public void multiplyarrays()
    {
        int arr[] = {2,4,1};
        int arr2[] = {3,5,7};
        for(int i = 0; i < arr.length;i++)
        {
            int j;
           for(j = i;j<arr2.length;j++)
           {
               System.out.println(arr[i]*arr2[j]);
           }

        }
    }
}
