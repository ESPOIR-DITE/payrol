package repository.identity;

import domain.identity.Identity;
import factory.domain.IdentityFactory;
import factory.repository.IdentityRepFac;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IdentityRepTest {
    IdentityRep identityRep= IdentityRepFac.getIdentRep();
    Identity identity= IdentityFactory.getIdentityFac(1223,"werew","sdfdfe");
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void create() {
        Assert.assertNotNull(identityRep);
        System.out.println(identityRep.create(identity).toString());
    }

    @Test
    public void read() {
        System.out.println(identityRep.read(""+1000).toString());
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

    @Test
    public void getHighId() {
    }
}