package com.calculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Log {
	public void log() throws IOException {
		File file = new File("CalculationsHistory.txt");
		@SuppressWarnings("resource")
		BufferedWriter MyFileWriter= new BufferedWriter(new FileWriter(file,true));
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int Log;
		System.out.println("Common Log known as base 10 ,binary known as base 2 and natural log known as base e");
		System.out.println("To get log value" + "\nEnter Any One" + "\nPress 1 - Common log "
				+ "\nPress 2 - Binary log " + "\nPress 3 - Natural log ");
		Log = sc.nextInt();
		System.out.println("Enter the number");
		double num1 = sc.nextDouble();
		switch (Log) {
		case 1:
			double result1 = Math.log10(num1);
			System.out.println("Log value on base 10 is : " + result1);
			MyFileWriter.write("Entered Numbere"+num1);
			MyFileWriter.newLine();
            MyFileWriter.write("Answer "+result1);
			break;
		case 2:
			double result2 = Math.log(num1);
			System.out.println("Log value on base 2 is : " + result2);
			MyFileWriter.write("Entered Numbere"+num1);
			MyFileWriter.newLine();
            MyFileWriter.write("Answer "+result2);
			break;
		case 3:
			double result3 = Math.log1p(num1);
			System.out.println("Log value on base e is : " + result3);
			MyFileWriter.write("Entered Numbere"+num1);
			MyFileWriter.newLine();
            MyFileWriter.write("Answer "+result3);
			break;
		}
	}
}
