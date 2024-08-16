package in.co.nmsworks.week2.collections.contactdirectory;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        listCreation();
        AddressBook searchNumber = new AddressBook();
        searchNumber.getPhoneDirectory('t');
        searchNumber.searchName();
    }

    public static void listCreation(){

        Contact contactJenifer = new Contact(1,"Jenifer");
        Contact contactPremalatha = new Contact(2,"Premalatha");
        Contact contactAarthi = new Contact(3,"Aarthi");
        Contact contactMadhumitha = new Contact(4,"Madhumitha");
        Contact contactPavitra = new Contact(5,"Pavitra");
        Contact contact1Hariharan = new Contact(6,"Hariharan P");
        Contact contact1Krishnaraj = new Contact(7,"KrishnaRaj");
        Contact contactArunRaj = new Contact(8,"ArunRaj");
        Contact contactPriyadharshini = new Contact(9,"Priyadharshini");
        Contact contactSujaritha = new Contact(10,"Sujaritha");
        Contact contactJenish = new Contact(11,"Jenish");
        Contact contactHariKR = new Contact(12,"Hariharan K R");
        Contact contact1Muthuraj = new Contact(13,"Muthuraj");
        Contact contact1Ariharan = new Contact(14,"Ariharan");
        Contact contactSiva = new Contact(15,"Siva");

        AddressBook addNumbers = new AddressBook();
        addNumbers.updatePhoneDirectory(contact1Ariharan);
        addNumbers.updatePhoneDirectory(contactAarthi);
        addNumbers.updatePhoneDirectory(contactArunRaj);
        addNumbers.updatePhoneDirectory(contactHariKR);
        addNumbers.updatePhoneDirectory(contact1Hariharan);
        addNumbers.updatePhoneDirectory(contact1Krishnaraj);
        addNumbers.updatePhoneDirectory(contactJenish);
        addNumbers.updatePhoneDirectory(contactMadhumitha);
        addNumbers.updatePhoneDirectory(contact1Muthuraj);
        addNumbers.updatePhoneDirectory(contactPavitra);
        addNumbers.updatePhoneDirectory(contactPremalatha);
        addNumbers.updatePhoneDirectory(contactPriyadharshini);
        addNumbers.updatePhoneDirectory(contactSiva);
        addNumbers.updatePhoneDirectory(contactSujaritha);
        addNumbers.updatePhoneDirectory(contactJenifer);

    }
}
