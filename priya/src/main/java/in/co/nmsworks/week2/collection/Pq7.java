package in.co.nmsworks.week2.collection;
import java.util.ArrayList;
import java.util.List;
public class Pq7 {
    public void search(int element){
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        int position=-1;
        for (int i = 0; i < li.size(); i++) {
            if(li.get(i).equals(element)){
                position = i;
                position++;

            }
        }
        System.out.println("The position of "+ element+" is "+position);
    }
}
