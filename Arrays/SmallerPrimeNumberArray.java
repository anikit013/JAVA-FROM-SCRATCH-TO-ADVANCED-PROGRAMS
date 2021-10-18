//WAP for SmallerPrimeNumberArray 
class SmallerPrimeNumberArray
{
	public static void main(String[] args) 
	{
		int smaller=1;
		int[] a = {5,11,1,15,20,25};
		for (int num : a)
		{
			 if (IsPrime(num))
			 {
				 if (num<smaller)
				 {
					smaller=num;
				 }
				 
			 }
		}
		 System.out.println("The smallest of Prime numbers are " + smaller);

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
