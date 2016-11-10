public class Arithmetic2 {
	public static void main(String[] args) {
		int operand1, operand2;
		char operator;

		//Check if there are 3 command line arguments
		if (args.length != 3 ) {
			System.err.println("*** Program requires 3 arguments ***");
			System.err.println("Usage: java Arithmetic1 int1 int2 operator");
			System.exit(1);
		}

		//Use the Integer.parseInt(aStr) to convert a String to int
		operand1 = Integer.parseInt(args[0]);

		//TODO:
		//		Write a statement to read the 2nd operand and convert it to an int
		operand2 = Integer.parseInt(args[1]);

		//Get the appropriate character for the operator
		operator = args[2].charAt(0);

		//print out the operands and operator
		System.out.print(args[0] + args[2] + args[1] + "=");


		//TODO:
		//		use the switch statement to perform the appropriate operation
		//		according to the operator variable
		//		Supported operations are +, -, /, and *

		switch(operator) {
			case('-'): 
				System.out.println(operand1 - operand2);
				break;
			case('+'):
				System.out.println(operand1 + operand2);
				break;
			case('/'):
				if (operand2 != 0) {System.out.println(operand1 / operand2);} else {System.out.println("Error: cannot divid by 0");}
				break;
			default:
				System.out.println("Error. Invalid operator.");
		}
	}
}
