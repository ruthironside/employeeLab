package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String depName;

    public Manager(String name, String nationalInsuranceNo, double salary, String deptName) {
        super(name, nationalInsuranceNo, salary);
        this.depName = deptName;
    }

    public String getDepName() {
        return depName;
    }
}
