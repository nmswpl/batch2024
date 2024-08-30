package in.co.nmsworks.week3.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

    class personComparator implements Comparator<Person>{
        public int compare(Person p1, Person p2) {
            int ageComparison = Integer.compare(p1.getAge(),p2.getAge());
            if(ageComparison != 0){
                return ageComparison;
            }
            return p1.getName().compareTo(p2.getName());
        }
    }

    public void sortThePersonUsingAge(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jeff",22));
        personList.add(new Person("Sam", 22));
        personList.add(new Person("John", 24));
        personList.add(new Person("Kyle",21));

        Collections.sort(personList, new personComparator());
        System.out.println("Sorted Persons by age and name...");
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.sortThePersonUsingAge();

    }
}