//Program to find the factorial of the number
class Factorial 
{
	public static void main(String[] args) 
	{
		int num=5;
		fact(num);
		System.out.println("The factorial of " + num+ " is : " +fact(num));
	}
	public static int fact(int num)
	{
		if(num==0 || num==1)
		{
			return 1;
		}
		else
		{
			return num*fact(num-1);
		}
	}

}
