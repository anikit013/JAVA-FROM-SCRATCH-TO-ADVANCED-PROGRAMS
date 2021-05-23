//WAP for GreaterPrimeNumberArray 
class GreaterPrimeNumberArray
{
	public static void main(String[] args) 
	{
		int greater=0;
		int[] a = {1,5,11,15,20,25};
		for (int num : a)
		{
			 if (IsPrime(num))
			 {
				 if (num>greater)
				 {
					 greater=num;
				 }
				 
			 }
		}
		 System.out.println("The  greatest of Prime numbers are " + greater);

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
