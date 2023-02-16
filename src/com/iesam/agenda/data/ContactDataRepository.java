package com.iesam.agenda.data;

import com.iesam.agenda.data.local.ContactLocalDataSource;
import com.iesam.agenda.domain.ContactRepository;
import com.iesam.agenda.domain.models.Contact;

import java.util.List;

/**
 * Naming:
 * NombreModelo + DataRepository
 */
public class ContactDataRepository implements ContactRepository {

    private ContactLocalDataSource localDataSource;

    public ContactDataRepository(ContactLocalDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }

    @Override
    public void save(Contact contact) {
        localDataSource.save(contact);
    }

    @Override
    public List<Contact> getAll() {
        return localDataSource.findAll();
    }

    @Override
    public void delete(Integer contactId) {
        localDataSource.delete(contactId);
    }

    @Override
    public Contact findById(Integer contactId) {
        return localDataSource.findById(contactId);
    }
}
