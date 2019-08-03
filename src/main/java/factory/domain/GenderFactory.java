package factory.domain;

import domain.demography.Gender;

public class GenderFactory {
    public static Gender getGenderFac(int id,String description){
        return new Gender.Builder(id).getDescription(description).getGender();
    }
}
