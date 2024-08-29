package in.co.nmsworks.week4;

public class ArrayStack implements Stack
{
    int size=0;
    int arr[]=new int[5];


    @Override
    public void push(int n)
    {

      arr[size]=n;
        size++;

    }

    @Override
    public void pop()
    {
      arr[size-1]=arr[size];
    }

    @Override
    public void display()
    {
        for (int i =  arr.length-1; i >=0; i--)
        {
            if (arr[i] != 0)
            {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        ArrayStack obj=new ArrayStack();

        obj.push(8);
        obj.push(9);
        obj.push(56);
        obj.pop();
        obj.display();
    }
}
