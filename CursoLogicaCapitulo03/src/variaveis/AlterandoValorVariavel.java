package variaveis;

import java.util.Scanner;

public class AlterandoValorVariavel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the product's price: ");
		Double productsPrice = scanner.nextDouble();
		
		System.out.print("Enter the type of payment [1 - total price / 2 - instalments]: ");
		Integer typeOfPayment = scanner.nextInt();
		
		Boolean isTotalPrice = typeOfPayment.equals(1);
		
		Double interestPercentage = 0.0;
		
		if (!isTotalPrice) {
			interestPercentage = 10.0;
		}
		
		Double interestFee = interestPercentage * productsPrice / 100.0;
		
		Double finalPrice = productsPrice + interestFee;
		
		System.out.println("Final price: " + finalPrice);
		
		
		scanner.close();
	}

}
