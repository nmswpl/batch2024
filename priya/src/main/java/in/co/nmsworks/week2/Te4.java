package in.co.nmsworks.week2;

public class Te4 {
    public void getPosition(int[] arr, int search) {
        int position=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                position = i;
            }
        }
        System.out.println("The position of  "+search+ " is "+position);
    }
}