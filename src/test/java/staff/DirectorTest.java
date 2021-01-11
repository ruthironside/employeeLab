package staff;

import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void setUp() {
        director = new Director(1000, "Jane", "FJFJEIFJE", 1000, "RandomName") {
        };
    }

    @Test
    public void raiseSalary() {
        director.raiseSalary(10000.50);
        assertEquals(11000.50, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(10, director.payBonus(), 0.01);
    }
}

