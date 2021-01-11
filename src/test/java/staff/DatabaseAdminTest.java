package staff;

import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    private DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Bob", "FJDKFJDSF", 10000) {
        };
    }

    @Test
    public void raiseSalary() {
        databaseAdmin.raiseSalary(10000.50);
        assertEquals(20000.50, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(100, databaseAdmin.payBonus(), 0.01);
    }
}

