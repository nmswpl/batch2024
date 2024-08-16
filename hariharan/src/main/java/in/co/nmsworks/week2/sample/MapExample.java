package in.co.nmsworks.week2.sample;

import java.util.*;

public class MapExample {

    Map<Character, List> telephoneNumber = new HashMap<>();
    public MapExample() {


        Map<Integer, String> idToName = new HashMap<>();
        idToName.put(1, "Jenifer");
        idToName.put(2, "Premalatha");
        idToName.put(3, "Aarthi");
        idToName.put(4, "Madhumitha");
        idToName.put(5, "Pavithra");
        idToName.put(6, "Hariharan p");
        idToName.put(7, "Krishna");
        idToName.put(8, "Arunraj");
        idToName.put(9, "Priyadharshini");
        idToName.put(10, "Sujaritha");
        idToName.put(11, "Jenish");
        idToName.put(12, "Hariharan kr");
        idToName.put(13, "Muthuraj");
        idToName.put(14, "Ariharan");
        idToName.put(15, "Siva");

        //idToName.forEach((key,value) -> System.out.println(key + "="+ value));

        for (Map.Entry<Integer, String> entry : idToName.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("\n");

        Map<String, Integer> nameToId = new HashMap<>();
        nameToId.put("Jenifer", 1);
        nameToId.put("Premalatha", 2);
        nameToId.put("Aarthi", 3);
        nameToId.put("Madhumitha", 4);
        nameToId.put("Pavithra", 5);
        nameToId.put("Hariharan p", 6);
        nameToId.put("Krishna", 7);
        nameToId.put("Arunraj", 8);
        nameToId.put("Priyadharshini", 9);
        nameToId.put("Sujaritha", 10);
        nameToId.put("jenish", 11);
        nameToId.put("Hariharan kr", 12);
        nameToId.put("Muthuraj", 13);
        nameToId.put("Ariharan", 14);
        nameToId.put("Siva", 15);


        for (Map.Entry<Integer, String> entry : idToName.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


        Contact hariharan = new Contact("hariharankr", 12);
        Contact jenifer = new Contact("Jenifer", 1);
        Contact premalatha = new Contact("Premalatha", 2);
        Contact aarthi = new Contact("Aarthi", 3);
        Contact madhumitha = new Contact("Madhumitha", 4);
        Contact pavithra = new Contact("Pavithra", 5);
        Contact hariharanP = new Contact("Hariharan p", 6);
        Contact krishna = new Contact("Krishna", 7);
        Contact arunraj = new Contact("Arunraj", 8);
        Contact priyadharshini = new Contact("Priyadharshini", 9);
        Contact sujaritha = new Contact("Sujaritha", 10);

        Contact jenish = new Contact("jenish", 11);
        Contact muthuraj = new Contact("Muthuraj", 13);
        Contact ariharan = new Contact("Ariharan", 14);
        Contact siva = new Contact("Siva", 15);


        List<Contact> acontactList = new ArrayList<>();
        acontactList.add(aarthi);
        acontactList.add(ariharan);
        acontactList.add(arunraj);
        List<Contact> hcontactList = new ArrayList<>();
        hcontactList.add(hariharanP);
        hcontactList.add(hariharan);
        List<Contact> jcontactList = new ArrayList<>();
        jcontactList.add(jenifer);
        jcontactList.add(jenish);
        List<Contact> pcontactList = new ArrayList<>();
        pcontactList.add(priyadharshini);
        pcontactList.add(pavithra);
        pcontactList.add(premalatha);
        List<Contact> mcontactList = new ArrayList<>();
        mcontactList.add(madhumitha);
        mcontactList.add(muthuraj);
        List<Contact> kcontactList = new ArrayList<>();
        kcontactList.add(krishna);
        List<Contact> scontactList = new ArrayList<>();
        scontactList.add(siva);
        scontactList.add(sujaritha);



        telephoneNumber.put('a', acontactList);
        telephoneNumber.put('h', hcontactList);
        telephoneNumber.put('j', jcontactList);
        telephoneNumber.put('p', pcontactList);
        telephoneNumber.put('m', mcontactList);
        telephoneNumber.put('k', kcontactList);
        telephoneNumber.put('s', scontactList);

    }

    public Integer searchName(String name) {
        char firstLetter = name.toLowerCase().charAt(0);


                List<Contact> list = telephoneNumber.get(firstLetter);
                for (Contact contact : list) {
                    if (contact.getName().equals(name)) {
                        return contact.getPhone();
                    }
                }
                       return -1;
            }

}
