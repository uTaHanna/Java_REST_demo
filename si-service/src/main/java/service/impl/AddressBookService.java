package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import domain.Contact;
import repository.AddressBookDAO;
import service.IAddressBookService;

@Service
public class AddressBookService implements IAddressBookService{

    @Autowired
    private AddressBookDAO addressBookDAOMongo;

    /**
     * {@inheritDoc}
     */
    public Contact getContact(String name){

        return addressBookDAOMongo.getContact(name);
    }

    /**
     * {@inheritDoc}
     */
    public void postContact(String name, String email){

        addressBookDAOMongo.postContact(name, email);
    }
}
