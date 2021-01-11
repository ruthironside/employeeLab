package staff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    private Employee employee;

    @Before
    public void setUp() {
        employee = new Employee("Bob", "FJDKFJDSF", 10000) {
        };
    }

    @Test
    public void raiseSalary() {
        employee.raiseSalary(10000.50);
        assertEquals(20000.50, employee.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(100, employee.payBonus(), 0.01);
    }
}