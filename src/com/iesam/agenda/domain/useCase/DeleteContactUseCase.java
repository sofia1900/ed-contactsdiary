package com.iesam.agenda.domain.useCase;

import com.iesam.agenda.domain.ContactRepository;

public class DeleteContactUseCase {

    private ContactRepository contactRepository;

    public DeleteContactUseCase(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }

    public void execute(Integer contactId){
        contactRepository.delete(contactId);
    }

}
