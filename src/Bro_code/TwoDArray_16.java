//psvm forpublic static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
//sout for print
package Bro_code;

import java.util.Scanner;

/**
 *
 * @author mugdad
 */
public class TwoDArray_16 {

    public static void main(String[] args) {
        int rows, cols;
        System.out.println("enter the number of rows");
        Scanner scanner = new Scanner(System.in);
        rows = scanner.nextInt();
        System.out.println("enter the number of cols");
        cols = scanner.nextInt();
        scanner.nextLine();

        String[][] cars = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cars[i][j] = scanner.nextLine();

            }

        }
        System.out.println("the array elements you entered");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(cars[i][j] + "");
            }

        }

    }
}
