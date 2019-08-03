package factory.domain;

import domain.address.Address;

public class AddressFactory {
    public static Address getAddressFactory(int addressId, String streetAddress,String postalAddress){
        return new Address.Builder(addressId)
                .buildPostal(postalAddress)
                .buildStreet(streetAddress)
                .getAddress();
    }
}
