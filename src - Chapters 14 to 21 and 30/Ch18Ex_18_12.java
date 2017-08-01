/* From 18.12 on p.730
 * "(Print the characters in a string reversely)
 * Rewrite Programming Exercise 18.9 using a helper method to pass the substring *high index to the method.
 * The helper method header is:
 * public static void reverseDisplay(String value, int high)"
 * 
 * THOMAS' NOTE | Not using a String value parameter,
 * 				instead using reverse statement against a for loop,
 * 				would've been so much easier for lazy me :)
 */
import java.util.Scanner;
public class Ch18Ex_18_12
{
public static void main(String[] args)
	{
	System.out.print("Hi! My name is Quorra.\n"
			+"Type a word below and I'll reverse it "
			+"[if it's a Tron (user) character's first name, you might get a read to enjoy]...\n");
	@SuppressWarnings("resource")
	String userString = new Scanner(System.in).nextLine();
	switch (userString)
		{
		case "Kevin" :
		case "kevin":
			System.out.print("According to Zuse, A scene in \"TRON: Legacy\" shows Clu rotating a pair of Baoding spheres in his hand, \n"
					+"while a later scene shows Flynn to possess a Yoshimoto cube.\n\n"
					+"Sorry though; CLU 2 is messing with gravity. Your word reversed...\n\n");
			break;
		case "Alan" :
		case "alan":
			System.out.print("According to Castor, The character's name is most likely a nod to Allen-Bradley, which was for decades (...) \n"
					+"one of the world's top innovators in the human-machine interface and automation systems industry; \n"
					+"supplying animatronics for the original Small World ride and safety equipment on the 2010 passenger trams at Disneyland.\n\n"
					+"Sorry though; CLU 2 is messing with gravity. Your word reversed...\n\n");
			break;
		case "Sam" :
		case "sam":
			System.out.print("According to Zuse, Sam Flynn was designated as \"Combatant 3\" in the Disc Wars arena. \n"
					+"His name on the rotating match display was listed as \"<Unknown>\".\n\n"
					+"Sorry though; CLU 2 is messing with gravity. Your word reversed...\n\n");
			break;
		case "Lora" :
		case "lora":
			System.out.print("According to Castor, In a deleted scene in one of the original scripts, \n"
					+"Flynn and Alan hid in the back of the ENCOM van while Lora drove past the checkpoints and up to the building.\n\n"
					+"Sorry though; CLU 2 is messing with gravity. Your word reversed...\n\n");
			break;
		case "Ed" :
		case "ed":
		case "Edward" :
		case "edward":
			System.out.print("According to Zuse, In \"TRON: Legacy\", Dillinger's son Edward Dillinger, Jr. \n"
					+"is an employee at ENCOM who designed ENCOM OS-12, \n"
					+"formerly known as Flynn OS, which was stolen by Sam Flynn.\n\n"
					+"Sorry though; CLU 2 is messing with gravity. Your word reversed...\n\n");
			break;
		default :
			System.out.println("Your word reversed:\ndrow ruoY\n\nJK -- your word ACTUALLY reversed...\n");
		}
	reverseDisplay(userString);
	}
private static void reverseDisplay(String stringReversed)
	{
	reverseDisplay(stringReversed, stringReversed.length());
	}
private static void reverseDisplay(String reverseReturned, int high)
	{
	if (high == 0)
		return;
	System.out.print(reverseReturned.substring(high - 1));
	reverseDisplay(reverseReturned.substring(0, high - 1));
	}
}