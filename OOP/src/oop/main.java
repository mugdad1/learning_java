//psvm forpublic static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
//sout for print
package oop;

/**
 *
 * @author mugdad
 */
public class main {

    public static void main(String[] args) {
        cars MyCar = new cars();
        System.out.println(MyCar.color);
        System.out.println(MyCar.make);
        System.out.println(MyCar.model);
        System.out.println(MyCar.price);
        System.out.println(MyCar.year);
        MyCar.drive();
        MyCar.brake();
    

}
}