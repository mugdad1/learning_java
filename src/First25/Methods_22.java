//psvm forpublic static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
//sout for print
package First25;

/**
 *
 * @author mugdad
 */
public class Methods_22 {
    public static void main(String[] args) {
        //methods is a block of code that is executed whenever it is called upon
        int x = 3;
        int y = 4;
        int z = add(x, y);

        String  name = "bro";
        System.out.println(z); 

        hello(name);
      
        
   
        
         
        
        
    }
    static int add(int x , int y){//type and bring the variables from
      
        int z = x+y;
        return z;//return value
    }
   static void hello(String name){
        System.out.println("hello");
        System.out.println(name);
    }
}
/*static void then method folowed  by (){ code}*/