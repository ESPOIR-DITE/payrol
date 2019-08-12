package service.address;

import domain.address.Address;
import factory.domain.AddressFactory;
import factory.repository.AddressRepFact;
import repository.address.AddressRep;
import service.Iservice;

import java.util.ArrayList;

public class AddressService implements AddressInt {
    private AddressRep addressRep= AddressRepFact.getAddressRep();
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
        return  addressRep.create(address);
    }

    @Override
    public Address read(String id) {
        return addressRep.read(id);
    }

    @Override
    public Address udate(Address address) {
        return addressRep.udate(address);
    }

    @Override
    public Address delete(String id) {
        return addressRep.delete(id);
    }

    @Override
    public ArrayList readAll() {
        return addressRep.readAll();
    }
}
