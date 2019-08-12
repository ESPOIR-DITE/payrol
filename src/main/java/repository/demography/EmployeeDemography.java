package repository.demography;

import domain.demography.Democraphy;
import domain.demography.Race;
import factory.demography.DemographyFac;
import factory.gender.GenderRepFact;
import factory.repository.RaceRepFac;
import repository.gender.GenderRep;
import repository.race.RaceRep;

import java.util.ArrayList;

public class EmployeeDemography implements DemographyEmployee{
    private static EmployeeDemography employeeDemography=null;
    private GenderRep genderRep= GenderRepFact.getGender();
    private RaceRep raceRep= RaceRepFac.getRaceRep();
    Democraphy democraphy;

    public EmployeeDemography() {
    }
    public static EmployeeDemography getEmpDemo(){
        if(employeeDemography==null){
            employeeDemography=new EmployeeDemography();
        }return employeeDemography;
    }

    @Override
    public Democraphy create(Democraphy democraphy) {
        genderRep.create(democraphy.getGender());
        raceRep.create(democraphy.getRace());

        return  democraphy=DemographyFac.getDemography(democraphy.getGender(),democraphy.getRace());
    }

    @Override
    public Democraphy read(String id) {
        int idInt=Integer.parseInt(id);

        return democraphy=DemographyFac.getDemography(genderRep.read(id),raceRep.read(id));
    }

    @Override
    public Democraphy udate(Democraphy democraphy) {
        return democraphy=DemographyFac.getDemography(genderRep.udate(democraphy.getGender()),raceRep.udate(democraphy.getRace()));
    }

    @Override
    public Democraphy delete(String id) {
        int idInt=Integer.parseInt(id);
        return democraphy=DemographyFac.getDemography(genderRep.delete(id),raceRep.delete(id));
    }

    @Override
    public ArrayList readAll() {
        ArrayList<String>myList1,myList2,myList3=new ArrayList<>();

        myList1=genderRep.readAll();
        myList2=raceRep.readAll();
        myList3.addAll(myList2);
        myList3.addAll(myList1);
        return myList3;
    }

    @Override
    public int getHighId() {
        return 0;
    }
}
