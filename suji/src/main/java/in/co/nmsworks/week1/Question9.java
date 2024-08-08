
package in.co.nmsworks.week1;

/*To print a alphabetical order pattern
 A
 BB
 CCC
 DDDD
 EEEEE
 FFFFFF
 GGGGGGG
*/
public class Question9
{
    public static void main(String[] args)
    {
        String a[] = {"A", "B", "C","D","E","F","G"};

        for(int i = 0; i < a.length; i++)
        {
            for (int j = 0; j<=i; j++)
            {
                System.out.print(a[i]);
            }
            System.out.println();
        }


        }
    }




