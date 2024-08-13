package in.co.nmsworks.week2;

//Given an array of integers, Write a Program to find the sum of the elements of the
//array.


class Te13 {
    public Te13() {
        int[]a={3,4,3,4};
        int sum=0;
        for (int i = 0; i < 4; i++) {
            sum=sum+a[i];
        }
        System.out.println("The sum of the array is "+sum);
    }
}
