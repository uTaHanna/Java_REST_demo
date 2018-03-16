package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import domain.Contact;
import service.IAddressBookService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Controller
@Path("address/")
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
@Produces(MediaType.APPLICATION_JSON)
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;

    @GET
    @Path("contact/{name}")
    public Response getContact(@PathParam("name") String name){

        Contact contact = addressBookService.getContact(name);

        return Response.status(200).entity(contact).build();
    }

    @POST
    @Path("/new-contact")
    public Response postContact(@FormParam("name") String name,
                                @FormParam("email") String email){

        addressBookService.postContact(name, email);

        return Response.status(200).build();
    }
}
