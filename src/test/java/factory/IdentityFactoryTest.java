package factory;

import domain.identity.Identity;
import factory.domain.IdentityFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IdentityFactoryTest {

    Identity identity= IdentityFactory.getIdentityFac(3434,"woe930owow","Pasport");
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getIdentityFac() {
        Assert.assertNotNull(identity);
    }
}