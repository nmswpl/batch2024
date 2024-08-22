package in.co.nmsworks.week3.day4;

public class NumberName {
    String[] ones = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    String[] tens = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};


    public String numberToWord(int num){
        String string = "";
        if(num == 1000){
            string = "Thousand";
            num = num % 1000;
        }

        if(num >= 100){
            string += ones[(num / 100)] + " Hundred  ";
            num = num % 100;

        }
        if (num >= 20) {
            string += tens[num / 10] + " ";
            num = num % 10;
        }
        if (num > 0) {
            string += ones[num];
        }
        return string;

    }

    public static void main(String[] args) {
        NumberName numbersToWords = new NumberName();
        System.out.println(numbersToWords.numberToWord(900));
    }
}