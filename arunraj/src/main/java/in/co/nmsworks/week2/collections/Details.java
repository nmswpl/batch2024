package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Details {
    public void list(String name) {
        ContactDetail jenifer = new ContactDetail("Jenifer", 1);
        ContactDetail aarthi = new ContactDetail("Aarthi", 3);
        ContactDetail premalatha = new ContactDetail("Premalatha", 2);
        ContactDetail madhumitha = new ContactDetail("Madhumitha", 4);
        ContactDetail pavithra = new ContactDetail("Pavithra", 5);
        ContactDetail hariharan = new ContactDetail("Hariharan", 6);
        ContactDetail krisha = new ContactDetail("Krisharaj", 7);
        ContactDetail arun = new ContactDetail("Arunraj", 8);
        ContactDetail priya = new ContactDetail("Priyadharshini", 9);
        ContactDetail sujaritha = new ContactDetail("Sujaritha", 10);
        ContactDetail jenish = new ContactDetail("Jenish", 11);
        ContactDetail hari = new ContactDetail("KrHariharan", 12);
        ContactDetail muthu = new ContactDetail("Muthuraj", 13);
        ContactDetail ari = new ContactDetail("Ariharan", 14);
        ContactDetail siva = new ContactDetail("Siva", 15);

        List<ContactDetail> aList = new ArrayList<>();
        aList.add(ari);
        aList.add(arun);
        aList.add(aarthi);

        List<ContactDetail> hList = new ArrayList<>();
        hList.add(hariharan);

        List<ContactDetail> jList = new ArrayList<>();
        jList.add(jenifer);
        jList.add(jenish);

        List<ContactDetail> kList = new ArrayList<>();
        kList.add(krisha);
        kList.add(hari);

        List<ContactDetail> mList = new ArrayList<>();
        mList.add(madhumitha);
        mList.add(muthu);

        List<ContactDetail> pList = new ArrayList<>();
        pList.add(pavithra);
        pList.add(premalatha);
        pList.add(priya);

        List<ContactDetail> sList = new ArrayList<>();
        sList.add(siva);
        sList.add(sujaritha);

        Map<Character, List<ContactDetail>> telephoneBook = new HashMap<>();
        telephoneBook.put('A', aList);
        telephoneBook.put('H', hList);
        telephoneBook.put('J', jList);
        telephoneBook.put('K', kList);
        telephoneBook.put('M', mList);
        telephoneBook.put('P', pList);
        telephoneBook.put('S', sList);

        for(ContactDetail i:aList){
            System.out.println(i);
        }

    }
}

