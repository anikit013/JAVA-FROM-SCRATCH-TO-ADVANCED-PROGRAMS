class Factorial 
{
	public static void main(String[] args) 
	{
		int num=5;
		int fact=1;
		int temp=num;
		while(num>=1)
		{
			fact=fact*num;
			num--;
		}
		System.out.println("The Factorial of "+temp+" is ="+fact);
	}
}
