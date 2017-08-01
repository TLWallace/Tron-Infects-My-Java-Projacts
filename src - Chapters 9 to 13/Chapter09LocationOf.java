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
public class Chapter09LocationOf
{
public int rowOfMax;
public int columnOfMax;
public double maxValue;
public Chapter09LocationOf(int rowAssessed, int columnAssessed, double maxValue)
	{
	this.rowOfMax = rowAssessed;
	this.columnOfMax = columnAssessed;
	this.maxValue = maxValue;
    }
public static Chapter09LocationOf locateMax(double[][] assessedArr)
	{
	int rowFound = 0;
	int columnFound = 0;
	double maxValue = assessedArr[rowFound][columnFound];
	for (int romeo = 0; romeo < assessedArr.length; romeo++)
		{
		for (int charlie = 0; charlie < assessedArr[romeo].length; charlie++)
			{
			if (maxValue < assessedArr[romeo][charlie])
				{
				maxValue = assessedArr[romeo][charlie];
				rowFound = romeo;
				columnFound = charlie;
				}
			}
		}
	return new Chapter09LocationOf(rowFound, columnFound, maxValue);
	}
}