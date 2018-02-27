package service;

import domain.Contact;

/**
 * Interface for org.si.service layer classes for the AddressBookController
 */
public interface IAddressBookService {

    /**
     * Finds an existing contact by name
     * @param name refers to the contact
     * @return a document containing the contact information
     */
    Contact getContact(String name);

    /**
     * Adds a new contact to the address book
     * @param name refers to the new contact
     * @param email belongs to the new contact
     */
    void postContact(String name, String email);
}
