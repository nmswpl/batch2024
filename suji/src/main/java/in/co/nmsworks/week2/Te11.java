package in.co.nmsworks.week2;

/*
Write a program to print the biggest of the 3 numbers
E.g : Input : 12, 24, 5 Output : 24 ; Input2 : 18, 18, 35 Output : 35 */


class Te11 {
    public Te11() {
        int[]a={12,24,50};
        int bigNum=0;
        for (int i = 0; i < 3; i++) {
            if(a[i]>bigNum)
            {
                bigNum=a[i];
            }
        }
        System.out.println("The biggest of the 3 numbers is "+bigNum);
    }

}
