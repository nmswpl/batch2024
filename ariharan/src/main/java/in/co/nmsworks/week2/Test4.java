package in.co.nmsworks.week2;
//Write a program to print the position of given element in an array. If not present, print -1
//E.g : Input : arr = {7, 15, 41}
//Search Element : 41 Output : 2;
//Search Element : 5 Output : -1

public class Test4 {
    public void searchElem(int arr[],int elem){
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==elem){
                int pos=i+1;
                System.out.println("the position of the elements is::"+ pos);
                return;

            }

        }
        System.out.println("-1");
    }
}
