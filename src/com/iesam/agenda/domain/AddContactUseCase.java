package com.iesam.agenda.domain;


import com.iesam.agenda.domain.models.Contact;

/**
 * Un caso de uso sólo realiza una acción.
 * Un caso de uso siempre empieza por un verbo.
 */
public class AddContactUseCase {

    private ContactRepository contactRepository;

    public AddContactUseCase(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public void execute(Contact contact) {
        contactRepository.save(contact);
    }
}
