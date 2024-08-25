package in.co.nmsworks.week3.practicequestions;

import java.sql.*;
import java.util.*;

public class CollectionsProg
{
    public void mergeList(String parfum,String prod)
    {
        List<String> perfume =new ArrayList<>();       //List 1
        perfume.add(parfum);

        List<String> products=new ArrayList<>();       //List 2
        products.add(prod);

        List<String> cosmetics=new ArrayList<>();      //Merged list
        cosmetics.addAll(perfume);
        cosmetics.addAll(products);

        for (String cosmetic : cosmetics)
        {
            System.out.println(cosmetic);
        }

}
    public List<String> readNames() throws SQLException
    {
        List<String> nameList=new ArrayList<>() ;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "nms", "");
             Statement stmt = con.createStatement())
        {
            ResultSet rs = stmt.executeQuery("select Name from student");
            for (int i = 0; i < 21; i++)
            {
                if (rs.next())
                {
                    nameList.add(rs.getString(1));
                }
            }
        }
        return nameList;
    }

    public Set<String> listToSet(List<String> strings)
    {
        Set<String> nameSet=new HashSet<>(strings);
        return nameSet;
    }

   public void setToMap(Set<String> set)
   {
       Map<String, Integer> nameMap = new HashMap<>();
       for (String s : set)
       {
           nameMap.put(s, s.length());
       }
       for (Map.Entry<String, Integer> e : nameMap.entrySet())
       {
           System.out.println(e.getKey() + "  " + e.getValue());
       }
   }


    public static void main(String[] args) throws SQLException {
       CollectionsProg ob=new CollectionsProg();
 //      ob.mergeList("Victoria Secret","Dot & Key");
  //     ob.mergeList("Mandarin Blast","Plum Goodness");
  //     ob.mergeList("Vanilla Swill","Pond's");
  //     ob.mergeList("Wottagirl","SoulTree Kajal");

     List<String> list=  ob.readNames();
      Set<String> set=ob.listToSet(list);
       ob.setToMap(set);

    }
    }
