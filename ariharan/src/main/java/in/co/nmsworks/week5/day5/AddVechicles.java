package in.co.nmsworks.week5.day5;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AddVechicles implements Runnable{
   List<Integer> vechicles=new CopyOnWriteArrayList<>();
   LocalDateTime time;
    Random rand = new Random();
    String name;
    int vechicle=0;
    private int getRandomNumber()
    {
        return rand.nextInt(10) + 1;
    }

    public AddVechicles(String name){
        this.name=name;
//        Road obj=new Road(name,vechicles);
    }

    @Override
    public void run(){
            while(true){
                time=LocalDateTime.now();
                int random=getRandomNumber();
                for (int i = 1; i <=random ; i++) {
                    vechicles.add(++vechicle);
                }
                try {
                    System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond()+" ::"+"added list :"+ name +": "+vechicles);
                    Thread.sleep(10000);

                }catch (Exception e){
                    e.printStackTrace();
                }


            }
    }
}
