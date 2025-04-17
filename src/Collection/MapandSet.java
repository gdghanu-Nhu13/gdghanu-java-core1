package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapandSet {
    public static void main(String[] args) {
        // using map to store student scores
        Map<String, Integer> score = new HashMap<>();
        score.put("Alice", 90);
        score.put("Bob", 85);
        score.put("Clarlie", 95);

        System.out.println("Alice's score: " + score.get("Alice"));
        System.out.println("all key-value pairs in the map: ");
        for(Map.Entry<String, Integer> entry : score.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("--");

        // using set to store course the student has registered for
        Set<String> registeredCourses = new HashSet<>();
        registeredCourses.add("Math");
        registeredCourses.add("Literature");
        registeredCourses.add("English");
        registeredCourses.add("Math"); // set will ignore bcoz uniqueness
        System.out.println("registered courses: ");
        for(String course : registeredCourses) {
            System.out.println(course);
        }
        System.out.println("number of registered courses: " + registeredCourses.size());
        System.out.println("has math been registered? " + registeredCourses.contains("Math"));
    }
}
