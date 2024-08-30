package in.co.nmsworks.week4.day5;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;

public class QueueInList <T> {
        private List<T> list;

        public QueueInList() {
            list = new ArrayList<>();;
        }

        public void enqueue(T value){
            list.add(value);
        }
        public T dequeue(){
           return list.remove(0);
        }
        public Integer size(){
            return list.size();
        }
        public void print(){
            for (T t : list) {
                System.out.print(t+" ");
            }
        }
        public void peek(){
            System.out.println(list.get(0));
        }

}




