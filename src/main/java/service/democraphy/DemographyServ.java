package service.democraphy;

import domain.demography.Democraphy;
import factory.gender.GenderRepFact;
import factory.repository.RaceRepFac;
import repository.demography.EmployeeDemography;
import repository.gender.GenderRep;
import repository.race.RaceRep;

import java.util.ArrayList;

public class DemographyServ implements DemographyInt {

    private static DemographyServ demographyServ;
    private GenderRep gender= GenderRepFact.getGender();
    private RaceRep race= RaceRepFac.getRaceRep();
    private EmployeeDemography empDemRep=EmployeeDemography.getEmpDemo();

    private DemographyServ() {
    }

    public static DemographyServ geDemoSer(){
        if(demographyServ==null){
            demographyServ=new DemographyServ();
        }return demographyServ;
    }
    @Override
    public Democraphy create(Democraphy democraphy) {
        return this.empDemRep.create(democraphy) ;
    }

    @Override
    public Democraphy read(String id) {
        return empDemRep.read(id);
    }

    @Override
    public Democraphy udate(Democraphy democraphy) {
        return empDemRep.udate(democraphy);
    }

    @Override
    public Democraphy delete(String id) {
        return empDemRep.delete(id);
    }

    @Override
    public ArrayList readAll() {
        return empDemRep.readAll();
    }
}
