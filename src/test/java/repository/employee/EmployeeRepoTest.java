package repository.employee;

import domain.employe.Employee;
import factory.domain.EmployeeFactory;
import factory.repository.EmployeeRepFac;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRepoTest {

    EmployeeRepo empRepo= EmployeeRepFac.getEmployeeRep();
    Employee newemployee=EmployeeFactory.getFactoryEmpl(23243,"david","yahoo");
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void create() {
        Assert.assertNotNull(empRepo);
        System.out.println(empRepo.create(newemployee).toString());
    }

    @Test
    public void read() {
        System.out.println(empRepo.read(""+1001).toString());
    }

    @Test
    public void udate() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void readAll() {
    }

    @Test
    public void getHighId() {
    }
}