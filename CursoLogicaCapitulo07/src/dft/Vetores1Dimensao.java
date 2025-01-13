package dft;

import java.util.Scanner;

public class Vetores1Dimensao {

	public static void main(String[] args) {
//		String[] menu = new String[] { "Capricciosa", "Tuna", "Margherita", "Prosciutto e Funghi" };
//		
//		System.out.println("Choose your pizza: ");
//		
//		for (int i = 0; i < menu.length; i++) {
//			System.out.println("[" + i + "] " + menu[i]);
//		}
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("Type in the number of the chosen pizza: ");
//		Integer chosenPizza = scanner.nextInt();
//		
//		System.out.println("You chose the following pizza: " + menu[chosenPizza]);
//		
//		scanner.close();
		
		
//		String[] menu = new String[] { "Capricciosa", "Tuna", "Margherita", "Prosciutto e Funghi" };
//		menu[3] = "Frango";
//		
//		for (int i = 0; i < menu.length; i++) {
//			System.out.println("[" + i + "] " + menu[i]);
//		}
		
		String[] menu = new String[4];
		menu[0] = "Capricciosa";
		menu[1] = "Tuna";
		menu[2] = "Margherita";
		menu[3] = "Prosciutto e Funghi";
		
		for (int i = 0; i < menu.length; i++) {
			System.out.println("[" + i + "] " + menu[i]);
		}

	}

}
