/* From Chapter 11, exercise 11.11 on p.447 & Chapter 13, exercise 13.3 on p.529
 * 11.11 "(Sort ArrayList)
 * Write the following method that sorts an ArrayList of numbers:
 * public static void sort(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter 5 numbers,
 * stores them in an array list, and displays them in increasing order."
 * 
 * THOMAS' NOTE | I have played with the sum of the hexidecimal values for the number 12 for entertainment purposes.
 * 				This is related to a dialogue between the characters Alan Bradley and Richard Mackey in the movie Tron Legacy :)
 * 
 * 13.3 "(Sort ArrayList)
 * Write the following method that sorts an ArrayList of numbers.
 * public static void sort(ArrayList<Number> list)"
 * 
 * THOMAS' NOTE | I'm not sure if "Number" referred to a specific data type based on chapter contents (e.g. rational number?).
 * 				I have assumed Integer to be compatible.
 * 				I'm sure the same can be accomplished with double, float, etc.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Chapter11Exercise_11_11_Chapter13Exercise_13_3
{
public static void main(String[] args)
    {
	Scanner input = new Scanner(System.in);
	System.out.print
			("Please enter 5 numbers.\n"
			+ "Don't worry; extra numbers will be ignored :)\n"
			+ "And, enjoy some Tron Legacy trivia if the sum of your array values is 63: ");
	ArrayList<Integer> arrList = new ArrayList<>();
	for (int userIndex = 0; userIndex < 5; userIndex++) arrList.add(input.nextInt());	    
		sort(arrList);
		System.out.println("Here's your array sorted in increasing order: \n"+arrList);
		int arrListSum = arrList.stream().mapToInt(Integer::intValue).sum();
		if (arrListSum == 63)
			{
			System.out.println
					("And since your numbers add up to the sum of the hex values for 12 ;) ...\n"
					+ "The \"improvements\" made to ENCOM OS-12?\n"
					+ "They put a 12 on the box!\n"
					+ ":O Did ENCOM's past foresee Apple's future?!");
			}
			else
			{
			System.out.println
					("BTW: "
					+ "The sum of your array values is "+arrListSum+". "
					+ "So no Tron Legacy trivia for you :(");
			}
	input.close();
	}
public static void sort(ArrayList<Integer> sortedList)	
{
for (int assessedIndex = 0; assessedIndex < sortedList.size() - 1; assessedIndex++)
	{
	int rollingMinVal = sortedList.get(assessedIndex);
	int currentIndex = assessedIndex;
		for (int sortedIndex = assessedIndex + 1; sortedIndex < sortedList.size(); sortedIndex++)
			{
			if (rollingMinVal > sortedList.get(sortedIndex))
				{
				rollingMinVal = sortedList.get(sortedIndex);
				currentIndex = sortedIndex;
				}
			}
			if (currentIndex != assessedIndex)
				{
				sortedList.set(currentIndex, sortedList.get(assessedIndex));
				sortedList.set(assessedIndex, rollingMinVal);
				}
		}
	}
}