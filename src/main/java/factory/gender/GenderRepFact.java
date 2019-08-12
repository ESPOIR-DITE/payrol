package factory.gender;

import domain.demography.Gender;
import repository.gender.GenderRep;

public class GenderRepFact {
    public static GenderRep getGender(){
        return GenderRep.getGenderRep();
    }
}
