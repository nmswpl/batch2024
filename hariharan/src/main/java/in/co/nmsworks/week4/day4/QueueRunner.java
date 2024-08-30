package in.co.nmsworks.week4.day4;


public class QueueRunner
{
    public static void main(String[] args) {

        QueueList<Integer> queueList = new QueueList<Integer>();

        queueList.enqueue(10);
        queueList.enqueue(20);
        queueList.enqueue(30);
        queueList.enqueue(40);

        queueList.printQueue();
        System.out.println("Size of Queue :"+queueList.getQueueSize());

        System.out.println("Removed Element :"+queueList.dequue());
        System.out.println("Removed Element :"+queueList.dequue());

        queueList.printQueue();
        System.out.println(queueList.getQueueSize());


    }
}
