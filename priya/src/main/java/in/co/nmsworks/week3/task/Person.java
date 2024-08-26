package in.co.nmsworks.week3.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void comparePersons() {
        Comparator<Person> CompareByAge = (a, b) -> a.age > b.age ? 1 : -1;
        Comparator<Person> CompareByName = new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                if (a.name.compareTo(b.name) > 0) {
                    return 1;
                } else if (a.name.compareTo(b.name) == 0) {
                    if (a.age > b.age) {
                        return 1;
                    }
                } else return -1;
                return 0;
            }
        };
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Priya", 21));
        personList.add(new Person("Priya", 22));
        personList.add(new Person("Mani", 22));
        personList.add(new Person("Oviya", 23));
        personList.add(new Person("Praveen", 25));
        personList.add(new Person("renu", 20));
        personList.add(new Person("ravi", 19));
        Collections.sort(personList, CompareByAge);
        for (Person person : personList) {
            System.out.println(person);
        }
        System.out.println("******************************");
        Collections.sort(personList, CompareByName);
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.comparePersons();
    }
}

