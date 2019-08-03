package factory.domain;

import domain.identity.Identity;

public class IdentityFactory {
    public static Identity getIdentityFac(int identityId,String indentityTpe,String identityValeu){
        return new Identity.Builder(identityId)
                .buildIdentityTpe(indentityTpe)
                .buildIdentityValeu(identityValeu)
                .getIdentity();
    }
}
