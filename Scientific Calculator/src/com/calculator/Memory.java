package com.calculator;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Memory {
	@SuppressWarnings("resource")
	public static int storefunc() throws IOException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value to store");
		var a =sc.nextInt(); 
		System.out.println("The value of a is stored succesfully where a = "+a);
		File file = new File("CalculationsHistory.txt");
		BufferedWriter MyFileWriter= new BufferedWriter(new FileWriter(file,true));
		MyFileWriter.write("Entered NUmber"+a);
		MyFileWriter.newLine();
		MyFileWriter.write("Stored Number "+a);
		return a ;
		
		
	}
	@SuppressWarnings("resource")
	public static void recallfunc() throws IOException {
		var y=storefunc();
		System.out.println("Recalling of a value is : " +y);
		File file = new File("CalculationsHistory.txt");
		BufferedWriter MyFileWriter= new BufferedWriter(new FileWriter(file,true));
		MyFileWriter.write("Entered NUmber "+y);
		MyFileWriter.newLine();
		MyFileWriter.write("Answer "+y);
	
	}
}
