package factory;

import domain.employe.Employee;
import factory.domain.EmployeeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeFactoryTest {
Employee employee= EmployeeFactory.getFactoryEmpl(2343,"espoir","ditekemena");

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getFactoryEmpl() {
        Assert.assertNotNull(employee);
        System.out.println(employee.toString());
    }
}