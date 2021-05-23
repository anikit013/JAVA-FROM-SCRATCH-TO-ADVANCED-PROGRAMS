//WAP for PrimeNumberArray 
class PrimeNumberArray
{
	public static void main(String[] args) 
	{
		int sum=0;
		int[] a = {1,5,11,15,20,25};
		for (int num : a)
		{
			 if (IsPrime(num))
			 {
				 sum=num+sum;
				 
			 }
		}
		 System.out.println("The  sum of Prime numbers are " + sum);

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
