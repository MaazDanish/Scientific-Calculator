package com.calculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SIPCalculations {
   @SuppressWarnings( "resource")
public void SIPCalculator() throws IOException{
	File file = new File("CalculationsHistory.txt");
	BufferedWriter MyFileWriter= new BufferedWriter(new FileWriter(file,true));
	System.out.println("SIP Calculator");
	Scanner sc = new Scanner(System.in);
    int TP; int MI;
    double r;
    System.out.println("Monthly Investment");
    MI=sc.nextInt();
    System.out.println("Time period");
    TP=sc.nextInt();
    System.out.println("Expected Ratio");
    r=sc.nextDouble();
    double i=r/12/100;
    int n = TP*12;
    double IA=MI*n;
    System.out.println("Invested Amount\t\t\t\t"+IA);
    double Total_Amount  = MI*((Math.pow((1+i), n)-1)/i)*(1+i);
    System.out.println("Total amount\t\t\t\t"+Total_Amount);
    double ER =(Total_Amount-IA);
    System.out.println("Estimated Return\t\t\t"+ER);  
    
    MyFileWriter.write("Monthly Investment "+MI);
    MyFileWriter.newLine();
    MyFileWriter.write("Time Peiord "+TP);
    MyFileWriter.newLine();
    MyFileWriter.write("Expected Ratio "+r);
    MyFileWriter.newLine();
    MyFileWriter.write("Total Amount "+Total_Amount);
    MyFileWriter.newLine();
    MyFileWriter.write("Invested total amount "+IA);
    MyFileWriter.newLine();
    MyFileWriter.write("Profit "+ER);
    
    
    
   }}
