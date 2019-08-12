package factory.repository;

import repository.demography.EmployeeDemography;

public class DemographyRepFac {
    public static EmployeeDemography getEmpRep()
    {
        return EmployeeDemography.getEmpDemo();
    }
}
