package repository.gender;

import domain.demography.Gender;
import factory.domain.GenderFactory;
import factory.gender.GenderRepFact;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GenderRepTest {

    Gender gender= GenderFactory.getGenderFac(122,"werwere");
    GenderRep genderRep= GenderRepFact.getGender();
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getGenderRep() {
    }

    @Test
    public void create() {
        System.out.println(genderRep.create(gender).toString());
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
        ArrayList<String>myList=new ArrayList<>();
        myList=genderRep.readAll();
        for(int i=0;i<myList.size();i++){
        System.out.println(myList.get(i));}
    }

    @Test
    public void getHighId() {
    }
}