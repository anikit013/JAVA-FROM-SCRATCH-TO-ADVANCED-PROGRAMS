//Program to find the sum of digits
class SumOfDigits 
{
	public static void main(String[] args) 
	{
		int num=4000;
		digits(num);
		System.out.println("The sum of " +num+ " is "+digits(num));
	}
	public static int digits(int num)
	{
		if(num==0)
		{
			return 0;
		}
		else
		{
			return num%10 + digits(num/10);
		}
	}
}
