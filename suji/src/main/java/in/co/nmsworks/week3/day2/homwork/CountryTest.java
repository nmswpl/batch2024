package in.co.nmsworks.week3.day2.homwork;

import java.util.HashMap;
import java.util.Map;

class Country {
    private int id;
    private String countryName;
    private Map<String, Integer> stateMap;

    public Country(int id, String countryName) {
        this.id = id;
        this.countryName = countryName;
        this.stateMap = new HashMap<>();
    }

    public void addState(String stateName, int numberOfPeople) {
        stateMap.put(stateName, numberOfPeople);
    }

    // Getters and setters for id, countryName, and stateMap
    public int getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                ", stateMap=" + stateMap +
                '}';
    }

    public Map<String, Integer> getStateMap() {
        return stateMap;




    }
}

public class CountryTest {
    public static void main(String[] args) {
        // Create 5 Country objects
        Country country1 = new Country(1, "India");
        country1.addState("Maharashtra", 124737537);
        country1.addState("Uttar Pradesh", 199812371);

        Country country2 = new Country(2, "United States");
        country2.addState("California", 39512223);
        country2.addState("Texas", 29145561);

        Country country3 = new Country(3, "China");
        country3.addState("Guangdong", 115210000);
        country3.addState("Shandong", 99580000);

        Country country4 = new Country(4, "Brazil");
        country4.addState("São Paulo", 46289275);
        country4.addState("Minas Gerais", 21727745);

        Country country5 = new Country(5, "Russia");
        country5.addState("Moscow", 12678000);
        country5.addState("Saint Petersburg", 5381000);


    }
}
