/**
 * This class implements the calculation of the Greatest Common Divisor
 * for an input of two integers stored in a string
 *
 * @author Joshua Cappella
 * @version 1.0
 * File: GCD.java
 * Created: Jan 27 2023
 */

package numeric;

/**
 * Description: This class provides a GCD for two integers. For example, if the
 * user types "java numeric.GCD 50 30", the program will return the number "10".
 * GCD does not inherit from other classes, and is not anticipated to be a base
 * class for other classes.
 */

public class GCD{

	/**
	 * This class implements the calculation of the Greatest Common Divisor
	 * for an input of two integers, x and y. 
	 */

	public static int compute(int x, int y){
		
		if(x < 0){
			x *= (-1);
		}
		if(y < 0){
			y *= (-1);
		}
		if(y == x){
                        return x;
                }
		if(y == 0){
			return x;
		}
		else if(x == 0){
                        return y;
                }
                else {
			return compute((y%x),x);
		}
	}

	/**
	 * This function takes in a string of arguments, checks that there are
	 * only two arguments, calls compute to obtain the greatest common
	 * divisor, and then prints the results.
	 */

	public static void main(String[] args){
		// Checks for the proper number of arguments
		if(args.length != 2){
			System.out.println("Please input two and only two integers.");
		}
		// Prints out the Greatest Common Divisor
		else{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("The GCD of " + a + " and " + b +  " is " + compute(a,b) + ".");
		}
	}
}
