package repository.race;

import domain.demography.Race;
import factory.domain.RaceFactory;
import factory.repository.RaceRepFac;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceRepTest {
    Race race= RaceFactory.getFacRace(12321,"Yeah");
    RaceRep rp= RaceRepFac.getRaceRep();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void create() {
        System.out.println(rp.create(race).toString());
    }

    @Test
    public void read() {
    }

    @Test
    public void udate() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void readAll() {
        rp.createTable("LIZE");
    }

    @Test
    public void getHighId() {
        System.out.println();
    }
}