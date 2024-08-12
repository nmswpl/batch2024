package in.co.nmsworks.week2;
//
//Write a program to multiply two arrays of same size element-by-element.
 //       E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7


public class Te3
{
    public static void main(String[] args) {
        int []a={2,4,1};
        int []b={3,5,7};
        int []c={0,0,0};
        for (int i = 0; i < 3; i++) {

            c[i]=a[i]*b[i];
        }

        for (int i = 0; i <3 ; i++) {
            System.out.print(c[i]+" ");

        }
    }
}
