package in.co.nmsworks.week2.practice.collections;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



    public class Telephone {
        Map<String, List<Contact>> alp;
        List<Contact> s = new ArrayList<>();
        List<Contact> k = new ArrayList<>();
        List<Contact> h = new ArrayList<>();
        List<Contact> a = new ArrayList<>();
        List<Contact> p = new ArrayList<>();
        List<Contact> m = new ArrayList<>();
        List<Contact> j = new ArrayList<>();
    public void display() {
        Contact ob1 = new Contact("Ari", 1);
        Contact ob2 = new Contact("ArunRaj", 2);
        Contact ob3 = new Contact("Arthi", 3);
        Contact ob5 = new Contact("Priya", 5);
        Contact ob6 = new Contact("Madhu", 6);
        Contact ob4 = new Contact("Prema", 4);
        Contact ob7 = new Contact("Pavi", 7);
        Contact ob8 = new Contact("Jeni", 8);
        Contact ob9 = new Contact("Suji", 9);
        Contact ob10 = new Contact("Jenish", 10);
        Contact ob11 = new Contact("HariKr", 11);
        Contact ob12 = new Contact("Muthuraj", 12);
        Contact ob13 = new Contact("Krishna", 13);
        Contact ob14 = new Contact("PHari", 14);
        Contact ob15 = new Contact("Siva", 15);



        a.add(ob1);
        a.add(ob2);
        a.add(ob3);


        p.add(ob5);
        p.add(ob4);
        p.add(ob7);


        m.add(ob6);
        m.add(ob12);


        j.add(ob8);
        j.add(ob10);


        h.add(ob11);
        h.add(ob14);


        s.add(ob15);
        s.add(ob9);


        k.add(ob13);


       alp=new HashMap<>();
        alp.put("A", a);
        alp.put("P", p);
        alp.put("K", k);
        alp.put("J", j);
        alp.put("S", s);
        alp.put("H", h);
        alp.put("M", m);

      //  System.out.println(alp.size());
    }

    public void search(String s)
    {
        String s1= String.valueOf(s.charAt(0));
       System.out.println(alp.get(s1));
       List<Contact> list=alp.get(s1);
       for (Contact c:list)
       {
           if(c.getName().equalsIgnoreCase(s))
           {
               System.out.println("NAME ::"+c.getName());
               System.out.println("ID ::"+c.getId());

           }
       }





    }
        public static void main(String[] args) {
        Telephone ob1=new Telephone();
        ob1.display();
        ob1.search("Suji".toString());


        }
        class Contact {

            @Override
            public String toString() {
                return "Contact{" +
                        "name='" + name + '\'' +
                        ", id=" + id +
                        '}';
            }

            String name;
            Integer id;

            public String getName() {
                return name;
            }

            public Contact(String name, Integer id) {
                this.name = name;
                this.id = id;
            }

            public Integer getId() {
                return id;
            }



        }

}




