package in.co.nmsworks.week4.day4;

public class Fibonncci {
    public static void main(String[] args) {
          Fibonncci fibonncci = new Fibonncci();
         int n =10;
         for (int i =0; i<n;i++){
             System.out.println(fibonncci.findFibonnacci(i) + " ");
         }
    }

    public int findFibonnacci(int n){
     if(n <=1)
         return 1;
     return findFibonnacci(n-1)+ findFibonnacci(n-2);
    }
}
