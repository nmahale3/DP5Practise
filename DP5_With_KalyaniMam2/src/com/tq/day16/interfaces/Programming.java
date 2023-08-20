package com.tq.day16.interfaces;

interface Language {
	 void showName(String name);
}

class ProgrammingLanguage implements Language
{

	@Override
	public void showName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Programming Language : "+name);
	}
	
}


class CommunicationLaanguage implements Language
{

	@Override
	public void showName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Mother Tongue : "+name);
	}
	
}

public class Programming {

	public static void main(String[] args) {
		Language l;
		l=new ProgrammingLanguage();
		l.showName("Java");
		l= new CommunicationLaanguage();
		l.showName("Marathi");
	}
}
