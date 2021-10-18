//WAP for GreaterPrimeNumberArray 
class GreaterPrimeNumberArray
{
	public static void main(String[] args) 
	{
		int count =0;
		int greater=0;
		int[] a = {95,117,3,235,51,-1};
		for (int num : a)
		{
			 if (IsPrime(num))
			 {
				 count =count+1;
				 
			 }
		}
		 System.out.println("The  greatest of Prime numbers are " + count);

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
				if ((num=>90) && (num<=100))
				{
					return false;
				}
			}
			return  true;
			}
	}
}
