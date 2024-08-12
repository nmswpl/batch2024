package in.co.nmsworks.week1;

public class Training5 {
    public void getSentence(String s){
        String[] arr = s.split("\\.");
        for(String s1: arr){
            System.out.println(s1);
        }
    }
}
