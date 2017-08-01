/* From 17.1 on p.701
 * "(Create a text file)
 * Write a program to create a file named (...) if it does not exist.
 * Append new data to it if it already exists.
 * Write 100 integers created randomly into the file using text I/O.
 * Integers are separated by a space."
 * 
 * THOMAS' NOTE | Included different console messages depending on whether the file exists or not.
 */
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
public class Ch17Ex_17_1
{
public static void main(String[] args) throws IOException
	{
	//File rezzedIdDisc = new File("C://Users//Thomas//WorkSpaceEclipse//Java Exercises for Chapters 14 to 21 and 30//bin//text//Ch_17-Ex_1-Id_Disc.txt");
	File rezzedIdDisc = new File("C://Users//triosStudent//Documents//~JAVA//EclipseWorkSpace//Java Exercises for Chapters 14 to 21 and 30//bin//text//Ch_17-Ex_1-Id_Disc.txt");
	boolean codeWormAppend = rezzedIdDisc.exists();
	try (PrintWriter iODigitizer = new PrintWriter(new BufferedOutputStream
			(new FileOutputStream(rezzedIdDisc, codeWormAppend))))
		{
		for (int i = 0; i < 100; i++)
			{
			iODigitizer.write((int)(Math.random()*(19822010))+" ");
			}
		if (codeWormAppend == true)
			System.out.println("|         seeking identity disc         |\n"
							 + "|         IDENTITY DISC LOCATED         |\n"
							 + "|          deploying code worm          |\n"
							 + "|    IDENTITY DISC RE-REZ SUCCESSFUL    |");
		else
			System.out.println("|         seeking identity disc         |\n"
							 + "|       IDENTITY DISC NOT LOCATED       |\n"
							 + "|          deploying code worm          |\n"
							 + "|    IDENTITY DISC REZ-IN SUCCESSFUL    |");
		}
	}
}