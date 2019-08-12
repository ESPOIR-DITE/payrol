package service.identity;
import domain.identity.Identity;
import factory.service.IdentityFactory;
import org.junit.Before;
import org.junit.Test;
public class IdentityServiceTest {
    private Identity identity= factory.domain.IdentityFactory.getIdentityFac(234234,"were","refdf");
    private IdentityService IdS= IdentityFactory.getIdentityServ();
    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void create() {
        System.out.println(IdS.create(identity).toString());
    }
    @Test
    public void read() {
        System.out.println(IdS.read(""+1000).toString());
    }
    @Test
    public void udate() {
        System.out.println();
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