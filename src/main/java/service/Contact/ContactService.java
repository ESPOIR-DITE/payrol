package service.Contact;

import domain.contact.Contact;
import factory.repository.ContactRepoFact;
import repository.Contact.ContactRep;

import java.util.ArrayList;

public class ContactService implements ContactRepInt{
    private static ContactService contactRep=null;
    private ContactRep contactP= ContactRepoFact.getContactRep();

    private ContactService() {
    }

    public static ContactService getContactServ(){
        if(contactRep==null){
            contactRep=new ContactService();
        }return contactRep;
    }

    @Override
    public Contact create(Contact contact) {
        return contactP.create(contact);
    }

    @Override
    public Contact read(String id) {
        return contactP.read(id);
    }

    @Override
    public Contact udate(Contact contact) {
        return contactP.udate(contact);
    }

    @Override
    public Contact delete(String id) {
        return contactP.delete(id);
    }

    @Override
    public ArrayList readAll() {
        return contactP.readAll();
    }
}
