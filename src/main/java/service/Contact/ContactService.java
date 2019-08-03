package service.Contact;

import domain.contact.Contact;
import repository.Contact.ContactRep;

import java.util.ArrayList;

public class ContactService implements ContactRepInt{
    private static ContactService contactRep=null;

    private ContactService() {
    }

    public static ContactService getContactServ(){
        if(contactRep==null){
            contactRep=new ContactService();
        }return contactRep;
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
}
