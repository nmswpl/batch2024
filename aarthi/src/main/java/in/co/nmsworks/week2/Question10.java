package in.co.nmsworks.week2;
/*
 Write a program to print all numbers divisble by 3 greater than 300 and less than 400.
 */
public class Question10 {
    public void endWith7(int start , int end){
        for (int j = 0; j < 10 ; j++) {
            if ((start+j)%10 == 0){
                start = start+7 ;
                j= 10;
            }
        }

        for (int i = start; i < end ; i = i+10) {
            System.out.println(i);
        }
    }


}
