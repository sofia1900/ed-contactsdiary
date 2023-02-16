package com.iesam.agenda.data.local;

import com.iesam.agenda.domain.models.Contact;

import java.util.List;

public interface ContactLocalDataSource {
    public void save(Contact contact);
    public Contact findById(Integer contactId);
    public List<Contact> findAll();

    public void delete(Integer contactId);
}
