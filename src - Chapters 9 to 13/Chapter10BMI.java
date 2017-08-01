/* From 10.2 on p.400
 * "(The BMI Class)
 * Add the following new constructor in the BMI Class:
 * (//Construct the BMI with the specified name, age, weight, feet, and inches.
 *  public BMI(String name, int age, double weight, double feet, double inches)"
 * 
 * THOMAS' NOTE | Added private variables in Chapter10Exercise_X file to enable run.
 * 				Added feet & inches to Chapter10BMI /edited this.height with relevant formula in Chapter10BMI.
 */
import java.util.Scanner;
public class Chapter10BMI
{
String name;
int age;
double weight;
double inches;
double feet;
double height;
static final double KILOGRAMS_PER_POUND = 0.45359237;
static final double METRES_PER_INCH = 0.0254;
public Chapter10BMI(String name, int age, double weight, double height)
	{
	Scanner input = new Scanner(System.in);
	System.out.print("Enter name: ");
	this.name = input.nextLine();
	System.out.print("Enter age in years: ");
	this.age = input.nextInt();
	System.out.print("Enter weight in pounds: ");
	this.weight = input.nextDouble();
	System.out.print("Enter height in feet (i.e. for 5 feet 11 inches tall, just enter the 5): ");
	this.feet = input.nextDouble();
	System.out.print("Enter height in inches (i.e. for 5 feet 11 inches tall, just enter the 11): ");
	this.inches = input.nextDouble();
	this.height = (feet*12) + inches;
	input.close();
	}
public double getBMI()
	{
	double bmi = weight * KILOGRAMS_PER_POUND /
				((height * METRES_PER_INCH)*(height*METRES_PER_INCH));
	return Math.round(bmi * 100)/100.0;
	}
public String getStatus()
	{
	double bmi = getBMI();
	if (bmi < 18.5)
		return "Underweight :|\n"
				+ " Your packet may be lost in the I/O Portal.";
	else if (bmi < 25)
		return "Normal :)\n"
				+ " Flynn says you have just the right amount of nibbles 'n bits! Care for a game of Go?";
	else if (bmi < 30)
		return "Overweight :|\n"
				+ " Your order of magnitude could crash the I/O Portal.";
	else
		return "Obese :(\n"
				+ " The Grid says you consumed too much data for your britches to pass through the I/O Portal.";
	}
public String getName()
	{
	return name;
	}
public int getAge()
	{
	return age;
	}
public double getWeight()
	{
	return weight;
	}
public double getHeight()
	{
	return height;
	}
}