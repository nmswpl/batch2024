package in.co.nmsworks.week2;

/*Given a 3 digit number, write a program to print the hundred position value in words.
E.g 1: Input : 542 Output : Five.
        E.g 2: Input : 777 Output : Seven.*/

public class Te8 {
    public void hundredPosition(){
        String str="542";
        char ch;
        ch=str.charAt(0);
        String hundreds="";
        switch (ch){
            case 1:
                hundreds="One";
                break;
            case 2:
                hundreds="Two";
                break;
            case 3:
                hundreds="Three";
                break;
            case 4:
                hundreds="Four";
                break;
            case 5:
                hundreds="Five";
                break;
            case 6:
                hundreds="Six";
                break;
            case 7:
                hundreds="Seven";
                break;
            case 8:
                hundreds="Eight";
                break;
            case 9:
                hundreds="Nine";
                break;
        }
        System.out.println("Input : "+str+" Output : "+hundreds);
    }
}
