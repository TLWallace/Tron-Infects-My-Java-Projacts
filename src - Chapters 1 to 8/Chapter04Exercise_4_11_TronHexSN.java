/*From 4.11 on p.153
 * "(Decimal to Hex)
 * Write a program that prompts the user to enter an integer between 0 and 15 and displays its(...)
 * Hex number."
 * 
 * THOMAS' NOTE	| Kept but narrowed the input range validation.
 * 				Played with various Tron-related values from previous exercises. E.G.:
 * 					96 + 19820709 + 36 + 50000376 = 69821217
 * 						The Hex of 69821217 is 4296321.
 */
import java.util.Scanner;
public class Chapter04Exercise_4_11_TronHexSN
{
public static void main(String[] args)
	{
	System.out.println
	("Enter an integer between 69821216 and 69821218 to receive your Group 7 access code:");
	Scanner input = new Scanner(System.in);
	String decString = input.nextLine();
	int decInt = Integer.valueOf(decString);
	while (!(decInt > 69821216 && decInt < 69821218))
		{
		System.out.println
		("You've entered a big error. An integer between 69821216 and 69821218 please:");
		decString = input.nextLine();
		decInt = Integer.valueOf(decString);
		}
	input.close();
	String decHex = Integer.toHexString(decInt).toUpperCase();
	System.out.println
	("Great. Like, send you to Hawaii great."
	+"\nThe Hex number for "+decString+" is "+decHex+".\nYour Group 7 access code is: 4296321.");
	}
}