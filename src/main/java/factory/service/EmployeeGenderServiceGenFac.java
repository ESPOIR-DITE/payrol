package factory.service;

import service.generic_services.EmployeeGenderServiceGen;

public class EmployeeGenderServiceGenFac {
public static EmployeeGenderServiceGen getEmployeeGenderSF(){
    return EmployeeGenderServiceGen.getEmployeeGenderServiceGen();
}
}
