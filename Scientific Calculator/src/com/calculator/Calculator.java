package com.calculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) throws IOException {
		File file = new File("CalculationsHistory.txt");
		BufferedWriter MyFileWriter = new BufferedWriter(new FileWriter(file, true));
		System.out.println("welcome to Scientific Calculator - Developed By Danish Kamal");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("\nSelect operations" + "\nPress 1 - Arithmatic operations " + "\nPress 2 - Powers"
					+ "\nPress 3 - Trigonometry" + "\nPress 4 - Logarithmic Values" + "\nPress 5 - Roots"
					+ "\nPress 6 - DecimalBinaryConverter" + "\nPress 7 - SIP Calculations" + "\nPress 8 - Memory");
			int Choice = sc.nextInt();
			if (Choice == 1) {
				System.out.println("You can perform Arithmetic Operations");
				char operator;
				ArithmeticOperations ao = new ArithmeticOperations();
				System.out.println("Select your choice" + "\nEnter + : Addition " + "\nEnter - : Substraction "
						+ "\nEnter * : Multiplication " + "\nEnter / : Division " + "\nEnter % : Modulo ");
				operator = sc.next().charAt(0);
				System.out.println("Enter first number");
				double num1 = sc.nextDouble();
				System.out.println("Enter second number");
				double num2 = sc.nextDouble();
				switch (operator) {
				case '+':
					System.out.println(ao.Addition(num1, num2));
					MyFileWriter.write("First Input Number " + num1 + " Second input Number " + num2);
					MyFileWriter.newLine();
					MyFileWriter.write(" Answer " + ao.Addition(num1, num2));
					MyFileWriter.close();
					break;
				case '-':
					System.out.println(ao.substraction(num1, num2));
					MyFileWriter.write("First Input Number " + num1 + " Second input Number " + num2);
					MyFileWriter.newLine();
					MyFileWriter.write(" Answer " + ao.substraction(num1, num2));
					MyFileWriter.close();
					break;
				case '*':
					System.out.println(ao.Multiplication(num1, num2));
					MyFileWriter.write("First Input Number " + num1 + " Second input Number " + num2);
					MyFileWriter.newLine();
					MyFileWriter.write(" Answer " + ao.Multiplication(num1, num2));
					MyFileWriter.close();
					break;
				case '/':
					System.out.println(ao.Division(num1, num2));
					MyFileWriter.write("First Input Number " + num1 + " Second input Number " + num2);
					MyFileWriter.newLine();
					MyFileWriter.write(" Answer " + ao.Division(num1, num2));
					MyFileWriter.close();
					break;
				case '%':
					System.out.println(ao.Modulo(num1, num2));
					MyFileWriter.write("First Input Number " + num1 + " Second input Number " + num2);
					MyFileWriter.newLine();
					MyFileWriter.write(" Answer " + ao.Modulo(num1, num2));
					MyFileWriter.close();
					break;
				}
			} else if (Choice == 2) {
				System.out.println("You can check square and cube of a number");
				Powers power = new Powers();
				power.powers();
			} else if (Choice == 3) {
				System.out.println("Let's Calculate the angle of sin,cosin and tan");
				Trigonometry t = new Trigonometry();
				t.trigonometry();
			} else if (Choice == 4) {
				System.out.println("Let's Calculate the Log value");
				Log log = new Log();
				log.log();

			} else if (Choice == 5) {
				System.out.println("Let's Find roots value ");
				Root root = new Root();
				root.root();
			} else if (Choice == 6) {
				System.out.println("You Can convert Binary to decimal & Decimal to binary");
				DecimalBinary db = new DecimalBinary();
				db.Main();
			} else if (Choice == 7) {
				System.out.println("Let's Calculate SIP for mutual Funds");
				SIPCalculations SC = new SIPCalculations();
				SC.SIPCalculator();
			} else if (Choice == 8) {
				System.out.println("Let's  Store and recall values from memory");
				new Memory();
				System.out.println("Press 1 - To store value " + "\nPress 2 - To recall stored value");
				int option = sc.nextInt();

				switch (option) {
				case 1:
					Memory.storefunc();
					break;
				case 2:
					Memory.recallfunc();
					break;
				}
			}

			else {
				System.out.println("Invalid Input - try again");
			}
		}

	}
}
