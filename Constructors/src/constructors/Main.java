//psvm forpublic static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
//sout for print
package constructors;

/**
 *
 * @author mugdad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human human = new Human("Rick ", 65, 70);
        Human human2 = new Human("morty", 65, 70);

        System.out.println(human2.name+"name +age:"+human2.age);//change name to age or weight
        human2.drink();
        human.drink();
        human.pickle();
        human2.eat();
        human.drink();
     }

}
