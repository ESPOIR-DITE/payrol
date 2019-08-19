package service.generic_services;

import domain.demography.EmployeeGender;
import domain.demography.EmployeeRace;
import domain.demography.Gender;
import domain.demography.Race;
import domain.employe.Employee;
import domain.employeeObj.EmployeeObject;
import factory.domain.EmployeeFactory;
import factory.domain.EmployeeObjectFac;
import factory.domain.GenderFactory;
import factory.domain.RaceFactory;
import factory.repository.EmployeeRaceRapFac;
import factory.service.*;
import org.junit.Before;
import org.junit.Test;
import repository.employeeRaceRep.EmployeeRaceRep;
import service.Gender.GenderService;
import service.employee.EmployeeService;
import service.employeeGender.EmployeeGenderService;
import service.raceService.RaceService;

import static org.junit.Assert.*;

public class EmployeeGenderServiceGenTest {
    /***EMPLOYEE SERVICE*/
    private EmployeeService employeeService = EmployeeServiceFactory.getEmplServi();
    private Employee employee;

    /***GENDER SERVICE*/
    private GenderService genderService= GenderServicefact.getGender();
    private Gender gender;

    /***RACE SERVICE*/
    private RaceService raceService= RaceServiceFactory.getRaceService();
    private Race race;

    /***EmployeeObject class*/
    private EmployeeObject employeeObject;

    /***GENERIQUE SERVICE INSTANCE*/
    private EmployeeGenderServiceGen employeeGenderServiceGenFac =EmployeeGenderServiceGenFac.getEmployeeGenderSF();

    private EmployeeGenderService employeeGenderService= EmployeeGenderSerFac.getEmployeeService();
    private EmployeeGender employeeGender;
    private EmployeeRaceRep employeeRaceRep= EmployeeRaceRapFac.getEmpoyeeRaceRapFac();
    private EmployeeRace employeeRace;




    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void creatEmployee() {

        System.out.println(employeeObject.toString());
    }

    @Test
    public void readEmployee() {

    }

    @Test
    public void create() {
        employee= EmployeeFactory.getFactoryEmpl(000,"NATHAN","WALEME");
        race= RaceFactory.getFacRace(000,"WHITE");
        gender= GenderFactory.getGenderFac(000,"OTHER");
        employeeObject= EmployeeObjectFac.getEmployeeObject(employee,race,gender);

        System.out.println(employeeGenderServiceGenFac.create(employeeObject).toString());
    }

    @Test
    public void read() {
        System.out.println(employeeGenderServiceGenFac.read("1000").toString());
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
}