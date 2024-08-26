package in.co.nmsworks.week3.day5;

import java.util.HashMap;
import java.util.Map;

/***Create a class `Person` with fields `name` (String) and `age` (int). Write a program that sorts a `List<Person>`
 * first by age in ascending order and then by name in alphabetical order if ages are equal.
 **Challenge:** Implement sorting using a custom `Comparator` and the `Collections.sort` method. ****/
public class Person {
    private String name;
    private int age;

    public Person() {
    }

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

    public static void main(String[] args) {
        Map<Integer,Person> idToPerson = new HashMap<>();
        idToPerson.put(1,new Person("anbu ",12));
        idToPerson.put(2,new Person("anbu ",12));
        idToPerson.put(3,new Person("anbu ",12));
        for (Map.Entry<Integer, Person> integerPersonEntry : idToPerson.entrySet()) {
            System.out.println(integerPersonEntry.getValue());
        }
    }
}
