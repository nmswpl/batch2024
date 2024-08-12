package in.co.nmsworks.week2;
/*Write a program to print the position of given element in an array. If not present, print -1
E.g : Input : arr = {7, 15, 41}
Search Element : 41 Output : 2;
Search Element : 5 Output : -1*/

public class Te4 {
    public void findElement(int n){
        int[] arr={7, 15, 41, 50};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("Search Element : "+n+" Output : "+i);
            }
        }
    }
}
