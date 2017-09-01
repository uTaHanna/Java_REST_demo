package siapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import siapp.domain.Contact;
import siapp.repository.AddressBookDAO;
import siapp.service.IAddressBookService;

@Service
public class AddressBookService implements IAddressBookService{

    @Autowired
    private AddressBookDAO addressBookDAO;

    /**
     * {@inheritDoc}
     */
    public Contact getContact(String name){

        return addressBookDAO.getContact(name);
    }

    /**
     * {@inheritDoc}
     */
    public void postContact(String name, String email){

        addressBookDAO.postContact(name, email);
    }
}
