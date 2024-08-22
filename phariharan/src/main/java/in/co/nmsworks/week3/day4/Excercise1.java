package in.co.nmsworks.week3.day4;

public class Excercise1 {
    public static void main(String[] args) {
        Excercise1 excercise1 = new Excercise1();
        String binaryInString = "110";
        System.out.println("Value of Binary "+binaryInString+" in Decimal is : " +excercise1.binaryToString(binaryInString));
    }

    public int computePower(int a, int b){
        int answer = 1;
        for (int i = 1; i <= b; i++) {
            answer *= a;
        }
        return answer;
    }

    private int binaryToString(String a) {
        int sum = 0;
        for (int i =a.length()-1; i >=0 ; i--) {
            int values  = Integer.parseInt(String.valueOf(a.charAt(i)))*computePower(2,a.length()-1-i);
            sum = sum + values;
        }
        return sum;
    }
}
