package factory.domain;

import domain.demography.Gender;
import domain.demography.Race;
import domain.employe.Employee;
import domain.employeeObj.EmployeeObject;

public class EmployeeObjectFac {
    public static EmployeeObject getEmployeeObject(Employee employee, Race race, Gender gender){
        return new EmployeeObject.Builder(gender)
                .buildEmployee(employee)
                .buildRace(race)
                .getEmployeeObject();

    }
}
