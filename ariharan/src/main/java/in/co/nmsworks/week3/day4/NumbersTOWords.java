package in.co.nmsworks.week3.day4;

public class NumbersTOWords {
    public static void main(String[] args){
        new NumbersTOWords().numberToWords(523);
    }

    public void numberToWords(int value){
        if (value == 1000) {
            System.out.println("one thousand");

        } else {
            String word = "";
            int rem = value % 100;
            word = elevens(rem).concat(word);
            if (word.length() < 1) {
                int rem1 = value % 10;
                word = " ".concat(word);
                word = ones(rem1).concat(word);
                word = " ".concat(word);
                value = value / 10;
                int rem2 = value % 10;
                word = twoes(rem2).concat(word);
                word = " ".concat(word);
            } else {
                value = value / 10;
            }
            word = word.trim();
            value = value / 10;
            int rem3 = value % 10;
            if (value > 0) {
                if (word.isEmpty()) {
                } else {
                    word = " and ".concat(word);

                }
                word = " hundred ".concat(word);
                word = ones(rem3).concat(word);

            }
            System.out.println(word);
        }
    }
    public String ones(int onesval){
        if (onesval == 1) {
            return "one";
        } else if (onesval == 2) {
            return "two";
        } else if (onesval == 3) {
            return "three";
        } else if (onesval == 5) {
            return "five";
        } else if (onesval == 4) {
            return "four";
        } else if (onesval == 6) {
            return "six";
        } else if (onesval == 7) {
            return "seven";
        } else if (onesval == 8) {
            return "eight";
        } else if (onesval == 9) {
            return "nine";
        }else {
            return "";
        }

    }

    public String elevens(int onesval){
        if (onesval == 11) {
            return "eleven";
        } else if (onesval == 12) {
            return "twelve";
        } else if (onesval == 13) {
            return "thirteen";
        } else if (onesval == 15) {
            return "fifteen";
        } else if (onesval == 14) {
            return "fourteen";
        } else if (onesval == 16) {
            return "sixteen";
        } else if (onesval == 17) {
            return "seventeen";
        } else if (onesval == 18) {
            return "eightteen";
        } else if (onesval == 19) {
            return "nineteen";

        } else if (onesval==10) {
            return "ten";
        } else {
            return "";
        }
    }

    public String twoes(int onesval){
        if (onesval == 1) {
            return "one";
        } else if (onesval == 2) {
            return "twenty";
        } else if (onesval == 3) {
            return "thirty";
        } else if (onesval == 5) {
            return "fifty";
        } else if (onesval == 4) {
            return "forty";
        } else if (onesval == 6) {
            return "sixty";
        } else if (onesval == 7) {
            return "seventy";
        } else if (onesval == 8) {
            return "eighty";
        } else if (onesval == 9) {
            return "ninety";
        }else {
            return "";
        }
    }
}
