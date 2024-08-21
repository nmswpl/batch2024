package in.co.nmsworks.week3.homework.setc2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1 {
    public void checkCountryContinent() {
        List<String> countriesList = new ArrayList<>();
        countriesList.addAll(Arrays.asList("India", "Egypt", "Pakistan", "Brazil", "Srilanka", "England", "Bangladesh", "France", "China", "America", "Australia"));
        List<String> asianCountries = new ArrayList<>(Arrays.asList("India","Pakistan","Srilanka","Bangladesh","China"));

        for (String country : countriesList) {
            if(asianCountries.contains(country)){
                System.out.println(country+" is in Asia.");
            }
        }
    }

    public static void main(String[] args) {
        Question1 q1 = new Question1();
        q1.checkCountryContinent();
    }
}