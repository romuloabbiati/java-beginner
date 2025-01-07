package exercicio02;

import java.util.Scanner;

public class Mod03Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type in your name: ");
		String name = scanner.nextLine();
		
		System.out.print("Type in your surname: ");
		String surname = scanner.nextLine();
		
		String fullName = name + " " + surname;
		
		System.out.println("Your full name is " + fullName);
		
		scanner.close();
	}

}
