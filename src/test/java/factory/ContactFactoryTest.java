package factory;

import domain.contact.Contact;
import factory.domain.ContactFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContactFactoryTest {

    Contact contact= ContactFactory.getContactFac(23434,"93939394848","3838383838","espoirdksj@lajfkl.com");
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getContactFac() {
        Assert.assertNotNull(contact);
        System.out.println(contact.toString());
    }
}