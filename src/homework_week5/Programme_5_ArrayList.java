package homework_week5;
/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class Programme_5_ArrayList {

    public static void main(String[] args) {
        // creating an Array list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("Arraylist : " +numbers);

        // using iterate
         ListIterator<Integer> iterate = numbers.listIterator();
        System.out.println("Iterating over Arraylist :");
        while (iterate.hasNext()){
            System.out.println(iterate.next() + " , ");
        }

    }


}
