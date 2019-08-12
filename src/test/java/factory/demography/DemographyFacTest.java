package factory.demography;

import domain.demography.Gender;
import domain.demography.Race;
import domain.employe.Employee;
import factory.domain.EmployeeFactory;
import factory.domain.GenderFactory;
import factory.domain.RaceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import domain.demography.Democraphy;

public class DemographyFacTest {

    private Employee employee= EmployeeFactory.getFactoryEmpl(123123,"werwer","werer");
    private Gender gender= GenderFactory.getGenderFac(32423,"male");
    private Race race= RaceFactory.getFacRace(234234,"Black");
    private Democraphy democraphy=DemographyFac.getDemography(gender,race);
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getDemography() {
        Assert.assertNotNull(democraphy);
        System.out.println(democraphy.toString());
    }
}