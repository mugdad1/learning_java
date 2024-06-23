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

public class For_13 {

    public static void main(String[] args) {
        int n, sum = 0;
        System.out.println("enter a positve number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("even  numbers from 1 to " + n + "\n");
        for (int counter = 1; counter <= n; counter++) {
            if (counter % 2 == 0) {
                System.out.print(counter + " ");
                sum = sum + counter;
                

            }

        }
        System.out.println("\nsum of all even num " + sum);

    }
}
