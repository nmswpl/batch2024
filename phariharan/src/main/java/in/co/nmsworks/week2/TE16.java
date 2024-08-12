package in.co.nmsworks.week2;

public class TE16 {
    public int productOfElementsInArray(int[] arr2){
        int product = 1;
        for (int i = 0; i < arr2.length; i++) {
            product = product * arr2[i];
        }
        return product;
    }
}

