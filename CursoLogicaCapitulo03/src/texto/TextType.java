package texto;

import java.util.Scanner;

public class TextType {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type your name: ");
		String nome = scanner.nextLine();
		
		System.out.println("Hello " + nome + "!");
		
		scanner.close();
		
		Character variavelChar = 'A';
	}

}
