package staff;

public abstract class Employee {

    private String name;
    private String nationalInsuranceNo;
    private double salary;



    public Employee(String name, String nationalInsuranceNo, double salary) {
        this.name = name;
        this.nationalInsuranceNo = nationalInsuranceNo;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNationalInsuranceNo() {
        return nationalInsuranceNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    public double raiseSalary(double raisedSalary) {
        if (raisedSalary > 0) {
            this.salary += raisedSalary;
        }
        return salary;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }



}
