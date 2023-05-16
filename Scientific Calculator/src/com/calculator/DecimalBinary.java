package com.calculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DecimalBinary {
	public int getdecimal(int binary) {
		int decimal = 0;
		int n = 0;
		while (true) {
			if (binary == 0) {
				break;
			} else {
				int temp = binary % 10;
				decimal = (int) (decimal + temp * Math.pow(2, n));
				binary = binary / 10;
				n++;
			}
		}
		return decimal;
	}

	@SuppressWarnings("resource")
	public void Main() throws IOException {
		Scanner sc = new Scanner(System.in);
		{
			File file = new File("CalculationsHistory.txt");
			BufferedWriter MyFileWriter = new BufferedWriter(new FileWriter(file, true));
			DecimalBinary DB = new DecimalBinary();
			System.out.println("Select Any one" + "\nEnter 1 - Decimal to Binary" + "\nEnter 2 - Binary to Decimal");
			int Converter = sc.nextInt();
			switch (Converter) {
			case 1:
				System.out.println("Enter decimal number to convert into binary");
				int a = sc.nextInt();
				String result1 = Integer.toBinaryString(a);
				System.out.println("The binary number is " + result1);
				MyFileWriter.write("Entered Number " + a);
				MyFileWriter.newLine();
				MyFileWriter.write("Answer " + result1);
				break;
			case 2:
				System.out.println("Enter binary bumber to convert into decimal");
				int binary = sc.nextInt();
				int result2 = DB.getdecimal(binary);
				System.out.println("The decimal number is : " + result2);
				MyFileWriter.write("Entered Number " + binary);
				MyFileWriter.newLine();
				MyFileWriter.write("Answer " + result2);
				break;
			}
		}

	}
}
