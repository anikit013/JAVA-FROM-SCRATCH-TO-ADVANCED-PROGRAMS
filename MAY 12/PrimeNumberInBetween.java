// To print number prime number  from  50 to 100 
 class PrimeNumberInBetween
 {
	 public static void main(String[] args) 
	 {
		//System.out.println("Prime Number Between 50 to 100");
		for (int i=50;i<101;i++)
		 {
			if(LogicPrime(i))
			{
			System.out.println(i + "  is a prime Number");
			}
		 }
	}
	 public static boolean LogicPrime(int num)
	 {
		 for (int i=2 ;i<num ;i++)
		 {
		 if(num%i==0) 
			 { 
			 return false;
			 }
			 else
			 {
			 return true;
			 }
	 }
 }
 }
