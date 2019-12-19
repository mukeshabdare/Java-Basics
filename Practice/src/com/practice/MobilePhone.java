package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Contacts> contacts = new ArrayList<Contacts>();
	public static void main(String[] args) {

		boolean flag = false;
		
		while(!flag) {
			System.out.println("Enter your choice");
			System.out.println("\t0 : List options\n"
					+"\t1 : Print contacts\n"+
					"\t2 : Add new contact\n"+
					"\t3 : Update contact\n"+
					"\t4 : Remove contacts\n"+
					"\t5 : Exit\n");
			
			int choice = scanner.nextInt();
			scanner.hasNextLine();
			switch(choice) {
			
				case 1 : printContacts();
				break;
				
				case 2 : addContact();
				break;
				
				case 3 : updateContacts();
				break;
				
				case 4 : removeContacts();
				break;
				
				case 5 : flag= true;
				break;
				
			}
		}
		
	}
	private static void removeContacts() {

		
	}
	private static void updateContacts() {
		// TODO Auto-generated method stub
		
	}
	private static void addContact() {
		System.out.println("Enter contact name:");
		String name = scanner.nextLine();
		
	}
	private static void printContacts() {

		if(contacts.isEmpty()) {
			System.out.println("Your contact list is empty!");
		} else {
			System.out.println("Your contact list:");
			for(Contacts contact : contacts) {
				System.out.println(contact.toString());
			}
		}
		
	}

}
