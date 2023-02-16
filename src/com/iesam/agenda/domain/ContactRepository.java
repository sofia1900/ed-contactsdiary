package com.iesam.agenda.domain;


import com.iesam.agenda.domain.models.Contact;

import java.util.List;

/**
 * El nombre estará formado por:
 *  NombreModelo + Repository
 */
public interface ContactRepository {

    public void save(Contact contact);

    public List<Contact> getAll();

    public void delete(Integer contactId);

}


