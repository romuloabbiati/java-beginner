package constantes;

import java.util.Scanner;

public class Constantes {
	
	final static Integer MINIMUM_AGE_TO_HAVE_DRIVING_LICENSE = 18;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Age: ");
		Integer age = scanner.nextInt();
		
		Boolean canHaveDrivingLicense = age >= MINIMUM_AGE_TO_HAVE_DRIVING_LICENSE;
		
		if (canHaveDrivingLicense) {
			System.out.println("Yes! He/she is allowed to have a driving license.");
		} else {
			System.out.println("No! He/she is not allowed to have a driving license.");
		}
		
		
		scanner.close();
	}

}
