//psvm forpublic static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
//sout for print
package variablescoope;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author mugdado
 */
public class DiceRoller {
    Random random;
    int number = 0;
    DiceRoller() {
        
         random = new Random();
        roll();

    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);

    }

}
