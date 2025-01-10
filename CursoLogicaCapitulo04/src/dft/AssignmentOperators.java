package dft;

public class AssignmentOperators {

	public static void main(String[] args) {
		Boolean threeGreaterThanTwo = 3 > 2;
		System.out.println("3 > 2? " + threeGreaterThanTwo);
		
		Boolean threeLessThanTwo = 3 < 2;
		System.out.println("3 < 2? " + threeLessThanTwo);
		
		Boolean threeGreaterThanThree = 3 > 3;
		System.out.println("3 > 3? " + threeGreaterThanThree);
		
		Boolean threeGreaterThanOrEqualThree = 3 >= 3;
		System.out.println("3 >= 3? " + threeGreaterThanOrEqualThree);
		
		Boolean threeLessThanOrEqualThree = 3 <= 3;
		System.out.println("3 <= 3? " + threeLessThanOrEqualThree);
		
		Boolean twoEqualsTwo = 2 == 2;
		System.out.println("2 == 2? " + twoEqualsTwo);
		
		Boolean twoNotEqualsTwo = 2 != 2;
		System.out.println("2 != 2? " + twoNotEqualsTwo);
		
		Integer four = 4;
		Boolean fourGreaterThanFour = four > four;
		System.out.println("four > four? " + fourGreaterThanFour);
		
		Boolean fourGreaterThanOrEqualsFour = four >= four;
		System.out.println("four >= four? " + fourGreaterThanOrEqualsFour);
		
		Integer five = 5;
		Boolean fiveEqualsFive = five.equals(five);
		System.out.println("five.equals(five)? " + fiveEqualsFive);
		
		Integer six = 6;
		Boolean fiveEqualsSix = five.equals(six);
		System.out.println("five.equals(six)? " + fiveEqualsSix);
		
		Integer oneHundreAndTwentyEight = 128;
		Integer oneHundreAndTwentyEight02 = 128;
		Boolean oneHundredAndTwentyEightEqualsOneHundredAndTwentyEight = oneHundreAndTwentyEight.equals(oneHundreAndTwentyEight02);
		System.out.println("oneHundredAndTwentyEight.equals(oneHundredAndTwentyEight02)? " + oneHundredAndTwentyEightEqualsOneHundredAndTwentyEight);
		
		Boolean oneHundredAndTwentyEightEqualsOneHundredAndTwentyEight02 = oneHundreAndTwentyEight == oneHundreAndTwentyEight02;
		System.out.println("oneHundredAndTwentyEight == oneHundredAndTwentyEight02? " + oneHundredAndTwentyEightEqualsOneHundredAndTwentyEight02);
		
	}

}
