package in.co.nmsworks.week3.assesment;

public class Q2 {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6};
        int c=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0)
            {
                System.out.println(a[i]);
                c=c+1;
            }
        }
        System.out.println("Count of event numbers "+c);
    }
}
