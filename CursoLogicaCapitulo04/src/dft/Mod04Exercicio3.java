package dft;

import java.util.Scanner;

public class Mod04Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double totalBill = 0.0;
		
		System.out.print("Enter the value of electricity bill: ");
		totalBill += scanner.nextDouble();
		
		System.out.print("Enter the value of water bill: ");
		totalBill += scanner.nextDouble();
		
		System.out.print("Enter the value of phone bill: ");
		totalBill += scanner.nextDouble();
		
		System.out.print("Enter the value of school: ");
		totalBill += scanner.nextDouble();
		
		System.out.print("Enter the value of debit/credit card: ");
		totalBill += scanner.nextDouble();
		
		System.out.print("Grocery store: ");
		totalBill += scanner.nextDouble();
		
		System.out.println("The total bill is " + totalBill);
		
		
		scanner.close();
	}

}
