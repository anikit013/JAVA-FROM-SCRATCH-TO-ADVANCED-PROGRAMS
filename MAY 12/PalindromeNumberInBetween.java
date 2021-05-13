//Print the palindrome number from 1 to 1000
	class  PalindromeNumberInBetween
{
	public static void main(String[] args) 
	{
		for (int i=1;i<1001;i++)
		{
			if (logicPalindrome(i))
				{
				System.out.print( i + " , " );
				}
		}
		System.out.print(" are Palindrome numbers in between 1 to 1000" );
	}
	public static boolean logicPalindrome(int num)
	{
		int rev=0;
		int rem=0;
		int temp=num;													
		for (int i=1;i<=num;i++)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if (temp==rev)
		{
			return true;
		}
	return false;
}
}