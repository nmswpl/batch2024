package in.co.nmsworks.week3.day5.homework;

import java.util.Comparator;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    static class CompareByAge implements Comparator<Person> {
        public int compare(Person p1, Person p2) {
            if (p1.getAge() == p2.getAge())
                return p1.getName().compareTo(p2.getName());
            else
                return p1.getAge() - p2.getAge();
        }
    }
}

