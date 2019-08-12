package factory.service;

import repository.gender.GenderRep;
import service.Gender.GenderService;

public class GenderServicefact {
    public static GenderService getGender(){
        return GenderService.getGender();
    }
}
