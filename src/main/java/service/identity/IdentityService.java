package service.identity;

import domain.identity.Identity;
import repository.identity.IdentityRep;
import java.util.ArrayList;

public class IdentityService implements IdentityServiceInt {

    private IdentityRep identityRep= IdentityRep.getIdentityRep();
    private static IdentityService ident=null;

    private IdentityService() {

    }

    public static IdentityService getIdent(){
        if(ident==null){
            ident=new IdentityService();
        }return ident;
    }
    @Override
    public Identity create(Identity identity) {

        return identityRep.create(identity);
    }

    @Override
    public Identity read(String id) {
        return identityRep.read(id);
    }

    @Override
    public Identity udate(Identity identity) {
        return identityRep.udate(identity);
    }

    @Override
    public Identity delete(String id) {
        return identityRep.delete(id);
    }

    @Override
    public ArrayList readAll() {
        return identityRep.readAll();
    }

}
