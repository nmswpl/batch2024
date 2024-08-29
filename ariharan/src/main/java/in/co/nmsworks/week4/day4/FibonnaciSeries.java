package in.co.nmsworks.week4.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FibonnaciSeries {
    int a=0,b=1;
    public static void main( String[] args ){
        new FibonnaciSeries().fibonannci(1);
    }
    public void fibonannci(int count){
        if (count==0)
            return;
        System.out.println(a);
        int c=a+b;
        a=b;
        b=c;
        fibonannci(count-1);
        List<Integer> numList=new ArrayList<>();

    }
}
