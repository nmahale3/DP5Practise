package com.customeexception;

import java.io.IOException;

public class RethrowException {

	public static void findLength(String s) throws IOException {

		try {
			System.out.println("Length of String : " + s.length());
		} catch (Exception e) {
			throw new IOException("String doesnt have any value :");
		}
	}

	public static void main(String[] args) {
		String s = null;
		try {
			findLength(s);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
