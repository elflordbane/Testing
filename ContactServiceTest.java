package Contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Contact;
import Contact.ContactService;

class ContactServiceTest {          // testing the Contact Servie Methods

	@Test
	void testContactServiceAdd() {
		Contact testContact;
		ContactService.AddContact("003", "George", "Jettson","7073725641","768 Space Way");
		int i = ContactService.SearchForContact("003");
		testContact = ContactService.ReturnContact(i);
		assertTrue(testContact.getId().equals("003"));
		assertTrue(testContact.getFirstName().equals("George"));
		assertTrue(testContact.getLastName().equals("Jettson"));
		assertTrue(testContact.getPhoneNum().equals("7073725641"));
		assertTrue(testContact.getAddress().equals("768 Space Way"));
	}
	@Test
	void testContactClassModify() {
		ContactService.AddContact("002", "George", "Jettson","7073725641","768 Space Way");
		Contact testContact2;
		ContactService.ModifyContact("002", "Fred", "Jackson","7073725623","567 Howard Drive");
		int j = ContactService.SearchForContact("002");
		testContact2 = ContactService.ReturnContact(j);
		assertTrue(testContact2.getId().equals("002"));
		assertTrue(testContact2.getFirstName().equals("Fred"));
		assertTrue(testContact2.getLastName().equals("Jackson"));
		assertTrue(testContact2.getPhoneNum().equals("7073725623"));
		assertTrue(testContact2.getAddress().equals("567 Howard Drive"));
	}
	
	@Test
	void testContactServiceSameId()       // ensure two entries with same Id cannot exist
	 
	{ContactService.AddContact("004", "Bert", "Flowers","6135827965","874 Town Road");  
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			ContactService.AddContact("004", "Albert", "Einsten","5302584561","984 Light Street");
		});}
	
	@Test
	void testContactServiceRemoval() 
	 
	{ContactService.AddContact("005", "Betsy", "Ross","8534569561","237 City Way"); 
	ContactService.ReomoveContact("005");
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			ContactService.SearchForContact("005");
		});}

}
