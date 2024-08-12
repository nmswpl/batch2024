package in.co.nmsworks.week2;

/**
 * 4. Write a program to print the position of given element in an array. If not present, print -1
 * E.g : Input : arr = {7, 15, 41}
 * Search Element : 41 Output : 2;
 * Search Element : 5 Output : -1;
 */

public class Te4 {
    int[] arr;
    int searchElemnt;

    public void positionOfElement(){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==searchElemnt){
                System.out.println('\n'+"position ::"+i);


            }

                }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=searchElemnt){
                System.out.println('\n'+"Position::"+"-1");
                break;

            }

            }

        }

    }


