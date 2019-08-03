package repository.employee;

import domain.employe.Employee;

import java.util.ArrayList;

public class EmployeeRepo implements EmployeeRepInt {
    private static EmployeeRepo employeeRepo=null;
    private EmployeeRepo() {
    }
    public static EmployeeRepo getEmployeeRep(){
        if(employeeRepo==null){
            employeeRepo=new EmployeeRepo();
        }return employeeRepo;
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
