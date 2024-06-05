//psvm for     public static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
//sout for print
package Bro_code;

/**
 *
 * @author mugdad
 */
import java.util.Scanner;

public class If_Else_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how old are you");
        int age = scanner.nextInt();
        while (age == 69) {
            System.out.print(" nice ");
            break;

        }

        if (age <= 13 && age >= 0) {
            System.out.println("hi kid");

        } else if (age >= 13 && age <= 40) {
            System.out.println("hi adult");

        } else if (age >= 41 && age <= 90 && age != 69) {
            System.out.println("hi grandpa");
        } else {
            System.out.println("wtf ");

        }

    }
}
