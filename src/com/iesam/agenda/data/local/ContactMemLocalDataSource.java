package com.iesam.agenda.data.local;

import com.iesam.agenda.domain.models.Contact;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Patrón Singletón para tener sólo una instancia de esta clase
 */
public class ContactMemLocalDataSource implements ContactLocalDataSource {

    // Paso 1: creamos una variable estática privada que nos indica si ya está creada la instancia. Se inicia con null.
    private static ContactMemLocalDataSource instance = null;

    private Map<Integer, Contact> storage = new TreeMap<>();

    /**
     * Paso 2: Constructor por defecto con visibilidad privada para que no se puedan crear instancias con el
     * operador new.
     */
    private ContactMemLocalDataSource() {

    }

    public void save(Contact contact) {
        storage.put(contact.getId(), contact);
    }

    public Contact findById(Integer contactId) {
        return storage.get(contactId);
    }

    public List<Contact> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(Integer contactId) {
        storage.remove(contactId);
    }

    /**
     * Paso 3: Método estático para llevar un control en la creación de instancias.
     */
    public static ContactMemLocalDataSource getInstance() {
        //Si es nulo es que no se han creado instancias
        if (instance == null) {
            //Me creo la instancia y la almacena en la varible estática
            instance = new ContactMemLocalDataSource(); //desde dentro de la clase puedo crearme una instancia con new.
        }
        //Devuelvo la instancia. Si ya estaba creada devolverá esa.
        return instance;
    }

}
