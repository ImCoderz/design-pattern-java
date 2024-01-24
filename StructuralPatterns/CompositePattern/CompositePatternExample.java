import java.util.ArrayList;
import java.util.List;

// Component
interface Department {
    void printDepartment();
}

// Leaf
class FinanceDepartment implements Department {
    @Override
    public void printDepartment() {
        System.out.println("Finance Department");
    }
}

// Leaf
class HRDepartment implements Department {
    @Override
    public void printDepartment() {
        System.out.println("HR Department");
    }
}

// Composite
class CompositeDepartment implements Department {
    private List<Department> childDepartments;

    public CompositeDepartment() {
        this.childDepartments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }

    @Override
    public void printDepartment() {
        System.out.println("Composite Department");

        for (Department department : childDepartments) {
            department.printDepartment();
        }
    }
}

// Client Code
public class CompositePatternExample {
    public static void main(String[] args) {
        Department finance = new FinanceDepartment();
        Department hr = new HRDepartment();

        CompositeDepartment company = new CompositeDepartment();
        CompositeDepartment engineering = new CompositeDepartment();

        company.addDepartment(finance);
        company.addDepartment(hr);

        Department it = new FinanceDepartment();
        Department development = new HRDepartment();

        engineering.addDepartment(it);
        engineering.addDepartment(development);

        company.addDepartment(engineering);

        // Print the entire organizational structure
        company.printDepartment();
    }
}
