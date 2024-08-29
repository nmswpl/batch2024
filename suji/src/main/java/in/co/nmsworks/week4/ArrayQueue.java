package in.co.nmsworks.week4;

public class ArrayQueue implements Queue
{
    int front=0;
    int rear=-1;
    int pointer;
    int newElement;
    int size=5;
    int q[]=new int[5];


    @Override
    public void addElement(int newElement)
    {
        if(rear==size)
        {
            System.out.println(" OVERFLOW ");
        }
        else
        {
            ++rear;
           q[rear]=newElement;
        }
    }

    @Override
    public void deleteElement()
    {
        if ((front == -1) && (rear == -1))
        {
            System.out.println(" UNDERFLOW ");
        }
       else
        {
          /*  pointer = q[front];
            if (front == rear)
            {
                front = -1;
                rear = -1;
            } else
            { */
            System.out.println(" Q removes :: "+q[front]);

              front=front+1;

            }
      //  }
    }
    public void display() {

           for (int i=front;i<=rear;i++)
           {
               System.out.println(q[i]);
           }
        }


    public static void main(String[] args)
    {
        ArrayQueue obj= new ArrayQueue();
        obj.addElement(56);
        obj.addElement(40);
        obj.addElement(78);
        obj.deleteElement();
        obj.display();
    }
}