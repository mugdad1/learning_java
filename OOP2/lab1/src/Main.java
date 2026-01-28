public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Ali", "IT");
        Dependent dep1 = new Dependent(101, "Sara");
        Dependent dep2 = new Dependent(102, "Ahmed");

        Emp_Dependents ed1 = new Emp_Dependents(emp1);
        ed1.addDependent(dep1);
        ed1.addDependent(dep2);

        Records records = new Records();
        records.add(ed1);

        records.viewAllRecords();
    }
}
