package factory.repository;

import repository.address.AddressRep;

public class AddressRepFact {
    public static AddressRep getAddressRep(){
        return  AddressRep.getAddress();
    }
}
