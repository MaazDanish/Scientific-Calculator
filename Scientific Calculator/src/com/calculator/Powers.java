package com.calculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Powers {
	public int square(int x) {
		int result = 0;
		result = x * x;
		return result;
	}

	public int Cube(int x) {
		int result = 0;
		result = x * x * x;
		return result;
	}
	public double anyPower(int x,int y) {
		double result = (Math.pow(x, y));
	    return result;
	}

	@SuppressWarnings("resource")
	public void powers() throws IOException {
		File file = new File("CalculationsHistory.txt");
		BufferedWriter MyFileWriter= new BufferedWriter(new FileWriter(file,true));
		Powers powers = new Powers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 - Square (x^2) " + "\nPress 2 - Cube (x^3)"+"\nPress 3 - Nth Power");
		int Powers = sc.nextInt();
		System.out.println("Enter the x Value");
		int num = sc.nextInt();
		switch (Powers) {
		case 1:
			double result1 = powers.square(num);
			System.out.println("The Square is : " + result1 + " of " + num);
			MyFileWriter.write("Entered Number "+num);
			MyFileWriter.newLine();
            MyFileWriter.write("Answer "+result1);
			break;
		case 2:
			double result2= powers.Cube(num);
			System.out.println("The cube is : " + result2 + " of " + num);
			MyFileWriter.write("Entered Number "+num);
			MyFileWriter.newLine();
            MyFileWriter.write("Answer "+result2);
			break;	
		case 3 :
			System.out.println("Enter the Nth Power value");
			int powerofX= sc.nextInt();
			double ans= powers.anyPower(num, powerofX);
			System.out.println(ans);
			break;
		}

	}
}
