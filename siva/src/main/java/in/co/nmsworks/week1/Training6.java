package in.co.nmsworks.week1;

public class Training6 {
    String s;

    public void countVowels(){
        int sum=0;
        int sum1=0;
        for(int  i=s.charAt(s.length()-1);i>=0;i--)
        {
            if(i=='A'||i=='a'||i=='E'||i=='e'||i=='I'||i=='O'||i=='o'||i=='U'||i=='u')
            {
                sum=sum+1;


            }
            else
            {
                sum1=sum1+1;

            }


        }
        System.out.println(sum);
        System.out.println(sum1);

    }
}
