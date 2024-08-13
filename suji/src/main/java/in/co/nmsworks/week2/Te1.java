package in.co.nmsworks.week2;

/*
. Write a program to print all even numbers between 601 and 700 in descending order.

 */
 class Te1 {
    public Te1() {
        for (int i = 700; i > 600; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}