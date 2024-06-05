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

//this code isn't the same as vid but better;)
public class switches_10 {

    public static void main(String[] args) {
        int input1, input2, result = 0;
        char operation=' ';
        
        System.out.println("Enter two integer values: ");
        Scanner scanner = new Scanner(System.in);
        input1 = scanner.nextInt();
        scanner.nextLine();
        input2 = scanner.nextInt();
        if (input1 > input2) {
            operation = '-';
        } else if (input1 < input2) {
            operation = '+';
        } else if (input1 == input2) {
            operation = '*';
        }
        switch (operation) {
            case '-':
                result = input1 - input2;
                break;
            case '+':
                result = input1 + input2;
                break;
            case '*':
                result = input1 * input2;
                break;

        }
        System.out.println("result is " + result);

    }

}
