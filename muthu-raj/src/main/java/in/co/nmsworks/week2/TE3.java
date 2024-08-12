package in.co.nmsworks.week2;

import java.util.Scanner;

public class TE3 {

    public void multiplyArrays() {
        Scanner sc = new Scanner(System.in);
//        int[] arr1 = {2, 4, 1};
//        int[] arr2 = {3, 5, 7};

        System.out.println("Enter array length:: ");
        int len = sc.nextInt();
        if (len < 1 ){
            System.out.println("Array size must be greater than Zero");
            return;
        }
        int[] arr1 = new int[len];
        int[] arr2 = new int[len];
        for (int i = 0; i < len; i++) {

            System.out.println("Enter array1 ["+i+"]");
            arr1[i] = sc.nextInt();
            System.out.println("Enter array1 ["+i+"]");
            arr2[i] = sc.nextInt();

        }

        int[] res = new int[arr1.length];

        int ptr = 0;


        for (int i = 0; i < res.length; i++, ptr++) {

            res[i] = arr1[ptr] * arr2[ptr];

        }

        for (int re : res) {

            System.out.println(re);

        }

    }
}
