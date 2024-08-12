package in.co.nmsworks.week2;
/*
Write a program to print the position of given element in an array. If not present, print -1
E.g : Input : arr = {7, 15, 41}
Search Element : 41 Output : 2;
Search Element : 5 Output : -1
 */

public class Question4 {
    public void position(int a)
        {
          int arr[]={7,15,41};
          for(int i = 0; i < arr.length;i++)
          {
              int b= arr[i];
              int index=i;
             if(a == b)
             {
                 System.out.println(index);

             }
             else
              {
                  System.out.println(-1);
              }
          }
        }

}
