import java.util.ArrayList;

public class Records {
    private ArrayList<Emp_Dependents> list;

    public Records() {
        list = new ArrayList<>();
    }

    public void add(Emp_Dependents empDependents) {
        list.add(empDependents);
    }

    public void viewAllRecords() {
        for (Emp_Dependents ed : list) {
            ed.display();
            System.out.println("--------------------------");
        }
    }
}
