import java.util.Scanner;
    
  /* This program calculates the volume and surface area of a cylinder */
  // Programming is hard
  // I don't know what to say here
  // Comments are for bad jokes
 
  public class Cylinder   {
     public static void main(String [] args) {
   	
	// declaration of the variables
      	double h = 0;
	double r = 0;
	double v = 0; //volumn
	double ba = 0; //basearea
	double sa = 0; //surfacearea

	// create a Scanner ok what is a scanner?
    	Scanner input;
	input = new Scanner(System.in);

	// Enter radius   
	System.out.print("Please enter the radius = ");
	   
	// Read input from terminal and store it in the appropriate variable   
	r = input.nextDouble(); 
      
	// Enter height
	System.out.print("Please enter the height = ");

	// Read input from terminal and store it in the appropriate variable
	h = input.nextDouble(); 

	// define a variable for pi actually a constant...
    	final double pi = 3.14;

	//compute the volume of the cylinder and store it in appropriate variable
	ba = pi * r * r;
	v = ba * h;

	//computer the surface area and store it in appropriate variable.
      	sa = 2 * ba + (2 * r * pi)*h;

	// print out the result
	System.out.println ("Volume = "+v);
	System.out.println ("Surface Area = "+ sa);

      } 
}
