/* From 7.1 on p.276
 * "(Assign grades)
 * Write a program that reads student scores, gets the best score, and then assigns grades based on(...):
 * Grade is A if score is >= best - 10;
 * Grade is B if score is >= best - 20;
 * Grade is C if score is >= best - 30;
 * Grade is D if score is >= best - 40;
 * Grade is F otherwise.
 * The program prompts the user to enter the total number of students(,)
 * 	then prompts the user to enter all of the scores, and concludes by displaying the grades(...)
 * 
 * THOMAS' NOTE | I played with the exercise's scheme's grade assignment data type & output message...
 * 				...merely for entertainment purposes again of course :D
 * 
 */
import java.util.Scanner;
public class Chapter07Exercise_7_1_TronHillsAreAliveQuestionMark
{
public static void main(String[] args)
	{
	System.out.println("Enter the number of students then press Enter:");
	Scanner input = new Scanner(System.in);
	int numberOf = input.nextInt();
	int[] aScore = new int[numberOf];
	int theBestScore = 0;
	System.out.println("Enter the " + numberOf + " scores "
	+"(TIP: Press Enter after each score):");
	for (int disc = 0; disc < aScore.length; disc++)
		{
		aScore[disc] = input.nextInt();
		if (theBestScore < aScore[disc])
			{
			theBestScore = aScore[disc];
			}
		}
	String assignedGrade;
	for (int o = 0; o < aScore.length; o++)
		{
		if (aScore[o] >= theBestScore - 10)
			assignedGrade = "A [for Alan	(a friend, a friend with Flynn and Tron)]";
		else if (aScore[o] >= theBestScore - 20)
			assignedGrade = "B [for Baines	(a research engineer, a female research engineer)]";
		else if (aScore[o] >= theBestScore - 30)
			assignedGrade = "C [for Clu		(a name, a name Flynn called something else)]";
		else if (aScore[o] >= theBestScore - 40)
			assignedGrade = "D [for Dumont	(a guardian, a guardian of I/O Tower)]";
		else
			assignedGrade = "F [for Flynn	(a needle pulling thread :)]";
		input.close();
		System.out.println("Student "+o+"'s score is "+aScore[o]+" and grade is "+assignedGrade);
		}
	System.out.println("\nERROR: "
	+"Java program corrupted! "
	+"WithThe SOUNDEX(of_music) FROM MARIADB && theChildren");
	}
}