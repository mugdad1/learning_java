//psvm forpublic static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
//sout for print

   
        // wrapper class =  provides a way to use primitive data types as reference data types
        //     reference data types contain useful methods
        //     can be used with collections (ex.ArrayList)

        //primitive  //wrapper
        //---------  //-------
        // boolean  Boolean
        // char   Character
        // int   Integer
        // double  Double

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
package Bro_code;

/**
 *
 * @author mugdad
 */
public class WrapperClasses_18 {

    public static void main(String[] args) {
        Integer x = 4;
        System.out.println(x.byteValue());
        System.out.println(x);
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";
        if (a == true) {
            if (b == '@') {
                if (c == 123) {
                    System.out.println("m");

                }
            }
        }

    }

}
