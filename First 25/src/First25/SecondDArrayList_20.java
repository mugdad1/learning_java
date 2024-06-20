//psvm forpublic static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
//sout for print
package First25;

import java.util.ArrayList;

/**
 *
 * @author mugdad
 */
public class SecondDArrayList_20 {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> grocerylist = new ArrayList();
        ArrayList<String> bakerylist = new ArrayList();
        bakerylist.add("pasta");
        bakerylist.add("bread");
        bakerylist.add("donuts");
        bakerylist.add("garlicbread");
        ArrayList<String> producelist = new ArrayList();

        producelist.add("apple");
        producelist.add("banana");
        producelist.add("orange");
        ArrayList<String> diarylist = new ArrayList();

        diarylist.add("milk");
        diarylist.add("yougrt");
        diarylist.add("butter");
        grocerylist.add(bakerylist);
        grocerylist.add(producelist);
        grocerylist.add(diarylist);

        System.out.println(/*gets the specific index*/grocerylist.get(0).get(1));

    }

}
