package in.co.nmsworks.week3.day4;

 class BinaryToDecimal {
     String s;
     int sum;

     public int calcDecimal(String s) {
         this.s = s;
         int i = Integer.parseInt(String.valueOf(s));
         int num = i;
         int rem = 0;
         int power = 1;
         int q = i;
         int sum = 0;
         while (num > 0) {
             rem = num % 10;
             sum = sum + rem * power;
             power = power * 2;
             q = num / 10;
             num = q;
         }
         return sum;
     }

     public void display(int sum) {
         this.sum = sum;
         System.out.println("Answer as decimal  ::  " + sum);
     }

  /*   public void calcUsingPow(String s) {
         int position = 0;
         int i= Integer.parseInt(String.valueOf(s));
         for (int j = s.length()-1; j >=0; j--) {
             Integer n=
             sum=sum+ (posto* Math.pow(2,j);
         }
     } */


         public static void main (String[]args)
         {
             BinaryToDecimal ob = new BinaryToDecimal();
             int sum = ob.calcDecimal("100");
            // ob.calcUsingPow("100");
             ob.display(sum);
         }

     }







