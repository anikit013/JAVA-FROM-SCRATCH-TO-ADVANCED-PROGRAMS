// To print number prime number  from  1 to 100 
 class PerfectPrimeNumberInBetween
 {
	 public static void main(String[] args) 
	 {
		//System.out.println("Prime Number Between 50 to 100");
		for (int i=1;i<100;i++)
		 {
			if(LogicPrime(i) && LogicPerfect(i))
			{
			System.out.println( i + "  is a perfect prime Number");
			}
		 }
	}
	 public static boolean LogicPrime(int num)
	 {
		 if (num==1)
		 {
			 return false;
		 }
		 else
		 {
		 for (int i=2 ;i<num ;i++)
		 {
		 if(num%i==0) 
			 { 
			 return false;
			 }
		 }
			 return true;
			 }
	 }
	public static boolean LogicPerfect(int num)
	 {
		int sum=0;
		int temp=num;
		for (int i=1;i<num;i++)
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
			}
			return (sum==temp) ? true  : false;

		}
 }