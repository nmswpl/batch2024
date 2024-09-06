package in.co.nmsworks.week5.day4;

public class Task1 implements Runnable{
    int value;

    public Task1( int value ){
        this.value = value;
    }

    @Override
    public void run(){
        try {
            while (value<20){
                System.out.println("task 1 : " + ++value);
                Thread.sleep(5000);
            }
        }catch (Exception e){
            System.out.println("task 1 was interrupt");
        }

    }
}
