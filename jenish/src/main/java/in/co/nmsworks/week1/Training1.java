package in.co.nmsworks.week1;

public class Training1 {
        public void reverse(String s) {
                String[] arr = s.split(" ");
                for (int i = arr.length -1; i >= 0 ; i--) {
                        System.out.print(arr[i]+ " ");
                }
        }
}