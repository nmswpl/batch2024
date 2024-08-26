package in.co.nmsworks.week3.day5;

public class ReverseAString {
    public static void main(String[] args) {
        ReverseAString rev = new ReverseAString();
        rev.reverseString("Messi");
    }
    public void reverseString(String str){
        String reversed = "";
        char ch;
        for (int i=str.length()-1;i>=0;i--){
            ch=str.charAt(i);
            reversed = reversed+ch;
        }
        System.out.println(reversed);
    }
}
