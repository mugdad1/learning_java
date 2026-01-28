public class Dependent extends Person {

    public Dependent(int id, String name) {
        super(id, name);
    }

    @Override
    public void welcomeMsg() {
        System.out.println("Welcome Dependent");
    }
}
