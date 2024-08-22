package in.co.nmsworks.week3.day4;

public class Question11 {
    public static void main(String[] args) {
        Question11 q11 = new Question11();
        q11.toDigits(289);
    }

    public void toDigits(int digit){
        int thirdDigit;
        thirdDigit = digit % 10;

        int lastTwoDig = digit % 100;

        int twoDigit = digit/ 10;
        int secondDigit;
        secondDigit = twoDigit % 10;
        int firstDigit = twoDigit / 10;

        if(secondDigit == 0 && thirdDigit == 0){
        switch (firstDigit){
            case 1 :
                System.out.print("One Hundred ");
                break;
            case 2:
                System.out.print("Two Hundred ");
                break;
            case 3:
                System.out.print("Three Hundred ");
                break;
            case 4:
                System.out.print("Four Hundred ");
                break;
            case 5:
                System.out.print("Five Hundred ");
                break;
            case 6:
                System.out.print("Six Hundred ");
                break;
            case 7:
                System.out.print("Seven Hundred ");
                break;
            case 8:
                System.out.print("Eight Hundred ");
                break;
            case 9:
                System.out.print("Nine Hundred ");
                break;
        }
        }
        else {
            switch (firstDigit){
                case 1 :
                    System.out.print("One Hundred and ");
                    break;
                case 2:
                    System.out.print("Two Hundred and ");
                    break;
                case 3:
                    System.out.print("Three Hundred and ");
                    break;
                case 4:
                    System.out.print("Four Hundred and ");
                    break;
                case 5:
                    System.out.print("Five Hundred and ");
                    break;
                case 6:
                    System.out.print("Six Hundred and ");
                    break;
                case 7:
                    System.out.print("Seven Hundred and ");
                    break;
                case 8:
                    System.out.print("Eight Hundred and ");
                    break;
                case 9:
                    System.out.print("Nine Hundred and ");
                    break;
            }

        }
        if(lastTwoDig >= 10 && lastTwoDig < 20){
            switch (lastTwoDig){
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.print("Twelve");
                    break;
                case 13:
                    System.out.print("Thirteen");
                    break;
                case 14:
                    System.out.print("Fourteen");
                    break;
                case 15:
                    System.out.print("Fifteen");
                    break;
                case 16:
                    System.out.print("Sixteen");
                    break;
                case 17:
                    System.out.print("Seventeen");
                    break;
                case 18:
                    System.out.print("Eighteen");
                    break;
                case 19:
                    System.out.print("Nineteen");
                    break;
            }
        }
        else if(secondDigit == 0){
            switch (secondDigit){
                case 2:
                    System.out.print("and Twenty ");
                    break;
                case 3:
                    System.out.print("and Thirty ");
                    break;
                case 4:
                    System.out.print("and Fourty ");
                    break;
                case 5:
                    System.out.print("and Fifty ");
                    break;
                case 6:
                    System.out.print("and Sixty ");
                    break;
                case 7:
                    System.out.print("and Seventy");
                    break;
                case 8:
                    System.out.print("and Eighty ");
                    break;
                case 9:
                    System.out.print("and Ninety ");
                    break;
            }
        }
        else {
            switch (secondDigit) {
                case 2:
                    System.out.print("Twenty ");
                    break;
                case 3:
                    System.out.print("Thirty ");
                    break;
                case 4:
                    System.out.print("Fourty ");
                    break;
                case 5:
                    System.out.print("Fifty ");
                    break;
                case 6:
                    System.out.print("Sixty ");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eighty ");
                    break;
                case 9:
                    System.out.print("Ninety ");
                    break;
            }
        }
        if(lastTwoDig > 20){
        switch (thirdDigit){
            case 1 :
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
        }
        }
        if(digit == 1000){
            System.out.println("One Thousand");
        }
    }
}

/* System.out.println(lastTwoDig);
        System.out.println(firstDigit);
        System.out.println(secondDigit);
        System.out.println(thirdDigit);*/
