package logico;

public class TipoLogico {

	public static void main(String[] args) {
		Boolean trueVariable = true;
		System.out.println("True variable: " + trueVariable);
		
		Boolean falseVariable = false;
		System.out.println("False variable: " + falseVariable);
		
		System.out.println("---------------------------------------");
		
		Integer age = 17;
		
		Boolean canHaveDrivingLicense = age >= 18;
		
		if (canHaveDrivingLicense) {
			System.out.println("Yes! He/she can have a driving license.");			
		} else {
			System.out.println("No! He/she cannot have a driving license.");
		}

	}

}
