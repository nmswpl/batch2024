package in.co.nmsworks.week1;

public class Example {
    public static void main(String[] args) {
        String s = "jenish-nms";
        System.out.println(s.split("-")[1]);
        System.out.println(s.substring(s.indexOf("-")+1));

        String s2 = new String("nms");
        String s1 = "nms";
        if(s1 == s2){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

    }
}
