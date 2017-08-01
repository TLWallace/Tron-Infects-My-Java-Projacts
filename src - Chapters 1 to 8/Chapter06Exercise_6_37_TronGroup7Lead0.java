/* From 6.37 on p.243
 * "(Format an integer)
 * Write a method with the following header to format the integer with the specified width.
 * public static String format(int num, int width)
 * The method returns a string for the number with one or more prefix zeros.
 * The size of the string is the width.
 * For example format(34. 4) returns 0034 and format (34, 5) returns 00034.
 * If the number is longer than the width, the method returns the string representation for the number.
 * For example, format (34, 1) returns 34."
 * 
 * THOMAS' NOTE | If the hints are followed a prefix "Group7" is added.
 * 				Then the zero-padded representation is concatenated.
 * 				Included an if /else to handle a non-hinted number.
 * 
 */
import java.util.Scanner;
public class Chapter06Exercise_6_37_TronGroup7Lead0
{
public static String format(int number, int width)
	{
	int newSize = getUsersNumberSize(number);
	if (newSize > width) return ""+number;
	StringBuilder paddy = new StringBuilder();
	paddy.append(number);
	for (int o = 0; o < width - newSize; o++)
		{
		paddy.insert(0,'0');
        }
	return paddy.toString();
    }
public static int getUsersNumberSize(int usersNumberSize)
	{
	int newNumberSize = 0;
	while (usersNumberSize > 0)
		{
		newNumberSize++;
		usersNumberSize /= 10;
        }
	return newNumberSize;
    }
public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number to be padded with zeros (HINT: Use 4296321): ");
    int userNumber = input.nextInt();
    System.out.print("Enter a width (HINT: Use 8 or higher): ");
    int userWidth = input.nextInt();
    input.close();
    String newAccessCode = format(userNumber, userWidth);
    if (userNumber != 4296321)
    	System.out.println("Bored. But alrighty then: "+newAccessCode);
    else
    System.out.println("Good work program. Your new access code is: Group7"+newAccessCode);
    }
}