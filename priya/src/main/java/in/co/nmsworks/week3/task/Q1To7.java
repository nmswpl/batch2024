package in.co.nmsworks.week3.task;

import java.util.Scanner;

public class Q1To7 {
    Scanner s = new Scanner(System.in);
    public String getLongestSubstring(String s) {
        String longestSubstring = "";
        for (int i = 0; i < s.length(); i++) {
            while (s.charAt(i) != '$') {
                longestSubstring+=s.charAt(i);
                s = s.replace(s.charAt(i), '$');
            }
        }
        return longestSubstring;
    }



    public String getReversedString(String original){
        String reverse ="";
        for (int i = original.length()-1; i >=0; i--) {
            reverse+= original.charAt(i);
        }
        return reverse;
    }




public void removeSpace(String s){

        s=s.replaceAll(" ","");
    System.out.println(s);

}



public void positiveOrNegative(int n) {
    if (n >= 0) {
        System.out.println("Positive");
    } else if (n < 0) {
        System.out.println("Negative");
    }
}



public void getFibonacci(){
        int n1 =0;
        int n2=1;
    System.out.print(n1+" "+n2+" ");
        int n3;
    for (int i = 0; i <8 ; i++) {
        n3 = n1+n2;
        System.out.print(n3+" ");
        n1=n2;
        n2=n3;
    }
}


public int getSum(){
    int sum=0;
    while(true) {
        System.out.println("ENTER A NUMBER");
        int x =s.nextInt();
        if(x==0){
            break;
        }
        else {
            sum+=x;
        }
    }
    return sum;
}


public void showMenu(){
        while(true){
           int x= s.nextInt();
           if(x!=4){
                System.out.println("\t1. Choose Menu A\n" +
                        "\t2. Choose Menu B\n" +
                        "\t3. Choose Menu C\n" +
                        "\t4. Exit\n");
            }
           else{
               break;
           }

        }
}
    public static void main(String[] args) {
        Q1To7 l = new Q1To7();
        System.out.println( l.getLongestSubstring("AAaBBCCDE"));
        System.out.println(l.getReversedString("Mani"));
        l.removeSpace("  Pri  ya      n  kk aa");
        l.positiveOrNegative(0);
        l.getFibonacci();
        System.out.println();
        System.out.println("sum is"+l.getSum());
        l.showMenu();
    }
}
