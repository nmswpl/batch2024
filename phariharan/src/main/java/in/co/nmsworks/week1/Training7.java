package in.co.nmsworks.week1;

public class Training7 {
    public void removeDuplicate(String str){
        // aabbcc
        System.out.println(str);
        String duplicateRemovedString;
        int length = str.length();
        duplicateRemovedString = String.valueOf(str.charAt(0));


        for (int i = 1; i < length; i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                duplicateRemovedString =  duplicateRemovedString + str.charAt(i);
            }
        }

        System.out.println("Duplicate Removed String: " + duplicateRemovedString);
    }
}

