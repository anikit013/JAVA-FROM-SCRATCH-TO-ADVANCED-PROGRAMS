//Multiply two numbers without using *


	import java.util.*;
	class Multiplyhack // --> First class
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("  Enter 1st number "); //Input First Number
		int num1=sc.nextInt();
		System.out.println("  Enter 2nd  number  ");// Input Second Number
		int num2=sc.nextInt();
		int hack=check.logicMultiplyHack(num1,num2);
		System.out.println(hack + " is the multiplyhack result ");
		}
}
		class check // --> Second class 
{
		public static int logicMultiplyHack(int num1, int num2)
	{
			int sum=0;
			for(int i=1;i<=num2;i++) // ---> logic
		{
				 sum=sum+num1;
		}
			return sum;
	}
}
