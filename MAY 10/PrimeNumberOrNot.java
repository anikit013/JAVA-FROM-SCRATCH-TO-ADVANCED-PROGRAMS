//class to determine prime number or not
import java.util.Scanner;
class PrimeNumberOrNot
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter a number ");
		int num= sc.nextInt();
		if (LogicPrimeOrNot(num))
		{
			System.out.println(" It is prime number");
		}
		else
		{ 
			System.out.println(" It is not a prime Number ");
		}
	}
	public static boolean LogicPrimeOrNot( int num)
	{
		if (num==1)
		{
			return false;
		}
		else
		{
			for (int i=2;i<num ;i++ )
			{
				if (num%i==0)
				{
					return false;
				}
			}
			return  true;
			}
	
	}
}


