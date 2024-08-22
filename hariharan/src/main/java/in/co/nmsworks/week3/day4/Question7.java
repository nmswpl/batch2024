package in.co.nmsworks.week3.day4;

public class Question7 {
    public Question7(int number1, int number2) {

        int gcd =1;
        if(number1 / 2 == number2){
            System.out.println("GCD is : "+ number2);
        }else if(number1 / 2 >number2){
            for(int i =1;i<number2/2;i++){
                if((number1 % i == 0) && (number2 % i == 0) ){
                    gcd =i;
                }
            }
        }else{
            for(int i =1;i<number2/2;i++){
                if((number1 % i == 0) && (number2 % i == 0) ){
                    gcd =i;
                }
            }
        }

        System.out.println("GCD:" + gcd);
    }

}
