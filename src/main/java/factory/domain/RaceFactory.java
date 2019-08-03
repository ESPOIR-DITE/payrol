package factory.domain;

import domain.demography.Race;

public class RaceFactory {
    public static Race getFacRace(int id, String description){
        return new Race.Builder(id).buildDescription(description).getRace();
    }
}
