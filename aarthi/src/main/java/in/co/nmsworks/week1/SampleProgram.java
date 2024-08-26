package in.co.nmsworks.week1;

public class SampleProgram
{
    public static void main(String[] args)
    {
        String s2 = "sanjeev-kumar";
        System.out.println(s2.indexOf("-"));
        String a = s2.substring(8);
        System.out.println(a);


        String s="NMS";
        String s1="NMS";
        if(s1.equals(s))
        {
            System.out.println("equals");
        }
        else
        {
            System.out.println("not equals");
        }


    }
}
