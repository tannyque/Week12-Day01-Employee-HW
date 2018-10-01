import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() throws Exception {
        developer = new Developer("Chuck Norris", "QQ123456C", 25000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Chuck Norris", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("QQ123456C", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(5000.00);
        assertEquals(30000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(250, developer.payBonus(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryByNegativeAmount() {
        developer.raiseSalary(-1000.00);
        assertEquals(25000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void cannotSetNameToNull() {
        developer.setName(null);
        assertEquals("Chuck Norris", developer.getName());
    }
}
