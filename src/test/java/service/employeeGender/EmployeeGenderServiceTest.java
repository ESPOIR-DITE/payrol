package service.employeeGender;

import domain.demography.EmployeeGender;
import factory.domain.EmployeeGenderFac;
import factory.service.EmployeeGenderSerFac;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EmployeeGenderServiceTest {
    private EmployeeGenderService employeeGenderService= EmployeeGenderSerFac.getEmployeeService();
    private EmployeeGender employeeGender= EmployeeGenderFac.getEmployeeGendr(000,1001,1000,"voila");

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getEmployeeGenderService() {
    }

    @Test
    public void create() {
        System.out.println(employeeGenderService.create(employeeGender).toString());
    }

    @Test
    public void read() {
        System.out.println(employeeGenderService.read(""+1002).toString());
    }

    @Test
    public void udate() {
        System.out.println(employeeGenderService.udate(employeeGender).toString());
    }

    @Test
    public void delete() {
        System.out.println(employeeGenderService.delete("1003").toString().toString());
    }

    @Test
    public void readAll() {
        ArrayList<String>myList=new ArrayList<>();
        myList=employeeGenderService.readAll();
        for(int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    }
}