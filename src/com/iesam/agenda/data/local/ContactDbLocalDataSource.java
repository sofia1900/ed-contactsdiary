package com.iesam.agenda.data.local;

import com.iesam.agenda.domain.models.Contact;

import java.util.List;

public class ContactDbLocalDataSource implements ContactLocalDataSource{

    private static ContactDbLocalDataSource instance = null;

    private ContactDbLocalDataSource(){ }

    @Override
    public void save(Contact contact) {

    }

    @Override
    public Contact findById(Integer contactId) {
        return null;
    }

    @Override
    public List<Contact> findAll() {
        return null;
    }

    public static ContactDbLocalDataSource getInstance(){
        if (instance == null){
            instance = new ContactDbLocalDataSource();
        }
        return instance;
    }
}
