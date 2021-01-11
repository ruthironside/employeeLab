package staff.management;

public class Director extends Manager {

    private double budget;


    public Director(double budget, String name, String nationalInsuranceNo, double salary, String deptName) {
        super(name, nationalInsuranceNo, salary,deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
