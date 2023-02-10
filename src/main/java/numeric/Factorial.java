/**
 * This class implements the calculation of the factorial
 * of an input of an integer stored in a string.
 *
 * @author Joshua Cappella
 * @version 1.0
 * File: Factorial.java
 * Created: Jan 27 2023
 *
 * Description: This class provides the factorial of an integer as a double. For example, if the
 * user types "java GCD 5", the program will return the number "120", a double.
 * Factorial does not inherit from other classes, and is not anticipated to be a base
 * class for other classes.
 *
 */
package numeric;

/**
 *  Description: This class provides the factorial of an integer as a double. For example, if the
 * user types "java GCD 5", the program will return the number "120", a double.
 * Factorial does not inherit from other classes, and is not anticipated to be a base
 * class for other classes.
 */

public class Factorial{
	
	/**
	 * This functions computes the factorial of an inputted integer X and returns the result as a double.
	 */
	public static double compute(int x){
 		double i = 1;
		if((x == 0) || (x == 1)){
                        return 1;
                }
 		if(x != 0){
        		for(int j = 2; j <= x; j++){
				i = i * j;
        		}
			return i;
  		}
	return -2;
	}

	/**
	 * This function takes in a string of arguments, ensures that only 1 argument is inputed, calls
	 * compute to get the factorial of the integer, and prints the result.
	 */

	public static void main(String[] args){
	 
		// Check for the proper number of args
		if(args.length != 1){
			System.out.println("Please input one and only one integer.");
		}
		else{
			// Gets integer and calls compute
                	int a = Integer.parseInt(args[0]);
			double b = compute(a);
			// Check to see if a negative number was input by the user.
			if(b == -1){
			System.out.println("Factorials of negative numbers are undefined.");
			}
			// Print the result if it is valid
			else{
                	System.out.println("The Factorial of " + a + " is " + b + ".");
			}
        	}
	}
}
