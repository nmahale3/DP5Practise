package day16.lab_21_07_2023.model;

public class Person {


	private String pName;
	private int pAge;
	private String pAddress;

	public Person(String pName, int pAge, String pAddress) {
		super();
		this.pName = pName;
		this.pAge = pAge;
		this.pAddress = pAddress;
	}

	public Person()
	{

	}
	public Person(String pName)
	{
		
	}
	public Person(String pName,int pAge)
	{
		
	}
	public Person(int age,String pAddress)
	{
		
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpAge() {
		return pAge;
	}
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}
	public String getpAddress() {
		return pAddress;
	}
	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
	public String toString()
	{
		return "Person name: "+pName+"\nPerson Age: "+pAge+"\nPerson Address: "+pAddress;
	}
}
