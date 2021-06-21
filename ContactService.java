package Contact;

import java.util.ArrayList;
import java.util.Vector;

import Contact.Contact;

public class ContactService {
	
	
	private  static Vector<Contact> contactVector = new Vector<Contact>();   // create contact vector
	
	
	
	


	static void AddContact(String ContactId, String fName, String lName, String pNum, String address)  // add a contact to vector
	{for( Contact eachContact: contactVector) {
		if (eachContact.getId().equalsIgnoreCase(ContactId)){              // catches duplicate id
			throw new IllegalArgumentException("Invalid id");     
			}}
		Contact contact2 = new Contact(ContactId,fName, lName,pNum,address );
		contactVector.add(contact2);
	}
	
	
	static Contact ReturnContact(int i)    // returns contact to tester
	{Contact rCon;
	rCon = contactVector.get(i);
	return rCon;
	}
		
		
	static void ReomoveContact (String ContactId)   // removes contact from vector
	{int temp3 = -1;
	temp3 = SearchForContact(ContactId);
	contactVector.remove(temp3);}
	
	
	
	static void ModifyContact (String ContactId, String fName, String lName, String pNum, String Address)
	{int temp2 = -1;
	Contact tempContact;
	temp2 = SearchForContact(ContactId);               // gets the index and the contact item updates the 
	tempContact = contactVector.get(temp2);         //  contact item and puts it back into the same index
	tempContact.setFirstName(fName);
	tempContact.setLastName(lName);
	tempContact.setPhoneNum(pNum);
	tempContact.setAddress(Address);
	contactVector.set(temp2, tempContact);
	
	}
	
	
	
	static int SearchForContact(String ContactID) {
	int temp = -1;
	Contact searchCon;
		for (int z = 0 ; z < contactVector.size(); z++)
		{searchCon = contactVector.get(z);               // searches whole vector for item putting each item in a container for comparison
		if(searchCon.getId() == ContactID)                // throws exception when id not found
			{temp = z;}
		}
		if (temp == -1) {
			throw new IllegalArgumentException("Contact not found");
		}
	
		return temp;
	}
	
	

	
	

}	
	
	
	


