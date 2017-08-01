/* From 1.5 on p.30
 * "(Compute expressions)
 * Write a program that displays the result of:
 * (9.5 x 4.5 - 2.5 x 3) / (45.5 - 3.5)"
 * 
 * THOMAS' NOTE	| Replaced the values for entertainment purposes; same order of operations...
 * 					...(1.9 x 8.2 - 0.7 x 0.9) / (33 - 17) = *93.4375...
 * 						...with a twist ending:
 * 							*93 + 4 - 3 + 7 - 5 = 96 -- i.e. Tron's duration in minutes ;)
 */
public class Chapter01Exercise_1_5_TronDurationSecret
{
public static void main(String[] args)
	{
	double tyy = 1.9;
	double ryy = 8.2;
	double omm = 0.7;
	double ndd = 0.9;
	double releaseDateOde = (tyy * ryy - omm * ndd);
	releaseDateOde = Math.round(releaseDateOde * 100);
	double boxOfficeLessBudgetMillions = 33 - 17;
	double theISOs = releaseDateOde / boxOfficeLessBudgetMillions;
	int runtime = 93 + 4 - 3 + 7 - 5;
	System.out.println
	("The clu to the duration of the original movie lies among theISO's..."
	+" who rose after the MCP fell:\n"
	+theISOs);
	System.out.println
	("*Free that integer... add and subtract the fractionals 'til they're \"derezzed\" -- Tron's duration in minutes:\n"
	+runtime);
	}
}