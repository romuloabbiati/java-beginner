package exercicio04;

import java.util.Scanner;

public class Mod03Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the product's price: ");
		Double productsPrice = scanner.nextDouble();
		
		System.out.print("Enter the product's quantity: ");
		Integer productsQuantity = scanner.nextInt();
		
		Double subtotal = productsPrice * productsQuantity;
		
		Boolean isQuantityGreaterOrEqualToTen = productsQuantity >= 10;
		
		Double discountPercentage = 0.0;
		
		if (isQuantityGreaterOrEqualToTen) {
			discountPercentage = 10.0;
		}
		
		Double discountValue = subtotal * discountPercentage / 100;
		
		Double finalPrice = subtotal - discountValue;
		
		System.out.println("Final price is " + finalPrice);
		
		scanner.close();
	}

}
