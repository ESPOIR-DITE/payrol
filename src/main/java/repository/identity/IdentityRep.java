package repository.identity;

import domain.identity.Identity;

import java.util.ArrayList;

public class IdentityRep implements IdentityRepInt {
    private static IdentityRep identityRep=null;

    private IdentityRep() {
    }

    public IdentityRep getIdentityRep(){
        if(identityRep==null){
            identityRep=new IdentityRep();
        }return identityRep;
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
