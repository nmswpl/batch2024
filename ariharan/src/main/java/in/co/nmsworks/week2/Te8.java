package in.co.nmsworks.week2;
//Given a 3digit number, write a program to print the hundred position value in words.
//E.g 1: Input : 542 Output : Five.
//        E.g 2: Input : 777 Output : Seven.
public class Te8 {
    public void hunPos(int val){
        int hunval=val/100;
       if(hunval==1){
           System.out.println("one");
       }
       else if(hunval==2){
            System.out.println("two");
        }
       else if(hunval==3){
           System.out.println("three");
       }
       else if(hunval==5){
           System.out.println("five");
       }
       else if(hunval==4){
           System.out.println("four");
       }
       else if(hunval==6){
           System.out.println("six");
       }
       else if(hunval==7){
           System.out.println("seven");
       }
       else if(hunval==8){
           System.out.println("eight");
       }
       else if(hunval==9){
           System.out.println("nine");
       }
    }
}
