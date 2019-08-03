package factory.domain;

import domain.employe.Employee;

public class EmployeeFactory {
    public static Employee getFactoryEmpl(int employeeNumber,String name,String lastname){
        return new Employee.Builder(employeeNumber)
                .buildName(name)
                .buildLastname(lastname)
                .getEmpoyee();
    }
}
