package staff;

import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    private Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Bob", "FJDKFJDSF", 10000) {
        };
    }

    @Test
    public void raiseSalary() {
        developer.raiseSalary(10000.50);
        assertEquals(20000.50, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(100, developer.payBonus(), 0.01);
    }
}
