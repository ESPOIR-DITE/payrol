package service.Contact;

import domain.contact.Contact;
import factory.domain.ContactFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContactServiceTest {

    private ContactService cS=ContactService.getContactServ();
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getContactServ() {
    }

    @Test
    public void create() {
        Contact contact= ContactFactory.getContactFac(0,"0816048957","none","emaiolskd.@ds.,ld");
        System.out.println(cS.create(contact).toString());
    }

    @Test
    public void read() {
        System.out.println(cS.read(""+1000).toString());
    }

    @Test
    public void udate() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void readAll() {
    }
}