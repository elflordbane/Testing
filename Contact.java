package Contact;

public class Contact {

private String id;
private String firstName;
private String lastName;
private String pNum;
private String address;

public  Contact(String id, String firstName, String lastName, String pNum, String address) {
	if (id == null || id.length()>10) {
		throw new IllegalArgumentException("Invalid id");
		}
	if (firstName == null || firstName.length()>10) {
		throw new IllegalArgumentException("Invalid First Name");
		}
	if (lastName == null || lastName.length()>10) {
		throw new IllegalArgumentException("Invalid Last Name");
		}
	if (pNum == null || pNum.length()!=10) {
		throw new IllegalArgumentException("Invalid Phone Number");
		}
	if (address == null || address.length()>30) {
		throw new IllegalArgumentException("Invalid address");
		}
	
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.pNum = pNum;
	this.address = address;
	}

  public String getId() 
  {return id;}
  
  public String getFirstName() 
  {return firstName;}
  
  public String getLastName() 
  {return lastName;}
  
  public String getPhoneNum() 
  {return pNum;}
  
  public String getAddress() 
  {return address;}
  
  void setFirstName(String fName)
  {	if (firstName == null || firstName.length()>10) {
		throw new IllegalArgumentException("Invalid First Name");
  }
    this.firstName = fName;}
  
  void setLastName(String lName)
  {if (lastName == null || lastName.length()>10) {
		throw new IllegalArgumentException("Invalid Last Name");
		}
  this.lastName = lName;}
  
  void setPhoneNum(String pNum)
  {if (pNum == null || pNum.length()!=10) {
		throw new IllegalArgumentException("Invalid Phone Number");
		}
  this.pNum = pNum;}
  
  void setAddress(String address)
  {if (address == null || address.length()>30) {
		throw new IllegalArgumentException("Invalid address");
		}
  this.address = address;} 
  
}
