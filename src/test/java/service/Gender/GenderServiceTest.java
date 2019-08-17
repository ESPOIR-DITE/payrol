package service.Gender;

import domain.demography.Gender;
import factory.domain.GenderFactory;
import factory.service.GenderServicefact;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GenderServiceTest {

    GenderService gs= GenderServicefact.getGender();
    Gender gender= GenderFactory.getGenderFac(2333,"OTHER");
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getGender() {

    }

    @Test
    public void create() {
        System.out.println(gs.create(gender).toString());
    }

    @Test
    public void read() {
    }

    @Test
    public void udate() {
    }

    @Test
    public void delete() {
        System.out.println(gs.delete("1001").toString());
    }

    @Test
    public void readAll() {
        ArrayList<String>myList=new ArrayList<>();
        myList=gs.readAll();
        for(int i=0;i<myList.size();i++){
        System.out.println(myList.get(i));}
    }
}