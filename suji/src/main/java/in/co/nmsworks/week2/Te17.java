package in.co.nmsworks.week2;

//Given an array of integer, Write a Program to find the largest element in the given
//array.
//For E.g Input : arr[] = {12, 3, 20, 14} Output : Largest element = 20

class Te17
{
    public Te17()
    {
        int []arr= {12, 30, 20, 14} ;
        int bigNum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>bigNum)
            {
                bigNum=arr[i];
            }
        }
        System.out.println(" The largesr num is "+bigNum);
    }
}