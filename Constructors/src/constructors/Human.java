//psvm forpublic static void main(String[] args) {
//alt shift f for orgnize
//f6 for run
//sout for print
package constructors;

/**
 *
 * @author mugdad
 */
public class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }
    void eat(){
        System.out.println(this.name+" is eating");
    }
    void    drink(){
        System.out.println(this.name+"is drinking *burp* ");
        
    }
    void pickle(){
        System.out.println("i'm pickle rickkkk morty ");
    }

}
