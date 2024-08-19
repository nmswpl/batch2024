package in.co.nmsworks.weekend;

public class Q4 {
    public void leadingZero(String str){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                continue;
            } else {
                String ans = str.substring(i);
                System.out.println(ans);
                break;
            }
        }
    }
}

