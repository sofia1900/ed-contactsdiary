package com.iesam.agenda.domain;


import com.iesam.agenda.domain.models.Contact;

/**
 * El nombre estará formado por:
 *  NombreModelo + Repository
 */
public interface ContactRepository {

    public void save(Contact contact);

}


