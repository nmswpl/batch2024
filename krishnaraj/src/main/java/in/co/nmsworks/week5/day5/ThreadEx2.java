package in.co.nmsworks.week5.day5;

public class ThreadEx2 implements Runnable{
    public void trialForLoop(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thraed 2 : " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void run() {
        trialForLoop();
    }
}
