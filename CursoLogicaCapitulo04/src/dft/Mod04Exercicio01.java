package dft;

import java.util.Scanner;

public class Mod04Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type the first number: ");
		Double firstNumber = scanner.nextDouble();
		
		System.out.print("Type in the arithmetic operation [ 1 - +, 2 - -, 3 - *, 4 - / ]: ");
		Integer arithmeticOperation = scanner.nextInt();
		
		System.out.print("Type the second number: ");
		Double secondNumber = scanner.nextDouble();
		
		Double operationResult;
		String nameOfTheOperationChosen;
		
		if (arithmeticOperation.equals(1)) {
			nameOfTheOperationChosen = "addition";
			operationResult = firstNumber + secondNumber;
			
		} else if (arithmeticOperation.equals(2)) {
			nameOfTheOperationChosen = "subtraction";
			operationResult = firstNumber - secondNumber;
			
		} else if (arithmeticOperation.equals(3)) {
			nameOfTheOperationChosen = "multiplication";
			operationResult = firstNumber * secondNumber;
			
		} else {
			nameOfTheOperationChosen = "division";
			operationResult = firstNumber / secondNumber;
		}
		
		System.out.println("The result of the " + nameOfTheOperationChosen + " is " + operationResult + ".");
		
		scanner.close();
	}

}
