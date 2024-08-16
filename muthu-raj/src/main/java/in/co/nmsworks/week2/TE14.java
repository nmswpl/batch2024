package in.co.nmsworks.week2;

public class TE14 {
    public void reverseArray(char[] arr){

        int len = arr.length-1;
        char[] res = new char[len+1];
        for (int i = 0; i <= len; i++) {

            res[i] = arr[len - i];
//            System.out.println(arr[len - i]);
        }

        for (char re : res) {
            System.out.println(re);
        }

    }
}
