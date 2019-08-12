package factory.demography;

import domain.demography.Gender;
import domain.demography.Race;
import domain.employe.Employee;
import domain.demography.Democraphy;

public class DemographyFac {
    public static Democraphy getDemography(/**Employee employee,*/Gender gender,Race race){
        return new Democraphy.Builder(gender)
                //.buildEmployee(employee)
                //.buildGender(gender)
                .buildRace(race)
                .getDemo();
    }
}
