/* From 3.2 on p.108
 * "(Game: add three numbers)
 * The program in Listing 3.1, AdditionQuiz.java,
 * generates two integers and prompts the user to enter the sum(...).
 * Revise the program to generate three single-digit integers and prompt the user to enter the sum(...)"
 * 
 * THOMAS' NOTE	| Generated 1, 2, and 3 digit integers.
 * 				Predefined three numbers for the user to include in the operation...
 */
import java.util.Scanner;
public class Chapter03Exercise_3_2_TronBudgetBoxOfficeArcade
{
public static void main(String[] args)
	{
	// Will be neutralised against Tron's $17m budget...
	int num1 = (int)(System.currentTimeMillis() % 10);
	// Will be neutralised against Tron's $33m Box Office earnings...
	int num2 = (int)(System.currentTimeMillis() % 100);
	/* Will be neutralised against a sum related to "Flynn's" ASCII HEX character values:
	F=46, l=6C [6(43)], y=79, n=6E [6(45)], n=6E [6(45)], '=27, s=73;
	46 + 6 + 43 + 79 + 6 + 45 + 6 + 45 + 27 + 73 = 376...*/
	int num3 = (int)(System.currentTimeMillis() % 1000);
	System.out.print("What is ("+num1+" - "+num1+" + "+17000000
	+") + ("+num2+" + "+33000000+" - "+num2
	+") + ("+376+" + "+num3+" - "+num3+")? ");
	Scanner input = new Scanner(System.in);
	int BBOarc = input.nextInt();
	input.close();
	System.out.println("("+num1+" - "+num1+" + "+17000000
	+") + ("+num2+" + "+33000000+" - "+num2
	+") + ("+376+" + "+num3+" - "+num3+") = "+BBOarc+" is "
	+((num1-num1+17000000)+(num2+33000000-num2)+(376+num3-num3)==BBOarc));
	}
}