package com.ravindra;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ContactCreator {

	public static void main(String[] args) {
		Contact contact = new Contact(1,"Ravindra","NC","5157702957");
		Contact contact2 = new Contact(1,"John Doe","NC Cary","5157702957");
		Contact contact3 = new Contact(1,"James","NC Rleigh","5157702957");
		Contact contact4 = new Contact(1,"Harry","Charlote","5157702957");
		List<Contact> contactList = new ArrayList<>();
		contactList.add(contact);
		contactList.add(contact2);
		contactList.add(contact3);
		contactList.add(contact4);
		ListIterator<Contact> iterator = contactList.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
