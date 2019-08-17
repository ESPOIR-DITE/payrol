package service.raceService;

import domain.demography.Race;
import factory.repository.RaceRepFac;
import repository.race.RaceRep;
import java.util.ArrayList;

public class RaceService implements RaceServiceInt {
    private static RaceService raceService;

    private RaceService() {
    }
    public static RaceService getRaceService(){
        if(raceService==null){
            raceService=new RaceService();
        }return raceService;
    }

    RaceRep raceRep= RaceRepFac.getRaceRep();
    @Override
    public Race create(Race race) {
        return raceRep.create(race);
    }

    @Override
    public Race read(String id) {
        return raceRep.read(id) ;
    }

    @Override
    public Race udate(Race race) {
        return raceRep.udate(race);
    }

    @Override
    public Race delete(String id) {
        return raceRep.delete(id);
    }

    @Override
    public ArrayList readAll() {
        return raceRep.readAll();
    }
}
