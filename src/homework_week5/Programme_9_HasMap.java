package homework_week5;
/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;

public class Programme_9_HasMap {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Rupalben", 40);
        people.put("Nehaben", 38);
        people.put("jaydeepbhai", 28);
        people.put("nevilbhai", 30);
        people.put("kamleshbhai", 40);
        people.put("Arunaben", 35);

        for (String i: people.keySet()) {
            System.out.println("key: " + i + "   Value: " +people.get(i));

        }
    }
}
