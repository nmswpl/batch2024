package in.co.nmsworks.week3.assesment.weekend1;
/* Given two `Set<String>` instances, write a method that returns a `Set<String>`
containing the elements that are present in both sets (intersection).
 */

import java.util.HashSet;
import java.util.Set;

public class Question2 {
    public Set<String> setIntersection() {
        Set<String> flowers1 = new HashSet<>();
        flowers1.add("Rose");
        flowers1.add("Lotus");
        flowers1.add("Lily");
        flowers1.add("Jasmine");

        Set<String> flowers2 = new HashSet<>();
        flowers2.add("Lily");
        flowers2.add("Jasmine");
        flowers2.add("Hibiscus");

        Set<String> resultSet = new HashSet<>(flowers1);
        resultSet.retainAll(flowers2);
        return resultSet;
    }
}
