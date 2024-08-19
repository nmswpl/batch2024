package in.co.nmsworks.week2.collections;

import java.util.*;

public class TelephoneBook {
    public static void main(String[] args) {
        new TelephoneBook().telephoneBook();
    }

    public void telephoneBook() {
        Scanner sc = new Scanner(System.in);

        List<ContactDetails> contactsOfA = new ArrayList<>();
        ContactDetails a1 = new ContactDetails(905030303, "Ariharan");
        ContactDetails a2 = new ContactDetails(647465478, "Arunraj");
        ContactDetails a3 = new ContactDetails(904573213, "Aarthi");
        contactsOfA.add(a1);
        contactsOfA.add(a2);
        contactsOfA.add(a3);

        List<ContactDetails> contactsOfH = new ArrayList<>();
        ContactDetails h1 = new ContactDetails(904357676, "Hariharan");
        ContactDetails h2 = new ContactDetails(976641112, "krHariharan");
        contactsOfH.add(h1);
        contactsOfH.add(h2);

        List<ContactDetails> contactsOfJ = new ArrayList<>();
        ContactDetails j1 = new ContactDetails(934521111, "jenefier");
        ContactDetails j2 = new ContactDetails(963777211, "jenish");
        contactsOfJ.add(j1);
        contactsOfJ.add(j2);

        List<ContactDetails> contactsOfP = new ArrayList<>();
        ContactDetails p1 = new ContactDetails(957584745, "pavithra");
        ContactDetails p2 = new ContactDetails(965478322, "premalatha");
        ContactDetails p3 = new ContactDetails(901234473, "priyadharshini");
        contactsOfP.add(p1);
        contactsOfP.add(p2);
        contactsOfP.add(p3);

        List<ContactDetails> contactsOfS = new ArrayList<>();
        ContactDetails s1 = new ContactDetails(934548737, "sujaritha");
        ContactDetails s2 = new ContactDetails(934535265, "siva");
        contactsOfS.add(s1);
        contactsOfS.add(s2);

        List<ContactDetails> contactsOfM = new ArrayList<>();
        ContactDetails m1 = new ContactDetails(973751233, "muthuraj");
        ContactDetails m2 = new ContactDetails(874562424, "madhumitha");
        contactsOfM.add(m1);
        contactsOfM.add(m2);

        List<ContactDetails> contactsOfK = new ArrayList<>();
        ContactDetails k1 = new ContactDetails(753652892, "krishna");
        contactsOfK.add(k1);


        Map<Character, List<ContactDetails>> telephoneBook = new HashMap<>();
        telephoneBook.put('A', contactsOfA);
        telephoneBook.put('J', contactsOfJ);
        telephoneBook.put('M', contactsOfM);
        telephoneBook.put('K', contactsOfK);
        telephoneBook.put('P', contactsOfP);
        telephoneBook.put('S', contactsOfS);
        telephoneBook.put('H', contactsOfH);

//        for (Map.Entry<String, List<ContactDetails>> contacts : telephoneBook.entrySet()) {
//            System.out.println(contacts);
//        }
        System.out.println("enter the name to search in the telephone book:: ");
        String name = sc.nextLine();
        searchName(telephoneBook,name);

    }

    public void searchName(Map<Character, List<ContactDetails>> telephoneBook, String name) {
        char firstCharname =name.toUpperCase().charAt(0);
        List<ContactDetails> contactDetails = telephoneBook.getOrDefault(firstCharname,new ArrayList<>());
        for (ContactDetails contactDetail : contactDetails) {
            if (name.equalsIgnoreCase(contactDetail.getName())) {
                System.out.println("this name is present in the Telephone book");
                System.out.println("Name::" + contactDetail.getName() + "\nphone number::" + contactDetail.getPhno());
                return;
            }
        }
        System.out.println("this contact details is not found in telephone book");
    }
}
