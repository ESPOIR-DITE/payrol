package factory;

import domain.demography.Gender;
import factory.domain.GenderFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenderFactoryTest {

    Gender gender= GenderFactory.getGenderFac(23232,"Male");
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getGenderFac() {
        Assert.assertNotNull(gender);
    }
}