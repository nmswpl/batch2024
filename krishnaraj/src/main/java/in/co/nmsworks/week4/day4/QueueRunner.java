package in.co.nmsworks.week4.day4;

public class QueueRunner {
    public static void main(String[] args) {
        QueueList queueList = new QueueList();
        queueList.add(1);
        queueList.add(2);
        queueList.add(3);
        queueList.add(4);
        System.out.println("Queue list size : " +queueList.size());
        queueList.printQueue();
        queueList.remove();
        System.out.println("After the deletion : ");
        queueList.printQueue();
    }
}
