package com.test2;


 interface Player 
 {
	 abstract void play();
	 
}

 
 class Child implements Player
 {

	@Override
	public void play() {
		System.out.println("Child is playing with toys.");	
	}
	 
 }
 class Musician implements Player
 {

	@Override
	public void play() {
		 System.out.println("Musician is playing an instrument.");
	}
	 
 }
 class Actor implements Player
 {

	@Override
	public void play()
	{
        System.out.println("Actor is playing a character in a drama or movie.");
	}
	 
 }
 
 
 public class Prog9{
	 public static void main(String[] args) {
		 Player child = new Child();
		 child.play();
		 
		 Player musician = new Musician();
		 musician.play();
		 
		 Player actors = new Child();
		 actors.play();
		 
	}
 }