/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
        human2.eat();
        human.drink();
        
    }

}
