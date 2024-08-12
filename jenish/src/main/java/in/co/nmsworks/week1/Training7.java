package in.co.nmsworks.week1;

public class Training7 {
    public void removeDuplicates(String s){
        String[] arr = s.split("");
        String ans = "";
        for (int i =1; i < arr.length; i++) {
                if (arr[i].equalsIgnoreCase(arr[i-1])) {
                    ans += ans.replace(arr[i],arr[i-1]);
                }
                else{
                    ans += "";
                }
        }
        System.out.println(ans);

    }
}