package in.co.nmsworks.week3.practicequestions;

import java.util.HashMap;
import java.util.Map;

class Student
{
    String name;
    int UniqueId;

    public Student(String name, int uniqueId)
    {
        this.name = name;
        UniqueId = uniqueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUniqueId() {
        return UniqueId;
    }

    public void setUniqueId(int uniqueId) {
        UniqueId = uniqueId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", UniqueId=" + UniqueId +
                '}';
    }


}
public class StudUniqueId
{
   static Map<Integer ,Student> mapOfStudents=new HashMap<>();


    public  void deleteMap(Map<Integer, Student> map, int id)
    {
        for (Map.Entry<Integer,Student> e:mapOfStudents.entrySet())
        {
            if (e.getKey()==id)
            {
                mapOfStudents.remove(e.getKey(),e.getValue());
            }
        }
    }


   public  void display(Map<Integer,Student> map)
   {
       for (Map.Entry<Integer,Student> e:mapOfStudents.entrySet())
       {
           System.out.println(e.getKey()+" "+e.getValue());
       }
   }

   public  void searchMap(Map<Integer,Student> map,int id)
   {
       int c=0;
       for (Map.Entry<Integer,Student> e:mapOfStudents.entrySet()) {
           if (e.getKey() == id)
           {
               c = c + 1;
           }
       }
          if(c==1)
          {
              System.out.println("Search sucessful");
          }
          else {
              System.out.println("Search not sucessful !");

          }}

    public void addMap(String name,int id)
    {
       Student ob=new Student(name,id);
       mapOfStudents.put(id,ob);
    }
    public static void main(String[] args)           //add details
    {

        StudUniqueId ob=new StudUniqueId();
        ob.addMap("Suji",14);

        ob.searchMap(mapOfStudents,11);
       ob.display(mapOfStudents);
       ob.deleteMap(mapOfStudents,65);

   }

}
