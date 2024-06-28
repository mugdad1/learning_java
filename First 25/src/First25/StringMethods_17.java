//psvm forpublic static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
//sout for print
package First25;

/**
 *
 * @author mugdad
 */
public class StringMethods_17 {

    public static void main(String[] args) {
        String name = "mkm";
        String lol = "0";
            name.replaceAll("[aeiou]", "");
            
            System.out.println(name.charAt(0));//finds the char at index
            System.out.println(name.contains("m"));
    }

}

//boolean result = name.equals("nihhs");//check if name is the variable is the same as the between parantheses()
        //int result = name.length();//finds the length of the char
        //char result = name.charAt(1);//finds the char at specific index
        //int result= name.indexOf("o");
        //boolean result = name.isEmpty();
        //String result = name.toLowerCase(); //change all to lower case
        //String result = name.replace("r", "M");//replace 1 with 2
        //String result = name.substring(1,3);//gets the string from the index to the index
        //7String result = name.trim();//removes spaces from begging and last
        //String result = name.replaceAll("\\s","");
 /*String result =name.replace('R', ' ');
        String result =name.replace('r', ' ');
        String result =name.replace('o', ' ');
        String result =name.replace('o', ' ');

        System.out.println(result);//prints the result*/
    