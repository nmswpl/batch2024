package in.co.nmsworks.week3.homework.setc2;

import java.util.HashMap;
import java.util.Map;

public class Country {
    private int id;
    private String countryName;
    private Map<String,Integer> noOfPeoplesInState = new HashMap<>();

    public Country(){

    }
    public Country(int id, String countryName){
        this.id = id;
        this.countryName = countryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Map<String, Integer> getNoOfPeoplesInState() {
        return noOfPeoplesInState;
    }

    public void setNoOfPeoplesInState(Map<String, Integer> noOfPeoplesInState) {
        this.noOfPeoplesInState = noOfPeoplesInState;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                ", noOfPeoplesInState=" + noOfPeoplesInState +
                '}';
    }

    public static void main(String[] args) {
       Country india = new Country(1,"India");
       Map<String, Integer> indianStates = new HashMap<>();
       indianStates.put("Tamilnadu",7000000);
       indianStates.put("Andhra", 500000);
       indianStates.put("Kerala",600000);
       indianStates.put("Karnataka",400000);
       india.setNoOfPeoplesInState(indianStates);
       System.out.println(india);

        Country southAfrica = new Country(2,"South Africa");
        Map<String, Integer> southAfricanStates = new HashMap<>();
        southAfricanStates.put("Capetown",70000);
        southAfricanStates.put("Pretoria", 50000);
        southAfricanStates.put("Eastern Cape",60000);
        southAfricanStates.put("Northern Cape",40000);
        southAfrica.setNoOfPeoplesInState(southAfricanStates);
        System.out.println(southAfrica);

        Country australia = new Country(3,"Australia");
        Map<String, Integer> australianStates = new HashMap<>();
        australianStates.put("New South Wales",30000);
        australianStates.put("Victoria", 50000);
        australianStates.put("Queensland",40000);
        australianStates.put("South Australia",20000);
        australia.setNoOfPeoplesInState(australianStates);
        System.out.println(australia);

        Country newzealand = new Country(4,"New Zealand");
        Map<String, Integer> newzealandStates = new HashMap<>();
        newzealandStates.put("Auckland",30000);
        newzealandStates.put("Northland", 40000);
        newzealandStates.put("Otago",60000);
        newzealandStates.put("Wellington",10000);
        newzealand.setNoOfPeoplesInState(newzealandStates);
        System.out.println(newzealand);

        Country srilanka = new Country(5,"Srilanka");
        Map<String, Integer> srilankanStates = new HashMap<>();
        srilankanStates.put("Central Province",50000);
        srilankanStates.put("Eastern Province", 60000);
        srilankanStates.put("Northern Province",30000);
        srilankanStates.put("Western Province",40000);
        srilanka.setNoOfPeoplesInState(srilankanStates);
        System.out.println(srilanka);
    }
}