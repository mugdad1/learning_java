public class Employee extends Person {
    private String deptName;

    public Employee(int id, String name, String deptName) {
        super(id, name);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    @Override
    public void welcomeMsg() {
        System.out.println("Welcome Employee");
    }
}
