package factory.service;

import service.identity.IdentityService;

public class IdentityFactory {
    public static IdentityService getIdentityServ(){
        return IdentityService.getIdent();
    }
}
