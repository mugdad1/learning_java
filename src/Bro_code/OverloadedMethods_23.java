//psvm forpublic static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
//sout for print
package Bro_code;

/**
 *
 * @author mugdad
 */
public class OverloadedMethods_23 {
    public static void main(String[] args) {
        int b = add(1,2);
        int y = 2;
        int z = 3;
        System.out.println(b);
        
    }
    static int add(int a , int b){
        System.out.println("thus is overloaded method1");
        return a +b;
        
    }
        static int add(int x , int y,int z){
            System.out.println("this is over loaded method 2 ");
        return x+y+z;
    }
}
