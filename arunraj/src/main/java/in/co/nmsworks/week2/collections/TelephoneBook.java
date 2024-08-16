package in.co.nmsworks.week2.collections;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {


    public void telephoneBook(Character s){
        Map<String , Integer> nameToMobile = new HashMap<>();

        nameToMobile.put("Jenifer",1);
        nameToMobile.put("Premalatha",2);
        nameToMobile.put("Aarthi",3);
        nameToMobile.put("Madhumitha",4);
        nameToMobile.put("Pavithra",5);
        nameToMobile.put("Hariharan",6);
        nameToMobile.put("Krishnaraj",7);
        nameToMobile.put("Arunraj",8);
        nameToMobile.put("Priyadharshini",9);
        nameToMobile.put("Sujaritha",10);
        nameToMobile.put("Jenish",11);
        nameToMobile.put("Krhariharan",12);
        nameToMobile.put("Muthuraj",13);
        nameToMobile.put("Ariharan",14);
        nameToMobile.put("Siva",15);

        for(String i:nameToMobile.keySet()){
            if(s.equals(i.charAt(0))){
                System.out.println(i+","+nameToMobile.values());
            }
        }
    }

}
