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
public class Nestedloop_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;
        String symbol = "";
        System.out.println("enter the number of rows");
        rows = scanner.nextInt();
        System.out.println("enter the number of cols");
        cols = scanner.nextInt();
        System.out.println("enter the symbol");
        symbol = scanner.next();
        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= cols; j++) {
                System.out.print(symbol);

            }
        }
        System.out.println("");
        scanner.close();
    }

}
