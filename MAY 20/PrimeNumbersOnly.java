import java.util.*;
class PrimeNumbersOnly
{
	public static void main(String[] args) 
	{
		int[] a= isPrime();
		PrintPrimeNum(a);
	}
	public static boolean isPrime()
	{
		System.out.println(" Enter the numbers of array");
		Scanner sc= new Scanner(System.in);
		int length= sc.nextInt();
		int[]a =new int [length];
		for (int i=0;i<a.length;i++)
	{
		if(a==1)
		{
			return false;
		}
		else
		{
			for (int i=2;i<a ;i++ )
			{
				if (a%i==0)
				{
					return false;
				}
			}
			return  true;
			}
	}
	}
	public static void PrintPrimeNum(boolean[] a)
	{
		for (int i:a)
		{
			 if (isPrime(i))
			 {
				 System.out.println("The Prime numbers are " + i);
			 }
		}
	}
}
