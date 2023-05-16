package com.calculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Root {
	@SuppressWarnings("resource")
	public void root() throws IOException {
		File file = new File("CalculationsHistory.txt");
		BufferedWriter MyFileWriter= new BufferedWriter(new FileWriter(file,true));
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your choice" + "\nPress 1 - Square root" + "\nPress 2 - Cube root");
		int root = sc.nextInt();
		System.out.println("enter number");
		double a = sc.nextDouble();
		switch (root) {
		case 1:
			double result1= Math.sqrt(a);
			System.out.println("The value of square root is : " +result1);
			System.out.println("Your entered value : \t" + a);
			MyFileWriter.write("Entered Number"+a);
			MyFileWriter.newLine();
            MyFileWriter.write("Answer "+result1);
			break;
		case 2:
			double result2=Math.cbrt(a);
			System.out.println("The value of cube root is : " + result2);
			System.out.println("Your entered value : \t" + a);
			MyFileWriter.write("Entered Number"+a);
			MyFileWriter.newLine();
            MyFileWriter.write("Answer "+ result2);
			break;
		}
	}
}
