package com.trax.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trax.entities.Contact;
import com.trax.repositories.ContactRepository;
@Service
public class ContactServiceImp implements ContactService {

	@Autowired
	private ContactRepository contactrepo;
	
	@Override
	public String saveContact(Contact contact) {
	contactrepo.save(contact)	;
		return null;
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = contactrepo.findAll();
		
		return contacts;
	}

	@Override
	public Contact findContactById(long id) {
		Optional<Contact> findById = contactrepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}
