/* From 12.19 on p.490
 * "(Count words)
 * Write a program that counts the number of words in President Lincoln's (...) Gettysburg address(...)"
 * 
 * THOMAS' NOTE | I limited the program to jump right into the Lincoln.txt URL.
 * 				To trigger user to input URL, like Listing 12.17:
 * 					1. Remove multi-line comment characters on lines 18 & 22.
 * 					2. Remove single line comment slashes on line 26.
 * 					3. Single line comment out line 27.
 * 					4. Remove multi-line comment characters on lines 39 & 42.
 * 					5. Multi-line comment out lines 43 /44.
 */
import java.util.Scanner;
public class Chapter12Exercise_12_19
{
public static void main(String[] args)
	{
	/*
	System.out.print("To count the number of characters in a file, enter the URL below...\n"
			+"(try this: http://cs.armstrong.edu/liang/data/Lincoln.txt):\n");
	@SuppressWarnings("resource")
	*/
	/*Research indicated that <unassigned Closeable value> "leak" from below scanner,
	 * seems to be a "false positive", so, suppressed above. 
	 */
	//String fileURL = new Scanner(System.in).next();
	String fileURL = "http://cs.armstrong.edu/liang/data/Lincoln.txt";
	try
		{
		java.net.URL checkURL = new java.net.URL(fileURL);
		int sum = 0;
		Scanner fileContents = new Scanner(checkURL.openStream());
	while (fileContents.hasNext())
		{
        String fileLine = fileContents.nextLine();
        sum += fileLine.length();
        }
		fileContents.close();
		/*
		 * System.out.println("Your file contains the following number of characters:\n"
		 		+sum);
		*/
		System.out.println("Armstrong.edu's Lincoln.txt (Gettysbburg address) file contains the following number of characters:\n"
				+sum);
		}
	catch (java.net.MalformedURLException badURL)
		{
		System.out.println(":O It seems your light cycle took a wrong turn somewhere!\n"
				+"(URL problem)");
		}
	catch (java.io.IOException badIO)
		{
		System.out.println("Dumont: \"If the Users can no longer help us, we're lost.\"\n"
				+"(I\\O problem)");
		}
	}
}   