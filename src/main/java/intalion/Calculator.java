package intalion;

public class Calculator {

	/**
	 * 
	 * @param a addend
	 * @param b addend
	 * @return sum of a and b
	 */
	public float add(float a, float b) {
		return a+b;
	}
	
	/**
	 * 
	 * @param a minuend
	 * @param b subtrahend
	 * @return difference of a and b
	 */
	public float substract(float a, float b) {
		return a-b;
	}
	
	/**
	 * 
	 * @param a multiplicand
	 * @param b multiplier
	 * @return product of a and b
	 */
	public float multiply(float a, float b) {
		return a*b;
	}
	 /**
	  * 
	  * @param a dividend
	  * @param b divisor
	  * @return ratio of a / b
	  */
	public float divide(float a, float b) {
		return a/b;
	}

}
