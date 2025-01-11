package dft;

import java.util.Scanner;

public class Mod4Exercicio04 {
	
	static final Integer MINIMUM_AGE_RETIREMENT = 55;
	
	static final Integer MINIMUM_YEARS_CONTRIBUTION = 25;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		Integer usersAge = scanner.nextInt();
		
		System.out.print("How long did you contribute with previdence? ");
		Integer periodOfPrevidenceContribution = scanner.nextInt();
		
		Boolean hasMinimumAge = usersAge >= MINIMUM_AGE_RETIREMENT;
		
		Boolean hasMinimumPeriodOfContribution = periodOfPrevidenceContribution >= MINIMUM_YEARS_CONTRIBUTION;
		
		Boolean canRetired = hasMinimumAge && hasMinimumPeriodOfContribution;
		
		if (canRetired) {
			System.out.println("Yes, you can retire!");
		} else {
			System.out.println("No, you don't have the minimum requirements to retire.");
		}
		
		scanner.close();
	}

}
