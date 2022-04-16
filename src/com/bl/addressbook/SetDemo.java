package com.bl.addressbook;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<Contact> set = new HashSet<>();

		Contact contact1 = new Contact();
		contact1.setFirstName("Darpan");
		contact1.setLastName("Madlani");

		Contact contact2 = new Contact();
		contact2.setFirstName("Darpan");
		contact2.setLastName("M");

		set.add(contact1);
		set.add(contact2);
		set.add(contact1);
		set.add(contact1);

		System.out.println(set);
		
		System.out.println(contact1.equals(contact2));
		
		System.out.println(contact1.hashCode());
		System.out.println(contact2.hashCode());
	}

}