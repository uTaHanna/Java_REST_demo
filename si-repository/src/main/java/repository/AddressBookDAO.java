package repository;

import domain.Contact;

/**
 * Interface for repository layer classes for the AddressBookController
 */
public interface AddressBookDAO {

    /**
     * Retrieves a document with the given name value
     * @param name refers to the client
     * @return a document containing the contact information
     */
    Contact getContact(String name);

    /**
     * Inserts a new document into the collection
     * @param name refers to the new contact
     * @param email belongs to the new contact
     */
    void postContact(String name, String email);
}
