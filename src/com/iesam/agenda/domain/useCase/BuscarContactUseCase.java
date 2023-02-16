package com.iesam.agenda.domain.useCase;

import com.iesam.agenda.domain.ContactRepository;
import com.iesam.agenda.domain.models.Contact;

public class BuscarContactUseCase {

    private ContactRepository contactRepository;

    public BuscarContactUseCase(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact execute(Integer contactId) {
        return contactRepository.findById(contactId);
    }

}
