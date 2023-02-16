package com.iesam.agenda.domain;

import com.iesam.agenda.domain.models.Contact;

import java.util.List;

public class DeleteContactUseCase {

    private ContactRepository contactRepository;

    public DeleteContactUseCase(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }

    public void execute(Integer contactId){
        contactRepository.delete(contactId);
    }

}
