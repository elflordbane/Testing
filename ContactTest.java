package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Contact;

class ContactTest {

	@Test
	void testContactClass() {
		Contact contact = new Contact("001","Larry", "Arndt", "7075722604", "1019 Lon");
		assertTrue(contact.getId().equals("001"));
		assertTrue(contact.getFirstName().equals("Larry"));
		assertTrue(contact.getLastName().equals("Arndt"));
		assertTrue(contact.getPhoneNum().equals("7075722604"));
		assertTrue(contact.getAddress().equals("1019 Lon"));
	}
	@Test
	void testContactClassIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("00100000001","Larry", "Arndt", "7075722604", "1019 Lon");
		});}
	
	@Test
	void testContactClassIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact(null,"Larry", "Arndt", "7075722604", "1019 Lon");
		});}
	
	@Test
	void testContactClassFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("001","LarryTheBest", "Arndt", "7075722604", "1019 Lon");
		});}
	
	@Test
	void testContactClassFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("001",null, "Arndt", "7075722604", "1019 Lon");
		});}
	
	@Test
	void testContactClassLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("001","Larry", "ArndtyTheBest", "7075722604", "1019 Lon");
		});}
	
	@Test
	void testContactClassLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("001","Larry", null, "7075722604", "1019 Lon");
		});}
	
	@Test
	void testContactClassPhoneNumToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("001","Larry", "Arndt", "70757226043", "1019 Lon");
		});}
	
	@Test
	void testContactClassPhoneNumToShort() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("001","Larry", "Arndt", "707572260", "1019 Lon");
		});}
	
	
	@Test
	void testContactClassPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("001","Larry", "Arndt", null, "1019 Lon");
		});}
	@Test
	void testContactClassAdressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("001","Larry", "Arndt", "7075722603", "1019 Lon on the west coast of the world in sunny california Humboldt county baby");
		});}
	
	@Test
	void testContactClassAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("001","Larry", "Arndt", "7075722603", null);
		});}
	
	

}
