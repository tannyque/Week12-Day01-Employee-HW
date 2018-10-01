import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Elon Musk", "QQ123456C", 35000.00, "Grunnings");
    }

    @Test
    public void hasName() {
        assertEquals("Elon Musk", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("QQ123456C", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(35000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Grunnings", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(5000.00);
        assertEquals(40000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(350, manager.payBonus(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryByNegativeAmount() {
        manager.raiseSalary(-1000.00);
        assertEquals(35000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void cannotSetNameToNull() {
        manager.setName(null);
        assertEquals("Elon Musk", manager.getName());
    }
}
