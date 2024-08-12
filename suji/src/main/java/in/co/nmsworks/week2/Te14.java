package in.co.nmsworks.week2;

//. Given an array of String, Write a Program to reverse the array and print.
//For E.g Input : arr[] = {a, b, c} Output : arr[] = {c, b, a}


public class Te14
{
    public static void main(String[] args) {

        String[] s = {"I", "am", "a", "girl"};
        String[] str = {""};

       /* for (int i = (s.length() - 1); i >= 0; i--) {
            str = str.concat(String.valueOf((s.charAt(i))));
        }
        System.out.println(str);
*/
        int l = s.length;
        for (int i = l - 1; i >= 0; i--) {
            //  str[]=str[] + s[i];
            //  str[l-i] = str+(String.valueOf((s[i])));
            System.out.println(s[i]);
            //str[i] = s[i];
        }

    }
    }


