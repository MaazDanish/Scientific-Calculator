package com.calculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Trigonometry {
	public void trigonometry() throws IOException {
		File file = new File("CalculationsHistory.txt");
		BufferedWriter MyFileWriter= new BufferedWriter(new FileWriter(file,true));
		int trigonometry;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Choice" + "\nEnter 1 - Sin" + "\nEnter 2 - Cos" + "\nEnter 3 - tan"
				+ "\nEnter 4 - cot" + "\nEnter 5 - cosec" + "\nEnter 6 - sec");
		trigonometry = sc.nextInt();
		System.out.println("Enter your value");
		double degrees = sc.nextDouble();
		switch (trigonometry) {
		case 1:
			double result1 = Math.sin(degrees);
			System.out.println("The sin of : " + degrees + " Degree is :" +result1);
			MyFileWriter.write("Entered Input"+degrees);
			MyFileWriter.newLine();
			MyFileWriter.write("Answer "+result1);
			MyFileWriter.close();
			break;
		case 2:
			double result2=Math.cos(degrees);
			System.out.println("The cos of : " + degrees + " Degree is :" +result2 );
			MyFileWriter.write("Entered Input"+degrees);
			MyFileWriter.newLine();
			MyFileWriter.write("Answer "+result2);
			MyFileWriter.close();
			break;
		case 3:
			double result3=Math.tan(degrees);
			System.out.println("The tan of : " + degrees + " Degree is :" +result3);
			MyFileWriter.write("Entered Input"+degrees);
			MyFileWriter.newLine();
			MyFileWriter.write("Answer "+result3);
			MyFileWriter.close();
			break;
		case 4:
			double result4 = 1 / Math.tan(degrees);
			System.out.println("The cot of : " + degrees + " Degree is :" + result4);
			MyFileWriter.write("Entered Input"+degrees);
			MyFileWriter.newLine();
			MyFileWriter.write("Answer "+result4);
			MyFileWriter.close();
			
			break;
		case 5:
			double result5 = 1 / Math.cos(degrees);
			System.out.println("The cosec of : " + degrees + " Degree is :" + result5);
			MyFileWriter.write("Entered Input"+degrees);
			MyFileWriter.newLine();
			MyFileWriter.write("Answer "+result5);
			MyFileWriter.close();
					
			break;
		case 6:
			double result6 = 1 / Math.sin(degrees);
			System.out.println("The sec of : " + degrees + " Degree is :" + result6);
			MyFileWriter.write("Entered Input"+degrees);
			MyFileWriter.newLine();
			MyFileWriter.write("Answer "+result6);
			MyFileWriter.close();
			break;
		}
	
	}
}
