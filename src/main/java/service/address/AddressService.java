package service.address;

import domain.address.Address;
import service.Iservice;

import java.util.ArrayList;

public class AddressService implements AddressInt {
    private static AddressService addressService=null;

    private AddressService() {
    }

    public AddressService getAddressService(){
        if(addressService==null){
            addressService=new AddressService();
        }return addressService;
    }

    @Override
    public Address create(Address address) {
        return null;
    }

    @Override
    public Address read(String id) {
        return null;
    }

    @Override
    public Address udate(Address address) {
        return null;
    }

    @Override
    public Address delete(String id) {
        return null;
    }

    @Override
    public ArrayList readAll() {
        return null;
    }
}
