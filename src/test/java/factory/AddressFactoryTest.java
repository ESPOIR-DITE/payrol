package factory;

import domain.address.Address;
import factory.domain.AddressFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddressFactoryTest {
Address address= AddressFactory.getAddressFactory(2323,"rebeick","2344");
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getAddressFactory() {
        Assert.assertNotNull(address);
        System.out.println(address.toString());
    }
}