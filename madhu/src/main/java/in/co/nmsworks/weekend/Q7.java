package in.co.nmsworks.weekend;

public class Q7 {
    public void removeDuplicates(String str){
        System.out.println(str);
        String duplicatesRemoved;
        duplicatesRemoved = String.valueOf(str.charAt(0));
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(i - 1)){
                duplicatesRemoved = duplicatesRemoved + str.charAt(0);

            }
        }
        System.out.println(duplicatesRemoved);
    }
}
