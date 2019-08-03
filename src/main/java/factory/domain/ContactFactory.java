package factory.domain;

import domain.contact.Contact;

public class ContactFactory {
    public static Contact getContactFac(int id,String cellPhne,String homePhone,String email){
        return new Contact.Builder(id)
                .buildCellPhone(cellPhne)
                .buildEmail(email)
                .buildHomePhone(homePhone)
                .getContact();

    }
}
