package service.employee;

import domain.employe.Employee;
import factory.repository.EmployeeRepFac;
import repository.employee.EmployeeRepInt;
import repository.employee.EmployeeRepo;

import java.util.ArrayList;

public class EmployeeService implements EmployeeInt {
    private static EmployeeService employee;
    private EmployeeRepo emp= EmployeeRepFac.getEmployeeRep();

    private EmployeeService() {
    }
    public static EmployeeService getEmployeeServic(){
        if(employee==null){
            employee=new EmployeeService();
        }return employee;
    }
    @Override
    public Employee create(Employee employee) {
        return emp.create(employee);
    }

    @Override
    public Employee read(String id) {
        return emp.read(id);
    }

    @Override
    public Employee udate(Employee employee) {
        return emp.udate(employee);
    }

    @Override
    public Employee delete(String id) {
        return emp.delete(id);
    }

    @Override
    public ArrayList readAll() {
        return emp.readAll();
    }


}
