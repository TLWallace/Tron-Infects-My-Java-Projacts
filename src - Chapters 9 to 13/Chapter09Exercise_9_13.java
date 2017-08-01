/* From 9.13 on p.363
 * "(The Location Class)
 * Design a Class Location for locating a maximal value and its location in a two-dimensional array.
 * The class contains public data fields in row, column, and maxValue that store the maximal value
 * 		and its indices in a two-dimensional array with row and column as int types
 * 		and maxValue as a double type.
 * Write the following method that returns the location of the largest element in a two-dimensional array:
 * public static Location locateLargest(double[][] a)
 * The return is an instance of Location.
 * Write a test program that prompts the user to enter a two-dimensional array
 * 		and displays the location of the largest element in the array.
 * Here is an example:
 * ("Enter the number of rows and columns in the array: " '3 4'
 *  "Enter the array: "'23.5   35     2    10
			 			 4.5    3    45   3.5
			 			  35   44   5.5   9.6'
 *  "The location of the largest element is 45 at (1. 2)."
 *
 * THOMAS' NOTE | Changed "Location" to 'Chapter09LocationOf' to make package more clear.
 * 				Suggested entries to to target a specific outcome.
 * 				Commented out some code I can use to lock down user entries instead of the concluding if /else.
 * 				The numbers are from the access code I made up in the Chapter 06 exercise (Group)704296321.
 * 				This combination is the screen saver uptime readout shown on Flynn's workstation in Tron Legacy :)
 */
import java.util.Scanner;
import java.util.Arrays;
public class Chapter09Exercise_9_13
{
public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of rows\n(p.s.: try 3):");
	int row = input.nextInt();
	/*while (row != 3)
		{
		System.out.println("Ahem... enter the number 3:");
		row = input.nextInt();
		}*/
	System.out.println("Enter the number of columns\n(p.p.s. try 3):");
	int column = input.nextInt();
	/*while (column != 3)
		{
		System.out.println("Ahem... enter the number 3:");
		column = input.nextInt();
		}*/
	double[][] tangoArr = new double[row][column];
	double[][] uniformArr = {{7,0,4},{2,9,6},{3,2,1}};
		System.out.println("Enter "+row+" numbers separated by spaces, then press Enter; "
				+"repeat "+column+" times\n(p.p.p.s. try the numbers 7 0 4 2 9 6 3 2 1):");
		for (int hotel = 0; hotel < tangoArr.length; hotel++)
			{
			for (int victor = 0; victor < tangoArr[hotel].length; victor++)
				{
				tangoArr[hotel][victor] = input.nextDouble();
				}
			}
		/*while (!(Arrays.deepEquals(tangoArr, uniformArr)))
			{
			System.out.println("Ahem... enter the numbers 7 0 4 2 9 6 3 2 1:");
			for (int hotel = 0; hotel < tangoArr.length; hotel++)
				{
				for (int victor = 0; victor < tangoArr[hotel].length; victor++)
					{
					tangoArr[hotel][victor] = input.nextDouble();
					}
				if (Arrays.deepEquals(tangoArr, uniformArr))
					{
					break;
					}
				}
			}*/
	Chapter09LocationOf locationOf = Chapter09LocationOf.locateMax(tangoArr);
	input.close();
	if (Arrays.deepEquals(tangoArr, uniformArr))
		{
		System.out.println("The location of the largest element is "
		+locationOf.maxValue+" at (" + locationOf.rowOfMax + ", " + locationOf.columnOfMax + ").");
		System.out.println("Legacy Group 7 access code detected |\n"
				+ "Flynn's workstation waking up |\n"
				+ "Significant screen saver uptime calculation start...\n"
				+ "7+0-4-2+9+6+3+2-1+1-1= 20 YRS\n"
				+ "7-0+4-2-9+6+3+2*1/1*1= 11 MOS\n"
				+ "7+0-4-2+9+6+3+2-1+1-1= 20 DAY\n"
				+ "7+0-4+2+9-6+3+2+1+1+1= 16 HRS\n"
				+ "7+0-4+2+9-6+3+2-1-1-1= 22 MIN\n"
				+ "7+0-4+2+9-6+3+2+1+1+1= 16 SEC\n"
				+ "Significant screen saver uptime calculation end...\n"
				+ "\"It's amazing how productive doing nothing can be.\"");
		}
	else
		{
		System.out.println("The location of the largest element is "
		+locationOf.maxValue+" at (" + locationOf.rowOfMax + ", " + locationOf.columnOfMax + ").");
		}
	}
}