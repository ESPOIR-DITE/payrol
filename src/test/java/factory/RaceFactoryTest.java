package factory;

import domain.demography.Race;
import factory.domain.RaceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RaceFactoryTest {

    Race race= RaceFactory.getFacRace(3232,"black");
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getFacRace() {
        Assert.assertNotNull(race);
    }
}