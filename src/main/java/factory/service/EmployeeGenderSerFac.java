package factory.service;

import service.employeeGender.EmployeeGenderService;

public class EmployeeGenderSerFac {
    public static EmployeeGenderService getEmployeeService(){
        return service.employeeGender.EmployeeGenderService.getEmployeeGenderService();
    }
}
