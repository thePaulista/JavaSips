package assignment_03;

import ignore.TestingUtils;

public class App {

	
	/**
	 * Given three ints, a b c, return true if it is possible to add two of 
	 * the ints to get the third. There should only be a single line of code in the method body.<br>
	 * <br> 
	 *
	 * <b>EXPECTATIONS:</b><br>
		twoSumOne(1, 2, 3)   <b>---></b> true <br>
		twoSumOne(3, 1, 2)    <b>---></b> true <br>
		twoSumOne(3, 2, 2) <b>---></b> false <br>
	 */
		public static boolean twoSumOne(int a, int b, int c) {
			
			return (a + b == c ) || (b + c == a) || (a +c == b);
		
		}
		
//		PASS: twoSumOne(1, 2, 3) -> true
//		PASS: twoSumOne(3, 1, 2) -> true
//		PASS: twoSumOne(3, 2, 2) -> false
//		PASS: twoSumOne(2, 3, 1) -> true
//		PASS: twoSumOne(5, 3, -2) -> true
//		PASS: twoSumOne(5, 3, -3) -> false
//		PASS: twoSumOne(2, 5, 3) -> true
//		PASS: twoSumOne(9, 5, 5) -> false
//		PASS: twoSumOne(9, 4, 5) -> true
//		PASS: twoSumOne(5, 4, 9) -> true
//		PASS: twoSumOne(3, 3, 0) -> true
//		PASS: twoSumOne(3, 3, 2) -> false	
	
	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
		public static void main(String args[]){
			TestingUtils.runTests();
		}
			

}
