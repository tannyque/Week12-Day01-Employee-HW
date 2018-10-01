import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() throws Exception {
        director = new Director("Leeroy Jenkins", "QQ123456C", 75000.00, "Pencils", 100000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Leeroy Jenkins", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("QQ123456C", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(75000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Pencils", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(100000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(5000.00);
        assertEquals(80000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1500.00, director.payBonus(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryByNegativeAmount() {
        director.raiseSalary(-1000.00);
        assertEquals(75000.00, director.getSalary(), 0.01);
    }

    @Test
    public void cannotSetNameToNull() {
        director.setName(null);
        assertEquals("Leeroy Jenkins", director.getName());
    }
}
