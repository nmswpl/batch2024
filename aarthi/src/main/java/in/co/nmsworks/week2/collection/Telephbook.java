package in.co.nmsworks.week2.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Telephbook {

    static Map<Character, List<Contacts>> addressBook = new HashMap<>();

    public static void main(String[] args) {

        Contacts c1 = new Contacts("Aarthi", 3);
        Contacts c2 = new Contacts("Jenifer", 1);
        Contacts c3 = new Contacts("Premalatha", 2);
        Contacts c4 = new Contacts("Madhumitha", 4);
        Contacts c5 = new Contacts("pavithra", 5);
        Contacts c6 = new Contacts("HariharanP", 6);
        Contacts c7 = new Contacts("Krishanaraj", 7);
        Contacts c8 = new Contacts("Arunraj", 8);
        Contacts c9 = new Contacts("Priyadharshini", 9);
        Contacts c10 = new Contacts("Sujaritha", 10);
        Contacts c11 = new Contacts("jenish", 11);
        Contacts c12 = new Contacts("HariharankR", 12);
        Contacts c13 = new Contacts("MuthuRaj", 13);
        Contacts c14 = new Contacts("Ariharan", 14);
        Contacts c15 = new Contacts("Siva", 15);

        List<Contacts> listA = new ArrayList<>();
        listA.add(c1);
        listA.add(c8);
        listA.add(c14);
        List<Contacts> listJ = new ArrayList<>();
        listJ.add(c2);
        listJ.add(c11);
        List<Contacts> listP = new ArrayList<>();
        listP.add(c5);
        listP.add(c9);
        listP.add(c3);
        List<Contacts> listM = new ArrayList<>();
        listM.add(c4);
        listM.add(c13);
        List<Contacts> listH = new ArrayList<>();
        listH.add(c6);
        listH.add(c12);
        List<Contacts> listK = new ArrayList<>();
        listK.add(c7);
        List<Contacts> listS = new ArrayList<>();
        listS.add(c15);
        listS.add(c10);


        addressBook.put('A', listA);
        addressBook.put('J', listJ);
        addressBook.put('P', listP);
        addressBook.put('M', listM);
        addressBook.put('H', listH);
        addressBook.put('K', listK);
        addressBook.put('S', listS);
        Telephbook tbook=new Telephbook();
        tbook.search("Aarthi");


    }
    public void search(String name)
    {
        Character namefirstChar=name.charAt(0);
        List<Contacts>contacts= addressBook.get(namefirstChar);
        for (Contacts contact:contacts)
        {
            if(contact.getName().equals(name))
            {
                System.out.println("Name::"+contact.getName());
                System.out.println("MobileNo::"+contact.getMobile());
                return;


            }System.out.println("not found");
        }



    }


}
