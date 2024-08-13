package in.co.nmsworks.week2;

//Given an array of integers and int x, Write a Program to print no of occurance of x in
//the array
//For E.g Input: arr[] = {1, 2, 3, 2, 2, 3}, x = 2; Output: 3 Reason: x (2) occurs 3
//times in array


class Te18
{
    int x;
    public Te18(int x)
    {
        this.x=x;
        int []arr={1, 2, 3, 2, 2, 3};
        int p=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                p=p+1;
            }
        }
        System.out.println(" The freq of the number  "+x+"  is  "+p);
    }
}
