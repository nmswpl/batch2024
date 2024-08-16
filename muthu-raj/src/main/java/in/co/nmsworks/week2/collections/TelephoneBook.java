package in.co.nmsworks.week2.collections;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.Map.Entry;

/*
To create a phone Diary with functionalities like
indexing by name's first letter and lookup if a name is already present in the Book
 */

public class TelephoneBook {
    public static void main(String[] args) {

        List<Contact> contactList;
        Map<Character, List<Contact>> telephoneBook = new HashMap<>();

        Map<String, Integer> trainees = getTrainees();

        for (String name : trainees.keySet()) {
            Character key = name.toUpperCase().charAt(0);
            if (telephoneBook.containsKey(key)) {
                contactList = telephoneBook.get(key);
                addToContacts(name, trainees.get(name), contactList);
            } else {
                contactList = new ArrayList<>();
                addToContacts(name, trainees.get(name), contactList);
            }

            addToTelephoneBook(key, telephoneBook, contactList);

        }

        for (Entry<Character, List<Contact>> page : telephoneBook.entrySet()) {
            System.out.println(page.getKey() + " = " + page.getValue());
        }

        String name = "ZMuthu Raj";

        if (searchName(telephoneBook, name)) {
            System.out.println("This Contact is already present in the Contact Book");
        } else {
            System.out.println("You might want to add");
        }

    }

    private static Map<String, Integer> getTrainees() {
        Map<String, Integer> trainees = new HashMap<>();
        trainees.put("Jennifer", 1);
        trainees.put("Premalatha", 2);
        trainees.put("Aarthi", 3);
        trainees.put("Madhumitha", 4);
        trainees.put("Pavithra", 5);
        trainees.put("Hariharan", 6);
        trainees.put("Krishnaraj", 7);
        trainees.put("Arunraj", 8);
        trainees.put("Priyadharshini", 9);
        trainees.put("Sujaritha", 10);
        trainees.put("Jenish", 11);
        trainees.put("Hariharan KR", 12);
        trainees.put("Muthu Raj", 13);
        trainees.put("Ariharan R", 14);
        trainees.put("Siva", 15);
        return trainees;
    }


    static void NameToId() {

        Map<String, Integer> Trainees = getTrainees();
//
//        for(String name: Trainees.keySet()){
//            System.out.println("Name: " + name + ", Id: " + Trainees.get(name));
//        }

//        Using Iterator Class

        Iterator<Entry<String, Integer>> iter = Trainees.entrySet().iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        System.out.println(iter.getClass().getName());

    }


    static void addToTelephoneBook(Character key, Map<Character, List<Contact>> telephoneBook, List<Contact> contactList) {

        telephoneBook.put(key, contactList);
    }

    static void addToContacts(String name, int phoneNo, List<Contact> contactList) {

        Contact c = new Contact(name, phoneNo);
        contactList.add(c);

    }

    static boolean searchName(Map<Character, List<Contact>> book, String name) {

        Character key = name.toUpperCase().charAt(0);

//        to search using index
        if (book.containsKey(key)) {
            for (Contact c : book.get(key)) {
                if (c.getName().equals(name)) {
                    return true;
                }
            }
        }
        return false;
    }
}

