package in.co.nmsworks.week3.practise;
/*
**Question-4:** Create a class `Person` with fields `name` (String) and `age` (int). Write a program that
sorts a `List<Person>` first by age in ascending order and then by name in alphabetical order if ages are equal.
**Challenge:** Implement sorting using a custom `Comparator` and the `Collections.sort` method.
 */

import java.util.ArrayList;
import java.util.List;

public class Person {
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

    public static void main(String[] args) {


        List<Person> people = new ArrayList<>();
        people.add(new Person("Prema", 21));
        people.add(new Person("Jeni", 20));
        people.add(new Person("Raji", 22));
        people.add(new Person("Nasi", 21));
    }
}

