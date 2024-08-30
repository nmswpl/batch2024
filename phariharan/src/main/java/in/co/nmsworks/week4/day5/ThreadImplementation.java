package in.co.nmsworks.week4.day5;

public class ThreadImplementation extends Thread{
    int a;
    ThreadImplementation(int a){
        this.a = a;
    }
    @Override
    public void run() {
        System.out.println("Thread ---- :"+a);
        try {
            Thread.sleep(a * 10000L);
            System.out.println("Thread 1 after wait   - "+a);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ThreadImplementation t1 = new ThreadImplementation(10);
        ThreadImplementation t2 = new ThreadImplementation(5);
        t1.start();
        t2.start();
        System.out.println("thread called");

//        ExecutorService service = Executors.newFixedThreadPool(2);    To create a pool
//        service.submit();  to submit task to pool
//        Future<Dtype> future = service.submit
    }
}
