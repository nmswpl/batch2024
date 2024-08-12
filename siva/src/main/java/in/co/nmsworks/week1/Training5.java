package in.co.nmsworks.week1;

/**
 * print each sentence in the given paragraph in a new line
 */
public class Training5 {
    String s;

    public void sentence()
    {
        String[] strings=s.split("\\.");
        for(String s2:strings)
        {
            System.out.println(s2);
        }
    }
}
