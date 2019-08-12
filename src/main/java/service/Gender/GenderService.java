package service.Gender;

import domain.demography.Gender;
import factory.gender.GenderRepFact;
import repository.gender.GenderRep;

import java.util.ArrayList;

public class GenderService implements GenderRepInt {
    private static GenderService gs=null;
    private GenderRep gp= GenderRepFact.getGender();
    private GenderService() {
    }
    public static GenderService getGender(){
        if(gs==null){
           gs=new GenderService();
        }return gs;
    }

    @Override
    public Gender create(Gender gender) {
        return gp.create(gender);
    }

    @Override
    public Gender read(String id) {
        return gp.read(id);
    }

    @Override
    public Gender udate(Gender gender) {
        return gp.udate(gender);
    }

    @Override
    public Gender delete(String id) {
        return gp.delete(id);
    }

    @Override
    public ArrayList readAll() {
        return gp.readAll();
    }
}
