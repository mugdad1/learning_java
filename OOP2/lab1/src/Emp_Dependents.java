import java.util.ArrayList;

public class Emp_Dependents {
    private Employee employee;
    private ArrayList<Dependent> dependents;

    public Emp_Dependents(Employee employee) {
        this.employee = employee;
        this.dependents = new ArrayList<>();
    }

    public void addDependent(Dependent dependent) {
        dependents.add(dependent);
    }

    public void display() {
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Department: " + employee.getDeptName());

        System.out.println("Dependents:");
        for (Dependent d : dependents) {
            System.out.println("  - " + d.getName() + " (ID: " + d.getId() + ")");
        }
    }
}
