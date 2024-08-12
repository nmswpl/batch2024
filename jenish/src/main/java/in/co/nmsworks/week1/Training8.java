package in.co.nmsworks.week1;

public class  Training8 {
    public void convertToTitleCase(String s){
        String[] arr = s.split(" ");
        String res = "";
        for (int i = 0; i < arr.length ; i++) {
            String temp = "";
            temp += arr[i].substring(0,1).toUpperCase();
            res += temp + arr[i].substring(1) + " ";
        }
        System.out.println(res);
    }
}