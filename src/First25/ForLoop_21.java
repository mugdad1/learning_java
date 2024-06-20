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
public class ForLoop_21 {
    public static void main(String[] args) {
          ArrayList<String> producelist = new ArrayList();

        producelist.add("apple");
        producelist.add("banana");
        producelist.add("orange");
        String[] animals={"cats","dog","you","bird"};
        for (String i : animals){
            System.out.println(i);
         
            
        }
        for(String l: producelist){//for array list printing
            System.out.println(l);
        }
    }
    
}
