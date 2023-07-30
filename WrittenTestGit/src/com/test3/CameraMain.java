package com.test3;

public class CameraMain {

	public static void main(String[] args) {
		System.out.println("-----------------------Digital Camera-----------------------");
		DigitalCamera d = new DigitalCamera();
		System.out.println(d.takePhoto());
		
		System.out.println("\n-----------------------Poleroid Camera-----------------------");	
		PolaroidCamera p = new PolaroidCamera();
		System.out.println(p.takePhoto());
	
		System.out.println("\n-----------------------Phone Camera-----------------------");
		PhoneCamera pc=new PhoneCamera();
		System.out.println(pc.takePhoto());
	}
	
}
