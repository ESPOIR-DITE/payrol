package service.employee;

import domain.employe.Employee;
import repository.employee.EmployeeRepInt;

import java.util.ArrayList;

public class EmployeeService implements EmployeeRepInt {
    private static EmployeeService employee;

    private EmployeeService() {
    }
    public static EmployeeService getEmployeeServic(){
        if(employee==null){
            employee=new EmployeeService();
        }return employee;
    }
    @Override
    public Employee create(Employee employee) {
        return null;
    }

    @Override
    public Employee read(String id) {
        return null;
    }

    @Override
    public Employee udate(Employee employee) {
        return null;
    }

    @Override
    public Employee delete(String id) {
        return null;
    }

    @Override
    public ArrayList readAll() {
        return null;
    }

    @Override
    public int getHighId() {
        return 0;
    }
}
