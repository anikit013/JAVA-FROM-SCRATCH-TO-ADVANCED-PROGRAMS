//Program to print the smallest prime in a given series of numbers
import java.util.Scanner;
class SmallestPrimeNumberInSeries  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[]  str=s.split(" ");
		int small=1;
		for (String ss : str)
		{
			int num=Integer.parseInt(ss);
			 if (IsPrime(num))
			 {
				if(small==1)
				 {
					small=num;
				 }
				 {
			        if(num<small)
			          {
				          small=num;
			          }
		           }
			 }
		}
		if(small==1)
		{
			System.out.println("Array doesn't have prime number");
		}
		else
		{
			System.out.println("Smallest="+small);
		}
	}

	public static boolean IsPrime(int num)
	{
		if(num==1)
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
