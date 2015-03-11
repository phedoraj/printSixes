import java.util.*;

/**
*Prints multiples of a certain number within a range of numbers, based on user inputs.
*@author Lydia Joslin
*version 1.0
*/
public class Final {
	public static void main(String [] args) {
	intro();
	userInput();
	printNumbers();
	}
	/**
	* Tells user the purpose of the program and gives an example.
	*/
	public static void intro() {
		System.out.println("Congratulations on being selected as a test user for our number printer!");
		System.out.println("This educational tool will print all the  integers that are multiples of"); 
		System.out.println("another integer up to a final, highest integer!");
		System.out.println("This number printer only takes integers greater than zero.");
		System.out.println("In other words, you will enter a minimum value (an integer) and a");
		System.out.println("maximum value. We will find multiples between these values.");
		System.out.println("Finally, you will choose the multiple whose values the number"); 
		System.out.println("printer will print in the range you set.");
		System.out.println("Example: MIN = 0, MAX = 100, MULTIPLE = 6, would print");
		System.out.println("all multiples of 6 between 0 and 100\n");
	
	}
	/**
	* Minimum value to be printed
	*/
	private static int min = 0;
	/**
	* Maximum value to be printed
	*/
	private static int max = 0;
	/**
	* Multiple, the integer we are looking for multiples of between the min and min.
	*/
	private static int multiple = 0;
	/** Prompts user to input values for min, max, and multiple.  
    * Checks if user inputs are correct.
    * The values are then stored in the class constants listed above.
    */
	public static void userInput() {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter your minimum value.");
		System.out.print("MIN = ");
		min = console.nextInt();
		System.out.println("Please enter your maximum value.");
		System.out.print("MAX = ");
		max = console.nextInt();
		System.out.println("Please enter your multiple.");
		System.out.print("MULTIPLE = ");
		multiple = console.nextInt();
		System.out.println("Let's see what values we have!");
		System.out.println("MIN = " + min);
		System.out.println("MAX = " + max);
		System.out.println("MULTIPLE = " + multiple); 
		System.out.println(" ");
		
		if (min < 0) {
			System.out.println("The minimum (MIN) cannot be a negative integer.");
			System.out.println("Please try again.");
			System.exit(1);
		} if (multiple <= 0) {
			System.out.println("The multiple (MULTIPLE) cannot be zero or a negative integer.");
			System.out.println("Please try again.");
			System.exit(1);
		} if (max <= 0) {
			System.out.println("All integers must be greater than zero.");
			System.out.println("The maximum (MAX) cannot be zero or a negative integer.");
			System.out.println("Please try again.");
			System.exit(1);
		} if (min >= max) {
			System.out.println("The minimum value must be less than the maximum value.");
			System.out.println("Please try again.");
			System.exit(1);
		} if (multiple >= max) {
			System.out.println("The multiple (MULTIPLE) must be less than the maximum (MAX) value.");
			System.out.println("Please try again.");
			System.exit(1);
		}
	}
	
	public static void printNumbers() {
 		System.out.println("The multiples of " + multiple + " between " + min + " and " + max + " are: ");
 		int i = 0;
 		for(i = min; i <= max; i++) {
 				if (i % multiple == 0) {
 					System.out.print("  " + i);
 					}
 				}
 				System.out.println("\nThat's all, you have reached the maximum value in this iteration!\n");
 				System.out.println("Press the up arrow key to try the our number counter again!");
 	}	
}