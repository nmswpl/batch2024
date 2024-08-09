package in.co.nmsworks.week1;

public class Training4 {
    public void removeTrailing0(String str){
        int length = str.trim().length();
        System.out.println(str);
        int i = 0;
        while (i < length  && str.charAt(i) == '0') {
            i++;
        }
        System.out.println(str.substring(i));
    }
}
