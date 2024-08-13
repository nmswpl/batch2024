package in.co.nmsworks.week2;

//Write a program to print the square of every element present in the array.
//E.g : Input : arr1 = {2, 4, 3, 5} Output : 4 16 9 25


class Te7 {
    public Te7() {
        int[] a = {2, 3, 4, 5};
        int[] m = {0, 0, 0, 0};

        for (int i = 0; i < 4; i++) {

            m[i] = a[i] * a[i];
        }

        for (int i = 0; i < 4; i++)
        {
            System.out.print(m[i] + " ");
        }
    }
}
