package in.co.nmsworks.week5.day5.junction;

public class RemoveVehicle implements Runnable {

    private Road road1;

    private Road road2;

    private Road road3;

    private Road road4;

    public RemoveVehicle(Road road1, Road road2, Road road3, Road road4) {
        this.road1 = road1;
        this.road2 = road2;
        this.road3 = road3;
        this.road4 = road4;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int second = removeVehicles(road1);
                Thread.sleep(second * 1000);
                second = removeVehicles(road2);
                Thread.sleep(second * 1000);
                second = removeVehicles(road3);
                Thread.sleep(second * 1000);
                second = removeVehicles(road4);
                Thread.sleep(second * 1000);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int removeVehicles(Road road) {
        if (road.getQueue().size() < 10) {
            int seconds = road.getQueue().size();
            System.out.println("\t\t\t\t\t\t\t" + road.getName() + " Road Queue : " + road.getQueue().size() + " Vehicles passed !!!\t& Remaining vehicles count : 0");
            road.getQueue().removeAll(road.getQueue());
            return seconds;
        } else if (road.getQueue().size() < 20) {
            System.out.println("\t\t\t\t\t\t\t" + road.getName() + " Road Queue :  10  Vehicles passed !!!\t& Remaining Vehicles Remaining : " + (road.getQueue().size() - 10));
            for (int i = 0; i < 10; i++) {
                road.getQueue().poll();
            }
            return 10;
        } else if (road.getQueue().size() < 40) {
            System.out.println("\t\t\t\t\t\t\t" + road.getName() + " Road Queue :  20  Vehicles passed !!!\t& Remaining Vehicles Remaining : " + (road.getQueue().size() - 20));
            for (int i = 0; i < 20; i++) {
                road.getQueue().poll();
            }
            return 20;
        } else {
            System.out.println("\t\t\t\t\t\t\t" + road.getName() + " Road Queue :  40  Vehicles passed !!!\t& Remaining Vehicles Remaining : " + (road.getQueue().size() - 40));
            for (int i = 0; i < 40; i++) {
                road.getQueue().poll();
            }
            return 40;
        }
    }
}
