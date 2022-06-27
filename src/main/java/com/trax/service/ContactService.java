package com.trax.service;

import java.util.List;

import com.trax.entities.Contact;

public interface ContactService {

	public String saveContact(Contact contact);
	public List<Contact> getAllContacts();
	public Contact findContactById(long id);
}
