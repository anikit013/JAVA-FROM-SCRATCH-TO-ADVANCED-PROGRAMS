//Program to find all the palindrome between 10 to 100
class Assg1_5 
{
	public static void main(String[] args) 
	{
		for(int i =10 ; i<=100 ; i++)
		{
			if(isPalindrome(i))
			{
				System.out.println(i+" is a Palindrome");
			}
		}
		
	}
	
	public static boolean isPalindrome(int num)
	{
		int rev=0,rem;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return temp==rev ? true : false;
	}

}
