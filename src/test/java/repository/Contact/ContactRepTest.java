package repository.Contact;

import domain.contact.Contact;
import factory.domain.ContactFactory;
import factory.repository.ContactRepoFact;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ContactRepTest {
    Contact contact= ContactFactory.getContactFac(0,"2342343","sdfsdf","sdfdsgdgf");
    ContactRep contRep= ContactRepoFact.getContactRep();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getContactRep() {
    }

    @Test
    public void create() {
        System.out.println(contRep.create(contact).toString());
    }

    @Test
    public void read() {
        System.out.println(contRep.read(""+1000).toString());
    }

    @Test
    public void udate() {
        Contact contact1= ContactFactory.getContactFac(1000,"2342343","0617825205","sdfdsgdgf");
        System.out.println(contRep.udate(contact1).toString());
    }

    @Test
    public void delete() {
        System.out.println(contRep.delete(""+1001).toString());
    }

    @Test
    public void readAll() {
        ArrayList<String>myList=new ArrayList<>();
        myList=contRep.readAll();

        for(int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    }

    @Test
    public void getHighId() {
        System.out.println(contRep.getHighId());
    }
}