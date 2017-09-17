/**
 * 
 */
package assignment2_1;

/**
 * @author MANJUNATH, This class is to find the highest among the given 3
 *         numbers.
 *
 */
public class Assignment2_1 {

	/**
	 * @param num1,num2,num3
	 *            as input
	 */
	public void findHighestNumber(int num1, int num2, int num3) {
		if (num1 > num2) { // Checks first no. is greater than second no.
			if (num1 > num3) { // Checks first no. is greater than third no.
				System.out.println("Highest of the among three numbers is num1 = " + num1);
			} else {
				System.out.println("Highest of the among three numbers is num3 = " + num3);
			}
		} else {
			if (num2 > num3) { // Checks second no. is greater than third no.
				System.out.println("Highest of the among three numbers is num2 = " + num2);
			} else {
				System.out.println("Highest of the among three numbers is num3 = " + num3);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 4, num2 = 8, num3 = -2;

		System.out.println("Input Numbers are ::\nNumber-1	: " + num1 + "\nNumber-2	: " + num2 + "\nNumber-3	: "
				+ num3 + "\n");

		Assignment2_1 maxNum = new Assignment2_1();

		maxNum.findHighestNumber(num1, num2, num3); // Calling find highest number function.

	}

}
