package homework_week5;
/**
 * Write a Java program to test if an array list is empty or not.
 */

import java.util.ArrayList;

public class Programme_7_ArrayListEmptyOrNot {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>(10);

        boolean ans = array.isEmpty();
        if (ans == true){
            System.out.println("The ArrayList is empty");
        }else {
            System.out.println("The ArrayList is not empty");
        }
        array.add(1);
        ans = array.isEmpty();
        if (ans == true){
            System.out.println("The Arraylist is empty");
        }else {
            System.out.println("The ArrayList is not empty");
        }
    }
}
