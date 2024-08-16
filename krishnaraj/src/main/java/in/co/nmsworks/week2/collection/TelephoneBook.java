package in.co.nmsworks.week2.collection;

import java.util.*;

public class TelephoneBook{
    Map<Character, List> telePhoneBook=new HashMap<>();
    public void addList() {
        ContactDetail krishnaraj = new ContactDetail("krishnaraj", 7);
        ContactDetail arthi = new ContactDetail("arthi", 3);
        ContactDetail madhumitha = new ContactDetail("madhumitha", 4);
        ContactDetail hariharen = new ContactDetail("hariharen", 6);
        ContactDetail muthuRaj = new ContactDetail("muthuRaj", 13);
        ContactDetail premalatha = new ContactDetail("premalatha", 2);
        ContactDetail jenish = new ContactDetail("jenish", 11);
        ContactDetail jenifer = new ContactDetail("jenifer", 1);
        ContactDetail pavithra = new ContactDetail("muthuRaj", 5);
        ContactDetail ariHaren = new ContactDetail("ariHaren", 14);
        
        List<ContactDetail> kList = new ArrayList<>();
        kList.add(krishnaraj);

        List<ContactDetail> aList = new ArrayList<>();
        aList.add(arthi);
        aList.add(ariHaren);

        List<ContactDetail> mList = new ArrayList<>();
        mList.add(madhumitha);
        mList.add(muthuRaj);

        List<ContactDetail> hList = new ArrayList<>();
        hList.add(hariharen);

        List<ContactDetail> pList = new ArrayList<>();
        pList.add(premalatha);
        pList.add(pavithra);

        List<ContactDetail> jList = new ArrayList<>();
        jList.add(jenifer);
        jList.add(jenish);

        telePhoneBook.put('k', kList);
        telePhoneBook.put('a', aList);
        telePhoneBook.put('m', mList);
        telePhoneBook.put('h', hList);
        telePhoneBook.put('p', pList);
        telePhoneBook.put('j', jList);
    }
    public void searchContact(String name) {
        Character firstLetter = name.charAt(0);
        List<ContactDetail> contactsList = telePhoneBook.get(firstLetter);
        if(contactsList==null){
            System.out.println("there is no letter statrt with : "+firstLetter);
            return;
        }
        for (ContactDetail contact : contactsList) {
            if(contact.getName().equalsIgnoreCase(name)){
                System.out.println("Name = "+ contact.getName());
                System.out.println("Mobile Number = "+ contact.getContactNumber());
                return;
            }
        }
        System.out.println("Name not found "+ name);
    }
    public static void main(String[] args) {
        TelephoneBook tb = new TelephoneBook();
        tb.searchContact("krishnaraj");
    }
}



