package repository.address;

import domain.address.Address;

import java.util.ArrayList;

public class AddressRep implements AddressRepInt {
    private  static AddressRep addressRep=null;

    private AddressRep() {

    }
    public static AddressRep getAddress(){
        if(addressRep==null){
            addressRep=new AddressRep();
        }return addressRep;
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

    @Override
    public int getHighId() {
        return 0;
    }
}
