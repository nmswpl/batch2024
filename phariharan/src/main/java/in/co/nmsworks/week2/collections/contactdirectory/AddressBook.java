package in.co.nmsworks.week2.collections.contactdirectory;

import java.util.*;

public class AddressBook {
    private static final Map<Character,Set<Contact>> phoneDirectory = new HashMap<>();

    public void getPhoneDirectory(Character a) {
        Set<Contact> receivedSet = phoneDirectory.get(a);
        if (receivedSet == null){
            System.out.println("Not found");
        }
        else{
            for(Contact contact :phoneDirectory.get(a)){
                System.out.println("\nContactNumber = " + contact.getContactNumber() +" --->  Name = " + contact.getName() + '\n');
            }
        }
    }

    public void searchName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name to Search in PhoneDirectory : ");
        String name = sc.nextLine();
        String formattedName = name.toLowerCase().trim();
        Character searchCharacter = formattedName.charAt(0);
        boolean isFound = false;
        Set<Contact> receivedSet = phoneDirectory.get(searchCharacter);
        if (receivedSet.isEmpty()){
            return;
        }
        else{
            for(Contact value : receivedSet){
                if (value.getName().toLowerCase().equals(formattedName)) {
                    System.out.println("\nContactNumber = " + value.getContactNumber() +" --->  Name = " + value.getName() + '\n');
                    isFound = true;
                    break;
                }
            }
            if (!isFound){
                System.out.println(name + " Not Found in Directory");
            }
        }
    }

    public void getPhoneNumbersWithCharacter(char characterToFilter){
        Character searchCharacter = Character.toLowerCase(characterToFilter);
        for(Contact contact :phoneDirectory.get(searchCharacter)){
            System.out.println(contact);
        }
    }

    public void addPhoneDirectory(char a ,Set<Contact> Name) {
        phoneDirectory.put(a,Name);
    }

    public void updatePhoneDirectory(Contact name) {
        Character b = name.getName().toLowerCase().trim().charAt(0);
        boolean isPresent = false;
        for(Character val : phoneDirectory.keySet()){
            if (b.equals(val)){
                isPresent = true ;
                phoneDirectory.get(b).add(name);
            }
        }
        if (!isPresent){
            addPhoneDirectory(b,new HashSet<>(Collections.singletonList(name)));
        }
    }
}
