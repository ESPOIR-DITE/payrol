package service.identity;

import domain.identity.Identity;

import java.util.ArrayList;

public class IdentityService implements IdentityServiceInt {
    private static IdentityService ident=null;

    private IdentityService() {
    }

    public IdentityService getIdent(){
        if(ident==null){
            ident=new IdentityService();
        }return ident;
    }
    @Override
    public Identity create(Identity identity) {
        return null;
    }

    @Override
    public Identity read(String id) {
        return null;
    }

    @Override
    public Identity udate(Identity identity) {
        return null;
    }

    @Override
    public Identity delete(String id) {
        return null;
    }

    @Override
    public ArrayList readAll() {
        return null;
    }

    @Override
    public int getHighId() {
        return 0;
    }
}
