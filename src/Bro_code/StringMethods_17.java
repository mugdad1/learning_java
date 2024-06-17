//psvm forpublic static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
//sout for print
package Bro_code;

/**
 *
 * @author mugdad
 */
public class StringMethods_17 {

    public static void main(String[] args) {
        String name = "   Bro    ";
        //boolean result = name.equals("nihhs");//check if name is the variable is the same as the between parantheses()
        //int result = name.length();//finds the length of the char
        //char result = name.charAt(1);//finds the char at specific index
        //int result= name.indexOf("o");
        //boolean result = name.isEmpty();
        //String result = name.toLowerCase(); //change all to lower case
        //String result = name.replace("r", "M");//replace 1 with 2
        //String result = name.substring(1,3);//gets the string from the index to the index
        String result = name.trim();//removes spaces from begging and last
        System.out.println(result);//prints the result
    }

}
