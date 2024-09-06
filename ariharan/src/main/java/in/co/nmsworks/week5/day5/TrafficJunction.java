package in.co.nmsworks.week5.day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TrafficJunction {
    public static void main( String[] args ){
        int count=0;
        AddVechicles north=new AddVechicles("north");
        AddVechicles south=new AddVechicles("south");
        AddVechicles east=new AddVechicles("East");
        AddVechicles west=new AddVechicles("West");
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        executorService.submit(north);
        executorService.submit(south);
        executorService.submit(east);
        executorService.submit(west);
        RemoveVechicles removeVechicles=new RemoveVechicles(north.vechicles,north.name);
        RemoveVechicles removeVechicles1=new RemoveVechicles(south.vechicles,south.name);
        RemoveVechicles removeVechicles2=new RemoveVechicles(east.vechicles,east.name);
        RemoveVechicles removeVechicles3=new RemoveVechicles(west.vechicles,west.name);
        while (count<10){
            executorService.submit(removeVechicles);
            executorService.submit(removeVechicles1);
            executorService.submit(removeVechicles2);
            executorService.submit(removeVechicles3);
            count++;
        }
        executorService.shutdown();
    }
}
