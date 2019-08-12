package factory.repository;

import repository.Contact.ContactRep;

public class ContactRepoFact {
    public static ContactRep getContactRep(){
        return ContactRep.getContactRep();
    }
}
