package in.co.nmsworks.weekend;

public class Q12 {
    public void arrayMul() {
        int arr1[] = {2, 4, 6};
        int arr2[] = {1, 3, 5};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.println(arr1[i] * arr2[j]);
            }
        }
    }
}
