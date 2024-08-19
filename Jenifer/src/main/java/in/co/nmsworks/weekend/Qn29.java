package in.co.nmsworks.weekend;
/* A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG */

import java.util.Scanner;

public class Qn29 {
    public void alphabeticPattern(){
        for (int i = 65; i <= 71; i++) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char) i);
            }
            System.out.println();
        }
    }
}
