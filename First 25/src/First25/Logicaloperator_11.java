//psvm forpublic static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
//sout for print
package First25;

import java.util.Scanner;

/**
 *
 * @author mugdad
 */
//scrool down for other way using while:
public class Logicaloperator_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("you are playing a game press q or Q to quit:");
        String response = scanner.next();
        if (response.equals("q") || response.equals("Q")) {
            System.out.println("you quit the game");

        } else {
            System.out.println("lol ");

        }

    }

}
/*
import java.util.Scanner;

public class Logicaloperator_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "";

        while (!response.equalsIgnoreCase("q")) {
            System.out.println("You are playing a game. Press 'q' to quit:");
            response = scanner.next();

            if (response.equalsIgnoreCase("q")) {
                System.out.println("You quit the game");
            } else {
                System.out.println("lol");
            }
        }

        scanner.close();
    }
}

*/




//do while
/*
import java.util.Scanner;

public class Logicaloperator_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;

        do {
            System.out.println("You are playing a game. Press 'q' to quit:");
            response = scanner.next();

            if (response.equalsIgnoreCase("q")) {
                System.out.println("You quit the game");
            } else {
                System.out.println("lol");
            }
        } while (!response.equalsIgnoreCase("q"));

        scanner.close();
    }
}

*/

