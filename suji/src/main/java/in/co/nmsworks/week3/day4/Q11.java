package in.co.nmsworks.week3.day4;

public class Q11
{
    int number;

    public void assignNum(int number)
    {
        int num = number;
        int hundredth = 0;
        int tenth = 0;
        int ones = 0;
        int spl = 0;

        hundredth = num / 100;
        ones = num % 10;
        tenth = num % 100 - (ones);
        spl = num % 100;
        int c = 0;

        // System.out.println(" Hundredth value " + hundredth);
        // System.out.println("Tenth place value " + tenth);
        // System.out.println("one's tense " + ones);
        // System.out.println("Spl " + spl);

        String one = "";
        String ten = "";
        String hundrend;
        String special = "";

        if (number == 1000)
        {
            System.out.println(" ONE THOUSAND");
        }
        else
        {
            switch (spl)
            {
                case 11:
                    special = "ELEVEN";
                    break;
                case 12:
                    special = "TWELVE";
                    break;
                case 13:
                    special = "THIRTEEN";
                    break;
                case 15:
                    special = "FIFTEEN";
                    break;
                case 10:
                    special = "TEN";
                    break;
                default:
                    c = c + 1;
                    break;
            }

            if (c == 1)
            {
                switch (ones)
                {
                    case 1:
                        one = "ONE";
                        break;
                    case 2:
                        one = "TWO";
                        break;
                    case 3:
                        one = "THREE";
                        break;
                    case 4:
                        one = "FOUR";
                        break;
                    case 5:
                        one = "FIVE";
                        break;
                    case 6:
                        one = "SIX";
                        break;
                    case 7:
                        one = "SEVEN";
                        break;
                    case 8:
                        one = "EIGHT";
                        break;
                    case 9:
                        one = "NINE";
                        break;
                    default:
                        one = " ";
                        break;
                }
            }

            switch (tenth)
            {
                case 10:
                    if (c == 1)
                    {
                        ten = one + "TEEN";
                        one = "";
                    }
                    break;
                case 20:
                    ten = "TWENTY";
                    break;
                case 30:
                    ten = "THIRTY";
                    break;
                case 40:
                    ten = "FOURTY";
                    break;
                case 50:
                    ten = "FIFTY";
                    break;
                case 60:
                    ten = "SIXTY";
                    break;
                case 70:
                    ten = "SEVENTY";
                    break;
                case 80:
                    ten = "EIGHTY";
                    break;
                case 90:
                    ten = "NINETY";
                    break;
                default:
                    ten = " ";
                    break;
            }

            switch (hundredth)
            {
                case 1:
                    hundrend = "ONE";
                    break;
                case 2:
                    hundrend = "TWO";
                    break;
                case 3:
                    hundrend = "THREE";
                    break;
                case 4:
                    hundrend = "FOUR";
                    break;
                case 5:
                    hundrend = "FIVE";
                    break;
                case 6:
                    hundrend = "SIX";
                    break;
                case 7:
                    hundrend = "SEVEN";
                    break;
                case 8:
                    hundrend = "EIGHT";
                    break;
                case 9:
                    hundrend = "NINE";
                    break;
                default:
                    hundrend = " ";
                    break;
            }
            if (hundredth!=0)
            {
                if (spl == 0)
                {
                    hundrend = hundrend + " HUNDREND  ";
                }
                else
                {
                    hundrend = hundrend + " HUNDREND AND ";
                }
            }

            if (c == 1)
            {
                System.out.println(" The number "+number+"  as words is  " + hundrend + " " + ten + " " + one + " ");
            }
            else
                System.out.println(" The number "+number+"  as words is   " + hundrend + " " + special + " " + one + " ");
        }
    }

    public static void main(String[] args)
    {
        Q11 ob=new Q11();
        ob.assignNum(87);
    }
}
