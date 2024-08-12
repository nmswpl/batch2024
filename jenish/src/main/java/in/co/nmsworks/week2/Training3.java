package in.co.nmsworks.week2;

public class Training3 {
    public void multiplyArray(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        for (int i = 0; i < n1 ; i++) {
            int res = arr1[i] * arr2[i];
            System.out.print(res +" ");
        }
        System.out.println("\n");
    }
}