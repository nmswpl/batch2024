package in.co.nmsworks.week3.Day4;

public class Q4 {
    public void min(int... arr){
        int min =arr[0];
        for (int i = 0; i < arr.length ; i++) {

            if(arr[i]<=min ){
                min = arr[i];
            }
        }
        System.out.print("Min="+min+" ");
    }

public void max(int... arr){
    int max =arr[0];
    for (int i = 0; i < arr.length ; i++) {

        if(arr[i]>=max ){
            max = arr[i];
        }
    }
    System.out.print("Max = "+max);
    System.out.println();
}
}
