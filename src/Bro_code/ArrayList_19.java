//psvm forpublic static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
//sout for print
package Bro_code;

import java.util.ArrayList;

/**
 *
 * @author mugdad
 */
public class ArrayList_19 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();//must use the wrapper data type INteger(right) (int)wrong  

        names.add("David");
        names.add("tarry");//adds without index
        names.add("Mugdad");
        names.add(0, "nigg");//adds with index
        names.remove(2);
        names.set(0, "bb");//sets in a index even if it was occupied
        //names.clear();//rm -rf /

        for (int i = 0; i < names.size(); ++i) {
            System.out.println(names.get(i));

        }

    }

}
