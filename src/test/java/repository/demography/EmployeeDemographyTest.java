package repository.demography;

import domain.demography.Democraphy;
import domain.demography.Gender;
import domain.demography.Race;
import factory.demography.DemographyFac;
import factory.domain.GenderFactory;
import factory.domain.RaceFactory;
import factory.repository.DemographyRepFac;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EmployeeDemographyTest {
    private EmployeeDemography dem=DemographyRepFac.getEmpRep();
    private Gender gender= GenderFactory.getGenderFac(1001,"mixed");
    private Race race= RaceFactory.getFacRace(1001,"jaune");
    private Democraphy democraphy= DemographyFac.getDemography(gender,race);

    @Test
    public void getEmpDemo() {
        Assert.assertNotNull(dem);
    }

    @Test
    public void create() {
        System.out.println(dem.create(democraphy));
    }

    @Test
    public void read() {

        System.out.println(dem.read("1002"));
    }

    @Test
    public void udate() {
        System.out.println(dem.udate(democraphy));
    }

    @Test
    public void delete() {
    }

    @Test
    public void readAll() {
        ArrayList<String>myList=new ArrayList<>();
        myList=dem.readAll();
        for(int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    }
}