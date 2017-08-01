/* From 10.2 on p.400
 * "(The BMI Class)
 * Add the following new constructor in the BMI Class:
 * (//Construct the BMI with the specified name, age, weight, feet, and inches.
 *  public BMI(String name, int age, double weight, double feet, double inches)"
 * 
 * THOMAS' NOTE | Added private variables in Chapter10Exercise_X file to enable run.
 * 				Added feet & inches to Chapter10BMI /edited this.height with relevant formula in Chapter10BMI.
 */
public class Chapter10Exercise_10_2
{
private static String name;
private static int age;
private static double weight;
private static double height;
public static void main(String[] args)
	{
	Chapter10BMI bmi1 = new Chapter10BMI(name, age, weight, height);
	System.out.println("The BMI for "+bmi1.getName()+" is "+bmi1.getBMI()+" "+bmi1.getStatus());
	}
}