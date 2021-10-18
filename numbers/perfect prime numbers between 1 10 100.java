//Program to print all perfect prime numbers between 1 10 100
class Assg1_4 
{
	public static void main(String[] args) 
	{
		for(int i=1 ;i<=100 ;i++)
		{
			if( isPrime(i) && isPerfect(i) )
			{
				System.out.println(i+" is a perfect prime number");
			}
		}
		
	}
	public static boolean isPrime(int num)
	{
		if(num==1)
		{
			return false;
		}
		else
		{
			for (int i=2 ;i<num ;i++)
			{
				if(num%i == 0)
				{
					return false;
				}

			}
			return true;
		}
	}
	public static boolean isPerfect(int num)
	{
		int sum=0;
		int temp=num;
		for(int i=1 ; i< num ; i++)
		{
			if(num % i == 0 )
			{
				sum=sum+i;
			}
		}
		return sum==temp ? true : false;
	}
}
