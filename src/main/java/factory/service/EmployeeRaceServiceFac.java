package factory.service;

import service.employeeRace.EmployeeRaceService;

public class EmployeeRaceServiceFac {
    public static EmployeeRaceService getEmployeeService(){
        return EmployeeRaceService.getEmployeeRaceService();
    }
}
