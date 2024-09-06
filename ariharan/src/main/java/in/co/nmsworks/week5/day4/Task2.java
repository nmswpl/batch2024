package in.co.nmsworks.week5.day4;

public class Task2 implements Runnable{
    int value;

    public Task2( int value ){
        this.value = value;
    }

    @Override
    public void run(){
        try {
            while (value!=0){
                System.out.println("task 2 : " + --value);
                Thread.sleep(6000);
            }
        }catch (Exception e){
            System.out.println("task 2 was interrupt");
        }

    }
}