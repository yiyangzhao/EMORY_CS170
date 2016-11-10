/*Don't forget your collaboration statement (see syllabus) here */
/*
YIYANG ZHAO (Alan)
2065868 / yzhao97@emory.edu
I worked on thie assignment alone, using only this semester's course material.
*/

/*Now it is joking time.
but i have no jokes for now.
sorry*/

//the program starts here...

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		/*TODO: Exercise 1: Make your program read in two double typed numbers from the user.
		Your program should prompt the user to enter the data.
		Let's call them a and b (although you can use whatever variable names you like.
		Then make your program print out the result of:
			a plus b
			a minus b
			a times b
			a divided by b
		Format your output so that it is readable.  For example, if the user enters
		3.5 and 6.9, your program should print out something like "3.5 + 6.9 = 10.4"
		*/

		//Excercise 1 begin
			System.out.println();
			System.out.println("---------------Exercise 1---------------");

			double a = 0, b = 0, adivb = 0;

			Scanner inpn;
			inpn = new Scanner(System.in);

			System.out.print ("Please input a (double) number (a):         a=? _");
			a = inpn.nextDouble();
			System.out.println();
			System.out.print ("Please input another (double) number (b):   b=? _");
			b = inpn.nextDouble();
			System.out.println();
			System.out.println("-----------Results----------");


			System.out.println ("a + b : "+a+" + "+b+" = "+(a+b));
			System.out.println ("a - b : "+a+" - "+b+" = "+(a-b));
			System.out.println ("a * b : "+a+" * "+b+" = "+(a*b));
				
			if (b == 0.0){
				System.out.println ("a / b : "+a+" / "+b+" is not defined: cannot devided by 0");				
			} else {
				System.out.println ("a / b : "+a+" / "+b+" = "+(a/b));
			}






		/*TODO: Exercise 2: Cast your two doubles to ints and print out the result
		of a mod b. Cast the int a to a character and print out the resulting character
		(Note that you will have to be specific in your input to get a viewable character.  
		There are lots of characters in the ASCII table which do not have a viewable output.) 
		Again, use a readable output as specified in Exercise 1.*/
		
		System.out.println();
		System.out.println("---------------Exercise 2---------------");

		int inta = 0, intb = 0;
		inta = (int)a;
		intb = (int)b;
		if (intb==0) {
			System.out.println ("(int)a mod (int)b : "+ inta + " mod " + intb + " is not defined: (int)b cannot be 0");
		} else {
			System.out.println ("(int)a mod (int)b : "+ inta + " mod " + intb + " = " + (inta % intb));
		}

		char chara = '\0';

		if ((inta >= 0) && (inta <= 127)) {
			chara = (char)inta;
			System.out.println ("ASCII character corresponding to "+ inta + " is " + chara);
			if (!((inta>=32) && (inta<=126))) {System.out.println ("Notice: this character does not have a visible output");}
			
		} else {
			System.out.println ("Error: No ASCII charactar corresponds to "+ inta);
		}


		/*TODO: Exercise 3: Make your program read in a String from the user.  Determine
		whether the first character of that String is a number or a letter.  Your program
		should print out "The first character is a number" or "The first character is a
		letter" or "The first character is something else."		
		
		(Hint: this is
		very easy if you look at an ASCII chart and remember how to compare characters using
		their numeric values.  If you find yourself writing more than ~5-8 lines of code,
		stop and rethink your approach.) */

		System.out.println();
		System.out.println("---------------Exercise 3---------------");
		String s = "";
		System.out.print("Please enter a string here: _");
		s = inpn.next();
		char s0 = '\0';
	
		if (s.length()!=0) {

			s0 = s.charAt(0);
			if ((s0>=48) && (s0<=57)){
				System.out.println ("The first character is a number");
			} else {
				if (((s0>=65) && (s0<=90)) || ((s0>=97) && (s0<=122))) {
					System.out.println ("The first character is a letter");			
				} else {System.out.println ("The first chatacter is something else"); }
			}

		} else {
			System.out.println ("Error: empty string. No first character.");
		}


		/*TODO: Exercise 4:  Using the string the user entered in Exercise 3, determine if
		the first and last characters are the same, regardless of capitalization.
		In other words, if the user put in the String "tababababT" or "abbbbba" or 
		similar, your program should print out "The first and last characters are the same
		letter!"  Otherwise, your program should print out "The first and last characters
		are different. */

		System.out.println();
		System.out.println("---------------Exercise 4---------------");
		int sLength = 0;
		char sLast = '\0';
		sLength = s.length();
		if (sLength>0) {
			sLast = s.charAt(sLength - 1);
			if (((s0>=48) && (s0<=57)) && (sLast == s0)) {
				System.out.println ("The first and last characters are the same number!");
			} else {
				if  ((s0>=65) && (s0<=90))  {
					if ((s0 == sLast) || (s0 == (char)(sLast-32))) {
						System.out.println ("The first and last characters are the same letters");
					} else {
						System.out.println ("The first and last characters are different");
					}

				} else {
					if  ((s0>=97) && (s0<=122))  {
						if ((s0 == sLast) || (s0 == (char)(sLast+32))) {
							System.out.println ("The first and last characters are the same letters");
						} else {
							System.out.println ("The first and last characters are different");
						} 
				
					} else {
						if (s0==sLast) {
							System.out.println ("The first and last characters are the same");
						} else {
							System.out.println ("The first and last characters are different ");
						}
					}
				}
							
			}
		} else {
			System.out.println ("Error: empty string. Cannot campare first and last character.");
		}



	}
}
