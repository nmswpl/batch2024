package in.co.nmsworks.week2.collections.telephonebook;

import java.util.*;

public class TelephoneBook {
    private Map<Character, List<Contact>> telePhoneBook = new HashMap<>();

    public void fillDetails(){
        Contact jenifer = new Contact(1, "jenifer");
        Contact premalatha = new Contact(2, "premalatha");
        Contact aarthi = new Contact(3, "aarthi");
        Contact madhumitha = new Contact(4, "madhumitha");
        Contact pavithra = new Contact(5, "pavithra");
        Contact hariharanP = new Contact(6, "hariharan_p");
        Contact krishna = new Contact(7, "krishna");
        Contact arunraj = new Contact(8, "arunraj");
        Contact priyadharshini = new Contact(9, "priyadharshini");
        Contact sujaritha = new Contact(10, "sujaritha");
        Contact jenish = new Contact(11, "jenish");
        Contact hariharanKr = new Contact(12, "hariharan_kr");
        Contact muthuraj = new Contact(13, "muthuraj");
        Contact ariharan = new Contact(14, "ariharan");
        Contact siva = new Contact(15, "siva");

        List<Contact> aList = new ArrayList<>();
        aList.add(ariharan);
        aList.add(aarthi);
        aList.add(arunraj);

        List<Contact> hList = new ArrayList<>();
        hList.add(hariharanP);
        hList.add(hariharanKr);

        List<Contact> jList = new ArrayList<>();
        jList.add(jenifer);
        jList.add(jenish);

        List<Contact> kList = new ArrayList<>();
        kList.add(krishna);

        List<Contact> mList = new ArrayList<>();
        mList.add(madhumitha);
        mList.add(muthuraj);

        List<Contact> pList = new ArrayList<>();
        pList.add(premalatha);
        pList.add(pavithra);
        pList.add(priyadharshini);

        List<Contact> sList = new ArrayList<>();
        sList.add(sujaritha);
        sList.add(siva);

        telePhoneBook.put('a', aList);
        telePhoneBook.put('h', hList);
        telePhoneBook.put('j', jList);
        telePhoneBook.put('k', kList);
        telePhoneBook.put('m', mList);
        telePhoneBook.put('p', pList);
        telePhoneBook.put('s', sList);
    }
    public void searchContact(String name) {
        Character firstLetter = name.charAt(0);
        List<Contact> contactsList = telePhoneBook.get(firstLetter);

        for (Contact contact : contactsList) {
            if(contact.getName().equalsIgnoreCase(name)){
                System.out.println("Name :: "+contact.getName());
                System.out.println("Mobile Number :: "+contact.getPhoneNumber());
                return;
            }
        }
        System.out.println(name+" not found !!");
    }
}