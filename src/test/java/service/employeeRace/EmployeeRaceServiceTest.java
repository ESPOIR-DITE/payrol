package service.employeeRace;

import domain.demography.EmployeeGender;
import domain.demography.EmployeeRace;
import factory.domain.EmployeeGenderFac;
import factory.domain.EmployeeRaceFac;
import factory.service.EmployeeGenderSerFac;
import factory.service.EmployeeRaceServiceFac;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.employeeGender.EmployeeGenderService;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EmployeeRaceServiceTest {

    private EmployeeRaceService employeeRaceService= EmployeeRaceServiceFac.getEmployeeService();
    private EmployeeRace employeeRace= EmployeeRaceFac.getEmployeeRace(1001,1000,1001,"awe");
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void create() {
        System.out.println(employeeRaceService.create(employeeRace).toString());

    }

    @Test
    public void read() {
        System.out.println(employeeRaceService.udate(employeeRace).toString());
    }

    @Test
    public void udate() {
        System.out.println(employeeRaceService.read("1001").toString());
    }

    @Test
    public void delete() {
        System.out.println(employeeRaceService.delete("1001").toString());
    }

    @Test
    public void readAll() {
        ArrayList<String> myList=new ArrayList<>();
        myList=employeeRaceService.readAll();
        for(int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    }
}