package com.iesam.agenda.presentation;

import com.iesam.agenda.data.ContactDataRepository;
import com.iesam.agenda.data.local.ContactFileLocalDataSource;
import com.iesam.agenda.data.local.ContactMemLocalDataSource;
import com.iesam.agenda.domain.useCase.AddContactUseCase;
import com.iesam.agenda.domain.ContactRepository;
import com.iesam.agenda.domain.useCase.BuscarContactUseCase;
import com.iesam.agenda.domain.useCase.DeleteContactUseCase;
import com.iesam.agenda.domain.useCase.GetContactsUseCase;
import com.iesam.agenda.domain.models.Contact;

import java.util.List;

public class TerminalView {

    // Para trabajar con Bases de Datos
    //ContactRepository contactRepository = new ContactDataRepository(ContactDbLocalDataSource.getInstance());

    // Para trabajar con memoria
    //ContactRepository contactRepository = new ContactDataRepository(ContactMemLocalDataSource.getInstance());

    // Para trabajar con ficheros
    ContactRepository contactRepository = new ContactDataRepository(ContactFileLocalDataSource.getInstance());

    public void init() {
        Contact contact = new Contact();
        contact.setId(1);
        contact.setName("Chema");
        contact.setSurname("PR");
        contact.setEmail("email@emai.es");
        contact.setPhoneNumber("123");

        AddContactUseCase addContactUseCase = new AddContactUseCase(contactRepository);
        addContactUseCase.execute(contact);

       printContacts();

        DeleteContactUseCase deleteContactUseCase = new DeleteContactUseCase(contactRepository);
        //deleteContactUseCase.execute(1);

        printContacts();

        BuscarContactUseCase buscarContactoUseCase = new BuscarContactUseCase(contactRepository);
        System.out.println(buscarContactoUseCase.execute(1));
    }

    private void printContacts() {
        GetContactsUseCase getContactsUseCase = new GetContactsUseCase(contactRepository);
        List<Contact> contactList = getContactsUseCase.execute();
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

}
