package repository.gender;

import domain.demography.Gender;

import java.util.ArrayList;

public class GenderRep implements GenderRepInt {
    private static GenderRep genderRep=null;

    private GenderRep() {
    }

    public static GenderRep getGenderRep(){
        if(genderRep==null){
            genderRep=new GenderRep();
        }return genderRep;
    }
    @Override
    public Gender create(Gender gender) {
        return null;
    }

    @Override
    public Gender read(String id) {
        return null;
    }

    @Override
    public Gender udate(Gender gender) {
        return null;
    }

    @Override
    public Gender delete(String id) {
        return null;
    }

    @Override
    public ArrayList readAll() {
        return null;
    }

    @Override
    public int getHighId() {
        return 0;
    }
}
