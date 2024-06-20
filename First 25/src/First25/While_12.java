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
public class While_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isBlank()) {
            System.out.println("enter your name");
            name = scanner.nextLine();

        }
        System.out.println("Hello:" + name);

    }

}
