package factory.repository;

import repository.employee.EmployeeRepo;

public class EmployeeRepFac {
    public static EmployeeRepo getEmployeeRep(){
        return EmployeeRepo.getEmployeeRep();
    }
}
