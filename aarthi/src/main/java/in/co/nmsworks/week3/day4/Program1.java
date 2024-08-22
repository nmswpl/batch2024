package in.co.nmsworks.week3.day4;

public class Program1 {
    public void returnIntName(int num) {
        if (num == 1000) {
            System.out.println("Thousand");
        } else {
            String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
            String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            int hundred = num / 100;
            int hunRem = num % 100;
            int ten = hunRem / 10;
            int tenRem = hunRem % 10;
            int ones = tenRem;
            if (hundred > 0) {
                System.out.print(units[hundred] + " hundred and");
            }
            if (ten == 1 && (tenRem == 0 || tenRem == 1 || tenRem == 2 || tenRem == 3 || tenRem == 4 || tenRem == 5 || tenRem == 6 || tenRem == 7 || tenRem == 8 || tenRem == 9)) {
                System.out.print(" " + teens[tenRem]);
            } else {
                if (ten > 0) {
                    System.out.print(" " + tens[ten]);
                }
                if (ones > 0) {
                    System.out.println(" " + units[ones]);
                }
            }
        }
    }



    public static void main(String[] args) {
        Program1 intName = new Program1();
        intName.returnIntName(192);
    }


}
