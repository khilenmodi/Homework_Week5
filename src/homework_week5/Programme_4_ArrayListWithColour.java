package homework_week5;
/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

import java.util.ArrayList;

public class Programme_4_ArrayListWithColour {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Yellow");
        list.add("Red");
        list.add("Blue");
        list.add("White");
        list.add("Purple");
        list.add("Pink");
        System.out.println(list.size());
        System.out.println(list);

        for (Object name: list) {
            System.out.println(name);

        }

    }
}
