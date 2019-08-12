package service.democraphy;

import domain.demography.Democraphy;
import domain.demography.Gender;
import domain.demography.Race;
import factory.demography.DemographyFac;
import factory.domain.GenderFactory;
import factory.domain.RaceFactory;
import factory.repository.DemographyRepFac;
import factory.service.DemographyServFac;
import org.junit.Before;
import org.junit.Test;
import repository.demography.EmployeeDemography;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DemographyServTest {

    private DemographyServ desev= DemographyServFac.getDemSerFac();
   // private EmployeeDemography dem= DemographyRepFac.getEmpRep();
    private Gender gender= GenderFactory.getGenderFac(1001,"mixed");
    private Race race= RaceFactory.getFacRace(1001,"jaune");
    private Democraphy democraphy= DemographyFac.getDemography(gender,race);

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void create() {
        System.out.println(desev.create(democraphy));
    }

    @Test
    public void read() {
        System.out.println(desev.read("1001").toString());
    }

    @Test
    public void udate() {
        System.out.println(desev.udate(democraphy).toString());
    }

    @Test
    public void delete() {
        System.out.println(desev.delete("1002"));
    }

    @Test
    public void readAll() {
        ArrayList<String>myList=new ArrayList<>();
        myList=desev.readAll();
        for(int i=0; i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    }
}