package exercicio03;

import java.util.Scanner;

public class Mod03Exercicio03 {
	
	final static Integer MINIMUM_SCORE = 70;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the student's scoring: ");
		Double score = scanner.nextDouble();
		
		Boolean isGreaterThanSeventy = score >= MINIMUM_SCORE;
		
		String message;
		
		if (isGreaterThanSeventy) {
			System.out.println("Congrats, you're score is greater than 70.");
		} else {
			System.out.println("Unfortunately, you will have to study a bit more.");
		}
		
		scanner.close();
	}

}
