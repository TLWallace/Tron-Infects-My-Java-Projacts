/* From 8.3 on p.306
 * "(Sort students on grades)
 * Rewrite Listing 8.2. GradeExam.java,
 * to display the students in increasing order of the number of correct answers."
 * 
 * THOMAS' NOTE | Y
 * 
 */
public class Chapter08Exercise_8_3_TronDematerialisationSetting
{
public static void main(String args[])
	{
	// All students' answers...
	char[][] studentAnswers =
		{
		{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
		{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
		{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
		{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
		};
	// Correct Answer Key...
	char[] answerKey = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
	// New Array to keep result...
	int[][] result = new int[studentAnswers.length][2];
	// Loop to grade all answers...
	for (int stuAnsRow = 0; stuAnsRow < studentAnswers.length; stuAnsRow++)
		{
		// Grade one student
		int correctAnswerCount = 0;
		for (int ansKeyCol = 0; ansKeyCol < studentAnswers[stuAnsRow].length; ansKeyCol++)
			{
			if (studentAnswers[stuAnsRow][ansKeyCol] == answerKey[ansKeyCol])
			correctAnswerCount++;
			}
		result[stuAnsRow][0] = stuAnsRow;
		result[stuAnsRow][1] = correctAnswerCount;
		}
	selectionSort(result);
	for (int finStuInd = 0; finStuInd < result.length; finStuInd++)
		{
		System.out.println("Conscript (a.k.a. \"Student\") "+result[finStuInd][0]+"'s dematerialisation laser setting (a.k.a. correct answer count) is: "+result[finStuInd][1]+".");
		}
	}      
public static void selectionSort(int[][] newSortedList)
	{
	for (int oriLisRow = 0; oriLisRow < newSortedList.length - 1; oriLisRow++)
		{
		// Seek Min value...
		int currentMin = newSortedList[oriLisRow][1];
		int currentMinIndex = oriLisRow;
		for (int newLisCol = oriLisRow + 1; newLisCol < newSortedList.length; newLisCol++)
			{
			if (currentMin > newSortedList[newLisCol][1])
				{
				currentMin = newSortedList[newLisCol][1];
				currentMinIndex = newLisCol;
				}
			}
		// Swap if needed...
		if (currentMinIndex != oriLisRow)
			{
			newSortedList[currentMinIndex][1] = newSortedList[oriLisRow][1];
			newSortedList[oriLisRow][1] = currentMin;
			newSortedList[currentMinIndex][0] = newSortedList[oriLisRow][0];
			newSortedList[oriLisRow][0] = currentMinIndex;
			}
		}
	}
}