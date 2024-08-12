package in.co.nmsworks.week2;

public class TE17 {

    public void largestElement(int[] arr){
        if(arr.length < 1){
            return;
        }
        int maxi = arr[0];

        for (int i : arr) {

            if(i > maxi)
            {
                maxi = i;
            }
        }

        System.out.println(maxi);

    }
}
