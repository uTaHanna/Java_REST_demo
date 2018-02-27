package repository.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import domain.Contact;
import repository.AddressBookDAO;

import java.util.UUID;

@Repository
public class AddressBookDAOMongo implements AddressBookDAO{

    private static final Logger LOGGER = LoggerFactory.getLogger(AddressBookDAOMongo.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * {@inheritDoc}
     */
    public Contact getContact(String name){

        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(name));

        LOGGER.info("Retrieving " + name + " from db");

        return mongoTemplate.findOne(query, Contact.class);
    }

    /**
     * {@inheritDoc}
     */
    public void postContact(String name, String email){

        //Contact contact = new Contact(UUID.randomUUID().toString(), name, email);

        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(name));

        Update update = new Update();
        update.set("_id", UUID.randomUUID().toString());
        update.set("name", name);
        update.set("email", email);

        LOGGER.info("Upserting " + name + " " + email);

        // Used upsert, rather than insert, to avoid duplication
        mongoTemplate.upsert(query, update, Contact.class.getSimpleName()); //insert(contact, Contact.class.getSimpleName());
    }
}
