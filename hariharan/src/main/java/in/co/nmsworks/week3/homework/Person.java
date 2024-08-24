package in.co.nmsworks.week3.homework;

import java.util.*;

public class Person {

    static List<Person> people = new ArrayList<Person>();
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    static class SortPerson implements Comparator<Person> {
            public int compare(Person p1, Person p2) {
                int value = p1.getAge() - p2.getAge();
                if(value == 0){
                    return p1.getName().compareTo(p2.getName());
                }else {
                    return value;
                }
            }
   }

    public static void main(String[] args) {

       people.add(new Person("hari",23));
       people.add(new Person("jenish",22));
       people.add(new Person("arun",25));
       people.add(new Person("arjun",25));

        Collections.sort(people,new SortPerson());
        for (Person person : people) {
            System.out.println("Name "+person.getName()+"\n" + "Age" + person.getAge()+"\n");
        }
    }


}
