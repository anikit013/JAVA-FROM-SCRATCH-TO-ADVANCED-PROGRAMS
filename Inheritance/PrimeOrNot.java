//Prime OR Not 
import java.util.*;
class PrimeOrNot
{
	public static void main(String[] args) 
	{
		int num1=input();
		logicPrime(num1);
	}

	public static int input()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println( " Enter the number ");
		int num=sc.nextInt();
		return num;
	}


	public static void logicPrime(int num)
	{
		if (num==1)

		{
			System.out.println(" The number is prime ");

		}
		if else
		{
			for(int i=2;i<num;i++)
			{
				if (num%i==0)
			{
				System.out.println(" The  number is not a prime number ");

			}
			}
				else
				{
				System.out.println(" The number is prime ");
				}
			
		}
	}
	}

