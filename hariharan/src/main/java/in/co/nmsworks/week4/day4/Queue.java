package in.co.nmsworks.week4.day4;

public interface Queue<T> {
     void enqueue(T number);
     T dequue();
     void printQueue();
     int getQueueSize();
}
