package in.co.nmsworks.week1;

public class Training8 {
    public static void main(String[] args) {
        String s="Blue is my fav color";
                String str=s.toUpperCase();
                for(int i=0;i<s.length()-1;i++)
                {
                    if((s.charAt(i)==' ')||i==0)
                    {
                        s=s.replace(s.charAt(i+1),str.charAt(i+1));
                    }
                }
                System.out.println(s);
            }
        }
