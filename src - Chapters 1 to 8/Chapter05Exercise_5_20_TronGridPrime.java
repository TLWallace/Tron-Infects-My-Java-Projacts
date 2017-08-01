/*From 5.20 on p.194
 * "(Display prime numbers between 2 and 1000)
 * Modify Listing 5.15 to display all the prime numbers between 2 and 1000, inclusive.
 * Display eight prime numbers per line.
 * Numbers are separated by exactly one space."
 * 
 * THOMAS' NOTE | Added leading zeros & an elipsis at the end to create some symmetry in the output.
 * 				Played with the rows /columns to create a 13x13 prime number grid instead of 8 per row.
 * 				First print line is 102 characters, minus the leading space; likewise the grid is 51 :)
 * 				Output still yields the prime numbers between 2 and 1000 of course.
 */
public class Chapter05Exercise_5_20_TronGridPrime
{
public static void main(String[] args)
	{
	final int NUMBER_OF_PRIMES_PER_LINE = 13;
	int count = 0;
	int number = 2;
	System.out.println
	(" Sark says: Greetings."
	+"The Master Control Program has chosen you to serve your system on the Game Grid.\n");
	while (number < 1000)
		{
		boolean isPrime = true;
		for (int divisor = 2; divisor <= number / 2; divisor++)
			{
			if (number % divisor == 0)
				{
				isPrime = false;
				break;
				}
			}
		if (isPrime)
			{
			count++;
			if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
				{
				System.out.printf(" "+"%03d", number);
				System.out.println();
				}
			else
				System.out.printf(" "+"%03d", number);
			}
		number++;
		}
	System.out.printf(" ...");
	}
}