package homework_week5;
/**
 * Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */

import java.util.ArrayList;

public class Programme_11_CompareOfArrayList {
    public static void main(String[] args) {

        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("pink");
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("pink");

        System.out.println("Array list c1 = " +c1);
        System.out.println("Array list c2 =" + c2);

        if (c1.equals(c2)== true){
            System.out.println("Array list are equal");
        }else{
            System.out.println("Array list are not equal");
        }
    }
}
