package repository.address;

import domain.address.Address;
import factory.domain.AddressFactory;
import factory.repository.AddressRepFact;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AddressRepTest {

    AddressRep addressRep= AddressRepFact.getAddressRep();
    Address address= AddressFactory.getAddressFactory(1000,"rebeick","7460");
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getAddress() {
    }

    @Test
    public void create() {
        System.out.println(addressRep.create(address).toString());
    }

    @Test
    public void read() {
        System.out.println(addressRep.read("1000").toString());
    }

    @Test
    public void udate() {
        System.out.println(addressRep.udate(address).toString());
    }

    @Test
    public void delete() {
        System.out.println(addressRep.delete("1000").toString());
    }

    @Test
    public void readAll() {
        ArrayList<String>myList=new ArrayList<>();
        myList=addressRep.readAll();
        for(int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    }

    @Test
    public void getHighId() {
        System.out.println(addressRep.getHighId());
    }
}