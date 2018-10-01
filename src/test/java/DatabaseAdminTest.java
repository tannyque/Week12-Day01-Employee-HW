import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() throws Exception {
        databaseAdmin = new DatabaseAdmin("Harry Potter", "QQ123456C", 20000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Harry Potter", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("QQ123456C", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(20000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(5000.00);
        assertEquals(25000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(200, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryByNegativeAmount() {
        databaseAdmin.raiseSalary(-1000.00);
        assertEquals(20000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void cannotSetNameToNull() {
        databaseAdmin.setName(null);
        assertEquals("Harry Potter", databaseAdmin.getName());
    }
}
