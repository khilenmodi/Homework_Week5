package homework_week5;
/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

import java.util.ArrayList;
import java.util.List;

public class Programme_6_RetrieveAnElement {

    public static void main(String[] args) {
        List<String> colours = new ArrayList<>();
        colours.add("white");
        colours.add("Yellow");
        colours.add("Orange");
        colours.add("Red");
        colours.add("Purple");
        System.out.println(colours);
        String elements = colours.get(0);
        System.out.println("First elements :" + elements);
        elements = colours.get(2);
        System.out.println("Third elements : " + elements);
    }
}
