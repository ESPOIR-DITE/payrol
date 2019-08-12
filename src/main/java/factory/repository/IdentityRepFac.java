package factory.repository;

import repository.identity.IdentityRep;

public class IdentityRepFac {
    public static IdentityRep getIdentRep(){
        return IdentityRep.getIdentityRep();
    }
}
