//psvm for     public static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
package First25;

import java.util.Scanner;

public class Mathclass_7 {

    public static void main(String[] args) {

        double x, y, z;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the length of side x (adjacent side): ");
            x = scanner.nextDouble();

            System.out.print("Enter the length of side y (opposite side): ");
            y = scanner.nextDouble();

            z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

            System.out.println("\nYou entered the following values:");
            System.out.println("Length of side x (adjacent side): " + x);
            System.out.println("Length of side y (opposite side): " + y);
            System.out.println("The calculated hypotenuse (z) is: " + z);
        } catch (Exception e) {
            System.out.println("An error occurred. Please enter valid numeric values.");
        }
    }
}

/*
*max(maximum num)
*min(obsit)
*abs(abstract)
*sqrt
*round(rounds a number)
ceil 
floor
pow
all this is math
(Math.*)
 */
