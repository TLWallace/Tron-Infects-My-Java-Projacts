/* From 2.6 on p.70
 * "(Sum the digits in an integer)
 * Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
 * For example, if an integer is 932, the sum of all its digits is 14."
 * 
 * THOMAS' NOTE	| Potentially interesting messages whether the correct or incorrect value is entered.
 */
import java.util.Scanner;
public class Chapter02Exercise_2_6_TronReleaseDatum
{
public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	int releaseDatum;
	System.out.println
	("Enter the original Tron movie's release date (YYYYMMDD):");
	releaseDatum = input.nextInt();
	while (releaseDatum != 19820709)
		{
		System.out.println
		("\"Mr. Dillinger, I am so very disappointed in you.\"");
		System.out.println
		("Try again please. Tron's release date (YYYYMMDD):");
		releaseDatum = input.nextInt();
		}
	int sum = 0;
	while (releaseDatum != 0)
		{
		sum += releaseDatum % 10;
		releaseDatum /= 10;
		}
	input.close();
	System.out.println
	("Yes! \"My User has information that could... that could make this a free system again!\""
	+" No, really.\n"
	+"The sum of the numbers in that date:\n"
	+sum);
	}
}