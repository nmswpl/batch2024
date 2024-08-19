package in.co.nmsworks.weekend;

public class Q13 {
    public void position(int value) {
        int arr[] = {4, 8, 12, 16};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                int position = i;
                System.out.println(position);
            }
        }
    }
}
