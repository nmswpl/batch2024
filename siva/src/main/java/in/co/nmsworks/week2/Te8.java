package in.co.nmsworks.week2;

/**
 * .Given a 3 digit number, write a program to print the hundred position value in words.
 * E.g 1: Input : 542 Output : Five.
 * E.g 2: Input : 777 Output : Seven.
 */
public class Te8 {
    int a;
    int b;

    public void hundredPosition(){

            b=a/100;
            switch (b){
        case 1:
            System.out.println("ONE");
            break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("ONE");
                    break;
                case 5:
                    System.out.println("ONE");
                    break;
                case 6:
                    System.out.println("ONE");
                    break;
                case 7:
                    System.out.println("ONE");
                    break;
                case 8:
                    System.out.println("ONE");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
                default:
                    System.out.println("ZERO");




        }
    }
}
