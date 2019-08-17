package service.raceService;

import domain.demography.Race;
import factory.domain.RaceFactory;
import factory.service.RaceServiceFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RaceServiceTest {

    private RaceService raceService= RaceServiceFactory.getRaceService();
    private Race race= RaceFactory.getFacRace(000,"ASIEN");
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void create() {
        System.out.println(raceService.create(race).toString());
    }

    @Test
    public void read() {
    }

    @Test
    public void udate() {
    }

    @Test
    public void delete() {
        System.out.println(raceService.delete("1001").toString());
    }

    @Test
    public void readAll() {
        ArrayList<String> myList=new ArrayList<>();
        myList=raceService.readAll();
        for(int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));}
    }
}