package factory.Race;

import domain.demography.Race;
import repository.race.RaceRep;

public class RaceFactory {
    public static RaceRep getRaceRep(){
        return RaceRep.getRaceRep();
    }
}
