package repository.Contact;

import domain.contact.Contact;

import java.util.ArrayList;

public class ContactRep implements ContacRepInt {
    private static ContactRep contactRep;
    private ContactRep() {

    }
    public static ContactRep getContactRep() {
        if(contactRep==null){
            contactRep=new ContactRep();
        }
        return contactRep;
    }

    @Override
    public Contact create(Contact contact) {
        return null;
    }

    @Override
    public Contact read(String id) {
        return null;
    }

    @Override
    public Contact udate(Contact contact) {
        return null;
    }

    @Override
    public Contact delete(String id) {
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
