package in.co.nmsworks.week4.day4;

import java.util.Collections;
import java.util.Scanner;

public class FibbonaciSeries {
    int start1 = 0;
    int start2 = 1;

    public static void main(String[] args) {
        FibbonaciSeries fibbonaciSeries = new FibbonaciSeries();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value for series count : ");
        int count = scanner.nextInt();
        scanner.nextLine();

        //fibbonaciSeries.fibonaciSeries(count);
        fibbonaciSeries.fibonaciSeriesUseRecursion(count);
    }

    private void fibonaciSeriesUseRecursion(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(start1);
        int sum = start1 + start2;
        start1 = start2;
        start2 = sum;
        fibonaciSeries(n - 1);
    }

    private void fibonaciSeries(int n) {
        int start1 = 0;
        int start2 = 1;
        System.out.println(start1);
        System.out.println(start2);
        for (int i = 1; i <= n; i++) {
            int sum = start1 + start2;
            start1 = start2;
            start2 = sum;
            System.out.println(sum);
        }

    }
}
