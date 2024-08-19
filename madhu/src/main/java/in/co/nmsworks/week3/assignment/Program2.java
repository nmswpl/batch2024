package in.co.nmsworks.week3.assignment;

public class Program2 {
    public void evenElements(){
        int count = 0;
        int arr[] = {1,2,3,4,5,6,7,8};
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]%2 == 0)
            {
            count++;
            }
        }
        System.out.println(count);
    }
}
