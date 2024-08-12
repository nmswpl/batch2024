package in.co.nmsworks.week2;

public class TE4 {

    public int getPosition(int[] arr, int target){

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }

        }
        return -1;

    }

}
