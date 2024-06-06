package Bro_code;

/**
 *
 * @author mugdad
 */
import java.util.Scanner;

public class If_Else_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        do {
            // Prompt the user to enter their age
            System.out.println("Enter your age (-1 to exit): ");
            age = scanner.nextInt();

            // Check if the user wants to exit
            if (age == -1) {
                System.out.println("Exiting program...");
                break;
            }

            // Check the age and display appropriate message
            if (age == 69) {
                System.out.println("Nice ");
            } else if (age <= 13 && age >= 0) {
                System.out.println("Hi kid");
            } else if (age >= 13 && age <= 40) {
                System.out.println("Hi adult");
            } else if (age >= 41 && age <= 90 && age != 69) {
                System.out.println("Hi grandpa");
            } else {
                System.out.println("wtf");
            }
        } while (true);
    }
}
