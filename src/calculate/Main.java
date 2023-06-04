package calculate;
/**
 * 4. Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        char choice;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("please enter the first number :");
            int x = scanner.nextInt();
            System.out.println("please enter the second number :");
            int z = scanner.nextInt();
            System.out.println("please enter one of symbol (+,_,*,/) :");
            char symbol = scanner.next().charAt(0);
            calculator.calculateResult(x, z, symbol);
            System.out.println("would you like to do more calculation please enter 'Y' or 'N' :");
            choice = scanner.next().charAt(0);
        }
        while (choice == 'Y' && choice == 'y');
        scanner.close();
        System.out.println("Program terminated");

    }

}



