//Program to print the sum of the prime numbers
class SumOfPrime
{
	public static void main(String[] args) 
	{
		int[] a={1,6,4,5,2};
		int sum=0;
		System.out.println("The Array elements are:");

		for(int i:a)
		{
			System.out.println(i);
		}
		System.out.println();

		for(int num : a)
		{
			
			if(isPrime(num))
			{
				System.out.println(num+" is prime number");
				sum=sum+num;
			}
			
			
		}
		System.out.println("The sum of Prime number is: " + sum);
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
}
