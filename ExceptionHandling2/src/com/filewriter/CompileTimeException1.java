package com.filewriter;
//filewriter
import java.io.FileWriter;
import java.io.IOException;

public class CompileTimeException1 {

	public static void main(String[] args) {
		FileWriter fw=null;
		try {
		fw= new FileWriter("myfill.txt"); 	
		String data = "java is my fav language";
		fw.write(data);
		System.out.println("File Created");
		} 
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try {
				fw.close();
			} catch (Exception e2)
			{
				System.out.println(e2.getMessage());
			}
		}
	}
}
