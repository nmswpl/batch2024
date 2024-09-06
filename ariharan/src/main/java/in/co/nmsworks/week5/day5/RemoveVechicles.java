package in.co.nmsworks.week5.day5;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RemoveVechicles implements Runnable {
    List<Integer> vechicles=new CopyOnWriteArrayList<>();
    LocalDateTime time;
    String name;

    public RemoveVechicles( List<Integer> vechicles ,String name){
        this.vechicles = vechicles;
        this.name=name;
    }

    @Override
    public void run(){
        time=LocalDateTime.now();
        int removeSize=0;
        if(vechicles.size()>=50)
            removeSize=vechicles.size()/2;
        else
            removeSize=vechicles.size()/2;
        for (int i = 0; i < removeSize; i++) {
            vechicles.remove(0);
        }
        try{
            System.out.println(time.getHour() +":"+time.getMinute()+":"+time.getSecond()+" :: "+"remove :"+name+" :"+vechicles);
            Thread.sleep(5000);

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
