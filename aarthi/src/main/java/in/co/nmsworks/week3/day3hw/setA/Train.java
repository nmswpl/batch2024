package in.co.nmsworks.week3.day3hw.setA;

import java.util.HashMap;
import java.util.Map;

/*Create a class Train.
Train should have id,
Name and a Map containing Month and Number of Pasengers travelled per month.
Create atleast 5 Train objects.
*/
public class Train {
    private int trainId;
    private String trainName;
    Map <String,Integer> numOfPassengersPerMonth = new HashMap<>();

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public Map<String, Integer> getNumOfPassengersPerMonth() {
        return numOfPassengersPerMonth;
    }

    public void setNumOfPassengersPerMonth(Map<String, Integer> numOfPassengersPerMonth) {
        this.numOfPassengersPerMonth = numOfPassengersPerMonth;
    }
    public Train (int id, String name, Map<String,Integer> numOfPassengersPerMonth){
        this.trainId = id;
        this.trainName = name;
        this.numOfPassengersPerMonth = numOfPassengersPerMonth;
    }
    public void displayTrainDetails(){
        System.out.println("The name of the Train :: "+ trainName);
        System.out.println("The id of the Train :: "+ trainId);
        System.out.println("The Number of Passengers travel per month ::"+numOfPassengersPerMonth);
    }

    public static void main(String[] args) {
        Map<String,Integer > train1PassengerPerMonth = new HashMap<>();
        train1PassengerPerMonth.put("January",1234);
        train1PassengerPerMonth.put("February",1457);
        train1PassengerPerMonth.put("March",1224);

        Map<String,Integer > train2PassengerPerMonth = new HashMap<>();
        train2PassengerPerMonth.put("January",1859);
        train2PassengerPerMonth.put("February",1875);
        train2PassengerPerMonth.put("March",1086);

        Map<String,Integer > train3PassengerPerMonth = new HashMap<>();
        train3PassengerPerMonth.put("January",1457);
        train3PassengerPerMonth.put("February",1865);
        train3PassengerPerMonth.put("March",1356);

        Map<String,Integer > train4PassengerPerMonth = new HashMap<>();
        train4PassengerPerMonth.put("January",1355);
        train4PassengerPerMonth.put("February",1223);
        train4PassengerPerMonth.put("March",1209);

        Map<String,Integer > train5PassengerPerMonth = new HashMap<>();
        train5PassengerPerMonth.put("January",1355);
        train5PassengerPerMonth.put("February",1223);
        train5PassengerPerMonth.put("March",1209);

        Train train1 = new Train(1,"train01",train1PassengerPerMonth);
        Train train2 = new Train(2,"train02",train2PassengerPerMonth);
        Train train3 = new Train(3,"train03",train3PassengerPerMonth);
        Train train4 = new Train(4,"train04",train4PassengerPerMonth);
        Train train5 = new Train(5,"train05",train5PassengerPerMonth);

        train1.displayTrainDetails();
        train2.displayTrainDetails();
        train3.displayTrainDetails();
        train4.displayTrainDetails();
        train5.displayTrainDetails();






    }
}
