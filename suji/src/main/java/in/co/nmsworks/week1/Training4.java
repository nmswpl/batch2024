package in.co.nmsworks.week1;

/*  Given a number as String, write a program that removes the leading 0
	Input :	0005640
	output:	5640   */





public class Training4 {
    public Training4()
  //  public static void main(String[] args)
    {

        String s = "000098706";
        String str = "0";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i))!=('0')) {
                System.out.println(s.substring(i,(s.length())));
                break;
            }
        }
    }
}

