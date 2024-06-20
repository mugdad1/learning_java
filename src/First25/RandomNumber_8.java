//psvm for     public static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
package First25;
import java.util.Random;
/**
 *
 * @author mugdad
 */
public class RandomNumber_8 {
    public static void main(String[] args) {
        Random random=new Random();
        int x = random.nextInt(6);//parameter is for limiting random now its 0 to 5
        //if u want 6 add + 1 or vhange 6 to 7
        double y = random.nextDouble(100.0);
        boolean z =random.nextBoolean();
        System.out.println(y);
        System.out.println(z);
        
        System.out.println(x);
        
    }
    
}
