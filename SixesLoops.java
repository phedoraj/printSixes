/**This program was written in Java.
*Version 2.0
@author Lydia Joslin (lejoslin@ncsu.edu)*/
 
public class SixesLoops {
 	public static void main( String[] args) {
 	sentenceSixes();
 	gridSixes();
 	printSixes();
 	modSixes();
 	whileSixes();
 	}
 	public static void printSixes () {
 	System.out.print("\nThe multiples of 6 between 1 and 100 are: ");
 	final int MAX= 100;
 		for(int i = 6; i <= MAX; i += 6) {
 			System.out.print(i + " ");
 		}
 	}
 	
 	public static void modSixes() {
 		final int MIN = 1;
 		final int MAX = 100;
 		final int MOD = 6;
 		System.out.println("Minimum values is: " + MIN);
 		System.out.println("Maximum value is: " + MAX);
 		System.out.println("The multiples we are searching for: " + MOD);
 		System.out.println("The multiples of " + MOD + " between " + MIN + " and " + MAX + " are: ");
 			for(int i = MIN; i <= MAX; i++) {
 				if (i % MOD == 0) {
 					System.out.print("  " + i);
 					}
 				}
 				System.out.print("\nThat's all, you have reached the maximum value in this loop!\n");
 			}
 			
 	public static void whileSixes() {
 		System.out.println("The multiples of 6 from 1 to 100 are:");
 		int i = 1;
 		while (i <= 100) {
 			if (i % 6 == 0) {
 				System.out.print(" " + i);
 				}
 			i++;
 			}
 			System.out.print("\nThat's all, you have reached the maximum value in this loop!\n");
 		}
 			
 	public static void sentenceSixes() {
 		System.out.println("\nThe multiples of 6 between 1 and 100 are 6, 12, 18, 24, 30, 36, 42, 48, 54, 60, 66, 72, 78, 84, 90, & 96.");
 		}
 	public static void gridSixes() {
 		System.out.println("\n\n\tThe grid below gives a visual representation of the multiples of 6 in a block.");
		System.out.println("\n     \t0\t1\t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9  ");
		System.out.println("     _______________________________________________________________________________");
		System.out.println("   0  |  *  \t* \t* \t* \t* \t* \t6 \t* \t* \t* ");
		System.out.println("      |\n      |\n      |\n   1  |\t * \t* \t12\t* \t* \t* \t* \t* \t18\t* ");
		System.out.println("      |\n      |\n      |\n   2  |\t * \t* \t* \t* \t24\t* \t* \t* \t* \t*");
		System.out.println("      |\n      |\n      |\n   3  |\t 30\t* \t* \t* \t* \t* \t36\t* \t* \t* ");
		System.out.println("      |\n      |\n      |\n   4  |\t * \t* \t42\t* \t* \t* \t* \t* \t48\t* ");
		System.out.println("      |\n      |\n      |\n   5  |\t * \t* \t* \t* \t54\t* \t* \t* \t* \t*");
		System.out.println("      |\n      |\n      |\n   6  |\t 60\t* \t* \t* \t* \t* \t66\t* \t* \t* ");
		System.out.println("      |\n      |\n      |\n   7  |\t * \t* \t72\t* \t* \t* \t* \t* \t78\t* ");
		System.out.println("      |\n      |\n      |\n   8  |\t * \t* \t* \t* \t84\t* \t* \t* \t* \t*");
		System.out.println("      |\n      |\n      |\n   9  |\t 90\t* \t* \t* \t* \t* \t96\t* \t* \t*");
		System.out.println("      |\n      |\n      |\n  10  |\t * ");
		System.out.println("\n\t(*      *) Asterisks represent numbers between 0 and 100 that are not multiples of 6.\n");	
		}
 	}