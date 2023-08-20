package day14.assignment.overriding;

class Contact
{
	private String personName;
	private String personMobNo;
	private String personEmail;
	
	public Contact(String personName, String personMobNo, String personEmail)
	{
		this.personName = personName;
		this.personMobNo = personMobNo;
		this.personEmail = personEmail;
	}
	void printContact()
	{
		System.out.println("Person Name:\t"+personName);
		System.out.println("Person M.No.:\t"+personMobNo);
		System.out.println("Person Name:\t"+personEmail);
	}
	
	
}

class EmployeeContact extends Contact
{
	protected String city;
	public String country;
	public int pin;
	protected String designation;
	protected String dateOfBirth;
	
	public EmployeeContact(String personName, String personMobNo, String personEmail,String city,String country,int pin,String designation,	String dateOfBirth) {
		super(personName, personMobNo, personEmail);
		this.city= city;
		this.country= country;
		this.pin= pin;
		this.designation = designation;
		this.dateOfBirth= dateOfBirth;
	}
	@Override
	void printContact() 
	{
		super.printContact();
		System.out.println("Person City:\t"+city);
		System.out.println("Person Country:\t"+country);
		System.out.println("City Pincode:\t"+pin);
		System.out.println("Person Designation:\t"+designation);
		System.out.println("Person D.O.B:\t"+dateOfBirth);
	}
	
}

class CompanyContact extends Contact
{

	public String companyName;
	public String website;
	public String department;	
	protected String city;
	public String address;
	public String country;
	public int pin;
		
	public CompanyContact(String personName, String personMobNo, String personEmail,String companyName,String website,String department,String city,String address,String country,int pin)
	{
		super(personName, personMobNo, personEmail);
	
		this.companyName=companyName;
		this.website=website;
		this.department=department;
		this.city=city;
		this.address=address;
		this.country=country;
		this.pin=pin;		
		}
	@Override
	void printContact() 
	{
		super.printContact();
		System.out.println("Company Name:\t"+companyName);
		System.out.println("Company Website:\t"+website);
		System.out.println("Company Department:\t"+department);
		System.out.println("Company City:\t"+city);
		System.out.println("Company Country:\t"+country);
		System.out.println("City Pincode:\t"+pin);

	}
}
public class Contacts {
	
	
	public static void main(String[] args) {
		
		EmployeeContact e =new EmployeeContact("Navin", "7620753076", "nmahale3@gmail.com", "Pune", "Maharashtra", 411041, "Software Engg", "08/07/1997");
		e.printContact();
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
	
		CompanyContact cc =new CompanyContact("Navin", "7620753076", "nmahale3@gmail.com", "ThinkQuotient","www.tq.com","R&D", "Pune","Nal Stop Erandwane Pune","Maharashtra",411041);
		cc.printContact();
	}
	

}
