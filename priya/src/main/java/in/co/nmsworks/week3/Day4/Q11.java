package in.co.nmsworks.week3.Day4;

public class Q11 {
    public  String getIntegerName(int n){
        if(n<1){
            System.out.println("Enter valid number");
        }
        else if( n>=0 && n<=9){
            return onesToWord(n);
        }
            else if(n>=11 && n<=19 ){
            return wordsOf11To19(n);
        }
            else if(n%10 == 0 && n<=100){
            return wordsOf10To100(n);
        }
            else  if(n>=21 && n<=99){
            return wordsOf10To100(n/10*10)+" "+onesToWord(n%10);
        }
            else if(n>=101&& n<=999){
                   return (onesToWord(n/100) + " Hundred and "+ getIntegerName(n%100));
        }
        return "";
    }
    public String onesToWord(int n){
        switch (n){
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
               return "Three";
            case 4:
              return  "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
              return "Seven";
            case 8:
               return "Eight";
            case 9:
               return "Nine";

            default:
                return null;

        }

    }
    public  String wordsOf11To19(int n){
        switch (n){
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return  "Fourteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Nineteen";

            default:
                return null;

        }

    }
    public String wordsOf10To100(int n){
        switch (n){
            case 10:
                return "Ten";
            case 20:
                return "Twenty";
            case 30:
                return "Thirty";
            case 40:
                return  "Fourty";
            case 50:
                return "Fifty";
            case 60:
                return "Sixty";
            case 70:
                return "Seventy";
            case 80:
                return "Eighty";
            case 90:
                return "Ninety";
            case 100:
                return "Hundred";

            default:
                return null;

        }
    }


    public static void main(String[] args) {
       Q11 q11 = new Q11();
        System.out.println(q11.getIntegerName(650));
    }


}