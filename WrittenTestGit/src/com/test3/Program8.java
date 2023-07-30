package com.test3;

class CodeA {
	public String type = "A ";

	public CodeA() {
		System.out.print("CodeA ");
	}
}

class CodeB extends CodeA {
	public CodeB() {
		System.out.print("CodeB ");
	}

	void go() {
		type = "B ";
		System.out.print(this.type + super.type);
	}

	public class Program8 {
		public static void main(String[] args) {
			new CodeB().go();
		}
	}
}
