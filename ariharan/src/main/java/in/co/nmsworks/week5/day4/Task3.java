package in.co.nmsworks.week5.day4;

public class Task3 implements Runnable{
    int value;

    public Task3( int value ){
        this.value = value;
    }

    @Override
    public void run(){
        try {
            while (value<800){
                value = value * 2;
                System.out.println("task 3 : " + value);
                Thread.sleep(10000);
            }
        }catch (Exception e){
            System.out.println("task 3 was interrupt");
        }

    }
}